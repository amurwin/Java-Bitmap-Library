/*
*Author: Andrew Murwin
*Date: August 10, 2019
*Description: Bitmap Class Demonstration
*/
public class Main {
	public static void main(String[] args) {
		int height = 1920;
		int width = 1080;

		//Sample code for .bmp creation with one-dimentional array
		try {
			Pixel[] bits = new Pixel[width * height];
			for (int i = 0; i < width * height; i++) {
				if (i % 26 == 0) {
					bits[i] = new Pixel(0, 200, 200);
				} else {
					bits[i] = new Pixel(0, 0, 0);
				}
			}
			Bitmap.generateBitmapImage(height, width, bits, "output");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}

		//Sample code for .bmp creation with two-dimentional array
		try {
			Pixel[][] twoD = new Pixel[height][width];
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < width; j++) {
					if (((i*width) + j) % 26 == 0) {
						twoD[i][j] = new Pixel(0, 200, 200);
					} else {
						twoD[i][j] = new Pixel(0, 0, 0);
					}
				}
			}
			Bitmap.generateBitmapImage(twoD, "out2");
		} catch (Exception e) {			
			e.printStackTrace();
			System.exit(-1);
		}
	}
}
