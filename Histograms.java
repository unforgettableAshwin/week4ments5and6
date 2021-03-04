package week4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		String line;
		try
		{
			BufferedReader rd = new BufferedReader( new FileReader( FILE_NAME ) );
			while( true )
			{
				line = rd.readLine();
				if( line == null )
					break;
				else
					recordScore( line );
			}

			rd.close();
			produceHistogram();
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}

	private void produceHistogram()
	{
		for( byte x = 0; x < 10; x++ )
			println( String.format( "%02d", x * 10 ) + "-" + String.format( "%02d", x * 10 + 9 ) + ": " + bar( scores[ x ] ) );

		println( "  100: " + bar( scores[ 10 ] ) );
	}

	private String bar(
			byte countInRange
	)
	{
		final String symbol = "*";
		String complete = "";

		for( byte x = 0; x < countInRange; x++ )
			complete += symbol;

		return complete;
	}

	private void recordScore(
			String line
	)
	{
		byte score = Byte.parseByte( line );

		if( score < 10 )
			scores[ 0 ]++ ;
		else
			if( score < 20 )
				scores[ 1 ]++ ;
			else
				if( score < 30 )
					scores[ 2 ]++ ;
				else
					if( score < 40 )
						scores[ 3 ]++ ;
					else
						if( score < 50 )
							scores[ 4 ]++ ;
						else
							if( score < 60 )
								scores[ 5 ]++ ;
							else
								if( score < 70 )
									scores[ 6 ]++ ;
								else
									if( score < 80 )
										scores[ 7 ]++ ;
									else
										if( score < 90 )
											scores[ 8 ]++ ;
										else
											if( score < 100 )
												scores[ 9 ]++ ;
											else
												scores[ 10 ]++ ;

	}

	private static final String FILE_NAME = "MidtermScores.txt";

	byte[] scores = new byte[ 11 ];
}
