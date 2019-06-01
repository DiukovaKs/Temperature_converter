package Diukova.Controller;

import Diukova.Model.Temperatures;
import Diukova.View.View;

import javax.swing.*;

public class Controller {
    private Temperatures model;
    private View view;

    public Controller(Temperatures m, View v) {
        model = m;
        view = v;
    }

    public void initView() {
        view.getButton().addActionListener(e -> {
            try {
                Double.parseDouble(view.getInsertTempField().getText());
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(view.getFrame(), "Enter number!", "Inane Warning", JOptionPane.WARNING_MESSAGE);
            }
            double temp = 0.0;
            if (view.getRadioButton1().isSelected() && view.getRadioButton4().isSelected()) {
                temp = Temperatures.convertCelsiusToCelsius(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton1().isSelected() && view.getRadioButton5().isSelected()) {
                temp = Temperatures.convertCelsiusToKelvin(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton1().isSelected() && view.getRadioButton6().isSelected()) {
                temp = Temperatures.convertCelsiusToFahrenheit(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton2().isSelected() && view.getRadioButton4().isSelected()) {
                temp = Temperatures.convertKelvinToCelsius(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton2().isSelected() && view.getRadioButton5().isSelected()) {
                temp = Temperatures.convertKelvinToKelvin(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton2().isSelected() && view.getRadioButton6().isSelected()) {
                temp = Temperatures.convertKelvinToFahrenheit(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton3().isSelected() && view.getRadioButton4().isSelected()) {
                temp = Temperatures.convertFahrenheitToCelsius(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton3().isSelected() && view.getRadioButton5().isSelected()) {
                temp = Temperatures.convertFahrenheitToKelvin(Double.parseDouble(view.getInsertTempField().getText()));
            }
            if (view.getRadioButton3().isSelected() && view.getRadioButton6().isSelected()) {
                temp = Temperatures.convertFahrenheitToFahrenheit(Double.parseDouble(view.getInsertTempField().getText()));
            }
            view.getCalculatedField().setText(Double.toString(temp));
        });
    }
}



