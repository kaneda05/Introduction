import java.util.Scanner;
public class Exercise{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=2; i<=4; i++){
            System.out.println(x*i);
        }
    }
}