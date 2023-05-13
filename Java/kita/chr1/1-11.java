import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("商="+(x/y)+" 余り"+(x%y));
    }
}