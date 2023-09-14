package Factory;

public class Main {
    public static void main(String[] args) {

        UIFactory uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.ANDROID);
        uiFactory.createDropDown().dropdown();
        uiFactory.createButton().button();

        uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.IOS);
        uiFactory.createDropDown().dropdown();
        uiFactory.createButton().button();
        uiFactory.createMenu().menu();

        uiFactory = UIFactoryFactory.getUIFactory(SupportedPlatform.WINDOWS);
        uiFactory.createDropDown().dropdown();
        uiFactory.createButton().button();
        uiFactory.createMenu().menu();

    }
}
