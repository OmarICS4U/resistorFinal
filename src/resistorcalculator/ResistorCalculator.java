/*
 * Omar Sayyed
2020-03-03
calculates resistor values when given colour values
 */
package resistorcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Omara
 */
public class ResistorCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//declare variables
       String myInput;
        int firstBand = 0;
        int secondBand = 0;
        int thirdBand = 0;

         //collect phrase from user
        myInput = JOptionPane.showInputDialog("Please enter all three band colours, sepereated by hyphens");
        //Convert all characters to uppercase
        myInput=myInput.toUpperCase();
    
       //seperates the seperate words from the hyphens
        String[] bands = myInput.split("-");
        String stripe1=bands[0];
        String stripe2=bands[1];
        String stripe3=bands[2];
        //prints out user's input
        System.out.println("You entered:");
        System.out.println(bands[0]);
        System.out.println(bands[1]);
        System.out.println(bands[2]);
        
        //Array with the colours and their respective values
         String colour []=new String [10];
                colour [0] = "BLACK";
                colour [1] = "BROWN";
                colour [2] = "RED";
                colour [3] = "ORANGE";
                colour [4] = "YELLOW";
                colour [5] = "GREEN";
                colour [6] = "BLUE";
                colour [7] = "VIOLET";
                colour [8] = "GREY";
                colour [9] = "WHITE";
   
        
                
        // checks first stripe and returns it's value
        if(colour[0].equals(stripe1)){
              firstBand=0;
          }else if(colour[1].equals(stripe1)){
              firstBand=1;
          }else if(colour[2].equals(stripe1)){
              firstBand=2;
          }else if(colour[3].equals(stripe1)){
              firstBand=3;
          }else if(colour[4].equals(stripe1)){
              firstBand=4;
          }else if(colour[5].equals(stripe1)){
              firstBand=5;
          }else if(colour[6].equals(stripe1)){
              firstBand=6;
          }else if(colour[7].equals(stripe1)){
              firstBand=7;
          }else if(colour[8].equals(stripe1)){
              firstBand=8;
          }else if(colour[9].equals(stripe1)){
              firstBand=9;
          }
        
        
          // checks second stripe and returns it's value
        if(colour[0].equals(stripe2)){
              secondBand=0;
          }else if(colour[1].equals(stripe2)){
              secondBand=1;
          }else if(colour[2].equals(stripe2)){
              secondBand=2;
          }else if(colour[3].equals(stripe2)){
              secondBand=3;
          }else if(colour[4].equals(stripe2)){
              secondBand=4;
          }else if(colour[5].equals(stripe2)){
              secondBand=5;
          }else if(colour[6].equals(stripe2)){
              secondBand=6;
          }else if(colour[7].equals(stripe2)){
              secondBand=7;
          }else if(colour[8].equals(stripe2)){
              secondBand=8;
          }else if(colour[9].equals(stripe2)){
              secondBand=9;
          }
        
        
          // checks third stripe and returns it's value
       if(colour[0].equals(stripe3)){
              thirdBand=0;
          }else if(colour[1].equals(stripe3)){
              thirdBand=1;
          }else if(colour[2].equals(stripe3)){
              thirdBand=2;
          }else if(colour[3].equals(stripe3)){
              thirdBand=3;
          }else if(colour[4].equals(stripe3)){
              thirdBand=4;
          }else if(colour[5].equals(stripe3)){
              thirdBand=5;
          }else if(colour[6].equals(stripe3)){
              thirdBand=6;
          }else if(colour[7].equals(stripe3)){
              thirdBand=7;
          }else if(colour[8].equals(stripe3)){
              thirdBand=8;
          }else if(colour[9].equals(stripe3)){
              thirdBand=9;
              }
       
      
       //calculates the total resistor value, and outputs the result to the user
       double bandValue = (((firstBand*10)+secondBand)* java.lang.Math.pow(10, thirdBand));
        
        System.out.println("The value of the resistor is " + bandValue + "ohms.");
     }
    }
    
    
    
