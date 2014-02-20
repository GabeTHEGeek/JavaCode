public class Main {

    public static void main(String[] args)
    {
        Animal d = new Dog();
        d.setName("Scribbles");
        d.setBread("Boxer");
        d.setSize(15);
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


        CowSingleton cowSingleton =  CowSingleton.getInstance();
        //cowSingleton.cowMoo();


        //created animal array casted as dogs.
        Animal[] myDogs = new Dog[3];

        //puts 3 dogs inside array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = d;

        //accessing dogs using the array
       //references
        myDogs[0].setName("Fred");
        myDogs[1].setName("Marge");

        //checking what myDog[2] name is supposed to be
        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].getName());


        //Loop through array and tells all dogs to bark
        for (int x = 0; x < myDogs.length; x++){
            System.out.println(myDogs[x].getName());
            ((Dog)myDogs[x]).bark();
        }
    }
}
