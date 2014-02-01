/**
 * Created with IntelliJ IDEA.
 * User: gpendleton
 * Date: 1/10/14
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IShipBehavior
{
    void fire();
    void reduceShields(int amount);
    void destroy();
}
