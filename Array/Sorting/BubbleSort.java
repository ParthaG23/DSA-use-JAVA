import java.util.Scanner;

public class BubbleSort {
    // traversal of array
    public static void display(int []arr,int size){
         System.out.print("Current array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    // create function for bubble sort
    public static void bubbleSort(int[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }

             }
                if(!swap){
                    break;
                }
         }
            
     }
      public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the capacity of the  array:");
            int capacity= sc.nextInt();
        System.out.println("Enter how many element add to the  array:");
             int size= sc.nextInt();
        
        // declear a array
        int[] arr= new int[capacity];

        // inout array element
        System.out.println("Enter " +size+" Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // print the array 
        System.out.println("Your befor sorting");
        display(arr,size);
        System.out.println("Your after sorting");
        bubbleSort(arr);
        display(arr, size);
 }
    
}
