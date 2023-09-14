package Factory;

import Factory.components.button.Button;
import Factory.components.dropdown.DropDown;
import Factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();

}
