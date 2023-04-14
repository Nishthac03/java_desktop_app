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
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    String[] arr={"Temperature","Wight","Length","Currency"};
    JComboBox<String> jcb= new JComboBox<>(arr);    //<>...is type inference diamond..referring from left side angular bracket
    jcb.addItem("Time");  //inserting at particular index...jcb.insertItemAt("Time",1);
    jf.add(jcb,BorderLayout.NORTH);
    
    JPanel p =new JPanel(); //to add 4 different components in centre
    jf.add(p);
    p.setLayout(null);  //so as to use setBounds..if not null then we can't have exact result of setBounds
    
    String[] temp={"Celcius","Farenheit","Kelvin"};
    JTextField t1 = new JTextField(10);
    JComboBox <String> jc1= new JComboBox<>(temp);
    
    
    JTextField t2 = new JTextField(10);
    t2.setEditable(false);  //for text feild or area
    JComboBox <String> jc2= new JComboBox<>(temp);
    
    p.add(t1);
    t1.setBounds(100,100,200,50);
    p.add(jc1);
    jc1.setBounds(350,100,80,50);
    
    p.add(t2);
    t1.setBounds(100,200,200,50);
    p.add(jc2);
    jc1.setBounds(350,200,80,50);
    
    
    class MyListener implements ItemListener
    {
      public void itemStateChanged(ItemEvent e)
      {
        double input = Doubel.parseDoublet1.getText();
        String input_type = (String)jc1.getSelectedItem(); //can also use e.getItem(); not used here because we have two combo boxes
        String output_type = (String)jc2.getSelectedItem();
        double result= input;
        
        if(input_type.equals("Celsius"))
        {
          if(output_type.equals("Farenheit"))
          {
            result=(input*9/5)+32;
          }
          else if (output_type.equals("Kelvin"))
          {
            result=273.15+input;
          }
        }
        t2.setText(""+result);
      }
    }
    MyListener ml = new MyListener();  //registering the items
    jc1.addItemListener(ml);           //registering the items
    jc2.addItemListener(ml);
    jf.setVisible(true);
  }
}
