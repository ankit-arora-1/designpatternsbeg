package factory;

import factory.buttons.Button;
import factory.dropdown.DropDown;
import factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);

        UIFactory uiFactory = flutter.createFactory();
        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropdown();
    }
}
