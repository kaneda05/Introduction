package Java.JvaDrive.chr3;
/**
 * JSample6_1
 * 2023.05.12
 */

 class JSample6_1{
     public static void main(String[] args){
         int sum = 0;

         // 10回繰り返す
         for (int i=1; i<=10; i++){
             sum += i; //　数値を順に加算する
         }

         /*
          集計した結果を画面に出力する
         */

         System.out.println(sum);
     }
 }