This project is a fractal drawing application. It uses Java to implement recursive algorithms to draw fractals of different shapes on a canvas, including triangles, circles, and rectangles. The project focuses on implementing object-oriented principles and recursive drawing techniques.

📜 Overview
The Fractal Drawing Project allows users to draw fractal patterns for different shapes using recursive methods. The program supports three shapes: Triangle, Circle, and Rectangle. Each shape is drawn using Java's graphics capabilities, with a custom Canvas class to manage rendering.

🛠️ Features
Object-Oriented Design: Implements shape classes (Circle, Rectangle, Triangle) with specific properties and methods.
Fractal Generation: Recursive algorithms to draw fractal patterns for each shape.
Graphical Rendering: Uses Java's AWT and Swing libraries to render shapes on a canvas.

🏁 Getting Started
Prerequisites
Java Development Kit (JDK) version 8 or later

Installation
Clone the repository to your local machine:


Copy code:
git clone https://github.com/SohaibBantan/fractal-drawing-project.git
cd fractal-drawing-project

Compile the project:

Copy code:
javac *.java

Run the main class:


Copy code:
java FractalProgram

📂 Project Structure

Canvas.java: Handles the canvas rendering and manages lists of shapes.

Circle.java, Rectangle.java, Triangle.java: Define the individual shape classes with properties and methods like 
calculateArea and calculatePerimeter.

FractalDrawer.java: Contains methods to draw each shape's fractal using recursive techniques.

FractalProgram.java: The entry point of the program, which interacts with the user to select a shape and initiate the fractal drawing process.

🚀 Usage
Run the program using the steps above.

Enter a shape type from the options provided (Triangle, Circle, or Rectangle).

The program will draw the fractal on a graphical canvas and print the total area of the drawn fractal.

📧 Contact
For any questions or feedback, please reach out to:

Sohaib Bantan (banta033@umn.edu)
