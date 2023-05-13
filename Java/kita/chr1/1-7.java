public class Exercise{
    public static void main(String[] args){
        nt x, y, t;

        x = 3;
        y = 7;

        t = x;
        x = y;
        y = t;

        System.out.println( "x=" + x + ",y=" + y );
    }
}