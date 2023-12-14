import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserDetails {
    public static void main(String[] args) {
    	
    	// Title
        JFrame frame = new JFrame("User Input Form"); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));
        
        // Setting up label text
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField(20);

        JLabel middleNameLabel = new JLabel("Middle Name:");
        JTextField middleNameField = new JTextField(20);

        JLabel mobileNumberLabel = new JLabel("Mobile Number:");
        JTextField mobileNumberField = new JTextField(20);

        JLabel emailLabel = new JLabel("E-mail Address:");
        JTextField emailField = new JTextField(20); 

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear All");
       
        // Added label text to panel
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(middleNameLabel);
        panel.add(middleNameField);
        panel.add(mobileNumberLabel);
        panel.add(mobileNumberField);
        panel.add(emailLabel);
        panel.add(emailField);  
        panel.add(submitButton);
        panel.add(clearButton);

        frame.add(panel);
        frame.setVisible(true);
        
        // Clear Button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameField.setText("");
                lastNameField.setText("");
                middleNameField.setText("");
                mobileNumberField.setText("");
                emailField.setText("");
            }
        } );
        
        // Submit Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String middleName = middleNameField.getText();
                String mobileNumber = mobileNumberField.getText();
                String email = emailField.getText();
                
                // Will show the result
                String result = "First Name: " + firstName + "\n" +
                                "Last Name: " + lastName + "\n" +
                                "Middle Name: " + middleName + "\n" +
                                "Mobile Number: " + mobileNumber + "\n" +
                                "E-mail Address: " + email;
                
                JOptionPane.showMessageDialog(frame, result, "User Input", JOptionPane.INFORMATION_MESSAGE);
            }
        } );
    }
}