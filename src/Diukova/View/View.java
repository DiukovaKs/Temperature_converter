package Diukova.View;

import Diukova.Main.Converter;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class View {
    public View() {
        // Объявление фрейма
        JFrame frame = new JFrame("Temperature converter");
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

        JTextField insertTempField = new JTextField("", 10);
        north.add(insertTempField);

        JLabel calculatedTemperatureLabel = new JLabel("Calculated temperature ");
        south.add(calculatedTemperatureLabel);
        JTextField calculatedField = new JTextField("", 15);
        south.add(calculatedField);
        calculatedField.setEnabled(false);

        JLabel initialTemperatureScaleLabel = new JLabel("Initial temperature scale ");
        west.add(initialTemperatureScaleLabel);

        // Перечень шкал, определяющий количество радиобаттонов на панелях
        HashMap<String, String> scalesMap = new HashMap<>();
        scalesMap.put("Celsius", "Celsius");
        scalesMap.put("Kelvin", "Kelvin");
        scalesMap.put("Fahrenheit", "Fahrenheit");

        //Группа радиобаттонов исходной шкалы
        ButtonGroup bg1 = new ButtonGroup();

        for (String value : scalesMap.values()) {
            JRadioButton radioButton = new JRadioButton(scalesMap.get(value), true);
            bg1.add(radioButton);
            west.add(radioButton);
            radioButton.setActionCommand(scalesMap.get(value));
        }

        JLabel calculatedTemperatureScaleLabel = new JLabel("Convert to scale");
        east.add(calculatedTemperatureScaleLabel);

        //Группа радиобаттонов конечной шкалы
        ButtonGroup bg2 = new ButtonGroup();

        for (String value : scalesMap.values()) {
            JRadioButton radioButton = new JRadioButton(scalesMap.get(value), true);
            bg2.add(radioButton);
            east.add(radioButton);
            radioButton.setActionCommand(scalesMap.get(value));
        }

        JButton convert = new JButton("Convert");
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
            Converter converter = new Converter();
            double result = converter.convertTemp(temp, bg1.getSelection().getActionCommand(), bg2.getSelection().getActionCommand());
            calculatedField.setText(Double.toString(result));
        });
    }
}
