import static java.lang.System.*;

/**
 * Created with IntelliJ IDEA.
 * User: gpendleton
 * Date: 1/8/14
 * Time: 12:39 PM
 * To change this template use File | Settings | File Templates.
 */



public class BeerSong {

    public static void main(String[] args)
    {
        int beerNum = 99;
        String word = "bottles";
        SpaceShip avenger = new SpaceShip("Avenger");

        while(beerNum > 0)
        {
            if(beerNum == 1)
                word = "bottle"; //singular, as in ONE bottle

            out.println(beerNum + " " + word + " of beer on the wall");
            out.println(beerNum + " " + word + " of beer.");
            out.println("Take one down");
            out.println("Pass it around");
            beerNum = beerNum -1;
        }

        if(beerNum > 0){
            out.println(beerNum + " " + word + "of beer on the wall");
        } else{
            out.println("No more bottles of beer on the wall");
            avenger.reduceShields(50);

        }
    }
}
