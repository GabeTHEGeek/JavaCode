/**
 * Created with IntelliJ IDEA.
 * User: gpendleton
 * Date: 1/10/14
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class SpaceShip implements IShipBehavior
{
    public String name;
    private int sStrength;

    public SpaceShip()
    {
        name = "Unamed ship";
        sStrength = 100;
    }

    public SpaceShip(String n)
    {
        name        = n;
        sStrength   = 200;
    }

    @Override
    public void fire()
    {
       System.out.println("THIS JUST FIRED");
    }

    @Override
    public void reduceShields(int amount)
    {
        sStrength -= amount;
    }

    @Override
    public void destroy()
    {
        name = null;
    }
}
