package week4;

import acm.graphics.GImage;

import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram
{
	public void run()
	{
		GImage image = new GImage( "downLoad.jpg" );
		add( image, 0, 0 );
		add( flipHorizontal( image ), image.getWidth() + 1, 0 );
	}

	private GImage flipHorizontal(
			GImage original
	)
	{
		int[][] arrayImage = original.getPixelArray();
		int height = arrayImage.length;
		int width = arrayImage[ 0 ].length;
		int[][] arrayImage2bFlipped = new int[ height ][ width ];
		for( int y = 0; y < height; y++ )
			for( int x = 0; x < width; x++ )
				arrayImage2bFlipped[ y ][ width - x - 1 ] = arrayImage[ y ][ x ];

		return new GImage( arrayImage2bFlipped );
	}

	private static final long serialVersionUID = 1L;
}
