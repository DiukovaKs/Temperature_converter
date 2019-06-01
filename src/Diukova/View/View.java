package Diukova.View;

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

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getInsertTempField() {
        return insertTempField;
    }

    public JTextField getCalculatedField() {
        return calculatedField;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public JRadioButton getRadioButton3() {
        return radioButton3;
    }

    public JRadioButton getRadioButton4() {
        return radioButton4;
    }

    public JRadioButton getRadioButton5() {
        return radioButton5;
    }

    public JRadioButton getRadioButton6() {
        return radioButton6;
    }

    public JButton getButton() {
        return convert;
    }

    {
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
    }
}
