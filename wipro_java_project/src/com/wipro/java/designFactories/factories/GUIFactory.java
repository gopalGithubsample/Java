package com.wipro.java.designFactories.factories;

import com.wipro.java.designFactories.button.Button;
import com.wipro.java.designFactories.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}