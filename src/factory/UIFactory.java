package factory;

import factory.buttons.Button;
import factory.dropdown.DropDown;
import factory.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropdown();
}
