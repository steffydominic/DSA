
// public class sums{
//     public static void main(String [] args){

//             int num=199;
//         int count=0;
//         if(num<20000){

//             while(num!=1){
//                      int num1;
//                 if(num%2==0){

//    num1=num/2;

//     num=num1;
//     count+=1;
//                 }
//                 else{
//                     num1=(3*num)+1;

//     count+=1;
//                 }
//   System.out.println(num1);
//       num=num1;
//             }
//             System.out.println("count is "+count);

//         }

//         }

//     }
// public class sums {
//     public static void main(String[] args) {
//         int n = 10;
//         System.out.println("Fibonacci sequence up to " + n + " terms:");

//         int a = 0, b = 1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int temp = a + b;
//             a = b;
//             b = temp;
//         }
//     }
// }
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// public class sums {

//     static boolean isAnagram(String a, String b) {

//       int check1=1;
//     int check2=1;

//     a=a.toUpperCase();
//     b=b.toUpperCase();

//     for(int i=0;i<a.length();i++){
//         check1*=a.charAt(i);
//         System.out.println(check1+"thi is chcEhk!");
//     }
//     for(int i=0;i<b.length();i++){
//         check2*=b.charAt(i);
//          System.out.println(check1+" check2");
//     }
//     if(check1==check2){
//     return true;
//     }
//     else{
//     return false;
// }}
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);
//         String a = "anagram";

//         String b =  "margana";

//         boolean ret = isAnagram(a, b);
//         System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
//     }
// }
// class solution{
//     public static void main(String[] args) {
//         String input="welcometojava";
//         int num=3;
//        ArrayList<String> str=new ArrayList<String>();
//     for(int i=0;i<input.length();i++){

//     }

//     }
// }

// class sums {
//     public static void main(String[] args) {
//         String input = "aabbbcccccaaa";
//         // a2b1c5a3
//         String output = "";

//         int count = 1;
//         char ch = input.charAt(0);
//         for (int i = 1; i < input.length(); i++) {
//             char cha = input.charAt(i);
//             if (ch == cha) {
//                 count++; // c2c3
//             } else {
//                 output += (ch + "") + count;// a2b1c5
//                 ch = input.charAt(i); // a //c2 //b
//                 count = 1; // 1
//             }
//         }
//         if (count != 1) {
//             output += (ch + "") + count;
//         }

//         System.out.println(output);

//     }
// }

// class sums {
//     public static void main(String[] args) {
//         int N = 3;
//         int M = 3;
//         int num = N * M;
//         int ans = (int) Math.sqrt(num);
//         if (ans * ans == N) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }

//     }
// }

class sums{
    public static void main(String[] args) {
        int num=2;
        if(num)
    }
}