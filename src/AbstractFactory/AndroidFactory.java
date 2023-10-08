package AbstractFactory;

public class AndroidFactory implements Controller{
    @Override
    public Call calling() {
        return new AndroidPhoneCall();
    }

    @Override
    public Message messages() {
        return new AndroidPhoneMessage();
    }
}
