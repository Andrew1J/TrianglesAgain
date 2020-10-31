public class Point {
    private double x,y;
    //construct a point given coordinates
    public Point(double X, double Y){
        x = X;
        y = Y;
    }
    //construct a point given a point (redundant, just provides flexibility)
    public Point(Point p){
        x = p.x;
        y = p.y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distanceTo(Point other){
        return Math.sqrt((x-other.getX())*(x-other.getX()) + (y-other.getY())*(y-other.getY()));
    }

    public boolean equals(Point other){
        return x==other.x && y == other.y;
    }
}
