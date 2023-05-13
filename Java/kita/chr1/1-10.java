import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i=1; i<=3; i++){
            System.out.println(Math.pow(x, i));
        }
    }
}