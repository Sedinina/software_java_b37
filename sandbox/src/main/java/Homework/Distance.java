package Homework;

public class Distance {

    public double x1;
    public double x2;
    public double y1;
    public double y2;



/* просто фукция*/
    public static double distance(double x1, double x2, double y1, double y2)
    {
       double xdif = (x2-x1);
       double ydif=(y2-y1);
        return Math.sqrt(Math.pow(xdif, 2) + Math.pow(ydif, 2));
    }

       public static void main(String[] args) {

        System.out.println("Расстояние равно = " + distance(1,2,3,4));

           Point p1 = new Point(1,3);
           Point p2 = new Point(2,4);
           System.out.println("Расстояние равно = " + p1.distance(p2));

    }
}
