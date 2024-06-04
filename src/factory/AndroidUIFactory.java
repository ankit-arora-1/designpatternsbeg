package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;
import factory.dropdown.AndroidDropdown;
import factory.dropdown.DropDown;
import factory.menu.AndroidMenu;
import factory.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
