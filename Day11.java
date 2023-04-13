import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class TestPage
{
private static ResultSet rs = null;
public static void main(String [] rk)
{
Connection con = null;

//Database Connection
try{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STC", "root", "Ravi@1987");
PreparedStatement ps = con.prepareStatement("select * from questionbank where tag = ?");
ps.setString(1, "GK");
rs = ps.executeQuery();
rs.next();
}
catch(Exception ex) { System.out.println(ex); }
JFrame f = new JFrame("Attempt Test");
f.setSize(820, 800);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);
f.getContentPane().setBackground(Color.PINK);
f.setLayout(null);

Font plain = new Font("Serif", 0, 30);
Font bold1 = new Font("Serif", 1, 30);
Font bold = new Font("Serif", 1, 20);

JLabel question = new JLabel("Question statement goes here..."); question.setFont(bold);
JRadioButton opa = new JRadioButton("Option a"); opa.setFont(plain);
JRadioButton opb = new JRadioButton("Option b"); opb.setFont(plain);
JRadioButton opc = new JRadioButton("Option c"); opc.setFont(plain);
JRadioButton opd = new JRadioButton("Option d"); opd.setFont(plain);

JButton next = new JButton("NEXT"); next.setFont(bold);
JButton prev = new JButton("PREVIOUS"); prev.setFont(bold);
JButton clear = new JButton("CLEAR"); clear.setFont(bold);
JButton end = new JButton("END TEST"); end.setFont(bold);

end.setBounds(40, 700, 150, 40);
prev.setBounds(250, 700, 150, 40);
next.setBounds(450, 700, 150, 40);
clear.setBounds(630, 700, 150, 40);
f.add(next); f.add(prev); f.add(clear); f.add(end);

f.add(opa); opa.setBounds(180, 300, 500, 50);
f.add(opb); opb.setBounds(180, 370, 500, 50);
f.add(opc); opc.setBounds(180, 440, 500, 50);
f.add(opd); opd.setBounds(180, 510, 500, 50);
opa.setBackground(Color.PINK);
opa.setForeground(Color.BLUE);
opa.setFont(plain);
opb.setFont(plain);
opc.setFont(plain);
opd.setFont(plain);
opb.setBackground(Color.PINK);
opb.setForeground(Color.BLUE);
opc.setBackground(Color.PINK);
opc.setForeground(Color.BLUE);
opd.setBackground(Color.PINK);
opd.setForeground(Color.BLUE);

ButtonGroup bg = new ButtonGroup();
bg.add(opa); bg.add(opb);
bg.add(opc); bg.add(opd);

f.add(question);
question.setBounds(100, 100, 600, 200);
question.setFont(bold1);
question.setForeground(Color.RED);
try{
String q = rs.getString(1);
String a = rs.getString(2);
String b = rs.getString(3);
String c = rs.getString(4);
String d = rs.getString(5);
question.setText(q);
opa.setLabel(a);
opb.setLabel(b);
opc.setLabel(c);
opd.setLabel(d);
}
catch(Exception exc) {System.out.println(exc); }


//Event Handling

class MyListener implements ActionListener, ItemListener
{
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == clear)
bg.clearSelection();

else if(ae.getSource() == end)
{
//display the result page
}
else if(ae.getSource() == next)
{
try{
bg.clearSelection();
rs.next();
String q = rs.getString(1);
String a = rs.getString(2);
String b = rs.getString(3);
String c = rs.getString(4);
String d = rs.getString(5);
question.setText(q);
opa.setLabel(a);
opb.setLabel(b);
opc.setLabel(c);
opd.setLabel(d);
}
catch(Exception exc) {System.out.println(exc); }
}
}

public void itemStateChanged(ItemEvent e)
{

}
}

MyListener ml = new MyListener();
end.addActionListener(ml);
clear.addActionListener(ml);
prev.addActionListener(ml);
next.addActionListener(ml);

opa.addItemListener(ml);
opb.addItemListener(ml);
opc.addItemListener(ml);
opd.addItemListener(ml);

f.setVisible(true);
}
}
