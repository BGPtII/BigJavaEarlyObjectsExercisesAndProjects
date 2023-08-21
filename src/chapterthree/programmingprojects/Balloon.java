package chapterthree.programmingprojects;

/**
 * Spherical balloon
 */
public class Balloon {
    private double radius;

    public Balloon() {
        radius = 0;
    }

    public void inflate(double amount) {
        radius += amount;
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * (radius * radius * radius);
    }

}
