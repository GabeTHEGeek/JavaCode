public class Cat extends Animal
{

    public Cat()
    {
        iPlayBehavior = new CatPlay();
    }

    public void meow()
    {
        System.out.println("Meooooow");
    }

    public void scratch()
    {
        System.out.println("I just clawed you");
    }
}

