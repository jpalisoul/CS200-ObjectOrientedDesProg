/**********************************************************************
 *                              Main                                  *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 24, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Main serves as the tester for the Shape, Square,    *
 *  and other shape classes.                                          *
 *********************************************************************/
public class Main {

	// Define main method
	public static void main(String[] args) {
		
		// Instantiate two squares
		Square s1 = new Square(2.5, "blue");
		Square s2 = new Square(17, "green");
		// Instantiate two circles
		Circle c1 = new Circle(2.5, "yellow");
		Circle c2 = new Circle(17, "aqua");
		// Instantiate two rectangles
		Rectangle r1 = new Rectangle(2.5, 4, "violet");
		Rectangle r2 = new Rectangle(17, 10, "black");
		// Instantiate two hexagons
		Hexagon h1 = new Hexagon(2.5, "red");
		Hexagon h2 = new Hexagon(17, "purple");
		// Output squares
		s1.printInfo();
		s2.printInfo();
		// Output circles
		c1.printInfo();
		c2.printInfo();
		// Output rectangles
		r1.printInfo();
		r2.printInfo();
		// Output hexagons
		h1.printInfo();
		h2.printInfo();
	}

}
