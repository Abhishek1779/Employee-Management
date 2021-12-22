import javax.swing.*;
import java.awt.event.*;

import javax.swing.*;
public class TestLayout extends JFrame implements ActionListener {
   // JTextPane l;
   JLabel l1, result;
    JTextField t1,t2;
    JButton b;
    JMenuBar mb;
	JMenu menu;
    JMenuItem ep, cp, lo;
    String str;
    
    TestLayout(){
        // l=new JTextPane();
        l1=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b=new JButton("Add");
        result=new JLabel("Result");
        mb=new JMenuBar();
		menu =new JMenu("Menu");
		ep=new JMenuItem("Edit Password");
		cp=new JMenuItem("View Password");
		lo=new JMenuItem("Log out");

        // l.setText("Hell World my name is Isha Panchal I'm a recident of Borivali West Mumbai\n");
        l1.setText("I'm Isha");
        // l.setBounds(10,0,400,400);
        // l.setEditable(false);
        l1.setBounds(50, 150, 150, 30);
        t1.setBounds(50, 200, 50, 30);
        t2.setBounds(150, 200, 50, 30);
        b.setBounds(100, 250, 70, 20);
        result.setBounds(50, 280, 100, 30);
        b.addActionListener(this);
        menu.add(lo);menu.add(cp);menu.add(ep);mb.add(menu);
        setJMenuBar(mb);
        add(result);
        add(b);
        add(t1);
        add(t2);
        // add(l);
        add(l1);
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int r=n1+n2;
        str="Result\n";
        System.out.println(str);
        result.setText("Result :"+r);
    }
    public static void main(String[] args) {
        TestLayout t=new TestLayout();
    }
}
