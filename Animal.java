public class Animal {

    private int size;
    private String bread;
    private String name;
    IPlayBehavior iPlayBehavior;

   public void setiPlayBehavior(IPlayBehavior pb)
    {
        this.iPlayBehavior = pb;
    }

    public void performPlay()
    {
        iPlayBehavior.play();
    }

    public void setBread(String myBread)
    {
        this.bread = myBread;
    }

    public String getBread()
    {
        return this.bread;
    }

    public void setName(String myName)
    {
        this.name = myName;
    }

    public String getName()
    {
        return this.name;
    }

    public void setSize(int mySize)
    {
       this.size = mySize;
    }

    public int getSize()
    {
        return this.size;
    }
}
