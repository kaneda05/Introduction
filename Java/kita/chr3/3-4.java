import java.util.Scanner;

public class Exercise{
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>y)
            System.out.println("xはyより大きい");
        else if (x<y)
            System.out.println("xはyより小さい");
        else
            System.out.println("xとyは等しい");        
    }
}