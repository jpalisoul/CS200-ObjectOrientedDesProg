/**********************************************************************
 *                          Rectangle                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 31, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Rectangle is an class extending the Shape class,    *
 *  defining the properties of a Rectangle.                           *
 *********************************************************************/
import java.awt.Color;
import java.awt.Graphics;

public final class Rectangle extends Shape {

	// Fields
	private double VsideLength;
	private double HsideLength;
	
	// Constructor
	public Rectangle(int x, int y, double VsideLength, double HsideLength, Color color)
	{
		this.x = x;
		this.y = y;
		this.VsideLength = VsideLength;
		this.HsideLength = HsideLength;
		this.color = color;
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return VsideLength*HsideLength; }
	public double getPerimeter() { return (2*VsideLength)+(2*HsideLength); }
	public void printInfo()
	{
		System.out.println("Rectangle:"+
						 "\n Coordinates: ("+getX()+", "+getY()+")"+
						 "\n  Color: "+getColor()+
				         "\n  VSideLength: "+VsideLength+
				         "\n  HSideLength: "+HsideLength+
				         "\n  Area: "+getArea()+
				         "\n  Perimeter: "+getPerimeter());
	}
	
	// Define methods for Square
	public double getVSideLength() {	return VsideLength; }
	public double getHSideLength() {	return HsideLength; }
	
	public void paint(Graphics canvas)
	{
			canvas.setColor(color);
			canvas.fillRect(x, y, (int)(HsideLength), (int)(VsideLength));
	}

}