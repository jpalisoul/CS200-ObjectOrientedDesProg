/**********************************************************************
 *                          Rectangle                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 24, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Rectangle is an class extending the Shape class,    *
 *  defining the properties of a Rectangle.                           *
 *********************************************************************/
public final class Rectangle extends Shape {

	// Fields
	private double VsideLength;
	private double HsideLength;
	
	// Constructor
	public Rectangle(double V, double H, String c)
	{
		VsideLength = V;
		HsideLength = H;
		setColor(c);
	}
	
	// Define abstract methods from Shape
	public double getArea()  { return VsideLength*HsideLength; }
	public double getPerimeter() { return (2*VsideLength)+(2*HsideLength); }
	public void printInfo()
	{
		System.out.println("Rectangle:\n  Color: "+getColor()+
				         "\n  VerticleSideLength: "+VsideLength+
				         "\n  HorizontalSideLength: "+HsideLength+
				         "\n  Area: "+getArea()+
				         "\n  Perimeter: "+getPerimeter());
	}
	
	// Define methods for Rectangle
	public double getVSideLength() {	return VsideLength; }
	public double getHSideLength() {	return HsideLength; }
}
