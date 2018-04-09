package gamepac;

public class player3 extends player
{
    public player3(String name)
    {
        super(name);
    }

    @Override
    public int kick()
    {
        return 7;
    }

    @Override
    public int punch()
    {
        return 5;
    }

    @Override
    public int uppercut()
    {
        return 11;
    }
}