package section9;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    public void fly() {
        System.out.println("I'm not too good at that. Can I swim instead?");
    }
}
