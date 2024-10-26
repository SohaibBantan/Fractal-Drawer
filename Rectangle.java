//Sohaib Bantan, Banta033@umn.edu
//Leen Al-Otaibi, alota068@umn.edu

package CSCI1933P1;
import java.awt.Color;

public class Rectangle {
    double x_Pos;
    double y_Pos;
    double width; 
    double height;
    Color want_Color;

    public Rectangle(double x, double y, double w, double h) {
        this.x_Pos = x;
        this.y_Pos = y;
        this.width = w;
        this.height = h;
    }

    public double calculatePerimeter() {
        return (2*width) + (2*height);

    }

    public double calculateArea() {
        return width * height;
    }

    // Setters below

    public void setColor(Color color) {
        this.want_Color = color;
    }

    public void setPos(double x, double y) {
        this.x_Pos = x;
        this.y_Pos = y;
    }

    public void setHeight(double h) {
        this.height = h;
    }
    public void setWidth(double w) {
        this.width = w;
    }

    //Getters below

    public Color getColor() {
        return this.want_Color;
    }
    
    public double getXPos() {
        return this.x_Pos;
    }

    public double getYPos() {
        return this.y_Pos;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }









}
