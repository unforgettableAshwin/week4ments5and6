package week4;

import acm.program.ConsoleProgram;

public class MidtermProblem2aEsm extends ConsoleProgram
{	public void run()
	{
		println( "5.0 / 4 - 4 / 5\t\t= " + ( 5.0 / 4 - 4 / 5 ) );
		println( "7 < 9 - 5 && 3 % 0 == 3\t= " + ( 7 < 9 - 5 && 3 % 0 == 3 ) );
		println( "\"B\" + 8 + 4\t\t= " + ( "B" + 8 + 4 ) );
	}

	private static final long serialVersionUID = 1L;
}

//	5.0 / 4 - 4 / 5			= 1.25
//	7 < 9 - 5 && 3 % 0 == 3	= false
//	"B" + 8 + 4				= B84