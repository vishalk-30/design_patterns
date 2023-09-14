package Factory;

import Factory.components.button.Button;
import Factory.components.button.IOSButton;
import Factory.components.dropdown.DropDown;
import Factory.components.dropdown.IOSDropDown;
import Factory.components.menu.IOSMenu;
import Factory.components.menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }
}
