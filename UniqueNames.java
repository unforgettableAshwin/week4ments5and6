package week4;

import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram
{
	public void run()
	{
		String line;
		
		ArrayList< String > names = new ArrayList< String >();
		
		while( true )
		{
			line = readLine( "Enter name: " );
			if( line.equals( "" ) )
				break;

			line = line.trim();
			if( !names.contains( line ) )
				names.add( line );
		}

		println( "Unique name list contains:" );
		for( String name: names )
			println( name );
	}

	private static final long serialVersionUID = 1L;
}
