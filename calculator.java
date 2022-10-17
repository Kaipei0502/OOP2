import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTextField jTextfield;
    private String text = "";
    public MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("calculator");
        setBounds(100, 100, 400, 600);
        setVisible(true);

        contentPane = new JPanel();
        setContentPane(contentPane);

        jTextfield = new JTextField("");
        jTextfield.setBounds(10,10,360,60);
        contentPane.add(jTextfield);

        JButton button1 = new JButton("1");
        button1.setBounds(10,90,100,80);
        button1.addActionListener(this);
        contentPane.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(140,90,100,80);
        button2.addActionListener(this);
        contentPane.add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(270,90,100,80);
        button3.addActionListener(this);
        contentPane.add(button3);

        JButton button4 = new JButton("4");
        button4.setBounds(10,180,100,80);
        button4.addActionListener(this);
        contentPane.add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(140,180,100,80);
        button5.addActionListener(this);
        contentPane.add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(270,180,100,80);
        button6.addActionListener(this);
        contentPane.add(button6);

        JButton button7 = new JButton("7");
        button7.setBounds(10,270,100,80);
        button7.addActionListener(this);
        contentPane.add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(140,270,100,80);
        button8.addActionListener(this);
        contentPane.add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(270,270,100,80);
        button9.addActionListener(this);
        contentPane.add(button9);

        JButton button0 = new JButton("0");
        button0.setBounds(140,360,100,80);
        button0.addActionListener(this);
        contentPane.add(button0);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(10,360,100,80);
        buttonPlus.addActionListener(this);
        contentPane.add(buttonPlus);

        JButton buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(270,360,100,80);
        buttonSubtract.addActionListener(this);
        contentPane.add(buttonSubtract);

        JButton buttonMul = new JButton("*");
        buttonMul.setBounds(10,450,100,80);
        buttonMul.addActionListener(this);
        contentPane.add(buttonMul);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(270,450,100,80);
        buttonEqual.addActionListener(this);
        contentPane.add(buttonEqual);

        JButton buttonDiv = new JButton("/");
        buttonDiv.setBounds(140,450,100,80);
        buttonDiv.addActionListener(this);
        contentPane.add(buttonDiv);
    }

    public void actionPerformed(ActionEvent e){
        String btn = e.getActionCommand();
        text += btn;
        jTextfield.setText(text);
    }
}

public class calculator {
    public static void main (String[] args){
        MyJFrame f1 = new MyJFrame();
    }
}

