package DesignPattern.factory;

import DesignPattern.factory.Components.AndroidFactory;
import DesignPattern.factory.Components.IOSFactory;
import DesignPattern.factory.Components.UIFactoryFactory;
import DesignPattern.factory.Components.UiFactory;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }
    public void setTheme(){
        System.out.println("Set theme is being set");
    }

    public void setRefreshRate(){
        System.out.println("Set Refresh rate");
    }

    public UiFactory createFactory(){
        return UIFactoryFactory.getUIfactory(supportedPlatform);
    }
}
