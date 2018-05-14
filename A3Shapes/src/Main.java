/**********************************************************************
 *                              Main                                  *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (September 7th, 2016)                             *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  Main serves as the tester for the Shape, Square,    *
 *  and other shape classes.                                          *
 *********************************************************************/
import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Main extends JApplet
{
		public void paint(Graphics canvas)
		{
				Portal portal = new Portal(1000,1000,40,20);
				portal.paint(canvas);
		}

}

