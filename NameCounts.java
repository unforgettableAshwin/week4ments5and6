package week4;

import java.util.HashMap;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram
{
	public void run()
	{
		HashMap< String, Byte > nameOccurrences = new HashMap< String, Byte >();

		String line;

		while( true )
		{
			line = readLine( "Enter name: " );
			if( line.equals( "" ) )
				break;

			if( nameOccurrences.containsKey( line ) )
				nameOccurrences.put( line, (byte)( nameOccurrences.get( line ) + 1 ) );
			else
				nameOccurrences.put( line, (byte)1 );
		}

		for( String s: nameOccurrences.keySet() )
			println( "Entry [" + s + "] has count " + nameOccurrences.get( s ) );

		// println( nameOccurrences.entrySet().toString() );
	}

	private static final long serialVersionUID = 1L;
}
