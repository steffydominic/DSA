// class practice {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4,5,6,1,4 };

//         int num = 3;
//         int count = 0;
//             int ans=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {

//               ans=arr[j] - arr[i];//2-1 //3-1
//                 if (num == ans){
//                        count++;
//                 }

//             }

//                     System.out.print(count);
//                     break;

//             }

//         }
//     }

// class practice {
//    public static void main(String[] args) {
//         String ans1 = "RGGB";
//         String ans2 = "RRGB";

//         char[] input=ans1.toCharArray();
//         char[] output=ans2.toCharArray();
// int hit=0;
// int pesudoHit=0;
//         for(int i=0;i<input.length;i++){
//             if(input[i]==output[i]){
//                 hit++;
//                 input[i]='o';  
//                 output[i]='o'; 
//             }}
            // for(int i=0;i<input.length;i++){
            //     System.out.print(input[i]+" ");
                
            // }
            //  for(int i=0;i<input.length;i++){
            //     System.out.print(output[i]+" ");
                
            // }
            
    //             for(int j=0;j<input.length;j++){
    //                 for(int k=0;k<input.length;k++){
    //                 if(input[j]==output[k] && input[j]!='o' && output[j]!='o' && input[k]!='o' && output[k]!='o'){
    //                     pesudoHit++;
    //                 }
    //             }
    //         }
            
    //          System.out.println(hit+" hit");
    //     System.out.println(pesudoHit+" pesudohit");
    //     }
        
       
    // }
// import java.util.HashMap;

// class practice{
//     public static void main(String[] args) {
//       String arr[]={"apple","orange","pineappale","apple","orange"};

//       HashMap<String,Integer> arrMap= new HashMap<String,Integer> ();

// for(int i=0;i<arr.length;i++){
//      String s=arr[i];

//     if(arrMap.containsKey(s)){
//     int count=arrMap.get(s);
//      arrMap.put(s, count+1);

//     }
//     else{
//         arrMap.put(s, 1);
//     }
// }
// for (String key : arrMap.keySet()) {
//     int count = arrMap.get(key);
//     System.out.println(key + ": " + count);
// }
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int n=7;

//         if (n <= 1) {
//            System.out.println("1");
//         }

//         int prev1 = 1; // Number of ways to climb 1 stair
//         int prev2 = 1; // Number of ways to climb 0 stairs (base case)

//         for (int i = 2; i <= n; i++) {
//             int current = prev1 + prev2;//1+1==cur(2)...//2+1==cur(3)..//3+2==5
//             prev2 = prev1;//prev2=1;//prev2=2;..prev2=3
//             prev1 = current;//prev1=2;prev1=3; 5

//         }

//     System.out.println("Number of ways to climb " + n + " stairs: " + prev1);
//     }

//    class practice {
//     int maxLen = 0;
//     int lo = 0;
//     public String longestPalindrome(String s) {
//         char[] input = s.toCharArray();
//         if(s.length() < 2) {
//             return s;
//         }

//         for(int i = 0; i<input.length; i++) {
//             expandPalindrome(input, i, i);
//             expandPalindrome(input, i, i+1);
//         }
//         return s.substring(lo, lo+maxLen);
//     }

//     public void expandPalindrome(char[] s, int j, int k) {
//         while(j >= 0 && k < s.length && s[j] == s[k]) {
//             j--;
//             k++;
//         }
//         if(maxLen < k - j - 1) {
//             maxLen = k - j - 1;
//             lo = j+1;
//         }
//     }
// }

// public class practice {
//     public String longestPalindrome(String s) {
//         if (s.length() <= 1) {
//             return s;
//         }

//         int maxLen = 1;
//         String maxStr = s.substring(0, 1);

//         for (int i = 0; i < s.length(); i++) {
//             for (int j = i + maxLen; j <= s.length(); j++) {
//                 if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
//                     maxLen = j - i;
//                     maxStr = s.substring(i, j);
//                 }
//             }
//         }

//         return maxStr;
//     }

//     private boolean isPalindrome(String str) {
//         int left = 0;
//         int right = str.length() - 1;

//         while (left < right) {
//             if (str.charAt(left) != str.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
//     public static void main(String[] args) {
//         String s="babdc";

//     }
// }

// import java.util.*;
// import java.lang.*;

// class practice {
//     public static void main(String args[]) {

//         int t = 4;

//             int a = 9;
//             int b = 6;
//             if (b % a == 0)//6%9
//                 System.out.println("YES");
//             else if (b == 1)
//                 System.out.println("NO");
//             else {
//                 String ans = "NO";
//                 for (int i = 2; i < 30; i++) {
//                     if (Math.pow(b, i) % a == 0)

//                         ans = "YES";
//                     break;
//                 }
//                 System.out.println(ans);

//             }
//         }
//     }

// class solution {
//     public static void main(String[] args) {
//         int start = 111;
//         int end = 130;
//         int len = end - start;
//         int arr[]=new int[len];
//          int newarr[]=new int[len];
//         for(int i=start;i<end;i++){
//             arr[i]=start;

//         }
//         for(int i=arr.length-1;i>=0;i--){
//             newarr[i]=arr[i];

//         }
//     }
// }

// class practice {
//     public static void main(String[] args) {
//         // Initial Array: [1, 2, 3, 4];

//         int arr[] = { 5,10,15,20};
//         // Cumulative Sum: [1, 3, 6, 10
//         int count = 0;
//         int temp=0;
//   int len=arr.length;
//   System.out.println(len);
//         int newarr[] = new int[len];
//         for (int i = 0; i < len; i++) {
            
//             newarr[i] = temp+ arr[count];//0+1//3

//              temp=newarr[i];//3  //3
           
//             System.out.print(newarr[i]+" ");//1
//             count++;

//         }
//         // for(int i=0;i<newarr.length;i++){
            
//         // }

//     }
// }