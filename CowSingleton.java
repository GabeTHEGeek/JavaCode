public class CowSingleton {

    private static class SingletonHolder
    {
        private static CowSingleton unique;
    }

    private CowSingleton(){}

    //Only create new object if NOT already instantiated.
    public static CowSingleton getInstance(){
        return SingletonHolder.unique;
    }

    public String cowMoo()
    {
        return "Moooooooo";
    }
}
