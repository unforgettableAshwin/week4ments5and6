package week4;

import acm.program.ConsoleProgram;

public class midtermProblem5doubles extends ConsoleProgram
{
	public void run()
	{
		callRDL( "Bookkeeper" );
		callRDL( "Mississippi" );
		callRDL( "zzzzzzaaabbaaaccccccc" );
		/*	Returns:
		 * 
		 * Bookkeeper becomes: Bokeper. 
		 * Mississippi becomes: Misisipi.
		 * zzzzzzaaabbaaaccccccc becomes: zabac.
		 * 
		 */
	}

	private void callRDL(
			String wordIn
	)
	{
		println( wordIn + " becomes:\t" + removeDoubledLetters( wordIn ) + "." );
	}

	private String removeDoubledLetters(
			String wordIn
	)
	{
		char c1 = wordIn.charAt( 0 );
		char c2;
		StringBuilder sb = new StringBuilder().append( c1 );
		for( byte b = 1; b < wordIn.length(); b++ )
		{
			c2 = wordIn.charAt( b );
			if( c1 != c2 )
			{
				sb.append( c2 );
				c1 = c2;
			}
		}

		return sb.toString();
	}

	private static final long serialVersionUID = 1L;
}