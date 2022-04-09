package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lesson8 extends JFrame {

    public int counter;

    public Lesson8(int initialValue) {
        setBounds(400, 100,500, 500);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Courier New", Font.BOLD, 24);

        JTextField counterValue = new JTextField();
        counterValue.setFont(font);
        counterValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValue,BorderLayout.CENTER);
        counter = initialValue;
        counterValue.setText(String.valueOf(counter));

        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        counterValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = Integer.parseInt(counterValue.getText());
                counterValue.setText(String.valueOf(counter));
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterValue.setText(String.valueOf(counter));
            }
        });

        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterValue.setText(String.valueOf(counter));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lesson8(0);
    }



}
