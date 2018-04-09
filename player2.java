package gamepac;

public class player2 extends player
{
    public player2(String name)
    {
        super(name);
    }

    @Override
    public int kick()
    {
        return 5;
    }

    @Override
    public int punch()
    {
        return 3;
    }

    @Override
    public int uppercut()
    {
        return 7;
    }
}