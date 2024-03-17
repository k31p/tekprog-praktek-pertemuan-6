/**********************************************
 * PaintThings.java
 *
 * Computes the amount of paint needed to paint various
 * things. Uses the amount method of the Paint class which
 * takes any Shape as a parameter.
 **********************************************/
import java.text.DecimalFormat;

public class PaintThings
{
    /*-------------------------------------------
    //Creates some shapes and a Paint object
    // and prints the amount of paint needed
    // to paint each shape.
    //-------------------------------------------*/
    public static void main(String[] args)
    {
        // Variables
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        // * MODIFIKASI 1: Menginstansiasikan class Rectangle, Sphere dan Cylinder
        Rectangle deck = new Rectangle(20, 35);
        Sphere ballSm = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // * MODIFIKASI 2: Menyimpan hasil dari method amount ke dalam variable
        double deckAmt = paint.amount(deck), ballAmt = paint.amount(ballSm), tankAmt = paint.amount(tank);

        // Instantiate the three shapes to paint
        // Compute the amount of paint needed for each shape
        // Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nPaint needed (in gallons) for each shape...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}