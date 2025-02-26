package DesignPattern.factory.Components;

import DesignPattern.factory.Components.Buttons.AndroidButton;
import DesignPattern.factory.Components.Buttons.Buttons;
import DesignPattern.factory.Components.Dropdown.AndroidDropdown;
import DesignPattern.factory.Components.Dropdown.Dropdown;
import DesignPattern.factory.Components.Menu.AndroidMenu;
import DesignPattern.factory.Components.Menu.Menu;

public class AndroidFactory implements UiFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Buttons createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
