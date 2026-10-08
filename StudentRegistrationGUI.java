import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationGUI extends JFrame implements ActionListener {

    JLabel nameLabel, rollLabel, marksLabel, resultLabel;
    JTextField nameField, rollField, marksField;
    JButton submitButton;

    StudentRegistrationGUI() {
        setTitle("Student Registration");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameLabel = new JLabel("Student Name:");
        nameLabel.setBounds(50, 50, 120, 30);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(180, 50, 180, 30);
        add(nameField);
        rollLabel = new JLabel("Roll No.:");
        rollLabel.setBounds(50, 100, 120, 30);
        add(rollLabel);
        rollField = new JTextField();
        rollField.setBounds(180, 100, 180, 30);
        add(rollField);
        marksLabel = new JLabel("Marks:");
        marksLabel.setBounds(50, 150, 120, 30);
        add(marksLabel);
        marksField = new JTextField();
        marksField.setBounds(180, 150, 180, 30);
        add(marksField);
        submitButton = new JButton("Submit");
        submitButton.setBounds(160, 200, 120, 35);
        add(submitButton);
        submitButton.addActionListener(this);
        resultLabel = new JLabel();
        resultLabel.setBounds(50, 250, 350, 80);
        add(resultLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String rollNo = rollField.getText();
        String marksText = marksField.getText();
        if (name.isEmpty() || rollNo.isEmpty() || marksText.isEmpty()) {
            resultLabel.setText("Please fill all the fields.");
            return;
        }

        try {
            int marks = Integer.parseInt(marksText)
            if (marks < 0 || marks > 100) {
                resultLabel.setText("Marks must be between 0 and 100.");
                return;
            }
            String grade;

            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            resultLabel.setText("<html>Student Name: " + name
                    + "<br>Roll No.: " + rollNo
                    + "<br>Marks: " + marks
                    + "<br>Grade: " + grade + "</html>");

        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numeric marks.");
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationGUI();
    }
}