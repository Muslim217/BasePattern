package AbstractFactory;

public class AndroidPhoneMessage implements Message {
    @Override
    public void messageFriend() {
        System.out.println("Message friend from Samsung s23");
    }

    @Override
    public void messageWife() {
        System.out.println("Message wife from Samsung s23");

    }
}
