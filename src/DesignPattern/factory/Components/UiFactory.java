package DesignPattern.factory.Components;

import DesignPattern.factory.Components.Buttons.Buttons;
import DesignPattern.factory.Components.Dropdown.Dropdown;
import DesignPattern.factory.Components.Menu.Menu;

public interface UiFactory {
    Menu createMenu();
    Buttons createButton();
    Dropdown createDropdown();
}
