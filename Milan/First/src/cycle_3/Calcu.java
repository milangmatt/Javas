/*Cycle 3
 *Experiment number : 4
 *Experiment Name : Simple Calculator
 *Name: Milan George Mathew
 *Class: S3 DS
 *Roll No: 39
 *Date : 05-12-2023
 */

package cycle_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcu extends JFrame implements ActionListener {
	private JTextField textFieldPrev,textField;
    private JButton[] numberButtons;
    private JButton addButton, subtractButton, multiplyButton, divideButton, equalButton, clearButton;

    private double firstNumber, secondNumber, result;
    private char operator;

    public Calcu() {
        setTitle("Simple Calculator");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textFieldPrev = new JTextField();
        textFieldPrev.setFont(new Font("SansSeriff",Font.LAYOUT_RIGHT_TO_LEFT,24));
        textFieldPrev.setEditable(false);
        textField = new JTextField();
        textField.setFont(new Font("SansSeriff",Font.LAYOUT_RIGHT_TO_LEFT,32));
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2,1));
        textPanel.add(textFieldPrev);
        textPanel.add(textField);
        
        add(textPanel, BorderLayout.NORTH);
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalButton = new JButton("=");
        clearButton = new JButton("C");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4,4,4));
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(addButton);

        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(subtractButton);

        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(multiplyButton);

        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(divideButton);
        buttonPanel.add(equalButton);
        buttonPanel.add(clearButton);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        for (int i = 0; i < 10; i++) {
            if (source == numberButtons[i]) {
                textField.setText(textField.getText() + i);
            }
        }

        if (source == addButton || source == subtractButton || source == multiplyButton || source == divideButton) {
            firstNumber = Double.parseDouble(textField.getText());
            operator = e.getActionCommand().charAt(0);
            textFieldPrev.setText(String.valueOf(firstNumber)+operator);
            textField.setText("");
        }

        if (source == equalButton) {
            secondNumber = Double.parseDouble(textField.getText());
            try {
                result = performOperation(firstNumber, secondNumber, operator);
                textField.setText(String.valueOf(result));
                textFieldPrev.setText(String.valueOf(result));
            } catch (ArithmeticException ex) {
                textField.setText("Error: " + ex.getMessage());
            }
        }

        if (source == clearButton) {
            textField.setText("");
            firstNumber = 0;
            secondNumber = 0;
            operator = '\0';
        }
    }

    private double performOperation(double num1, double num2, char op) throws ArithmeticException {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                return 0;
        }
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
        		new Calcu();
        	}
        });
    }

   
    
}
	
