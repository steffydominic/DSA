
// class Solution {
//     public int[] twoSum(int[] nums, int target) {

//         int numlength=nums.length;
//         for(int i=0;i<numlength-1;i++){
//            for(int j=i+1;j<numlength;j++){
//                int add=nums[i]+nums[j];
//                if(add==target)

//                  return new int[]{i, j};
//            }
//        }
//  return new int[]{};
//     }
// }

// class Solution {
//     public boolean isPalindrome(int x) {
//         String numStr = Integer.toString(x);
//         int left = 0;
//         int right = numStr.length() - 1;
//         if (left < right) {
//             if (numStr.charAt(left) != numStr.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;

//         }
//         return true;
//     }
// }

// class solution {
//     public static String MergeString(String word1, String word2) {

//         StringBuilder stringBuilder = new StringBuilder();
//         int wordlength = word1.length() + word2.length();//12

//         int count = 0;
//         //1<12
//         while (count < wordlength) {
//             if (count < word1.length()) {
//                 stringBuilder.append(word1.charAt(count));//s

//             }
//             if (count < word2.length()) {
//                 stringBuilder.append(word2.charAt(count));

//             }
//             if (count >= word1.length() && count >= word2.length()) {
//                 break;

//             }
//             count++;

//         }

//         return stringBuilder.toString();

//     }
//     public static void main(String[] args) {
//         String word1="steffy";
//          String word2="barath";

//          System.out.println(solution.MergeString(word1, word2));
//     }
// // }
// class solution {
//     public static  int removeDuplicates(int[] nums) {

//       int count=1;
//       int num=nums[0];
//       for(int i=1;i<nums.length;i++){
//  if(nums[i]!=num){

// int[]arr=new int[nums[i]];
//   count++;
//  }

//   }

//       }
//   return arr;
//     }

// class solution {
//     public static String EncryptedToDecrypted(String st) {

//         String[] arr = st.split("");

//         for (int i = 0; i < arr.length; i += 2) {
//             if((i+1) >=arr.length){
//                 break;
//             }
//             String temp = arr[i];
//             arr[i] = arr[i + 1];
//             arr[i + 1] = temp;

//         }

//         String str = "";
//         for (int j = 0; j < arr.length; j++) {

//             str += arr[j];
//         }
//         return str;
//     }

//     public static void main(String[] args) {
//         String s=null;
//         if(s.charAt(1)=='e'){
// //
//         }
//         String ans = solution.EncryptedToDecrypted("a1b2n312");
//         System.out.println(ans);

//         //{1,2*1+1,3*3+3,}

//         // int start=1;
//         // int sec=2*start+start;
//         // int third=3*sec+sec;
//         // int four=4*third+third;

//         // System.out.println(start +"  "+sec +"  "+third+"  "+four );

//     }

// }

// class solution{
// public static void main(String []args){
// int[] arr={1,2,2,3,5,3,5,7};

// for(int i=0;i<arr.length;i++){

// for(int j=0;j<arr.length;j++){

//     if(i!=j && arr[i]==arr[j]){

// System.out.println(arr[i]);

//     }

// }

// }

//     }
// }

//left or right rotation

// class solution{

//     public static void main(String [] args){

// int[] arr={3,4,5,6,7};

// int rotation=2;

// for(int i=0;i<rotation;i++){
//       int lastElement=arr[arr.length-1];
//     for(int j=arr.length-1;j>0;j--){

// arr[j]=arr[j-1];

//     }

// arr[0]=lastElement;

// }
// for(int i=0;i<arr.length;i++){

//     System.out.println(arr[i]+ " ");
// }

//     }
// }

// class solution {
//     public static void main(String[] args) {

//         int[] arr = {1, 1, 2, 5, 5, 6, 6};

//         int sum = 0;
//         int count=0;

//         for (int i = 0; i < arr.length; i++) {
//             // Assume arr[i] is unique until proven otherwise
//             boolean isUnique = true;

//             // Check if arr[i] is a duplicate of any previous elements
//             for (int j = 0; j < i; j++) {
//                 if (arr[i] == arr[j]) {
//                     isUnique = false;
//                     break;
//                 }
//             }

//             if (isUnique) {
//                 sum += arr[i];
//                 count++;
//                 System.out.print(arr[i] + " ");

//             }

//         }
//   System.out.println("\n"+"count is" +" "+count);

//     }
// }
//removeduplicates
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j = 1;
//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] != nums[i - 1]) {
//                 nums[j] = nums[i];
//                 j++;
//             }
//         }
//         return j;
//     }
// }

//Longest Common Prefix

//Input: strs = ["flower","flow","flight"]

// import java.util.Arrays;

// class solution {
//     public static String findLongestCommonPrefix(String[] words) {
//         if (words == null || words.length == 0) {
//             return "";
//         }

//         Arrays.sort(words); // Sort the array of strings

//         String firstWord = words[0];
//         String lastWord = words[words.length - 1];

//         int minLength = Math.min(firstWord.length(), lastWord.length());
// System.out.println(minLength);
//         int commonPrefixLength = 0;

//         while (commonPrefixLength < minLength
//                 && firstWord.charAt(commonPrefixLength) == lastWord.charAt(commonPrefixLength)) {
//             commonPrefixLength++;
//         }

//         return firstWord.substring(0, commonPrefixLength);
//     }

//     public static void main(String[] args) {

//         String[] input = { "geeksforgeeks", "geeks","ge", "geek", "geezer" };

//         System.out.println(solution.findLongestCommonPrefix(input));
//     }
// }

// class solution {
// public static void main(String[] args){
// int[] l1 = {2, 4, 3};
// int[] l2 = {5, 6, 4};

// String l3 = "";
// String l4 = "";

// for (int i=l1.length-1;i>=0;i--) {
//     l3 += l1[i];
// }
// // System.out.println(l3);

// for (int i=l2.length-1;i>=0;i--) {
//     l4 += l2[i];
//  }
// // System.out.println(l4);
// int num1 = Integer.parseInt(l3);

// int num2 = Integer.parseInt(l4);
// int num3=num1+num2;
// System.out.println(num3);
// }

// }

// class solution{
//     public static void main(String[] args){

//        int  dividend = 7;
//         int  divisor = -3;

//         double dividendDouble = (double) dividend;
//         double divisorDouble = (double) divisor;

//         Double ans= dividendDouble  /divisorDouble;

//         int ans1 = (int) Math.floor(ans);
//           System.out.println(ans1);
//     }   

// }

// class solution{
//     public static void main(String[] args){
// int nums1[]={1,2,3,0,0,0};
// int m=3;
// int nums2[]={2,5,6};
// int n=3;

//  for (int i = 0; i < nums1.length; i++) {
//      if(nums1[i]!=0 ){
//           System.out.print(nums1[i] + " ");
//      }
//     }
//      for (int j = 0; j < nums2.length; j++) {
//            if(nums2[j]!=0){

//                         System.out.print(nums2[j] + " ");

//         }
//            }

//     }
// }

//autobiographic sums

// import java.util.*;
// class solution{

//     public static int FindAutoCount(String n) {
//         if (n == null) {
//             return 0;
//         }

//         int[] digitCount = new int[n.length()];

//         for (int i = 0; i < n.length(); i++) {
//             char digitChar = n.charAt(i);

//             if (Character.isDigit(digitChar)) {
//                 int digit = Character.getNumericValue(digitChar);

//                 if (digit < n.length()) {
//                     digitCount[digit]++;
//                 } else {
//                     return 0; // Invalid digit
//                 }
//             } else {
//                 return 0; // Non-numeric character in the input
//             }
//         }

//         for (int i = 0; i < n.length(); i++) {
//             if (digitCount[i] != Character.getNumericValue(n.charAt(i))) {
//                 return 0; // Not an autobiographical number
//             }
//         }

//         int distinctCount = 0;
//         for (int count : digitCount) {
//             if (count > 0) {
//                 distinctCount++;
//             }
//         }

//         return distinctCount;
//     }

//     public static void main(String[] args) {
//         System.out.println(FindAutoCount("1210"));        // Output: 2 (1 and 2 are distinct numbers)
//     }
// }

// class solution{
// public static void main(String[] args){
//     int nums[]={3,2,2,3};
//     int value=3;
//     int  len=nums.length-1;
//     int nums2[]=new int[len];
// for(int i=0;i<nums.length;i++){
// if(nums[i]!=value){
// nums2[i]=nums[i];
// }
// }
// System.out.println(nums2);

//     }
// }

// nums = [3,2,2,3], val = 3  

// Output: 2, nums = [2,2,_,_]

// class solution {
//     public static boolean containsDuplicate(int[] nums) {
//         for (int i = 0; i < nums.length - 1; i++) {

//             for (int j = 1; j < nums.length; j++) {

//                 if (nums[i] == nums[j]) {
//                     return true;
//                 }

//             }

//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 1 };
//         System.out.print(solution.containsDuplicate(nums));
//     }

// }

// import java.util.ArrayList;

// class solution{
// public static void main(String[] args){
//     int[]  nums = {0,1,2,2,3,0,4,2};
//     int val = 3;
// System.out.println(removeElement(nums,val));

// }
// public static  int removeElement(int[] nums, int val) {
//     int index=0;

//     for(int i=0;i<nums.length;i++){
//      if(nums[i]!=val){ 
//      nums[index]=nums[i];
//      index++;
//      }

//     }
//     return index;
// }
// }

// import java.util.Arrays;

// class solution {
//     public static void main(String[] args) {

//         String s="Steffy";
// String[] cc=s.split("");

//         String ch=s.substring(s.indexOf('t'),s.indexOf('f'));                                                                       

//         //split("")
//         //tochartArray()

// System.out.println(ch);
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// class solution{
//     public static void main(String[] args){
//         List<Integer> arr=new ArrayList<>();

//               arr.add(1);
//               arr.add(2);
//               arr.add(3);
//               arr.add(3);
//               arr.add(2);

//          int count=0;

//    for(int i=0;i<arr.size();i++){
//      for(int j=i+1;j<arr.size();j++){
//                if(arr.get(i)==arr.get(j)){
//                 count++; 
//                }

//         }

//     }
//  System.out.println(count);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         char[] s={'{','(',']','}',')'};
//         for(int i=0;i<s.length;i++){
//             for(int j=i+1;j<s.length;j++){

//                 if(s[i]=='{' && s[j]=='}'){
//                     System.out.println("{} has a pair");   
//                     break;
//                 }
//                    if(s[i]=='(' && s[j]==')'){
//                     System.out.println("() has a pair");   
//                     break;
//                 }
//                    if(s[i]=='[' && s[j]==']'){
//                     System.out.println("[] has a pair"); 
//                     break;  
//                 }

//             }
//         }
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int[] arr={1,3,3,7,11};
//    int k=0;
//    int count=0;
// if(arr[k] % 2 !=0){
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
// if(arr[i]==arr[j]){

//     System.out.println(arr[i]);
//     count=1;

// }

//         }
//           if(count==1){
//         break;
//              }
//          }

//       }

//     }
//   }

// class solution{
//     public static void main(String[] args) {
//         int[] digits={1,2,9};
//   String arr="";
//         for(int i=0;i<digits.length;i++){
//         arr+= digits[i];

//         }
//         // System.out.println(arr);
//         int digit=Integer.parseInt(arr);
//         int ans=digit+1;
//         String ans1=Integer.toString(ans);
//         // System.out.println(ans);
//         String[] arr1=ans1.split("");

//         for(int i=0;i<arr1.length;i++)
//         System.out.print(arr1[i]+"");
//     }
// }

//length of last word

// class solution{
//     public static void main(String[] args) {
//         String s="luffy is still joyboy";
//         int count=0;
//  for(int i=s.length()-1;i>=0;i--){
//     if(s.charAt(i)!=' '){
//         count++;
//     }
//     else{
//         break;
//     }

//  }
// System.out.println(count);

//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int[]  nums={1,2,3,1,2,3};
//         int k=2;
//         int count=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-1;j++){
//  if(nums[i]==nums[j]){
//      count++;

//             }

//             }
//         }
//         if(count<=k){
//            System.out.println("true");
//         }
//         else{
//   System.out.println("false");
//         } 

//     }
// }

//Input: n = 6
// Output: true
// Explanation: 6 = 2 × 3

// class Solution {
//     public boolean isUgly(int n) {
//      if (n==1) {
//             return true;
//         }
//         if(n==0){
//             return false;
//         }
//         if(n % 2 == 0){
//             return isUgly (n/2);
//         }
//         else if(n % 3 == 0){
//             return isUgly(n/3);
//         }
//         else if(n % 5 == 0){
//             return isUgly(n/5);
//         }
//         return false;
//     }
// }

//      public static void main(String[] args) {
//         int n=6;
//      }

//     }

//happy num

// class solution{

//     public static void main(String[] args){
//         int n=19;
//         while(n!=0){
//         String num=Integer.toString(n);
//         int num1=0;
//         String[] arr=num.split("");
//         for(int i=0;i<arr.length;i++){
//            int an=Integer.parseInt(arr[i]);
//           num1+=an*an;

//         }
//             System.out.println(num1);

//          int num1;
//         if(num1==1){
//             System.out.println("true");
//                 break;

//             }else{
//  System.out.println("false");
//             }

//         }
//     }
//     }

// class solution {
//     public static int[] twoSum(int[] nums, int target) {

//         int numlength=nums.length;
//         for(int i=0;i<numlength-1;i++){
//            for(int j=i+1;j<numlength;j++){
//                int add=nums[i]+nums[j];
//                if(add==target)

//                  return new int[]{i, j};
//            }
//        }
//  return new int[]{};
//     }
// public static void main(String[] args) {
//     int nums[]={5,7,4,13};
//     int target=9;
//     int num1[]=solution.twoSum(nums,target);
// for(int i = 0 ; i < num1.length;i++){
//     System.out.print(num1[i]+" ");
// }
// }
// }

// public class solution {

//     public static void main(String[] args) {
//         int[] arr1 = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8};

//         int index = 0;  //0

//         int last = arr1.length - 1;  //11

//         while (index < last) {  //0<11
//             int mid = index + (last - index) / 2;  //5

//             if (mid % 2 == 1) {  //5/2!=1
//                 mid--; // Ensure mid is even
//             }

//             if (arr1[mid] != arr1[mid + 1]) {  //4!=5
//                 last = mid;     //4 
//             } else {
//                 index = mid + 2;  
//             }
//         }

//         int unique1 = arr1[index];

//         System.out.println("Unique element in arr1: " + unique1); // Output: 4

//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int arr[]={1,1,2,2,3,3,5,5,7,9,9};

//         int index=0;
//         int last=arr.length-1;

//         while(index<last){
//             int mid= index +(last-index)/2;

//             if(mid%2==1){
//                 mid--;

//             }
//             if(arr[mid]!=arr[mid+1]){
//                 last=mid;
//             }
//             else{
//                 index=mid+2;
//             }

//     }
//     int element=arr[index];

//         System.out.println(element);
// }
// }

// class solution {
//     // A XOR based function to find
//     // the element that appears only once

//     // Driver Code
//     public static void main(String[] args)
//     {
//         int arr[] = { 1, 1, 2, 4, 4, 5, 5, 6, 6 };
//         int len = arr.length;
//   int XOR = 0;
//         for (int i = 0; i < len; i++) {
//              System.out.print(  XOR = XOR ^ arr[i] );

//         }
//         System.out.println("The required element is "
//                            + XOR);

//     }

// import java.util.Arrays;

// class solution{
//     public static void main(String[] args) {
//         int arr1[]={1,2,3,4,5};
//         int arr2[]={3,4,5,6,7};

//         int l1=arr1.length;
//         int l2=arr2.length;
//         int l3=l1+l2;
//         int newarr[]=new int[l1+l2];

//         int i = 0;  
//         int j = 0;  
//         int k = 0;  

//        while(i<l1){
//         newarr[k]=arr1[i];
//         i++;
//         k++;
//        }
//        while(j<l2){
//         newarr[k]=arr2[j];
//         j++;
//         k++;
//        }

//      for(int l=0;l<l1+l2;l++){
//     System.out.print(newarr[l]+" ");
//     Arrays.sort(newarr);
//         }

//     }

// }

// traverse the arr1 and insert its element in arr3 //

// while(i < n1){   
//  arr3[k++] = arr1[i++];   
// }   

// // now traverse arr2 and insert in arr3
// while(j < n2){   
//  arr3[k++] = arr2[j++];   
// }  

// import java.util.ArrayList;

// class solution {
//         public static int[] rotate(int[] nums, int k) {
//         int[] output= new int[nums.length];

//         int j=0;
//         for(int i=nums.length-k;i<nums.length;i++){
//         output[j++]=nums[i];
//         }
//         for(int i=0;i<nums.length-k;i++){
//         output[j++]=nums[i];
//         }

//         return output;
//     }
//     public static void main(String[] args) {
//         int[] nums={1,2,3,4,5,6,7};
//         int k=3;

//         for(int num: rotate(nums,k)){
// System.out.print(num+" ");
//         }
//     }
// }

// class solution{
//         public static void main(String[] args) {
//                 int nums[]={1,2,3,4,5,6,7};
//                 int k=3;
//                 //output= 5671234

//                 int j=0;
//                int ans[]=new int[nums.length];
//           for(int i=nums.length-k;i<nums.length;i++){
//                 ans[j++]=nums[i];
//           }
//           for(int i=0;i<nums.length-k;i++){
//                 ans[j++]=nums[i];
//           }

//           for(int num:ans){
//                 System.out.print(num+" ");
//           }

//         }
// }

// class solution {
//         public static void main(String[] args) {
//                 String n = "ssvvd";
//                 char[] name = n.toCharArray();

//                 for (int i = 0; i < name.length; i++) {
//                          int count = 1;
//                   for(int j=i+1;j<name.length;j++){

//                         if (name[i] == name[j]) {
//                                 count++;
//                                 i++;
//                         }

//                 }
//                   System.out.println(name[i] + " " + count);
//         }

//         }
// }

// class solution {
//     public static void main(String[] args) {
//             String n = "ssvvd";
//             char[] name = n.toCharArray();

//             for (int i = 0; i < name.length; i++) {
//                      int count = 1;

//                           int j=name.length-1;
//                     if (name[i] == name[j]) {
//                             count++;
//                             i++;
//                             j--;
//                             if(j==0){
//                                 break;
//                             }

//                     }
//                     System.out.println(name[i] + " " + count);
//             }

//     }

// class solution {
//         public static void main(String[] args) {

//             String name="Madhubala";

//             Map<Character,Integer> lettersCount= new HashMap<Character,Integer>();   //generics

//                         char ch;
//             for(int i=0;i<name.length();i++){
//                 ch=name.charAt(i);
//                 if(lettersCount.get(ch)==null){
//                     lettersCount.put(ch,1);
//                 }else{
//                     it count= lettersCount.get(ch);
//                     count+=1;
//                     lettersCount.put(ch, count);

//                 }

//             }

//             for(char c:lettersCount.keySet()){
//                 System.out.println(c+" "+lettersCount.get(c)); 
//             }
//         }
// }

// class solution{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,2,4,5};

//         Map<Integer,Integer> arrcount=new HashMap<Integer,Integer>();

//            int n=0;

//            for(int i=0;i<arr.length;i++){
//             n=arr[i];
//             if(arrcount.get(n)==null){
//                arrcount.put(n,1);
//             }
//             else{
//                 int count=arrcount.get(n);
//                 count+=1;
//                 arrcount.put(n,count);
//             }
//            }
//            for(int num:arrcount.keySet()){

// System.out.println(num+" "+arrcount.get(num));
//            }

//     }
// }

//isWhitespace//

//  class solution {
// public static void main(String[] args) {
//     String input=" Steffy Alexan  der";
// String ans="";
//     for(int i=0;i<input.length();i++){
//        if(!Character.isWhitespace(input.charAt(i))){
//         ans+=input.charAt(i);
//        }

//     }
//      System.out.print(ans);

// }

// }

//revrese a string

//  class solution {

//     public static void main(String[] args) {
//         String input="Barath Mohan";
//         String ans=" ";
//         for(int i=input.length()-1;i>=0;i--){
//           ans+=input.charAt(i);
//         }
//           System.out.print(ans);
//     }
// }

//Java Program To Remove Special Characters From Given 

//  class solution {

//     public static void main(String[] args) {
//         String input="$*I am steffy{}";

//         String ans=input.replaceAll("[^a-zA-Z0-9 ]","");
//         System.out.print(ans);
//     }
// }

//remove duplicates
//  class solution {
// public static void main(String[] args) {
//     String input="steffy";
//     int j=0;
//     String ans="";
//     for(int i=0;i<input.length();i++){
// if(input.charAt(i)==input.charAt(j)){
//  ans=input.s

// j=i+1;
// }
// else if(input.charAt(i)!=input.charAt(j)){
//  ans+=input.charAt(i);

// j=i+1;

// }
//     }
//        System.out.print(ans);

// }

// }

//Given an array of N integers, and an integer K, the task is to find the number of pairs of integers in the array whose sum is equal to K.
// Examples:
// Input: arr[] = {1, 5, 7, -1}, K = 6
// Output:  2
// Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
// Input: arr[] = {1, 5, 7, -1, 5}, K = 6
// Output:  3
// Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).     nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// import java.util.*;
// class solution {
//     public static void main(String[] args) {
//         int nums[] = { 0, 0, 2, 1, 1, 2, 2, 3, 3, 4 };

//        List<Integer> num=new ArrayList<Integer>();

//        for(int i=0;i<nums.length;i++){
//        if(!num.contains(nums[i])){
//         num.add(nums[i]);

//        }

// }    System.out.println(num);

//        }

//     }

// class solutin{
//     public static void main(String[] args) {
//         int nums[] = { 0, 0, 5, 1, 1, 5, 2, 3, 3, 4 };

//         int j=0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i] ==nums[i-1]){
//                 nums[j++]=nums[i];
//             }
//             System.out.println(nums[j]);
//         }
//     }
// }

// class solution{
//     public static void main(String[] args) {
//          int nums[] = { 0, 0, 0, 5, 1, 1, 5, 2, 3, 3, 4 };

//   int count=0;
//   int k=0;
//          for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){ // 0 0

//                 }
//     }
// }
// }
//     }

// import java.text.NumberFormat;
// import java.util.*;

// class solution{
// public static void main(String[] args) {
//     String name="Steffy";
//     String name2="mfy";

// int count=0;
//     for(int i=0;i<name.length();i++){
//     if(name.charAt(i)==name2.charAt(count)){
//         count++;
//     }

// }
// if(count==name2.length()){
//     System.out.print("true");
// }
// else{
//     System.out.println("false");
// }

// }
// }

// class solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>(); // create an empty stack
//         for (char c : s.toCharArray()) { // loop through each character in the string
//             if (c == '(') // if the character is an opening parenthesis
//                 stack.push(')'); // push the corresponding closing parenthesis onto the stack
//             else if (c == '{') // if the character is an opening brace
//                 stack.push('}'); // push the corresponding closing brace onto the stack
//             else if (c == '[') // if the character is an opening bracket
//                 stack.push(']'); // push the corresponding closing bracket onto the stack
//             else if (stack.isEmpty() || stack.pop() != c) // if the character is a closing bracket
//                 // if the stack is empty (i.e., there is no matching opening bracket) or the top of the stack
//                 // does not match the closing bracket, the string is not valid, so return false
//                 return false;
//         }
//         // if the stack is empty, all opening brackets have been matched with their corresponding closing brackets,
//         // so the string is valid, otherwise, there are unmatched opening brackets, so return false
//         return stack.isEmpty();
//     }

// }

// import java.util.*;
// 

// class solution{
//     public static void main(String[] args) {
//                     int max=0;

//         int arr[][]={{2,2,2},{2,2,3}};
//         int row=arr.length;//2
//         System.out.println("Row"+row);
//         int col=arr[0].length;
//                 System.out.println("Col"+col);

//         for(int i=0;i<row;i++){
//             int sum=0;
//             for(int j=0;j<col;j++){
//                 sum+=arr[i][j];

//                 if(sum>max){
//                     max=sum;
//                 }
//             }

//         }

//                        System.out.println(max);

//     }
// }
//Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// class solution{
//     public static void main(String[] args) {
//         String input= "abcabcbb";
//        char s[]=input.toCharArray();

//  HashMap<Character,Integer> str=new HashMap<Character,Integer>();
//            char n=' ';

//          for(int i=0;i<s.length;i++){
//                  n=s[i];
//                 if(str.containsKey(n)){
//                   str.put(n, str.get(n)+1);
//                 }
//                 else{
//                 str.put(n, 1)    ;
//                 }

//          }

//          for(Map.Entry<Character,Integer>  nums: str.entrySet() ){

//             System.out.println(nums.getKey() +" "+nums.getValue());
//          }

//     }}

/**
 * solution
 */
// public class solution {

//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,2,4,5};

//         Map<Integer,Integer> arrcount=new HashMap<Integer,Integer>();

//            int n=0;

//            for(int i=0;i<arr.length;i++){
//             n=arr[i];
//             if(arrcount.get(n)==null){
//                arrcount.put(n,1);
//             }
//             else{
//                 int count=arrcount.get(n);
//                 count+=1;
//                 arrcount.put(n,count);
//             }
//            }
//            for(int num:arrcount.keySet()){

// System.out.println(num+" "+arrcount.get(num));
//            }

//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,1,2,4,5};

//         HashMap<Integer,Inte
//         ger> nums=new HashMap<Integer,Integer>();
// int n=0;
//         for(int i=0;i<arr.length;i++){
//             n=arr[i];
//      if(nums.containsKey(n)){
//          nums.put(n, nums.get(n)+1);
//       }
//       else{
//         nums.put(n, 1);
//       }
//         }
//         for(Map.Entry<Integer,Integer> num: nums.entrySet() ){
//             System.out.println(num.getKey()+" "+num.getValue());

//         }
//     }

// }

// public class solution {
//     public static String determineDataType(String value) {
//         try {
//             // Try parsing the string as an integer
//             int intValue = Integer.parseInt(value);
//             return "int";
//         } catch (NumberFormatException e) {
//             try {
//                 // Try parsing the string as a double
//                 double doubleValue = Double.parseDouble(value);
//                 return "double";
//             } catch (NumberFormatException e2) {
//                 // If it can't be parsed as either int or double, treat it as a string
//                 return "string";
//             }
//         }
//     }

//     public static void main(String[] args) {
//         String input1 = "123";
//         String input2 = "3.14";
//         String input3 = "Hello, World!";

//         System.out.println(input1 + " is of type: " + determineDataType(input1));

//         System.out.println(input2 + " is of type: " + determineDataType(input2));
//         System.out.println(input3 + " is of type: " + determineDataType(input3));
//     }
// }

// class solution{

//     public static String DatatypeCheck(String value){
//         try{
//             int intval=Integer.parseInt(value);
//              return "int";
//         }
//         catch(NumberFormatException e){
//             try{
//           double doubleval=Double.parseDouble(value);
//            return "double";
//             }

//        catch(NumberFormatException e2){
//             return "String";
//        }
//         }
//     }
//     public static void main(String[] args) {
//         String input1 = "123";
//        String input2 = "3.14";
//       String input3 = "Hello, World!";

//       System.out.println(input1+" is a "+DatatypeCheck(input1));
//       System.out.println(input2+" is a "+DatatypeCheck(input2));
//       System.out.println(input3+" is a "+DatatypeCheck(input3));
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         String s="Steffy";
//         String str=" ";
//         for(int i=s.length()-1;i>=0;i--){
//            str+=s.charAt(i);

//         }

//         System.out.print(str);
//     }
// }

// class solution{

//     public static int Maximumelement(int[] arr,int max){

//         int left=0;
//         int right=arr.length-1;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//              if(arr[mid]==max){
//                 return mid;
//              }
//              else if(arr[mid]<max){
//                 left= mid+1;

//              }
//              else if(arr[mid]>max){
//     right=mid-1;
//              }

//         }
//         return -1;
//     }
//     public static int maxel(int[] arr){
//         int max = Integer.MIN_VALUE;
//         // System.out.println(max);
// for(int i=0;i<arr.length;i++){
//     if(arr[i]>max){
//         max=arr[i];
//     }
// }
// return max;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,5,9,2,4,10};

//         int max=maxel(arr);
//       int searching=Maximumelement(arr,max);

//       if(searching!=-1)

// {
//     System.out.println(searching);
// }

//     }
// }

//class Solution {

//  public static int Maximumelement(int[] arr, int max) {
//         int left = 0;
//         int right = arr.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (arr[mid] == max) {
//                 return mid;
//             } else if (arr[mid] < max) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static int maxel(int[] arr) {
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 5, 9, 2, 4, 3};
//         int max = maxel(arr);
//         int searching = Maximumelement(arr, max);

//         if (searching != -1) {

//             System.out.println("Index of maximum element: " + searching);
//         }
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int arr[]={1,2,5,6,9};

//         ArrayList<Integer> nums=new ArrayList<Integer>();
//        for(int i=0;i<arr.length;i++){
//         nums.add(arr[i]);
//        }

// int sum=0;
//     for(int i=0;i<arr.length;i++){
//       sum+=nums.get(i);

//     }

//     double ans=sum/arr.length;

//     System.out.println(ans);
// }
// }

// class solution {
//     public static void main(String[] args) {
//         String s = "abcdc";
//         int len = s.length();
//         List<Character> str = new ArrayList<Character>();
//         if (len > 0) {
//             for (int i = 0; i < len; i++) {
//                 char c = s.charAt(i);//abcdc
//                 if (!str.contains(c)) { //cd
//                     str.add(c);//abd
//                 }

//             }

//         }
//         for (int i = 0; i < str.size(); i++) {
//             System.out.print(str.get(i));
//         }

//     }

// }
// class solution {
//     public String longestPalindrome(String s) {
//         int size=s.length();
//         if (size<2) {   // return string if 1 char
//             return s;
//         }

//         int start=0, end=0;
//         for (int i=0;i<size;i++) {  // i acts as the center of the palindrome
//             int len = Math.max(fromCenter(s, i, i), fromCenter(s, i, i+1));     // find maximum length of palindrome
//             if (len > end-start+1) {    // find start & end of palindrome from center
//                 start = i - ((len-1)/2);
//                 end = i + len/2;
//             }
//         }

//         return s.substring(start, end+1);
//     }

//     private int fromCenter(String s, int left, int right) {
//         while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
//             left--;     // expand right
//             right++;    // expand left
//         }
//         return right-left-1;    // return length of palindrome
//     }
// }

// public class solution {
//     public static void main(String[] args) {
//         String s = "ababacdc";
//         int max=0;
//         String str="";
//         String a="";
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);

//             for (int j = i + 1; j < s.length(); j++) {

//                 char ch = s.charAt(j);
//                 if (c == ch) {
//                     str=s.substring(i, j + 1);
//                     System.out.println(str);
//                 } 
//                 if(str.length()>max){
//                 a=str;
//                 max=str.length();  
//                 }
//             }

//         }
//          System.out.println(a+" long str");
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int []nums = {1,2,3};
//         int n=nums.length-1;
//         // Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
//         for(int i=0;i<nums.length;i++){
//             int j=i+1;
//             System.out.println;
//         }
//     }
// }

// Test data -> Test Data

/**
 * solution
 */
// class solution {
// public static void main(String[] args) {
// String input = "Help line";
// String str = "";
// char[] ch = input.toCharArray();
// for (int i = 0; i < ch.length; i++) {
// if (ch[i] == ' ') {
// int pos = ch[i + 1];
// if(pos>91){
// ch[i + 1] = (char) (pos - 32);
// for (int j = 0; j < ch.length; j++) {
// str += ch[j];

// }
// }
// else{
// System.out.print("not converted "+input);
// }
// }
// }
// System.out.print("converted "+str);
// }
// }

// Monday is not a holiday => Monday Is Not A Holiday
// This is freshworks academy => This Is Freshworks Academy
// class solution {
// public static void main(String[] args) {
// String inpuString = "Monday is not a holiday";
// String str = " ";
// boolean letter = true;
// char[] arr = inpuString.toCharArray();
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] == ' ') {
// letter = true;
// } else {
// if (letter) {
// arr[i] = Character.toUpperCase(arr[i]);
// letter = false;
// }
// }

// str += arr[i];
// }

// System.out.println("Converted: " + str);
// }
// }
// class solution{
// public static void main(String[] args) {
// String input="tHIS";
// char[] ch=input.toCharArray();
// for(int i=0;i<ch.length;i++){
// int num=ch[i];
// if(num>=97){
// ch[i]=(char)(num-32);
// System.out.print(ch[i]+" ");
// }
// else{
// ch[i]=(char)(num+32);
// System.out.print(ch[i]+" ");
// }

// }}
// }

// import java.util.Scanner;
// public class solution {

// static boolean isAnagram(String a, String b) {

// int check1 = 1;
// int check2 = 1;

// a = a.toUpperCase();
// b = b.toUpperCase();

// for (int i = 0; i < a.length(); i++) {
// check1 *= a.charAt(i);
// System.out.println(check1 + " check1");
// }
// for (int i = 0; i < b.length(); i++) {
// check2 *= b.charAt(i);
// }
// if (check1 == check2) {
// return true;
// } else {
// return false;
// }
// }

// public static void main(String[] args) {

// Scanner scan = new Scanner(System.in);
// String a = scan.next();
// String b = scan.next();
// scan.close();
// boolean ret = isAnagram(a, b);
// System.out.println((ret) ? "Anagrams" : "Not Anagrams");
// }
// }

// class solution {
// public static void main(String[] args) {
// String s = "yum";
// String ans = "";
// int j = 0;
// char[] arr = s.toCharArray();
// for (int i = 0; i < arr.length; i++) {
// char c = arr[i];
// j = arr.length - i - 1;
// System.out.println(j);
// int n = (char) (c + j);
// System.out.println(n + " n");

// if (n > 122) {
// int num = n - 122;
// System.out.println(num + " num");
// n = num + 96;
// }

// ans += (char) n;
// System.out.println(ans + " ans");

// }

// System.out.println("Final Result: " + ans);

// }
// }

// public class solution {
//     public static void main(String[] args) {
//         String input = "abc";
//         List<String> permutations = new ArrayList<>();
//         generatePermutations(input, "", permutations);

//         for (String permutation : permutations) {
//             System.out.println(permutation);
//         }
//     }

//     private static void generatePermutations(String remaining, String current, List<String> result) {
//         if (remaining.isEmpty()) {
//             result.add(current);
//         } else {
//             for (int i = 0; i < remaining.length(); i++) {
//                 char c = remaining.charAt(i);
//                 String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
//                 generatePermutations(newRemaining, current + c, result);
//             }
//         }
//     }
// }

// public class solution {

//     //print the sum of largest sub array
//     public static void main(String[] args){
//         int[] arr = {-1, 5, -50, -3, -90};
//         int length = arr.length;
//         int bestSum = 0;
//         int currentSum = 0;
//         for(int i =0; i < length; i++){
//             currentSum = currentSum + arr[i];
//             if(currentSum > bestSum){
//                 //Now, once the currentSum becomes more then bestSum the value of bestSum will be reset
//                 bestSum = currentSum; 
//             }else {
//                 //currentSum is less and hence reset the currentSum.
//                 currentSum  = 0;
//             }
//         }
//         System.out.println(bestSum);
//     }
// }

// public class solution {

//     public static void rotateMatrix(int[][] matrix){
//         int row = matrix.length;
// 	//first find the transpose of the matrix.
//         for (int i = 0; i < row; i++){
//             for (int j = i; j < row; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
// 	//reverse each row
//         for (int i = 0; i< row; i++){
//             for(int j = 0; j< row/2; j++){
//                 int temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][row - 1 - j];
//                 matrix[i][row - 1 - j] = temp;
//             }
//         }

//     }

// // Below is the main method that will start the execution and print the resultant matrix.

// public static void main(String[] args) {
//         int[][] matrix = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };
//         solution.rotateMatrix(matrix);
//         for (int i = 0; i < matrix.length; i++){
//             for (int j = 0; j < matrix.length; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// class solution{
//     public static void main(String[] args) {

//         int num=148;

//   int count=0;
//         for(int i=2;i<num;i++){
//         if(num%i==0){
//           count=1;
//         }

//     }
//     if(count==1){
//         System.out.println("not prime");
//     }
//     else{
//         System.out.println("prime");
//     }
// }
// }
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29
// import java.util.*;

// class solution{
//     public static void main(String[] args) {
//         String s="stef fy";

//         String a=" ";

//         // char[] ch=s.toCharArray();

//        for(int i=0;i<s.length();i++){
//         if(!Character.isWhitespace(s.charAt(i))){
//          a+=s.charAt(i);

//        }
//         }
//         System.out.println(a);
//     }
// }
// public class solution {
//     public static long calculateFactorial(int n) {
//         if (n < 0) {
//             throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
//         }

//         long factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i; //1 2
//         }
//         return factorial;
//     }

//     public static void main(String[] args) {

//         int n = 5; // Replace this with the integer for which you want to calculate the factorial.
//         long result = calculateFactorial(n);
//         System.out.println("Factorial of " + n + " is " + result);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         String str1 = "abcdABCDabcd";

// char[] chars = str1.toCharArray();

// HashMap<Character, Integer> charsCount = new HashMap<>();

// for (char c : chars) {
// 	if (charsCount.containsKey(c)) {
// 		charsCount.put(c, charsCount.get(c) + 1);
// 	} else
// 		charsCount.put(c, 1);
// }

// System.out.println(charsCount);
//     }
// }
// {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}

//  class Animal {
// 	String color;
// }

// class Cat extends Animal {
// 	void meow() {
// 		System.out.println("Meow");
// 	}
// }
// class solution{
//     public static void main(String[] args) {
//         int x = 10 * 10 - 10;

//    		System.out.println(x);
//     }
// }

// import java.util.HashMap;
// import java.util.Map;
// import java.util.Stack;

// public class solution {
//     public static void main(String[] args) {
//         String input = "aaabba";

//         Map<Character, Integer> alphabetCount = countAlphabets(input);

//         // Display the count of each alphabet
//         System.out.println("Alphabet counts:");
//         for (Map.Entry<Character, Integer> entry : alphabetCount.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }

//     public static Map<Character, Integer> countAlphabets(String input) {
//         Map<Character, Integer> alphabetCount = new HashMap<>();

//         for (char c : input.toCharArray()) {
//             // Check if the character is an alphabet
//             if (Character.isLetter(c)) {
//                 // Convert the alphabet to lowercase for case-insensitive counting
//                 char lowercaseChar = Character.toLowerCase(c);

//                 // Update the count in the map
//                 alphabetCount.put(lowercaseChar, alphabetCount.getOrDefault(lowercaseChar, 0) + 1);
//             }
//         }

//         return alphabetCount;
//     }
// }
//  haystack = "sadbutsad", needle = "sad"

// class solution{
//     public static void main(String[] args) {
//        String input="sadbutsad";
//        String input2="sad";

//     }
// }

// class solution {
//     public static int strStr(String haystack, String needle) {
//         int haylength=haystack.length();
//         int needlelength=needle.length();
//         if(haylength<needlelength)//8<4     return -1
//             return -1;
//         for(int i=0;i<=haystack.length()-needle.length();i++){
//             int j=0;
//             while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
//                 j++;
//             if(j==needle.length()){
//                 return i;
//             }                                                                      
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         String haystack="leetcode";
//         String needle="leeto";
//         System.out.println(solution.strStr(haystack, needle));
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         String haystack="sadfghjsad";
//         String needle="sad";
// int count=0;
//        int haylength=haystack.length();
//        int needlelength=needle.length();

//       if(haylength<needlelength){
//        count=1;
//       }
//       for(int i=0;i<=haylength-needlelength;i++){
//         int j=0;
//         while(j<needlelength && haystack.charAt(i+j)==needle.charAt(j)){
//             j++;
//             if(needlelength==j){
//                 System.out.println(i);
//             }
//             else{
//                 count=1;
//             }
//         }
//       }
//       if(count==1){
//         System.out.println("-1");
//       } 

//     }
// }
//class Solution {
// public int strStr(String haystack, String needle) {
//     if(haystack.contains(needle)){
//         return haystack.indexOf(needle);
//     }
// return -1;
// }

//     class solution {
//     public static void main(String[] args) {

//     String str1="A man, a plan, a canal: Panama";
//   String str=str1.toLowerCase();
//        String s=str.replaceAll("[^a-zA-Z0-9]","");
//         String ans="";
//         for(int i=s.length()-1;i>=0;i--){

//             ans+=s.charAt(i);
//             }

//         if(ans.equals(s)){
//            System.out.println("true"+" "+ans);
//         }
//         else{
//         System.out.println("false"+" "+ans);
//         }
//             }
//         }

// class solution{
//     public static void main(String[] args) {
//         int[] nums={1,2,2,1,3};

//         int ans=0;
//         for(int i=0;i<nums.length;i++){
//             ans=ans^nums[i];
//         }
//      System.out.println(ans);
//     }

// }

// class solution{
//     public static void main(String[] args) {
//         int num=18;
//        if(num%4==0){
//         System.err.println("true");
//        }
//        else{
//         System.out.println("false");
//        }
//     }
// }
// class solution{
// public static void main(String[] args) {
//     int num1=987;
//     int num=789;
//     String val=Integer.toString(num);
//     char[] arr=val.toCharArray();
//     String ans="";
//     for(int i=arr.length-1;i>=0;i--){
//       ans+=arr[i];
//     }
//     System.out.println(ans);

// if(ans.equals(num)){
//     System.out.println("is a palindrome");
// }
// else{
//  System.out.println("not a palindrome");
// }

// }}

// class solution {
//     public static void main(String[] args) {
//         int num = 987;
//         String input = Integer.toString(num);
//         int num2 = 749;
//         String val = Integer.toString(num2);
//         System.out.println(val);
//         String n = "";

//         for (int i = val.length() - 1; i >= 0; i--) {
//             n += val.charAt(i);

//         }
//         System.out.println(n);

//         if (input.equals(n)) {
//             System.out.println("is a palindrome");
//         } else {
//             System.out.println("not a palindrome");
//         }

//     }
// }
// class solution{
//     public static void main(String[] args) {
//         // Program to count vowels in a string

//         String input="Steffy Alexander";
//         String input1=input.toLowerCase().trim();
//         System.out.println(input1);
//     char[] ch=input1.toCharArray();
//     int count=0;
//         for(int i=0;i<ch.length;i++){
//             if(ch[i]=='a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o'  || ch[i]=='u'  ){
//                  System.out.print(ch[i]);
//                  count++;
//             }

//         }
//           System.out.println(count);
//     }
// }

// class solution{
//   public static void main(String[] args) {
//     // Check if given number is perfect squareCheck if given number is perfect square
//     int num=36;
//     if(num>0){

//     int sqrtnum=(int) Math.sqrt(num);
//     if(sqrtnum*sqrtnum==num){
//         System.out.println(sqrtnum+" "+num);
//     }

// else{
//     System.out.println("not a perfect square");
// }    
//   }
// }

// }

//Program to find the maximum element in a Matrix and array
/**
 * solution
 */
//  class solution {
// public static void main(String[] args) {
//     int [][]arr={{1,2,3},
//                  {2,9,4},
//                  {5,2,1}};
// int max=0;
// for(int i=0;i<arr.length;i++){
//     for(int j=0;j<arr.length;j++){
// if(arr[i][j]>max){
//     max=arr[i][j];
// }

//     }
// }
// System.out.println(max);
// }
// } 

// class solution{
//     public static void main(String[] args) {
//         // Program for Sum of the digits of a given number
//         int num=811;
//         int sum=0;
//         while(num!=0){
//         sum+=num%10;
//         num=num/10;
//         }
//         System.out.println(sum);
//     }
// }
//. Sum of square-sums of first n natural numbers

// class solution{
//     public static void main(String[] args) {
//         int n=2;
//         int sum=0;

//             for(int i=1;i<=n;i++){
//              sum+=i*i;
//             }

//         System.out.println(sum);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         int num=143;
//         int nums=num;
//         int ans=0;
//         int sum=0;
// while(nums!=0){
//  sum=nums%10;
//         ans+=Math.pow(sum,3);
//         nums/=10;
// }
//     if(ans==num){
//         System.out.println(num+" "+"is armstrong number");
//     }   
//     else{
//          System.out.println(num+" "+"not an armstrong number");
//     }

//     }

//     }

//  Program for factorial of a number

// class solution{
//     public static void main(String[] args) {
//         int num=4;
//           int ans=1;

// for(int i=1;i<=num;i++){
//     ans=ans*i;
// }
// System.out.println(ans);

//     }
// }

// class solution{
//     static int factorial(int n){
//         if(n==0){
//             return 1;
//         }
//         else{
//             return n*factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         int n=4;
//        System.out.println(solution.factorial(n)); 
//     }
// }
// Program to check if an array is sorted or not

/**
 * solution
 */
// class solution {

// public static void main(String[] args) {
// int arr[]={1,2,3,8,5};
// int count=0;
// int max=0;
// for(int i=0;i<arr.length;i++){
// if(arr[i]>max){
// max=arr[i];
// count++;
// }

// }
// if(count==arr.length){
// System.out.println("is sorted");
// }
// else{
// System.out.println("not sorted");
// }
// }
// }

// .Program to print multiplication table of a number

// class solution{
// public static void main(String[] args) {
// int num=2;
// int ans =0;
// for(int i=1;i<=10;i++){
// ans =i*num;
// System.out.println(i+"x"+num+"="+ans);
// }
// }
// }

// Check if a word is present in a sentence

// class solution{
// public static void main(String[] args) {
// String sen="the word is the all:";
// String word ="word";
// int count=0;
// int senlength=sen.length();
// int wordlength=word.length();
// if(senlength>wordlength){
// for(int i=0;i<sen.length();i++){
// int j=0;
// while(j<wordlength && sen.charAt(i+j)==word.charAt(j)){
// j++;
// if(wordlength==j){
// System.out.println("yes");
// }
// else{
// System.out.println("no");
// }
// }
// }

// }

// }
// }

// class solution{
// public static void main(String[] args) {
// String sen="the lin ghj";
// sen=sen.toLowerCase();

// String word="word";
// word=word.toLowerCase();

// if(sen.contains(word)){
// System.out.println("yes");
// }
// else{
// System.out.println("no");
// }
// }

// }

// class Solution {
// public int strStr(String haystack, String needle) {
// if(haystack.contains(needle)){
// return haystack.indexOf(needle);
// }
// return -1;
// }

// Segregate 0s and 1s in an array
// class solution{
// public static void main(String[] args) {
// int arr[]={1,0,1,0};
// int left=0;
// int right=arr.length-1;
// while(left<right){
// if(arr[left]==0 && left<right){
// left++;
// }
// if(arr[right]==1 && left<right){
// right--;
// }
// if(left<right){
// int temp=arr[left];
// arr[left]=arr[right];
// arr[right]=temp;
// left++;
// right--;
// }

// }
// for(int s: arr){
// System.out.print(s+" ");
// }
// }
// }

// class solution{
// public static void main(String[] args) {
// int arr[]={-1,-1,0,1,1,1};
// int onecount=0;
// for(int i=0;i<arr.length;i++){
// if(arr[i]!=0){
// onecount+=arr[i];
// }

// }
// System.out.println(onecount);
// }
// }

// . Identify Prime Numbers in a list

// public class solution {
// // Function to check if a number is prime
// static boolean isPrime(int num) {
// if (num <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(num); i++) {
// if (num % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// // Define an array of numbers
// int[] numbers = {2, 3, 5, 7, 10, 13, 17, 20};

// // Identify and print prime numbers in the array
// System.out.println("Prime numbers in the list:");
// for (int num : numbers) {
// if (isPrime(num)) {
// System.out.print(num + " ");
// }
// }
// }
// }

// class solution {
// public static void main(String[] args) {
// int arr[] = {2, 4, 6, 5, 7, 11};

// for (int num : arr) {
// if (num <= 1) {
// System.out.println(num + " is not a prime");
// } else {
// boolean isPrime = true;

// for (int i = 2; i <= Math.sqrt(num); i++) {
// if (num % i == 0) {
// isPrime = false;
// break; // No need to check further, it's not a prime
// }
// }
// if (isPrime) {
// System.out.println(num + " is a prime");
// } else {
// System.out.println(num + " is not a prime");
// }
// }
// }
// }
// }

// class solution{
// public static void main(String[] args) {
// int arr[]={2,3,4,5,6,7,8,9,0};
// for(int num:arr){
// if(num<=1){
// System.out.println(num+" "+"is not a prime");
// }
// else{
// boolean isPrime=true;
// for(int i=2;i<=Math.sqrt(num);i++){
// if(num%i==0){
// isPrime=false;
// break;
// }
// }
// if(isPrime){
// System.out.println(num+" "+"is a prime");
// }
// else{
// System.out.println(num+" "+"is not a prime");
// }
// }
// }
// }
// }

// class solution{
// public static void main(String[] args) {
// int arr[]={2,3,4,5,61,6,7,8};
// for(int num:arr){
// if(num<=1){
// System.out.println(num+" "+"is not a prime");
// }
// else{
// boolean isPrime=true;
// for(int i=2;i<=Math.sqrt(num);i++){
// isPrime=false;
// break;
// }
// if(isPrime){
// System.out.println(num+" "+"is a prime");
// }
// else{
// System.out.println(num+" "+"is not a prime");
// }
// }
// }
// }
// }

// class solution{
// public static void main(String[] args) {
// // Write a program to reverse digits of a number

// int num=987;
// String n=Integer.toString(num);
// String ans="";
// for(int i=n.length()-1;i>=0;i--){
// ans+=n.charAt(i);
// }
// System.out.println(ans);
// }
// }

// Find Second largest element in an array
// import java.util.*;

// class solution {
// public static void main(String[] args) {
// int arr[] = { 2, 5, 1, 3, 7, 8 };
// for (int i = 0; i < arr.length - 1; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] < arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// int ans = 0;
// if (arr.length >= 2) {
// ans = arr[1]; // Assuming the array has at least two elements
// } else {
// System.out.println("Array does not have a second-largest element.");
// return;
// }

// System.out.println("Second largest element: " + ans);

// }
// }

// class solution{
// public static void main(String[] args) {
// String arr[]={"angel","ancy","steffy","abc"};

// String fstlen=arr[0];
// for(int i=0;i<arr.length;i++){
// if(arr[i].length()>fstlen.length()){
// fstlen=arr[i];

// }

// }
// System.out.println(fstlen);

// }
// }

// class solution {
//     public static void main(String[] args) {
//         String input = "abcdeabcdefghi";

//         HashMap<Character, Integer> str = new HashMap<Character, Integer>();

//         for (int i = 0; i < input.length(); i++) {
//             char c = input.charAt(i);
//             int count = str.getOrDefault(c, 0);
//             str.put(c, count + 1);

//         }
//         System.out.println(str);
//     }

// }
// import java.util.*;
// public class solution {
//     public static void main(String[] args) {
//         String input = "aic";
//         String output = "car";

//         HashMap<Character, Integer> strMap = new HashMap<Character, Integer>();
//         HashMap<Character, Integer> strMap1 = new HashMap<Character, Integer>();

//         for (char c : input.toCharArray()) {
//             strMap.put(c, strMap.getOrDefault(c, 0) + 1);
//         }
//         for (char s : output.toCharArray()) {
//             strMap1.put(s, strMap1.getOrDefault(s, 0) + 1);
//         }
//         if (strMap.equals(strMap1)) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }

/**
 * solution
 */
// class solution {
// public static void main(String[] args) {
// int arr[]={2,3,41,9,6};
// int seclargest=0;
// int max=0;
// for(int i=0;i<arr.length;i++){
// if(max<arr[i]){
// seclargest=max;
// max=arr[i];
// }
// else if(seclargest<arr[i] && arr[i]!=max){
// seclargest=arr[i];
// }
// }
// System.out.println(seclargest);
// }

// }

// class solution{
// public static void main(String[] args) {
// String str="steffy234";
// int add=0;
// for(int i=0;i<str.length();i++){
// if(Character.isDigit(str.charAt(i))){
// add=add+Character.getNumericValue(str.charAt(i));
// }
// }
// System.out.println(add);
// }
// }

// class solution{
// public static void main(String[] args) {
// String str="steffy234";
// String add="";
// for(int i=0;i<str.length();i++){
// if(!Character.isDigit(str.charAt(i))){
// add+=str.charAt(i);
// }
// }
// System.out.println(add);
// }
// }

// class solution{
// public boolean isValid(String s) {
// Stack<Character> stack = new Stack<Character>(); // create an empty stack
// for (char c : s.toCharArray()) { // loop through each character in the string
// if (c == '(') // if the character is an opening parenthesis
// stack.push(')'); // push the corresponding closing parenthesis onto the stack
// else if (c == '{') // if the character is an opening brace
// stack.push('}'); // push the corresponding closing brace onto the stack
// else if (c == '[') // if the character is an opening bracket
// stack.push(']'); // push the corresponding closing bracket onto the stack
// else if (stack.isEmpty() || stack.pop() != c) // if the character is a
// closing bracket
// // if the stack is empty (i.e., there is no matching opening bracket) or the
// top of the stack
// // does not match the closing bracket, the string is not valid, so return
// false
// return false;
// }
// // if the stack is empty, all opening brackets have been matched with their
// corresponding closing brackets,
// // so the string is valid, otherwise, there are unmatched opening brackets,
// so return false
// return stack.isEmpty();
// }
// }
// styring []='apple','apricod','appeticir','apology'

// class solution {
//     public static void main(String[] args) {
//         String[] arr = { "apple", "apricod", "appeticer", "apoyghj" };
//         if (arr.length != 0) {
//             String one = arr[0];
//             for (int i = 1; i < arr.length; i++) {
//                 String s = arr[i];
//                 int j;
//                 for (j = 0; j < one.length() && j < s.length(); j++) {

//                     if (one.charAt(j) != s.charAt(j)) {
//                         break;
//                     }
//                 }

//                 one = one.substring(0, j);

//             }
//             System.out.println(one);

//             if (one.isEmpty()) {
//                 System.out.println("false");
//             }
//         }
//     }
// }
// word, bord, kork,
// class solution {
// public static void main(String[] args) {
// // 2
// // 11 42 564 5775 34 123 454 1 5 45 3556 23442
// // 3 11 4 200

// int arr[] = { 42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442 };
// int n=0;
// for(int i=0;i<arr.length;i++){
// n=arr[i]%10;
// if(i%2==0){
// System.out.println(arr[i]);
// }
// }
// }
// }

//111-200//

/**
 * solution
 */
// class solution {

//     public static void main(String[] args) {
//         int[]arr={42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442};
//         for(int i=0;i<arr.length;i++){

//         }
//     }
// }

// class solution {
//    public static void main(String[] args) {
//     int x=909;

//         long rev = 0;
//         while (x != 0) {
//             rev = rev * 10 + (x % 10);  //0+9==9 90+(90%10)==90+0==90   
//              System.out.println(rev);
//             x = x / 10;//90      //9
//         }

//         System.out.println(rev);
//     }

// }

import java.util.*;

// public class solution {
//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 9, 1, 5 };
//         Arrays.sort(arr);

//         int val = (arr.length - 1) / 2;

//         int[] max = new int[val];
//         for (int i = 0; i < val; i++) {
//             max[i] = arr[i];
//         }

//         int[] min = new int[val + 1];
//         int j = 0;
//         for (int i = arr.length - 1; i >= val; i--) {
//             min[j++] = arr[i];
//         }

//         ArrayList<Integer> listArr = new ArrayList<Integer>();
//         for (int i = 0; i < 5; i++) {
//             if (i % 2 == 0) {
//                 listArr.add(max[i / 2]);
//             } else {
//                 listArr.add(min[i / 2]);
//             }
//         }

//         for (Integer value : listArr) {
//             System.out.println(value);
//         }
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         String str="I am Steffy Alexander";
//         String arr[]=str.split(" ");
//        for(int i=0;i<arr.length;i++){
//         if(arr[i].length()%2==0){
//         System.out.println(arr[i]);
//         }
//        }

//     }
// }

// class solution {
//     public static void main(String[] args) {
//         String str = "0000098765089";
//         String s = "";
//         int index = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c != '0') {
//                 index = i;
//                 break;
//             }
//         }
//         s = str.substring(index, str.length());
//         System.out.println(s);
//     }
// }

// class solution {
//     public static void main(String[] args) {
//         String s = "The quick brown fox jumps over the lazy dog";

//         for (int i = 0; i < s.length(); i++) {
//           if (Character.isLetter(s.charAt(i))) {

//           }
//         }
//     }
// }

// class solution {
//     public boolean checkIfPangram(String sentence) {

//         Set<Character> seen = new HashSet<>();

//         for (final char c : sentence.toCharArray())
//             seen.add(c);

//         return seen.size() == 26;
//     }

//     public static void main(String[] args) {

//         solution solution = new solution();

//         String sentence = "thequickbrownfoxjumpsoverthelazydog";

//         boolean result = solution.checkIfPangram(sentence);

//         System.out.println("Is \"" + sentence + "\" a pangram? " + result);
//     }
// }

// class solution{
//     public static void main(String[] args) {
//         String s="SteffyAlexander";
//         char val='e';
//         ArrayList<Character> newstr=new ArrayList<Character>();
//         String str=s.toLowerCase();
//         for(int i=0;i<str.length();i++){
//             char c=str.charAt(i);
//           if(c!=val){
//             newstr.add(s.charAt(i));
//           }

//         }
//         for(int i=0;i<newstr.size();i++){
//             System.out.print(newstr.get(i));
//         }
//     }
// }

//  class solution {
//     public static void main(String[] args) {
//         int arr[] = {2, 1, 3, 4, 6};
//         int rotation = 3;

//         rotateRight(arr, rotation);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     private static void rotateRight(int[] arr, int rotation) {
//         int n = arr.length;
//         rotation = rotation % n; 
//         reverseArray(arr, 0, n - 1);

//         reverseArray(arr, 0, rotation - 1);

//         reverseArray(arr, rotation, n - 1);
//     }

//     private static void reverseArray(int[] arr, int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

// 1 You are given an array of numbers.you have to find whether the array is beautiful or not. A beautiful array is an array whose sum of all numbers is divisible by 2, 3 and 5

// Input Description:
// You are given a number ‘n’ denoting the size of the array.Next line contains n space separated numbers.

// Output Description:
// Print 1 if array is beautiful and 0 if it is not

// Sample Input :
// 5
// 5 25 35 -5 30
// Sample Output :
// 1

// class solution {
//     public static void main(String[] args) {
//         int arr[] = {-2 ,4 ,6 ,-8 ,10 ,12 };
//         int add = 0;
//         for (int i = 0; i < arr.length; i++) {
//             add += arr[i];
//         }
//         if (add % 2 == 0 && add % 3 == 0 & add % 5 == 0) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
//     }
// }

// class solution {
//     public static void main(String[] args) {
//         int digit = 121;

//         ArrayList<Integer> arrlist = new ArrayList<Integer>();

//         while (digit != 0) {
//             int num = (digit % 10);
//             if (!arrlist.contains(num)) {
//                 arrlist.add(num);
//             }

//             digit /= 10;
//         }
//         for (int i = 0; i < arrlist.size(); i++) {
//             System.out.print(arrlist.get(i) +" ");
//         }
//         if (arrlist.size() == 2) {
//             System.out.println("Saturated");
//         } else {
//             System.out.println("Unsaturated");
//         }

//     }
// }

class solution {
    public static void main(String[] args) {
        int digit = 101111011;
        int count = 0;

        while (digit != 0 & digit % 10 == 1) {
            count++;
            digit /= 10;
        }

        System.out.println(count);
    }
}