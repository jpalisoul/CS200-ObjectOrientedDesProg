/**********************************************************************
 *                             Portal                                 *
 *                                                                    *
 *  Programmed by:  Joseph Palisoul  								  *
 *  Class:  CS200   (September 7th, 2016)                             *
 *  Instructor:  Dean Zeller                                          *
 *                                                                    *
 *  Description:  A 'compound object' that draws a neat-looking       *
 *  picture using many instances of the various shape classes. 		  *
 *********************************************************************/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public final class Portal {

	int X, Y, shapeSize, numShapes;
	Color colran = null;

	public Portal(int X, int Y, int shapeSize, int numShapes)
	{
		this.X = X;
		this.Y = Y;
		this.shapeSize = shapeSize;
		this.numShapes = numShapes;
	}

	public void paint(Graphics canvas) 
	{
		drawCircles(canvas, X, Y, shapeSize, numShapes, colran);
	}


	public void drawCircles(Graphics canvas, int X, int Y, int shapeSize, int numShapes, Color colran) {
		for (int i = 0; i < numShapes; i++) {
			int ranX = new Random().nextInt(1500);
			int ranY = new Random().nextInt(1500);
			int ranSize = new Random().nextInt(120) + 30; // [0-120] to [30-150]
			int num = new Random().nextInt(10) + 1;
			if (num == 1) {
				colran = Color.RED;
			} else if (num == 2) {
				colran = Color.BLACK;
			} else if (num == 3) {
				colran = Color.BLUE;
			} else if (num == 4) {
				colran = Color.GREEN;
			} else if (num == 5) {
				colran = Color.ORANGE;
			} else if (num == 6) {
				colran = Color.PINK;
			} else if (num == 7) {
				colran = Color.MAGENTA;
			} else if (num == 8) {
				colran = Color.GRAY;
			} else if (num == 9) {
				colran = Color.CYAN;
			} else if (num == 10) {
				colran = Color.YELLOW;
			}
			Circle circle = new Circle(ranX, ranY, ranSize, colran);
			circle.paint(canvas);
		}
	}

}
