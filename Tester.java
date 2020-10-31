public class Tester {
    public static void main(String[] args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(2,3);
        Point p3 = new Point(0,0);
        System.out.println(p1.getX());
        System.out.println(p2.getY());
        System.out.println(p1.distanceTo(p3));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p3));

        Point p4 = new Point(2,0);
        Triangle t1 = new Triangle(p1,p3,p4);
        Triangle t2 = new Triangle(-1,1,5,1,3,8);
        System.out.println(t1.getPerimeter());
    }
}
