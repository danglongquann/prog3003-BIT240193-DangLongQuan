/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf1, tf2, result;
    JButton add, sub, mul, div;

    public Calculator() {
        setTitle("Calculator");
        setSize(300, 200);
        setLayout(new FlowLayout());

        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add(tf1);
        add(tf2);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tf2.getText());
        double res = 0;

        if (e.getSource() == add) res = a + b;
        if (e.getSource() == sub) res = a - b;
        if (e.getSource() == mul) res = a * b;
        if (e.getSource() == div) res = a / b;

        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}