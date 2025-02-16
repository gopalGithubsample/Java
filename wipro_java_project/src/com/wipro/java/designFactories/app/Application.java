package com.wipro.java.designFactories.app;

import com.wipro.java.designFactories.button.Button;
import com.wipro.java.designFactories.checkboxes.Checkbox;
import com.wipro.java.designFactories.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}