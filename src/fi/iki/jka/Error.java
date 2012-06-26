package fi.iki.jka;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class Error implements ErrorInterface {
    Component component;

    public Error(Component component) {
        this.component = component;
    }

    public void displayError() {
        JOptionPane.showMessageDialog(this.component, "No photos to show!",
                JPhotoFrame.APP_NAME, JOptionPane.ERROR_MESSAGE);
    }
}