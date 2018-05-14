/**********************************************************************
 *                              Main                                  *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (August 31, 2016)                                 *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Main serves as the tester for the Shape, Square,    *
 *  and other shape classes.                                          *
 *********************************************************************/
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Main extends JApplet
{
		Color lightBLue = new Color(0, 128, 255);
		Square s1 = new Square(25,25,36, Color.RED);
		Square s2 = new Square(30,30,10, Color.BLACK);
		Square s3 = new Square(0,50,100, Color.BLUE);
		Rectangle r1 = new Rectangle(200, 100, 25, 10, Color.BLUE);
		Rectangle r2 = new Rectangle(100, 150, 45, 100, Color.RED);
		Rectangle r3 = new Rectangle(150, 75, 100, 50, Color.GREEN);
		Circle c1 = new Circle(200, 200, 25, Color.RED);
		Circle c2 = new Circle(200, 300, 15, Color.BLUE);
		Circle c3 = new Circle(300, 200, 50, Color.YELLOW);
		
		public void paint(Graphics canvas)
		{
				s1.paint(canvas);
				s2.paint(canvas);
				s3.paint(canvas);
				r1.paint(canvas);
				r2.paint(canvas);
				r3.paint(canvas);
				c1.paint(canvas);
				c2.paint(canvas);
				c3.paint(canvas);
				
				s1.printInfo();
				s2.printInfo();
				s3.printInfo();
				r1.printInfo();
				r2.printInfo();
				r3.printInfo();
				c1.printInfo();
				c2.printInfo();
				c3.printInfo();
		}

}