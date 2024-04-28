package GUIStuff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;


public class AgeCalculator extends JFrame implements ActionListener {
	private JFrame topFrame;
    private JPanel panel;
    private JButton calculateButton;
    private JTextField birthDateTextField;
    private JLabel ageLabel;
    private JLabel birthDateLabel;
    private GridBagConstraints constraints; 

    public AgeCalculator() {
    	
        topFrame = new JFrame("Age Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        topFrame.setLayout(new GridBagLayout());

        panel = new JPanel(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(10, 10, 10, 10);

        birthDateLabel = new JLabel("Enter your birth date in the format: YYYY-MM-DD ");
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(birthDateLabel, constraints);

        birthDateTextField = new JTextField(15);
        birthDateTextField.setEditable(true);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(birthDateTextField, constraints);

        calculateButton = new JButton("Calculate Age");
        calculateButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        panel.add(calculateButton, constraints);

        ageLabel = new JLabel("");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(ageLabel, constraints);

        add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String birthDateText = birthDateTextField.getText();
            try {
                LocalDate birthDate = LocalDate.parse(birthDateText);
                LocalDate currentDate = LocalDate.now();
                Period age = Period.between(birthDate, currentDate);
                int years = age.getYears();
                ageLabel.setText("Your age is: " + years + " years");
            } catch (Exception ex) {
                ageLabel.setText("Incorrect date format.");
            }
        }
    }
}
