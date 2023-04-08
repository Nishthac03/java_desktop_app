import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CardLayoutTest
{
public static void main(String [] rk)
{
JFrame f = new JFrame("Card Layout");
f.setSize(600, 700);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);

String [] arr = {"Red", "Green", "Yellow", "Magenta", "Cyan"};
JComboBox <String> jcb = new JComboBox<>(arr);
f.add(jcb, BorderLayout.NORTH);

JPanel mainpanel = new JPanel();
CardLayout cl = new CardLayout();
mainpanel.setLayout(cl);
f.add(mainpanel);

JPanel p1 = new JPanel(); p1.setBackground(Color.red);
mainpanel.add(p1, "RED");

JPanel p2 = new JPanel(); p2.setBackground(Color.GREEN);
mainpanel.add(p2, "GREEN");

JPanel p3 = new JPanel(); p3.setBackground(Color.YELLOW);
mainpanel.add(p3, "YELLOW");

JPanel p4 = new JPanel(); p4.setBackground(Color.magenta);
mainpanel.add(p4, "MAGENTA");

JPanel p5 = new JPanel(); p5.setBackground(Color.CYAN);
mainpanel.add(p5, "CYAN");

class MyListener implements ItemListener
{
public void itemStateChanged(ItemEvent e)
{
String item = (String)jcb.getSelectedItem();
cl.show(mainpanel, item.toUpperCase());
}
}
jcb.setBackground(Color.YELLOW);
jcb.setForeground(Color.BLUE);

f.setVisible(true);
int i = 0;
while(i<5)
{
jcb.setSelectedIndex(i++);
cl.show(mainpanel, ((String)jcb.getSelectedItem()).toUpperCase());
try{Thread.sleep(3000); }
catch(Exception ex) {}
}

MyListener ml = new MyListener();
jcb.addItemListener(ml);


}
}
