package Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform platforms){
        return switch (platforms){
            case ANDROID -> new AndroidFactory();
            case IOS -> new IOSFactory();
            case WINDOWS -> new WindowFactory();
        };

    }
}
