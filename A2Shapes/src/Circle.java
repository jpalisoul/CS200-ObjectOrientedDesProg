/**********************************************************************
 *                             Circle                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 31, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Circle is an class extending the Shape class,       *
 *  defining the properties of a Circle.                              *
 *********************************************************************/
import java.awt.Color;
import java.awt.Graphics;

public final class Circle extends Shape {

	// Fields
	private double radius;
	
	// Constructor
	public Circle(int x, int y, double radius, Color color)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return Math.PI*radius*radius; }
	public double getPerimeter() { return 2*Math.PI*radius; }
	public void printInfo()
	{
		System.out.println("Circle:"+
						 "\n Coordinates: ("+getX()+", "+getY()+")"+
						 "\n  Color: "+getColor()+
						 "\n  Radius: "+radius+
				         "\n  Area: "+getArea()+
				         "\n  Circumference: "+getPerimeter());
	}
	
	// Define methods for Square
	public double getVSideLength() {	return radius; }
	
	public void paint(Graphics canvas)
	{
			canvas.setColor(color);
			canvas.fillOval(x, y, (int)(radius), (int)(radius));
	}

}