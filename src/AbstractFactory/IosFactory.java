package AbstractFactory;

public class IosFactory implements Controller {
    @Override
    public Call calling() {
        return new IosPhoneCall();
    }

    @Override
    public Message messages() {
        return new IosPhoneMessage();
    }
}
