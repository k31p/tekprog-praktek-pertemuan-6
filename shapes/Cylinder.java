/**
 * Class Cylinder
 * @author Yobel El'Roy Doloksaribu | 231524029
 */
public class Cylinder extends Shape{
    // Attributes
    private int radius;
    private int height;

    /**
     * Constructor Cylinder
     * @param radius
     * @param height
     */
    public Cylinder(int radius, int height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
