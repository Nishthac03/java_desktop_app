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
    
    String[] temp={"Celcius","Farenheit","Kelvin"};
    JTextFeld t1 = new JTextFeild(10);
    JComboBox <String> jc1= new JComboBox<>(temp);
    
    
    JTextFeld t2 = new JTextFeild(10);
    JComboBox <String> jc2= new JComboBox<>(temp);
    
    jf.setVisible(True);
  }
}
