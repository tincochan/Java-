import javax.swing.*;
import java.awt.*;



public class exam1 {
    JTextField ID;
    JTextField name;
    JTextField birthday;
    JTextField number;
    JTextField result;
    JRadioButton rb1, rb2;
    JCheckBox cb1, cb2, cb3, cb4;
    JCheckBox cb5, cb6, cb7, cb8;
    JComboBox cb;
    JButton btn, btn1;
    JLabel lblID, lblName, lblBirthday, lblNumber, lblResult, lblDep, msg, msg1;
    ButtonGroup group = new ButtonGroup();
    String[] depart = {
        "A市",
        "B市",
        "C市",
        "D市"
    };

    public static void main(String args[]) {
        JFrame f = new JFrame("学生信息表");
        exam1 xuesheng = new exam1();
        JPanel pane = xuesheng.init();
        f.getContentPane().add(pane);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.setVisible(true);
    }
    public JPanel init() {
        JPanel p = new JPanel();
        JPanel p1 = new JPanel(new GridLayout(2, 1));
        JPanel p2 = new JPanel(new GridLayout(4, 1));
        p1.setBorder(BorderFactory.createTitledBorder("SEX"));
        lblID = new JLabel("ID");
        ID = new JTextField(6);
        lblName = new JLabel("name");
        name = new JTextField(6);
        lblBirthday = new JLabel("birthday");
        birthday = new JTextField(6);
        lblNumber = new JLabel("number");
        number = new JTextField(6);
        lblResult = new JLabel("result");
        result = new JTextField(6);
        lblDep = new JLabel("home");
        msg = new JLabel("单机“操作”按钮时，输入下一个学生的信息");
        btn = new JButton("操作");
        msg1 = new JLabel("单机“退出”按钮时，结束信息的输入，退出程序");
        btn1 = new JButton("退出");
        rb1 = new JRadioButton("男性");
        rb2 = new JRadioButton("女性");
        p1.add(rb1);
        p1.add(rb2);
        group.add(rb1);
        group.add(rb2);
        JComboBox cb = new JComboBox(depart);
        p.add(lblID);
        p.add(ID);
        p.add(lblName);
        p.add(name);
        p.add(lblBirthday);
        p.add(birthday);
        p.add(lblNumber);
        p.add(number);
        p.add(lblResult);
        p.add(result);
        p.add(lblDep);
        p.add(cb);
        p.add(p1);
        p.add(p2);
        p.add(btn);
        p.add(msg);
        p.add(btn1);
        p.add(msg1);
        return p;
    }

}