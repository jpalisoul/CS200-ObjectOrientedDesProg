/**********************************************************************
 *                             Circle                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 24, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Circle is an class extending the Shape class,       *
 *  defining the properties of a Circle.                              *
 *********************************************************************/
public final class Circle extends Shape {

	// Fields
	private double radius;
	
	// Constructor
	public Circle(double r, String c)
	{
		radius = r;
		setColor(c);
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return Math.PI*radius*radius; }
	public double getPerimeter() { return 2*Math.PI*radius; }
	public void printInfo()
	{
		System.out.println("Circle:\n  Color: "+getColor()+
				         "\n  Radius: "+radius+
				         "\n  Area: "+getArea()+
				         "\n  Circumference: "+getPerimeter());
	}
	
	// Define methods for Circle
	public double getRadius() {	return radius; }

}
