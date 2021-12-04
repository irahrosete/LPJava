package section9;

public class Main<myPhone> {
    public static void main(String[] args) {
        ITelephone myPhone = new DeskPhone(12345678);
        myPhone.powerOn();
        myPhone.isRinging();
        myPhone.dial(12345678);
        myPhone.callPhone(12345678);
        myPhone.answer();
    }

}
