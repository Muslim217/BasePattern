package AbstractFactory;

public class IosPhoneCall implements Call {
    @Override
    public void CallFriend() {
        System.out.println("Call friend from iphone 12");
    }

    @Override
    public void CallWife() {
        System.out.println("Call Wife from iphone 12");

    }
}
