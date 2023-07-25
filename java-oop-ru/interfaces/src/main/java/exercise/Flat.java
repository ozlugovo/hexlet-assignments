package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyArea;
    int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getLivingArea() {
        return area;
    }

    public double getBalconyArea() {
        return balconyArea;
    }

    public int getFloor() {
        return floor;
    }
    @Override
    public double getArea() {
       return getLivingArea() + getBalconyArea();
    }

    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + getFloor()+ " этаже";
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
}
// END
