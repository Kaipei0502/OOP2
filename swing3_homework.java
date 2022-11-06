import javax.swing.*;
import javax.swing.event.*;

class MyJFrame5 extends JFrame implements ListSelectionListener{
    JLabel lab;
    JList<String> list;
    JTextArea textarea;
    String city[] = {"台北", "桃園", "台中", "彰化", "南投", "嘉義", "屏東", "宜蘭"};;
    String mountain[] = {"象山", "龜山", "梨山", "八卦山", "合歡山", "阿里山", "大武山", "抹茶山"};
    
    public MyJFrame5(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("各地名山");
        setBounds(100, 100, 400, 500);
        setVisible(true);
        setLayout(null);

        lab = new JLabel("找各地名山：");
        add(lab);
        lab.setBounds(40,50,80,50);

        list = new JList<String>(city);
        list.addListSelectionListener(this);
        JScrollPane scroll1 = new JScrollPane(list);
        add(scroll1);
        scroll1.setBounds(130,20, 100, 100);

        textarea = new JTextArea("可選取地名...");
        JScrollPane scroll2 = new JScrollPane(textarea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll2.setBounds(40,150,200,100);
        add(scroll2);
    }
    public void valueChanged(ListSelectionEvent e){
        String result = "";
        for(int i = 0 ; i < city.length ; i++){
            if(list.isSelectedIndex(i)){
                result = result + city[i]+"名山 : "+ mountain[i] + "\n";
            }
        }
        textarea.setText(result);
    }
}

public class swing3_homework {
    public static void main (String[] args){
        MyJFrame5 f5 = new MyJFrame5();
    }
}