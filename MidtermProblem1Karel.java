package week4;

import stanford.karel.*;

public class MidtermProblem1Karel extends SuperKarel
{
	private static final long serialVersionUID = 1L;

	public void run()
	{
		// bottom left:
		move();
		turnLeft();
		move();
		putBeeper();

		// left:
		while( frontIsClear() )
		{
			move();
			if( !beepersPresent() )
				putBeeper();
		}

		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();

		// top:
		while( frontIsClear() )
		{
			move();
			if( !beepersPresent() )
				putBeeper();
		}

		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();

		// right:
		while( frontIsClear() )
		{
			move();
			if( !beepersPresent() )
				putBeeper();
		}

		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		turnLeft();

		// bottom:
		while( frontIsClear() )
		{
			move();
			if( !beepersPresent() )
				putBeeper();
		}

		pickBeeper();
	}
}