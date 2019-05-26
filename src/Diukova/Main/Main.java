package Diukova.Main;

import Diukova.Temperatures.Temperatures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Объявление фрейма
            JFrame frame = new JFrame("Temperature converter");
            frame.setSize(500, 500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //Панели
            frame.setLayout(new BorderLayout());
            JPanel north = new JPanel(new FlowLayout());
            frame.add(north, BorderLayout.NORTH);

            JPanel west = new JPanel();
            west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
            frame.add(west, BorderLayout.WEST);

            JPanel east = new JPanel();
            east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
            frame.add(east, BorderLayout.EAST);

            JPanel south = new JPanel(new FlowLayout());
            frame.add(south, BorderLayout.SOUTH);

            JPanel center = new JPanel();
            center.setLayout(new FlowLayout());
            frame.add(center, BorderLayout.CENTER);

            //Элементы формы
            JLabel textBoxLabel = new JLabel("Enter temperature");
            north.add(textBoxLabel);

            JTextField insertTempField = new JTextField("", 10);
            north.add(insertTempField);

            insertTempField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!Temperatures.isDigit(insertTempField.getText())) {
                        JOptionPane.showMessageDialog(frame, "Enter number!", "Inane Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
            });

            JLabel calculatedTemperatureLable = new JLabel("Calculated temperature ");
            south.add(calculatedTemperatureLable);
            JTextField calculatedField = new JTextField("", 15);
            south.add(calculatedField);
            calculatedField.setEnabled(false);

            JLabel initialTemperatureScaleLabel = new JLabel("Initial temperature scale ");
            west.add(initialTemperatureScaleLabel);

            ButtonGroup bg1 = new ButtonGroup();
            JRadioButton radioButton1 = new JRadioButton("Celsius", true);
            JRadioButton radioButton2 = new JRadioButton("Kelvin");
            JRadioButton radioButton3 = new JRadioButton("Fahrenheit");
            bg1.add(radioButton1);
            bg1.add(radioButton2);
            bg1.add(radioButton3);
            west.add(radioButton1);
            west.add(radioButton2);
            west.add(radioButton3);

            JLabel calculatedTemperatureScaleLabel = new JLabel("Convert to scale");
            east.add(calculatedTemperatureScaleLabel);

            ButtonGroup bg2 = new ButtonGroup();
            JRadioButton radioButton4 = new JRadioButton("Celsius", true);
            JRadioButton radioButton5 = new JRadioButton("Kelvin");
            JRadioButton radioButton6 = new JRadioButton("Fahrenheit");
            bg2.add(radioButton4);
            bg2.add(radioButton5);
            bg2.add(radioButton6);
            east.add(radioButton4);
            east.add(radioButton5);
            east.add(radioButton6);

            JButton convert = new JButton("Convert");
            convert.setSize(50, 30);
            convert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!Temperatures.isDigit(insertTempField.getText())) {
                        JOptionPane.showMessageDialog(frame, "Enter number!", "Inane Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        double temp = 0.0;
                        if (radioButton1.isSelected() && radioButton4.isSelected()) {
                            temp = Temperatures.convertCelsiusToCelsius(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton1.isSelected() && radioButton5.isSelected()) {
                            temp = Temperatures.convertCelsiusToKelvin(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton1.isSelected() && radioButton6.isSelected()) {
                            temp = Temperatures.convertCelsiusToFahrenheit(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton2.isSelected() && radioButton4.isSelected()) {
                            temp = Temperatures.convertKelvinToCelsius(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton2.isSelected() && radioButton5.isSelected()) {
                            temp = Temperatures.convertKelvinToKelvin(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton2.isSelected() && radioButton6.isSelected()) {
                            temp = Temperatures.convertKelvinToFahrenheit(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton3.isSelected() && radioButton4.isSelected()) {
                            temp = Temperatures.convertFahrenheitToCelsius(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton3.isSelected() && radioButton5.isSelected()) {
                            temp = Temperatures.convertFahrenheitToKelvin(Double.parseDouble(insertTempField.getText()));
                        }
                        if (radioButton3.isSelected() && radioButton6.isSelected()) {
                            temp = Temperatures.convertFahrenheitToFahrenheit(Double.parseDouble(insertTempField.getText()));
                        }
                        calculatedField.setText(Double.toString(temp));
                    }
                }
            });
            center.add(convert);

            frame.setVisible(true);
        });
    }
}
