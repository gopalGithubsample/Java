package com.wipro.java.designFactories.factories;

import com.wipro.java.designFactories.button.Button;
import com.wipro.java.designFactories.button.WindowsButton;
import com.wipro.java.designFactories.checkboxes.Checkbox;
import com.wipro.java.designFactories.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}