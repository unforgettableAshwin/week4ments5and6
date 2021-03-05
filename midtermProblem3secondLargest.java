package week4;

import acm.program.*;

public class midtermProblem3secondLargest extends ConsoleProgram
{
	public void run()
	{
		int intRead, largest = 0, largest2nd = 0;

		print( "This program finds the two largest integers in a list. Enter values, one per line, using a " + SENTINEL
				+ " to signal the end of the list." );

		while( true )
		{
			intRead = readInt( " ? " );
			if( intRead == SENTINEL )
				break;

			if( intRead >= largest )
			{
				largest2nd = largest;
				largest = intRead;
			}
			else
				if( intRead >= largest2nd )
					largest2nd = intRead;
		}

		println( "The largest value is " + largest );
		println( "The second largest is " + largest2nd );
	}

	private static final int SENTINEL = 0;

	private static final long serialVersionUID = 1L;
}