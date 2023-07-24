package exercise;

// BEGIN
public class Segment {
    private Point BeginPoint;
    private Point EndPoint;

    public Segment(Point beginPoint, Point endPoint) {
        BeginPoint = beginPoint;
        EndPoint = endPoint;
    }

    public Point getBeginPoint() {
        return BeginPoint;
    }

    public Point getEndPoint() {
        return EndPoint;
    }
    public Point getMidPoint() {
        int xMidPoint = (getBeginPoint().getX() + getEndPoint().getX())/2;
        int yMidPoint = (getBeginPoint().getY() + getEndPoint().getY())/2;
        return new Point(xMidPoint,yMidPoint);
    }
}
// END
