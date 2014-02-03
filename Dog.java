public class Dog extends Animal {

    public Dog()
    {
        iPlayBehavior = new DogPlay();
    }

    public void bark()
    {
        System.out.println("RUFF RUFF RUFF");
    }

    public void playFetch()
    {
        System.out.println("Fetching ball....");
    }
}
