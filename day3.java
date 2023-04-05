import java.awt.*;
import java.awt.event*;  // to import Events and Listner

class MyGame{
static int h = 0, m=0, s=0;  // read in timer section below
public static void main(String agrs[]){

JFrame f= new JFrame("Puzzle game")//Frame can be created without any parameter
Jpanel centre = new JPanel();

//Panel to hold 9 button at centre of frame
JPanel centre = new JPanel();
centre.setLayout(new GridLayout(3,3));

  
  
for(int i=0; i<9; i++){
        JButton b= new JButton();
        centre.add(b);

        b.addActionListner();  // whenever button is clicked , listner is registered with it
    }

f.add(center); 
  
  
  
  /* 'Timer' on the top and name of player OR ' Date and Time at the bottom ' are labels*/ 

JLabel date = new JLabel("Date and time",JLabel.CENTER); 
JLabel date = new JLabel("Timer");    
//    DEFAULT VALUE of their allignment is 'Left'
