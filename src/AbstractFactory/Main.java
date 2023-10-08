package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Controller controllerIos = new AndroidFactory();
        controllerIos.messages().messageFriend();
        controllerIos.calling().CallWife();

        Controller controller1 = new IosFactory();
        controller1.calling().CallWife();
        controller1.messages().messageFriend();


    }


}
