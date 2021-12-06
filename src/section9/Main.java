package section9;

public class Main<myPhone> {
    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(12345678);
        myPhone.powerOn();
        myPhone.isRinging();
        myPhone.dial(12345678);
        myPhone.callPhone(12345678);
        myPhone.answer();

        Dog dog = new Dog("Levi");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian ringed neck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }

}
