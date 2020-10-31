public class Tester {
    public static void main(String[] args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(p1);
        System.out.println(p1.getX());
        System.out.println(p2.getY());
    }
}
