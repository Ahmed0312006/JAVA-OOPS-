package SimpleGeometricObject;
// import java.util.Date;

public class SimpleGeometricObject {
    private String color = "white";
    private boolean filled = false;
    private java.util.Date dateCreated;

    public SimpleGeometricObject() {
        dateCreated = new java.util.Date();
    };

    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Return a string representation of this object */

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
