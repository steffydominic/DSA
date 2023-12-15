
// class MergeSort { 
// 	// Merges two subarrays of arr[]. 
// 	// First subarray is arr[l..m] 
// 	// Second subarray is arr[m+1..r] 
// 	void merge(int arr[], int l, int m, int r) 
// 	{ 
// 		// Find sizes of two subarrays to be merged 
// 		int n1 = m - l + 1; 
// 		int n2 = r - m; 

// 		// Create temp arrays 
// 		int L[] = new int[n1]; 
// 		int R[] = new int[n2]; 

// 		// Copy data to temp arrays 
// 		for (int i = 0; i < n1; ++i) 
// 			L[i] = arr[l + i]; 
// 		for (int j = 0; j < n2; ++j) 
// 			R[j] = arr[m + 1 + j]; 

// 		// Merge the temp arrays 
// 		// Initial indexes of first and second subarrays 
// 		int i = 0, j = 0; 

// 		// Initial index of merged subarray array 
// 		int k = l; 
// 		while (i < n1 && j < n2) { 
// 			if (L[i] <= R[j]) { 
// 				arr[k] = L[i]; 
// 				i++; 
// 			} 
// 			else { 
// 				arr[k] = R[j]; 
// 				j++; 
// 			} 
// 			k++; 
// 		} 

// 		// Copy remaining elements of L[] if any 
// 		while (i < n1) { 
// 			arr[k] = L[i]; 
// 			i++; 
// 			k++; 
// 		} 

// 		// Copy remaining elements of R[] if any 
// 		while (j < n2) { 
// 			arr[k] = R[j]; 
// 			j++; 
// 			k++; 
// 		} 
// 	} 

// 	// Main function that sorts arr[l..r] using 
// 	// merge() 
// 	void sort(int arr[], int l, int r) 
// 	{ 
// 		if (l < r) { 
// 			// Find the middle point 
// 			int m = (l + r) / 2; 

// 			// Sort first and second halves 
// 			sort(arr, l, m); 
// 			sort(arr, m + 1, r); 

// 			// Merge the sorted halves 
// 			merge(arr, l, m, r); 
// 		} 
// 	} 

// 	// A utility function to print array of size n 
// 	static void printArray(int arr[]) 
// 	{ 
// 		int n = arr.length; 
// 		for (int i = 0; i < n; ++i) 
// 			System.out.print(arr[i] + " "); 
// 		System.out.println(); 
// 	} 

// 	// Driver method 
// 	public static void main(String args[]) 
// 	{ 
// 		int arr[] = { 12, 11, 13, 5, 6, 7 }; 

// 		System.out.println("Given Array"); 
// 		printArray(arr); 

// 		// Calling of Merge Sort 
// 		MergeSort ob = new MergeSort(); 
// 		ob.sort(arr, 0, arr.length - 1); 

// 		System.out.println("\nSorted array"); 
// 		printArray(arr); 
// 	} 
// }

// class MergeSort{

//     void merge(int arr[],int l,int m,int r){
//         //declaring the length
//          int n1=m-l+1;
//          int n2=r-m;

//          //creating temp arrays
//          int L[]=new int[n1];
//          int R[]=new int[n2];

//          //copying all data o the tem arrays

//          for(int i=0;i<n1;i++){
//             L[i]=arr[l+i];

//             //left to midof i

//          }

//          for(int j=0; j<n2 ;j++){
//             R[j]=arr[m+1+j];

//             //mid+1 to right end of j
//          }

//          //merge two arrays
// //declaring the indexes of two arrays

// int i=0;
// int j=0;
// int k=l;

// // checking the condition if i<n1 and j<n2

// while(i<n1 && j<n2){
//     //inside that if left arr elemnets is smaller than right
//     if(L[i]<=R[j]){
//         //store l[i] in arr[k] new array
// arr[k]=L[i];
// i++;
//     }
//     else{
//         arr[k]=R[j];
//           //else store k[j] in arr[k] new array
//         j++;
//     }
//     k++;
// }

//     while(i<n1){
//         arr[k]=L[i];
//         i++;
//         k++;
//     }
//     while(j<n2){
//         arr[k]=R[j];
//         j++;
//         k++;
//     }
// }

// //main function sort
// void sort(int arr[], int l, int r){
// if(l<r){
//     //finding mid elemnet
//     int m=(l+r)/2;
//     //sort first and sec halfes
//     sort(arr,l,m);
//     sort(arr,m+1,r);
//     // Merge the sorted halves 
//     merge(arr,l,m,r);
// }
// }

// static void printArray(int arr[]){
// for(int i=0;i<arr.length;i++){
//     System.out.println(arr[i]+" ");

// }
// }

//   public static void main(String[] args) {
//         int arr[]={11,4,10,2,3,8};

// 		// Calling of Merge Sort 
// 		MergeSort ob = new MergeSort(); 
// 		ob.sort(arr,0, arr.length - 1); 

// 		System.out.println("\nSorted array"); 
// 		printArray(arr); 

// }
// }

//copying remaining element    


// class MergeSort {
//  void merge(int arr[],int l,int m,int r){
//     int n1=m-l+1;
//     int n2=r-m;

//     int[] L=new int[n1];
//     int[] R=new int[n2];

//     for(int i=0;i<n1;i++){
//         L[i]=arr[l+i];

//     }
//     for(int j=0;j<n2;j++){
//           R[j]=arr[m+1+j];
//     }

// int i=0;
//   int j=0;
// int k=l;
//     while(i<n1 && j<n2){
//         if(L[i]<=R[j]){
//         arr[k]=L[i];
//         i++;
//     }
//     else{
//         arr[k]=R[j];
//         j++;
//     }
//     k++;
// }

// while (i<n1) {
//     arr[k]=L[i];
//     i++;
//     k++;
    
// }
// while(j<n2){
//     arr[k]=R[j];
//     j++;
//     k++;
// }}

//  void sort(int arr[],int l, int r){
 
//     if(l<r){
//     int m=(l+r)/2;
//     sort(arr,l,m);
//     sort(arr, m+1,r);
//     merge(arr,l,m,r);
//     }
//  }


//     static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 4, 2, 7, 2, 6 };
//         MergeSort ms = new MergeSort();
//         ms.sort(arr, 0, arr.length - 1);
        
//         printArray(arr);

//     }

  
// }

class MergeSort{
    void merge(int arr[],int l,int m ,int r){
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
         int R[]=new int[n2];

         for(int i=0;i<n1;i++){
        L[i]=arr[l+i];
         }
         for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
         }

         int i=0,j=0,k=l;
         while(i<n1 &&i<n2){
            if(L[i]<=R[j]){
             arr[k]=L[i];
             i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
         }
         while(i<n1){
           arr[k]=L[i];
           i++;
           k++;
        }
         while(i<n2){
           arr[k]=R[j];
           j++;
           k++;
        }
    }
    void sort(int arr[],int l,int r){
        int m=(l+r)/2;
        sort(arr,l,m);
        sort(arr,m+1,r);
        merge(arr,l,m,r);

    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
public static void main(String[] args) {
    int arr[]={9,2,1,3,1,5};
     MergeSort mg=new MergeSort();
      mg.sort(arr, 0, arr.length-1);
      printArray(arr);


}
}
