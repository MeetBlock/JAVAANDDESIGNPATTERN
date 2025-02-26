package DesignPattern.factory.Components;

import DesignPattern.factory.Components.Buttons.Buttons;
import DesignPattern.factory.Components.Dropdown.Dropdown;
import DesignPattern.factory.Components.Menu.Menu;
import DesignPattern.factory.Flutter;
import DesignPattern.factory.SupportedPlatform;

import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UiFactory factory  =  flutter.createFactory();
        Menu menu = factory.createMenu();
        Buttons button = factory.createButton();
        Dropdown dropdown = factory.createDropdown();
    }
}
