
import java.util.ArrayList;

/**
 * Represents a 2d point with double coordinates
 *
 * @author Johan
 */
public class PointDouble {

    double x;
    double y;

    public PointDouble() {
        this(0.0d, 0.0d);
    }

    public PointDouble(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PointDouble other = (PointDouble) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        return true;
    }

    /**
     * returns a array of n points on a circle
     */
    public static ArrayList<PointDouble> getNPointsOnCircle(PointDouble center, double radius, int n) {
        double alpha = Math.PI * 2 / n;
        ArrayList<PointDouble> points = new ArrayList<>();

        int i = -1;
        while (++i < n) {
            double theta = alpha * i;
            PointDouble p = new PointDouble(Math.cos(theta) * radius, Math.sin(theta) * radius);
            points.add(p);
        }
        return points;
    }
}
