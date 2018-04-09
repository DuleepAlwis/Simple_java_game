/*This is a simple fighting game I developped.  You have to fight the Deamon called 'Alchemy'. Beat him somehow. Good Luck.

@
Developped by Duleep Alwis.
Date 2018/04/07
*/

package gamepac;

import java.util.*;

public class game1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        int level = 1;
        int health;
        int state;
        boolean restart,exit;
        restart = false;
        exit = false;
        System.out.println("\t"+"\t"+"\t"+"| Start the Game |");
        System.out.print("\t"+"\t"+"\t"+"Enter yourt name:");
        name = input.nextLine();
        
        while(exit!=true)
        {
            while(restart!=true)
            {
                if(level==1)
                {
                    state = fight(name,level);
                }
                else if(level==2)
                {
                    state = fight(name,level);
                }
                else
                {
                    state = fight(name,level);
                }

                if(state == 0)
                {
                    restart = false;
                }
                else if(state == 5)
                {
                    exit = true;
                    break;
                }
                else if(state == 1)
                {
                    level = 1;
                }
                else if(state == 2)
                {
                    level = 2;
                }
                else if(state == 3)
                {
                    level = 3;
                }
                else 
                {
                    System.out.println("***************Congratulations............You won the Game..........Good job..........********************");
                    level=1;
                }


            }
        }
    }

    public static int fight(String name,int level)
    {
        int health=20;
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int you,enemy,m=1,s;
        
        printmenu();

        System.out.println("\t"+"\t"+"\t"+"Your Level is "+level);
        player p;
        switch(level)
        {
            case 1:p = new player1(name);break;
            case 2:p = new player2(name);break;
            case 3:p = new player3(name);break;
            default:return 5;
        }

        while(health>0 && p.getHealth()>0)
        {      
            System.out.println("\t"+"\t"+"\t"+"Your current health : "+p.getHealth());
            System.out.println("\t"+"\t"+"\t"+"Enemy's current health : "+health);
            System.out.print("\t"+"\t"+"\t"+"Your action :");
            s = input.nextInt();
            if(s==11)
            {
                System.exit(0);
            }
            enemy = random.nextInt(10);
            if(s==1)
            {
                you=p.kick();
            }
            else if(s==2)
            {
                you=p.punch();
            }
            else if(s==3)
            {
                you=p.uppercut();
            }
            else 
            {
                you = p.defence(s,enemy);
            }
            
            if(you>enemy)
            {
                health = health-(you-enemy);
            }
            else if(enemy>you)
            {
                p.reduceHealth(enemy-you);
            }
            else 
            {
                p.incrementHealth(you);
                System.out.println("\t"+"\t"+"\t"+"Your health was incremented by "+you+": You got a medi pack");
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                  Alchemy's shot : "+enemy+"                          ");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
        }

        if(health <=0 && p.getHealth()>0)
        {
            System.out.println("\t"+"\t"+"\t"+"You won the "+level+" round........................................................................................................................");
            return (level+1);
        }
        else
        {
            System.out.println("\t"+"\t"+"\t"+"You loose.............................................................................................................................................");
            while(m!=4 || m!=1)
            {
                System.out.println("*******************************Exit or restart(E-0/R-1): ");
                m = input.nextInt();
                if(m==0)
                {
                    return 5;
                }
                else if(m==1)
                {
                    return 0;
                }
                else 
                {
                    System.out.println("                               Your response wasn't clear                                                                                        ");
                }
            }
        }

        return 7;
    } 

    public static void printmenu()
    {
        System.out.println("\t"+"\t"+"\t"+"***************MENU***********");
        System.out.println("\t"+"\t"+"\t"+"1.Kick"+"\t"+"2.Punch");
        System.out.println("\t"+"\t"+"\t"+"3.Uppercut"+"\t"+"4.Defence");
        System.out.println("\t"+"\t"+"\t"+"Exit: 11"+"\n");
    }
}
