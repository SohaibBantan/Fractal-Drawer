//Sohaib Bantan, Banta033@umn.edu
//Leen Al-Otaibi, alota068@umn.edu

package CSCI1933P1;
import java.util.Scanner; 
public class FractalProgram {
 

    // This method should print area of fractal, after the fractal is done drawing.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter from the following: Triangle, Cricle, Rectangle:");
        String nexty = s.nextLine();

    // Below calls methods from FractalDrawer.java
        FractalDrawer drawer = new FractalDrawer();  
        drawer.drawFractal(nexty);
        System.out.println("Total area:" + drawer.totalArea);
    }
}
