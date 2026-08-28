import java .util.*;
public class prog22 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number of elements in the array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
    }
    int largest=arr[0];
    int secondLargest=arr[0];
    for (int i = 1; i < arr.length; i++) {
    if (arr[i]>largest) {
        secondLargest = largest;
        largest = arr[i];
    }
    else if (arr[i]>secondLargest) {
        secondLargest=arr[i];
     }
   }
   System.out.println("Second largest element is: "+secondLargest);
       }
 }
}