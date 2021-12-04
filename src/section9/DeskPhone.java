package section9;

public class DeskPhone implements ITelephone{
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No power on button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialling " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Hello");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        int myNumber = 12345678;
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring...");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
