package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms) {
        if(supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidUIFactory();
        } else if(supportedPlatforms == SupportedPlatforms.IOS) {
            return new IOSUIFactory();
        }

        return null;
    }
}
