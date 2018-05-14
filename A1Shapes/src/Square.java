/**********************************************************************
 *                             Square                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 24, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Square is an class extending the Shape class,       *
 *  defining the properties of a square.                              *
 *********************************************************************/
public final class Square extends Shape {

	// Fields
	private double sideLength;
	
	// Constructor
	public Square(double s, String c)
	{
		sideLength = s;
		setColor(c);
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return sideLength*sideLength; }
	public double getPerimeter() { return 4*sideLength; }
	public void printInfo()
	{
		System.out.println("Square:\n  Color: "+getColor()+
				         "\n  SideLength: "+sideLength+
				         "\n  Area: "+getArea()+
				         "\n  Perimeter: "+getPerimeter());
	}
	
	// Define methods for Square
	public double getSideLength() {	return sideLength; }

}
