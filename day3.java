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
