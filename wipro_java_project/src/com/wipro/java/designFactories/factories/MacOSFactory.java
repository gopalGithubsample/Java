package com.wipro.java.designFactories.factories;

import com.wipro.java.designFactories.button.Button;
import com.wipro.java.designFactories.button.MacOSButton;
import com.wipro.java.designFactories.checkboxes.Checkbox;
import com.wipro.java.designFactories.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}