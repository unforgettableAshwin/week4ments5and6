package week4;

import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class midtermProblem4frogger extends GraphicsProgram
{
	public void init()
	{
		addMouseListeners();
		frog.setFilled( true );
		frog.setFillColor( Color.GREEN );
		
		//	Center frog on the bottom row:
		add( frog, ( NCOLS - 1 ) / 2 * SQSIZE, ( NROWS - 1 ) * SQSIZE );
		
		//	Show grid:
//		GRect gridSquare;
//		for( byte x = 0; x < NCOLS; x++ )
//			for( byte y = 0; y < NROWS; y++ )
//			{
//				gridSquare = new GRect( SQSIZE, SQSIZE );
//				add( gridSquare, x * SQSIZE, y * SQSIZE );
//			}
	}

	public void mousePressed(
			MouseEvent e
	)
	{ // Frog's center:
		frogX = frog.getX() + SQSIZE / 2;
		frogY = frog.getY() + SQSIZE / 2;

		// Difference between the frog and Click:
		double diffX = e.getX() - frogX;
		double diffY = e.getY() - frogY;

		// Move horizontally or vertically:
		boolean moveHorizontally = Math.abs( diffX ) > Math.abs( diffY );
		
		//	Move the correct distance in the correct direction:
		double offsetX = 0;
		double offsetY = 0;
		if( moveHorizontally )
			if( diffX > 0 )
				offsetX = SQSIZE;
			else
				offsetX = -SQSIZE;
		else
			if( diffY > 0 )
				offsetY = SQSIZE;
			else
				offsetY = -SQSIZE;

		double newLeft = offsetX + frogX;
		double newTop = offsetY + frogY;
		//	Check boundaries before moving:
		if( newLeft >= 0 && newLeft <= APPLICATION_WIDTH )
			if( newTop >= 0 && newTop <= APPLICATION_HEIGHT )
				frog.move( offsetX, offsetY );
	}

	public static final int SQSIZE = 75;
	public static final int NCOLS = 11;
	public static final int NROWS = 4;
	public static final int APPLICATION_WIDTH = SQSIZE * NCOLS;
	public static final int APPLICATION_HEIGHT = SQSIZE * NROWS;

	private static final long serialVersionUID = 1L;

	//	The frog's current position (centered):
	double frogX;
	double frogY;

	GRect frog = new GRect( SQSIZE, SQSIZE );
}
