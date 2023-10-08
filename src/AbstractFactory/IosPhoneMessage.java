package AbstractFactory;

public class IosPhoneMessage implements Message{
    @Override
    public void messageFriend() {
        System.out.println("Message friend from iphone");
    }

    @Override
    public void messageWife(){
        System.out.println("Message Wife from iphone");
    }

}
