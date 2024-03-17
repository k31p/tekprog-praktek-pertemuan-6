/**********************************************
 *  PAINT CLASS
 *
 *  Represents a type of paint that has a fixed area
 *  coverage (number of square feet per gallon).
**********************************************/

public class Paint {
    private double coverage; //Number of square feet per gallon

    /**
     * Constructor: Sets up the paint object.
     */
    public Paint(double c) {
        coverage = c;
    }

    /**
     * Returns the amount of paint (number of gallons)
     * needed to cover the shape's surface area.
     */
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // * MODIFIKASI: Menghitung hasil dari area dibagi coverage
        return s.area() / coverage;
    }
}