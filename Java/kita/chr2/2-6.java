import java.io.*;

public class Exercise{
    public static void main( String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(
            new InputStreamReader( System.in ) );

        System.out.println("あなたの年齢はいくつですか?");
        int age = Integer.parseInt(br.readLine());    // 1行分の数値を入力する
        System.out.println("生まれてから現在まで少なくとも" + (age*355) + "日です。");
    }
}