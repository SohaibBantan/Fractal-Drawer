//Sohaib Bantan, Banta033@umn.edu
//Leen Al-Otaibi, alota068@umn.edu

package CSCI1933P1;
import java.awt.Color;

public class Circle {
    double x_Pos;
    double y_Pos;
    double radius;
    Color want_Color; 

    public Circle(double x, double y, double inp_Radius) {  
        this.x_Pos = x;
        this.y_Pos = y;
        this.radius = inp_Radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    // Setters Below

    public void setColor(Color inp_Color) {
        this.want_Color = inp_Color;
    }

    public void setPos(double x, double y) {
        this.x_Pos = x;
        this.y_Pos = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getters Below

    public Color getColor() {
        return this.want_Color;
    }

    public double getXPos() {
        return this.x_Pos;
    }
    
    public double getYPos() {
        return y_Pos;
    }

    public double getRadius() {
        return this.radius;
    }

}
