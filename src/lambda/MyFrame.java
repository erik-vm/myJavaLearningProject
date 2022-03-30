package lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton myButton1 = new JButton("MY BUTTON 1");
    JButton myButton2 = new JButton("MY BUTTON 2");


    MyFrame() {

        myButton1.setBounds(100, 200, 200, 100);
        myButton1.addActionListener((e) -> System.out.println("This is the first button"));

        myButton2.setBounds(100, 100, 200, 100);
        myButton2.addActionListener((e) -> System.out.println("This the seconds button"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(null);
        this.setVisible(true);
        this.add(myButton1);
        this.add(myButton2);


    }
}