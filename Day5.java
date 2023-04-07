import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class UnitConvertor
{
  public static void main(String rk[])
  {
    JFrame jf= new JFrame();
    jf.setSize(600,400);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOPeration(JFrame.EXIT_ON_CLOSE);
    String[] arr={"Temperature","Wight","Length","Currency"};
    JComboBox<String> jcb= newJComboBox<>(arr);    //<>...is type inference diamond..referring from left side angular bracket
    jcb.addItem("Time");  //inserting at particular index...jcb.insertItemAt("Time",1);
    jf.add(jcb,BorderLayout.NORTH);
    
    JPanel p =new JPanel(); //to add 4 different components in centre
    jf.add(p);
    p.setLayout(null);  //so as to use setBounds..if not null then we can't have exact result of setBounds
    
    String[] temp={"Celcius","Farenheit","Kelvin"};
    JTextFeld t1 = new JTextFeild(10);
    JComboBox <String> jc1= new JComboBox<>(temp);
    
    
    JTextFeld t2 = new JTextFeild(10);
    j2.setEditable(false);  //for text feild or area
    JComboBox <String> jc2= new JComboBox<>(temp);
    
    p.add(t1);
    t1.setBounds(100,100,200,50);
    p.add(jc1);
    jc1.setBounds(350,100,80,50);
    
    p.add(t2);
    t1.setBounds(100,200,200,50);
    p.add(jc2);
    jc1.setBounds(350,200,80,50);
    
    
    jf.setVisible(true);
  }
}
