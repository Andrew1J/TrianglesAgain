public class Triangle {
    private Point v1,v2,v3;

    public Triangle(Point a, Point b, Point c){
        v1 = a;
        v2 = b;
        v3 = c;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        v1 = new Point(x1,y1);
        v2 = new Point(x2,y2);
        v3 = new Point(x3,y3);
    }

    public double getPerimeter(){
        return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
    }

    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s*(s-v1.distanceTo(v2))*(s-v1.distanceTo(v3))*(s-v2.distanceTo(v3)));
    }

    public String classify(){
        double s1 = Math.round(10000*v1.distanceTo(v2))/10000.0;
        double s2 = Math.round(10000*v1.distanceTo(v3))/10000.0;
        double s3 = Math.round(10000*v2.distanceTo(v3))/10000.0;
        if(s1==s2&&s2==s3){
            return "equilateral";
        } else if(s1==s2||s1==s3||s2==s3){
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public String toString(){
        return "v1" + v1 + " v2" + v2 + " v3" + v3;
    }

    public void setVertex(int index, Point newP){
        if(index == 0) v1 = newP;
        if(index == 1) v2 = newP;
        if(index == 2) v3 = newP;
    }
}
