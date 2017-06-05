/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms.other;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Manasha
 */
public class Validation {

    public static void buttonEnable(JButton button, JTextField... textFields) {
        boolean canEnable = true;
        for (JTextField jTextField : textFields) {
            boolean empty = jTextField.getText().isEmpty();
            if (empty) {
                canEnable = false;
                break;
            }
        }
        button.setEnabled(canEnable);
    }

    public static void validateNIC(JTextField docNicText) {
        String text = docNicText.getText();
        if (!text.isEmpty()) {
            boolean matches = text.matches("^[0-9]{0,9}$");
            if (!matches) {
                docNicText.setText(text.substring(0, text.length() - 1));
            }
            boolean matches1 = text.matches("[0-9]{9}");
            if (matches1) {
                docNicText.setText(text + "V");
            }
        }
    }

    public static void validatePhoneNumber(JTextField docContactNoText) {
        String txt = docContactNoText.getText();
        int caretPosition = docContactNoText.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            docContactNoText.setText(txt);
            docContactNoText.setCaretPosition(caretPosition - 1);
        }
    }
}
