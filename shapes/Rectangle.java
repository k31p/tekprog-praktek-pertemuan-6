/**
 * Class Rectangle
 * @author Yobel El'Roy Doloksaribu | 231524029
 */
public class Rectangle extends Shape {
    // Attributes
    private int length;
    private int width;
    
    /**
     * Constructor Rectangle
     * @param length
     * @param width
     */
    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return width * length;
    }
}
