package week4;

import acm.program.ConsoleProgram;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount extends ConsoleProgram
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
					count( line );
			}

			rd.close();
			System.out.println( "File: " + FILE_NAME );
			System.out.println( "Lines = " + countLines );
			System.out.println( "Words = " + countWords );
			System.out.println( "Chars = " + countChars );
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}

	private void count(
			String line
	)
	{
		++countLines;
		for( int x = 0; x < line.length(); x++ )
			if( Character.isLetterOrDigit( line.charAt( x ) ) )
				++countChars;

		String[] words = line.split( " " );
		countWords += words.length;
	}

	int countLines;
	int countChars;
	int countWords;

	private static final String FILE_NAME = "countMe.txt";
}
