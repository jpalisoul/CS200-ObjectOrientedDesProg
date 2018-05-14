/**********************************************************************
 *                             Hexagon                                *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 24, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Hexagon is an class extending the Shape class,      *
 *  defining the properties of a Hexagon.                             *
 *********************************************************************/
public final class Hexagon extends Shape {

	// Fields
	private double sideLength;
	
	// Constructor
	public Hexagon(double s, String c)
	{
		sideLength = s;
		setColor(c);
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return (1.0 / 3.0) * Math.sqrt(6 * (5 + 2 * Math.sqrt(6))) * Math.pow(sideLength, 2); }
	public double getPerimeter() { return 5*sideLength; }
	public void printInfo()
	{
		System.out.println("Hexagon:\n  Color: "+getColor()+
				         "\n  SideLength: "+sideLength+
				         "\n  Area: "+getArea()+
				         "\n  Perimeter: "+getPerimeter());
	}
	
	// Define methods for Square
	public double getSideLength() {	return sideLength; }

}
