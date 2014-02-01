import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: gpendleton
 * Date: 1/8/14
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class WelcomeMessage implements IMessage
{
    private String welcome   = "Hello World";
    private String goodBye   = "GoodBye for now!";
    private String comeAgain = "Please come again.";

    public void createMessage(){
        out.println(welcome);
    };

    public void create2ndMessage(){
        out.println(goodBye);
    };

    public void create3rdMessage(){
        out.println(comeAgain);
    };
}
