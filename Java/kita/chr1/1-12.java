import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        x++;
        System.out.println(x);
        x--;
        x--;
        System.out.println(x);
    }
}