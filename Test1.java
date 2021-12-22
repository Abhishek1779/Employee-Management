import javax.swing.*;
import java.awt.event.*;

public class Test1 extends JFrame // implements ActionListener
{
    String name, mail_id,address,department,pass;
    double no1,no2,id;
    int a1=0,m1=0,s1=0,su1,si1,i=0,j=0;
    
    JLabel n1,mid1,dept1,eid1,add1,pnl1,pnl2,pw1,note;
    
    JTextField n,mid,dept,eid,pn1,pn2,pw;

    JTextArea add;
    
    JButton b,su,si,ad,m,s,bk;
    
    Test1(){

        ActionListener al=new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==ad){
                    su.setVisible(true);si.setVisible(true);bk.setVisible(true);
                    ad.setVisible(false);s.setVisible(false);m.setVisible(false);
                    a1=1;
                }
                else if(e.getSource()==s){
                    s1=1;
                    ad.setVisible(false);s.setVisible(false);m.setVisible(false);
                    su.setVisible(true);si.setVisible(true);bk.setVisible(true);
                }
                else if(e.getSource()==m){
                    su.setVisible(true);si.setVisible(true);bk.setVisible(true);
                    m1=1;
                    ad.setVisible(false);s.setVisible(false);m.setVisible(false);
                }
                else if(e.getSource()==su && (a1==1 || s1==1 ||m1==1)){
                    su.setVisible(false);si.setVisible(false);
                    su1=1;
                    n1.setVisible(true);n.setVisible(true);mid.setVisible(true);mid1.setVisible(true);
                    add.setVisible(true);add1.setVisible(true);pnl1.setVisible(true);pn1.setVisible(true);pnl2.setVisible(true);
                    pn2.setVisible(true);pw1.setVisible(true);pw.setVisible(true);bk.setVisible(true);
                    if(s1==1 || m1==1){
                        b.setVisible(true);eid1.setVisible(true);eid.setVisible(true);dept1.setVisible(true);dept.setVisible(true);
                    }
                    else if(a1==1){
                        b.setBounds(200,500,70,30);
                        b.setVisible(true);
                    }
                }
                else if(e.getSource()==si && (a1==1 || s1==1 || m1==1)){
                    su.setVisible(false);si.setVisible(false);
                    pw1.setBounds(10,150,100,30);
                    pw.setBounds(120,150,280,30);
                    b.setBounds(200,200,70,30);
                    si1=1;
                    n1.setVisible(true);n.setVisible(true);
                    pw1.setVisible(true);pw.setVisible(true);
                    b.setVisible(true);bk.setVisible(true);
                }
                else if(e.getSource()==bk && (a1==1 || s1==1 || m1==1) && su1==1){
                    su1=0;
                    //invisible
                    n1.setVisible(false);n.setVisible(false);mid1.setVisible(false);mid.setVisible(false);dept1.setVisible(false);dept.setVisible(false);
                    add1.setVisible(false);add.setVisible(false);pnl1.setVisible(false);pn1.setVisible(false);eid1.setVisible(false);eid.setVisible(false);
                    pnl2.setVisible(false);pn2.setVisible(false);pw1.setVisible(false);pw.setVisible(false);b.setVisible(false);
                    //visible
                    su.setVisible(true);si.setVisible(true);bk.setVisible(true);
                    b.setBounds(200,550,70,30);
                }
                else if(e.getSource()==bk && (a1==1 || s1==1 || m1==1) && si1==1){
                    n1.setVisible(false);n.setVisible(false);
                    pw1.setVisible(false);pw.setVisible(false);
                    b.setVisible(false);bk.setVisible(true);
                    pw1.setBounds(10,450,100,30);
                    pw.setBounds(120,450,280,30);
                    b.setBounds(200,550,70,30);
                    si1=0;
                    su.setVisible(true);
                    si.setVisible(true);
                }
                else if(e.getSource()==bk && (a1==1 || s1==1 || m1==1)){
                    su.setVisible(false);
                    si.setVisible(false);
                    bk.setVisible(false);
                    ad.setVisible(true);
                    s.setVisible(true);
                    m.setVisible(true);
                    if(a1==1) a1=0;
                    else if(s1==1) s1=0;
                    else if(m1==1) m1=0;
                }
                else if(e.getSource()==b && (a1==1 || s1==1 || m1==1) && su1==1){
                    String id1,n1,n2;
                    name=n.getText();
                    mail_id=mid.getText();
                    address=add.getText();
                    n1=pn1.getText();
                    no1=Double.parseDouble(n1);
                    n2=pn2.getText();
                    no2=Double.parseDouble(n2);
                    pass=pw.getText();
                    if(s1==1){
                        department=dept.getText();
                        id1=eid.getText();
                        id=Double.parseDouble(id1);
                        System.out.println("Creating a new Sales Account ...");            //Create a new Object of Sales Class
                    }
                    else if(m1==1){
                        department=dept.getText();
                        id1=eid.getText();
                        id=Double.parseDouble(id1);
                        System.out.println("Creating a new Management Account ...");            //Create a new Object of Management Class
                    }
                    else {
                        System.out.println("Creating a new Admin Account ...");     //Create an Object of Admin Class
            
                    }
                    System.out.println("Name :"+name+"\nEmail ID :"+mail_id+"\nDept :"+department+"\n ID : "+id+"\nAddress :\n"+address+"\nPassword :"+pass);
                    bk.setVisible(true);
                }
                else if(e.getSource()==b && (a1==1 || s1==1 || m1==1) && si1==1){
                    name=n.getText();
                    pass=pw.getText();
                    pw1.setBounds(10,450,100,30);
                    pw.setBounds(120,450,280,30);
                    b.setBounds(200,550,70,30);
                    n1.setVisible(false);n.setVisible(false);pw1.setVisible(false);pw.setVisible(false);b.setVisible(false);;
                    if(a1==1){
                        System.out.println("Checking for Admin Account ...");            //Check for Admin Account
                    }
                    else if(s1==1){
                        System.out.println("Checking for Sales Account ...");            //Check for Sales Account
                    }
                    else if(m1==1){
                        System.out.println("Checking for Management Account ...");            //Check for Management Account
                    }
                }
                else System.out.println("Not working");
            }
            
        };
// All GUI variables code

n1=new JLabel("Name:");
n1.setBounds(10,100,100,30);
// n1.setText();
// n1.setForeground(Color.black);
// n1.setBackground(Color.cyan);
n=new JTextField();
n.setBounds(120,100,280,30);

mid1=new JLabel("E-Mail ID:");
 mid1.setBounds(10,150,100,30);
// mid1.setText();
// mid1.setForeground(Color.black);
// mid1.setBackground(Color.cyan);
mid=new JTextField();
mid.setBounds(120,150,280,30);

dept1=new JLabel("Department:");
dept1.setBounds(10,200,110,30);
// dept1.setText();
// dept1.setForeground(Color.black);
// dept1.setBackground(Color.cyan);
dept=new JTextField();
dept.setBounds(120,200,280,30);

add1=new JLabel("Address:");
add1.setBounds(10,250,100,30);
// add1.setText();
// add1.setForeground(Color.black);
// add1.setBackground(Color.cyan);
add=new JTextArea();
add.setBounds(120,250,280,90);

pnl1=new JLabel("Mobile No1:");
pnl1.setBounds(10,350,100,30);
// pnl1.setText();
// pnl1.setForeground(Color.black);
// pnl1.setBackground(Color.cyan);
pn1=new JTextField();
pn1.setBounds(120,350,280,30);

pnl2=new JLabel("Mobile No2:");
pnl2.setBounds(10,400,100,30);
// pnl2.setText();
// pnl2.setForeground(Color.black);
// pnl2.setBackground(Color.cyan);
pn2=new JTextField();
pn2.setBounds(120,400,280,30);

pw1=new JLabel("Password:");
pw1.setBounds(10,450,100,30);
// pw1.setText();
// pw1.setForeground(Color.black);
// pw1.setBackground(Color.cyan);
pw=new JTextField();
pw.setBounds(120,450,280,30);

eid1=new JLabel("Emp ID:");
eid1.setBounds(10,500,100,30);
// eid1.setText();
// eid1.setForeground(Color.black);
// eid1.setBackground(Color.cyan);
eid=new JTextField();
eid.setBounds(120,500,280,30);

b=new JButton("Submit");
b.setBounds(200,550,70,30);
b.addActionListener(al);
// b.setBackground(Color.green);

ad=new JButton("Admin");
ad.setBounds(200,250,90,40);
// ad.setForeground(Color.white);
// ad.setBackground(Color.DARK_GRAY);
ad.addActionListener(al);

s=new JButton("Sales");
s.setBounds(200,300,90,40);
// s.setForeground(Color.white);
// s.setBackground(Color.DARK_GRAY);
s.addActionListener(al);

m=new JButton("Management");
m.setBounds(180,350,140,40);
// m.setForeground(Color.white);
// m.setBackground(Color.DARK_GRAY);
m.addActionListener(al);

su=new JButton("Sign UP");
su.setBounds(200,250,90,40);
// su.setForeground(Color.white);
// su.setBackground(Color.DARK_GRAY);
su.addActionListener(al);

si=new JButton("Sign IN");
si.setBounds(200,300,90,40);
// si.setForeground(Color.white);
// si.setBackground(Color.DARK_GRAY);
si.addActionListener(al);

bk=new JButton("Back");
bk.setBounds(200,600,70,30);
// bk.setBackground(Color.DARK_GRAY);
// bk.setForeground(Color.white);
bk.addActionListener(al);

note=new JLabel("Note : No more Management Accounts can be created!!");
note.setBounds(10,650,600,30);
// note.setText();
add(note);

// Adding in frame part

add(m);add(s);add(ad);add(n1);add(n);add(mid1);add(mid);add(dept1);add(dept);add(eid1);add(eid);add(add1);add(add);add(pnl1);add(pn1);add(pnl2);add(pn2);add(pw1);add(pw);add(b);add(su);add(si);add(bk);
n1.setVisible(false);n.setVisible(false);mid.setVisible(false);mid1.setVisible(false);dept1.setVisible(false);dept.setVisible(false);eid1.setVisible(false);eid.setVisible(false);add.setVisible(false);add1.setVisible(false);
pnl1.setVisible(false);pn1.setVisible(false);pnl2.setVisible(false);pn2.setVisible(false);pw1.setVisible(false);pw.setVisible(false);b.setVisible(false);su.setVisible(false);si.setVisible(false);bk.setVisible(false);
setSize(500,700);
setLayout(null);
setVisible(true);
// setFont(new Font("Serif",Font.BOLD,20));
// setBackground(Color.cyan);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
public static void main(String[] args) {
    Test1 t=new Test1();
}
}