/*
*Author: Andrew Murwin
*Date: August 10, 2019
*Description: Pixel Class
*
*The Pixel class is intended to simplify user interaction with the Bitmap class through the creation of the "Pixel". 
*A single member of the pixel class stores the red, green, and blue values for a single pixel in an image. After creation,
*pixels are not intended to be modified by the user. Getter methods were implemented publicly in case the user wants to
*reference previous pixels, such as in the case of making gradients.
*
*The class includes simple error checking to make sure the pixel only includes valid RGB values.
*/
public class Pixel extends Exception {
    private static final long serialVersionUID = 1L;
    private int red;
    private int green;
    private int blue;

    public Pixel(int red, int green, int blue) throws RuntimeException {

        //Checks user inputs to confirm they are valid RGB values
        if (red > 255 || red < 0 || green > 255 || green < 0 || blue > 255 || blue < 0) {
            throw new RuntimeException("\n\nAll RGB values must be in the value range of 0-255.\nYour values:\nRed: "
                    + red + "\nGreen: " + green + "\nBlue: " + blue);
        }
        this.red = red;
        this.green = green;
        this.blue = blue;

    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.green;
    }

    public int getBlue() {
        return this.blue;
    }

}