package Diukova.View;

import Diukova.Models.Celsius;
import Diukova.Models.Fahrenheit;
import Diukova.Models.Kelvin;

import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private JTextField insertTempField;
    private JTextField calculatedField;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JButton convert;

    public JButton getButton() {
        return convert;
    }

    public View() {
        // Объявление фрейма
        frame = new JFrame("Temperature converter");
        frame.setSize(500, 230);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 230));

        //Панели
        frame.setLayout(new BorderLayout());
        JPanel north = new JPanel(new FlowLayout());
        frame.add(north, BorderLayout.NORTH);
        north.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        JPanel west = new JPanel();
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
        frame.add(west, BorderLayout.WEST);
        west.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        JPanel east = new JPanel();
        east.setLayout(new BoxLayout(east, BoxLayout.Y_AXIS));
        frame.add(east, BorderLayout.EAST);
        east.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        JPanel south = new JPanel(new FlowLayout());
        frame.add(south, BorderLayout.SOUTH);
        south.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout());
        frame.add(center, BorderLayout.CENTER);
        center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        //Элементы формы
        JLabel textBoxLabel = new JLabel("Enter temperature");
        north.add(textBoxLabel);

        insertTempField = new JTextField("", 10);
        north.add(insertTempField);

        JLabel calculatedTemperatureLabel = new JLabel("Calculated temperature ");
        south.add(calculatedTemperatureLabel);
        calculatedField = new JTextField("", 15);
        south.add(calculatedField);
        calculatedField.setEnabled(false);

        JLabel initialTemperatureScaleLabel = new JLabel("Initial temperature scale ");
        west.add(initialTemperatureScaleLabel);

        ButtonGroup bg1 = new ButtonGroup();
        radioButton1 = new JRadioButton("Celsius", true);
        radioButton2 = new JRadioButton("Kelvin");
        radioButton3 = new JRadioButton("Fahrenheit");
        bg1.add(radioButton1);
        bg1.add(radioButton2);
        bg1.add(radioButton3);
        west.add(radioButton1);
        west.add(radioButton2);
        west.add(radioButton3);

        JLabel calculatedTemperatureScaleLabel = new JLabel("Convert to scale");
        east.add(calculatedTemperatureScaleLabel);

        ButtonGroup bg2 = new ButtonGroup();
        radioButton4 = new JRadioButton("Celsius", true);
        radioButton5 = new JRadioButton("Kelvin");
        radioButton6 = new JRadioButton("Fahrenheit");
        bg2.add(radioButton4);
        bg2.add(radioButton5);
        bg2.add(radioButton6);
        east.add(radioButton4);
        east.add(radioButton5);
        east.add(radioButton6);

        convert = new JButton("Convert");
        convert.setSize(50, 30);
        center.add(convert);

        frame.setVisible(true);

        convert.addActionListener(e -> {
            try {
                Double.parseDouble(insertTempField.getText());
            } catch (NumberFormatException e2) {
                JOptionPane.showMessageDialog(frame, "Enter number!", "Inane Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            double temp = Double.parseDouble(insertTempField.getText());
            //convert to Celsius
            if (radioButton4.isSelected()) {
                if (radioButton1.isSelected()) {
                    Celsius c = new Celsius();
                    temp = c.convertFromCelsius(temp);
                }
                if (radioButton2.isSelected()) {
                    Kelvin k = new Kelvin();
                    temp = k.convertToCelsius(temp);
                }
                if (radioButton3.isSelected()) {
                    Fahrenheit f = new Fahrenheit();
                    temp = f.convertToCelsius(temp);
                }
            }
            //convert to Kelvin
            if (radioButton5.isSelected()) {
                if (radioButton1.isSelected()) {
                    Kelvin k = new Kelvin();
                    temp = k.convertFromCelsius(temp);
                }
                if (radioButton2.isSelected()) {
                    Kelvin k = new Kelvin();
                    temp = k.convertFromKelvin(temp);
                }
                if (radioButton3.isSelected()) {
                    Fahrenheit f = new Fahrenheit();
                    temp = f.convertToKelvin(temp);
                }
            }
            //convert to Fahrenheit
            if (radioButton6.isSelected()) {
                if (radioButton1.isSelected()) {
                    Fahrenheit f = new Fahrenheit();
                    temp = f.convertFromCelsius(temp);
                }
                if (radioButton2.isSelected()) {
                    Fahrenheit f = new Fahrenheit();
                    temp = f.convertFromKelvin(temp);
                }
                if (radioButton3.isSelected()) {
                    Fahrenheit f = new Fahrenheit();
                    temp = f.convertFromFahrenheit(temp);
                }
            }
            calculatedField.setText(Double.toString(temp));
        });
    }
}
