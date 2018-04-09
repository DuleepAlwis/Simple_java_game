package gamepac;

abstract public class player
{
    private String name;
    private int health;
    
    public player(String name)
    {
        this.name = name;
        this.health = 20;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public void incrementHealth(int a)
    {
        health = health+a;
        if(health>20)
        {
            health=20;
        }
    }

    abstract int kick();

    abstract int punch();

    abstract int uppercut();

    public int defence(int n,int m)
    {
        return (n-m);
    }

    public void reduceHealth(int n)
    {
        this.health = this.health-n;
    }
}