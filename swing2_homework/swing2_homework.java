import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import java.awt.*;

class MyJFrame3 extends JFrame {
    private JPanel contentPane;
    int index = 0;
    public MyJFrame3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("homework");
        setBounds(10, 10, 600, 600);
        setVisible(true);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        ImageIcon icon1 = new ImageIcon("C:\\Users\\user\\Desktop\\java.jpg");
        icon1.setImage(icon1.getImage().getScaledInstance(500, 400,DO_NOTHING_ON_CLOSE));
        ImageIcon icon2 = new ImageIcon("C:\\Users\\user\\Desktop\\java2.jpg");
        icon2.setImage(icon2.getImage().getScaledInstance(500, 400,DO_NOTHING_ON_CLOSE));
        ImageIcon icon3 = new ImageIcon("C:\\Users\\user\\Desktop\\java3.jpg");
        icon3.setImage(icon3.getImage().getScaledInstance(500, 400,DO_NOTHING_ON_CLOSE));

        ImageIcon iconList[]={icon1, icon2, icon3};
        String nameList[] = {"一隻狗","兩隻狗","三隻狗"};

        JLabel lab1 = new JLabel(iconList[0]);
        contentPane.add(lab1,BorderLayout.CENTER);

        JLabel lab2 = new JLabel(nameList[0], JLabel.CENTER); 
        //lab2.setBounds(0,0,1,1);
        contentPane.add(lab2,BorderLayout.NORTH);

        JPanel btn = new JPanel(new GridLayout(1,2));
        JButton btnPrevious = new JButton("上一張");
        btnPrevious.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                index--;
                if(index < 0 ||index > 2){
                    lab2.setText("");
                    lab1.setIcon(null);
                    JOptionPane.showMessageDialog(null, "沒有圖片了");
                }
                else{
                    lab1.setText(null);
                    lab2.setText(nameList[index]);
                    lab1.setIcon(iconList[index]);
                }
            }
        });
        btn.add(btnPrevious);

        JButton btnNext = new JButton("下一張");
        btnNext.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                index++;
                if(index < 0 ||index > 2){
                    lab2.setText("");
                    lab1.setIcon(null);
                    JOptionPane.showMessageDialog(null, "沒有圖片了");
                }
                else{
                    lab1.setText(null);
                    lab2.setText(nameList[index]);
                    lab1.setIcon(iconList[index]);
                }
            }
        });
        btn.add(btnNext);
        contentPane.add(btn, BorderLayout.SOUTH);
    }
}

public class swing2_homework {
    public static void main (String args[]){
        MyJFrame3 f1 = new MyJFrame3();
    }
}