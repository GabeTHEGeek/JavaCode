public class Main {

    public static void main(String[] args)
    {
        Animal d = new Dog();
        d.setName("Scribbles");
        d.setBread("Boxer");
        d.setSize(200);
        System.out.println(d.getName());
        System.out.println(d.getBread());
        System.out.println(d.getSize());
        //d.play();
        d.setiPlayBehavior(new DogPlay());
        d.performPlay();

        Animal c = new Cat();
        c.setName("Skylar");
        c.setBread("Domestic House Cat");
        c.setSize(20);
        System.out.println(c.getName());
        System.out.println(c.getBread());
        System.out.println(c.getSize());
        c.setiPlayBehavior(new CatPlay());
        c.performPlay();
        ((Cat)c).meow();
        ((Cat) c).scratch();
    }
}
