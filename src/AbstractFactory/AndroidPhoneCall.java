package AbstractFactory;

public class AndroidPhoneCall implements Call {
    @Override
    public void CallFriend() {
        System.out.println("Call friend from Samsung s23");
    }

    @Override
    public void CallWife() {
        System.out.println("Call Wife from Samsung s23");

    }
}
