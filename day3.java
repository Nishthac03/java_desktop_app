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
  
  
  
// Font style
Font font1 = new Font(Font.SERIF, Font.BOLD, 48); // type ,  style , size
Font font2 = new Font(Font.SANS_SERIF, 3 ,36 );   // number constants can be used for font style (here -->3 = BOLD + ITALIC)
// default font is passed in case an invalid font type is passed
// all three paramerters are necessary to be passed to Font() and in same order (string, int , int)

date.setFont(font2);  // to apply font --> .setFont() is used
date.setFont(font1);

  /* Font is a helper class 
Font(String name , int style, int size)

there are constants defined for font style
0 --> FONT.PLAN
1 --> FONT.BOLD
2 --> FONT.ITALIC
3 --> BOLD + ITALIC
  */
  

date.setFont(font2);  // to apply font --> .setFont() is used
date.setFont(font1);

f.add(timer, BorderLayout.NORTH);     /*  to display timer at the top  -->  BorderLayout.NORTH  */
f.add(date, BorderLayout,SOUTH);

  
  LocalDate dt = LocalDate.now();   // to take local time of machine
LocalTime lt = LocalTime.now();   

  date.setText(dt + "\t" + lt);  // set method will set the date and tie to the label


timer.setText(""+h + " : " + m + " : " + s); 
  

Thread timer_thread = new Thread(
  /*Lambda to implement run() */
() -> {
         while true()
         {
              s ++;

              if ( s == 60){
                m++;
                s=0;  
              }
              if ( m == 60 ){
                h++;
                m=0;
              }
try{
        Thread.sleep(1000); // takes time in milli second
        // sleep method is static method
        // sleep method throws Interrupted exception 
}
catch (InterrupterException e){}

         }
      }
);

  
  //properties of frame
f.setSize(600,600);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVsible(true);

}
}
