package DesignPattern.factory.Components;

import DesignPattern.factory.Components.Buttons.Buttons;
import DesignPattern.factory.Components.Buttons.MacButton;
import DesignPattern.factory.Components.Dropdown.Dropdown;
import DesignPattern.factory.Components.Dropdown.MacDropdown;
import DesignPattern.factory.Components.Menu.MacMenu;
import DesignPattern.factory.Components.Menu.Menu;

public class MacFactory implements UiFactory {

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Buttons createButton() {
        return new MacButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropdown();
    }
}
