public class Main {

    public static void main(String[] args)
    {
        Animal d = new Dog();
        d.setName("Scribbles");
        d.setBread("Boxer");
        d.setSize(200);
        System.out.println("Dog " + d.getName() + ", Wants to play. " + "He is a " + d.getSize() + " pound " + d.getBread());
        d.setiPlayBehavior(new DogPlay());
        d.performPlay();
        ((Dog)d).bark();
        ((Dog)d).playFetch();

        Animal c = new Cat();
        c.setName("Skylar");
        c.setBread("Domestic House Cat");
        c.setSize(20);
        System.out.println("Cat " + c.getName() + ", Wants to play. " + "He is a " + c.getSize() + " pound " + c.getBread());
        c.setiPlayBehavior(new CatPlay());
        c.performPlay();
        ((Cat)c).meow();
        ((Cat) c).scratch();
    }
}
