package DesignPattern.factory.Components;

import DesignPattern.factory.SupportedPlatform;

public class UIFactoryFactory {
    public static UiFactory getUIfactory(SupportedPlatform supportedPlatform){
        switch (supportedPlatform){
            case IOS:
                return new IOSFactory();
            case ANDROID :
                return new AndroidFactory();
            case MAC:
                return new MacFactory();
        }

        return null;
    }
}
