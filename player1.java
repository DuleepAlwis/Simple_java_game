package gamepac;

public class player1 extends player
{
    public player1(String name)
    {
        super(name);
    }

    @Override
    public int kick()
    {
        return 3;
    }

    @Override
    public int punch()
    {
        return 2;
    }

    @Override
    public int uppercut()
    {
        return 5;
    }
}