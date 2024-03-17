/**
 * Abstract Class Shape
 * @author Yobel El'Roy Doloksaribu | 231524029
 */
abstract public class Shape {
    // Attributes
    protected String shapeName;

    /**
     * Constructor Shape
     * @param shapeName
     */
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    /**
     * Method untuk menghitung luas dari bangun datar
     * @return luas dari bangun datar
     */
    public abstract double area();

    /**
     * Method untuk mengembalikan informasi dari bangun datar
     * @return informasi dari bangun datar
     */
    public String toString() {
        return shapeName;
    }
}
