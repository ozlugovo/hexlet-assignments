package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if(this.getArea() < another.getArea()) {
            return -1;
        } else if (this.getArea() == another.getArea()) {
            return 0;
        }
        return 0;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public String toString() {
        return getFloorCount() + " этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
