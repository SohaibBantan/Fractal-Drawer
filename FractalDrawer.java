//Sohaib Bantan, Banta033@umn.edu
//Leen Al-Otaibi, alota068@umn.edu

package CSCI1933P1;
// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;

public class FractalDrawer {
    public  double totalArea=0;  // member variable for tracking the total area
    public int color_Idx = 0;
    public FractalDrawer() {}  // contructor

    Color[] colory_Array = {Color.RED,Color.BLUE,Color.GREEN,Color.PINK,Color.BLACK,Color.YELLOW,Color.CYAN}; // Used in the three shape drawing methods. Alternates color each recursion step.



    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas myCanva = new Canvas(750,750);
        switch (type) {   // checks with input and breaks
            case "Triangle":
                drawTriangleFractal(100, 150, 350, 400, colory_Array[color_Idx], myCanva, 0);
                break;
            case "Circle":
                drawCircleFractal(50, 350, 350,  colory_Array[color_Idx], myCanva, 0);
                break;
            case "Rectangle":
                drawRectangleFractal(100, 100, 350, 350, colory_Array[color_Idx], myCanva, 0);
                break;
        }
        return  totalArea;
        

    }
    

    
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        Triangle my_Tri = new Triangle(x, y, width, height);
        my_Tri.setColor(c);
        can.drawShape(my_Tri);
        totalArea += my_Tri.calculateArea();
        if (level < 7) {  
            drawTriangleFractal(width/2, height/2, x-(width/2), y, colory_Array[level], can, level+1);
            drawTriangleFractal(width/2, height/2, x + width, y, colory_Array[level], can, level+1);
            drawTriangleFractal(width/2, height/2, x + (width/4), y-(height/2), colory_Array[level], can, level+1);
        }

    }



    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        Circle my_Circ = new Circle(x,y, radius);
        my_Circ.setColor(c);
        can.drawShape(my_Circ);
        totalArea += my_Circ.calculateArea();
        if (level < 7) {
            drawCircleFractal(radius/2, x + 2*radius, y + 2*radius, colory_Array[level], can, level+1);
            drawCircleFractal(radius/2, x - 2*radius, y + 2*radius, colory_Array[level], can, level+1);
            drawCircleFractal(radius/2, x, y + 2*radius, colory_Array[level], can, level+1);
            drawCircleFractal(radius/2, x, y - 2*radius, colory_Array[level], can, level+1);
        }

    }



    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        Rectangle my_Rect = new Rectangle(x,y,width,height);
        my_Rect.setColor(c);
        can.drawShape(my_Rect);
        totalArea += my_Rect.calculateArea();
        if (level < 7) { 
            drawRectangleFractal(width/2, height/2, x + (width), y ,colory_Array[level] , can, level+1);
            drawRectangleFractal(width/2, height/2, x - (width), y , colory_Array[level], can, level+1);
            drawRectangleFractal(width/2, height/2, x , y + (height), colory_Array[level], can, level+1);
            drawRectangleFractal(width/2, height/2, x, y - (height), colory_Array[level], can, level+1);
        
        

    }
    
}
}
