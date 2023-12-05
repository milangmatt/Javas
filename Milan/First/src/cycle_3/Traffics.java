/*Cycle 3
 *Experiment number : 5
 *Experiment Name : Traffic Light Simulator
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


public class Traffics {
    private static final Color RED = Color.RED;
    private static final Color YELLOW = Color.YELLOW;
    private static final Color GREEN = Color.GREEN;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Traffic Light Simulation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1,4,4));

        ButtonGroup bg = new ButtonGroup();
        JRadioButton redButton = new JRadioButton("Red");
        JRadioButton yellowButton = new JRadioButton("Yellow");
        JRadioButton greenButton = new JRadioButton("Green");
        redButton.setFont(new Font("Arial",Font.LAYOUT_RIGHT_TO_LEFT,20));
        yellowButton.setFont(new Font("SansSeriff",Font.LAYOUT_RIGHT_TO_LEFT,20));
        greenButton.setFont(new Font("SansSeriff",Font.LAYOUT_RIGHT_TO_LEFT,20));
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == redButton) {
                    panel.setBackground(RED);
                } else if (e.getSource() == yellowButton) {
                    panel.setBackground(YELLOW);
                } else if (e.getSource() == greenButton) {
                    panel.setBackground(GREEN);
                }
            }
        };

        redButton.addActionListener(actionListener);
        yellowButton.addActionListener(actionListener);
        greenButton.addActionListener(actionListener);

        bg.add(redButton);
        bg.add(yellowButton);
        bg.add(greenButton);

        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        frame.add(radioPanel, BorderLayout.EAST);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
	
