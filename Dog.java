public class Dog extends Animal {

    public Dog()
    {
        iPlayBehavior = new DogPlay();
    }

    public void bark()
    {
        if (getSize() > 60)
        {
            System.out.println("Woof! Woof!");
        } else if ( getSize() < 14)
        {
           System.out.println("RUFF RUFF RUFF");
        }  else {
            System.out.println("Yip! Yip!");
        }

    }

    public void playFetch()
    {
        System.out.println("Fetching ball....");
    }
}
