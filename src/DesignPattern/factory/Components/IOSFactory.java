package DesignPattern.factory.Components;

import DesignPattern.factory.Components.Buttons.AndroidButton;
import DesignPattern.factory.Components.Buttons.Buttons;
import DesignPattern.factory.Components.Buttons.IosButton;
import DesignPattern.factory.Components.Dropdown.AndroidDropdown;
import DesignPattern.factory.Components.Dropdown.Dropdown;
import DesignPattern.factory.Components.Dropdown.IosDropdown;
import DesignPattern.factory.Components.Menu.AndroidMenu;
import DesignPattern.factory.Components.Menu.IosMenu;
import DesignPattern.factory.Components.Menu.Menu;

public class IOSFactory implements UiFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Buttons createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
