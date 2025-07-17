import java.util.Scanner;

public class BinarySearch {
  
    // for display the variable
    public static void travarsal(int[] var0) {
        System.out.println("Your given array:");
        int[] var1 = var0;
        int var2 = var0.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1[var3];
         System.out.println("" + var4 + " ");
      }

      System.out.println();
   }
    public static int bisearch(int[]arr,int size,int targetVal){
        int left=arr[0];
        int right=size-1;
     while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == targetVal) {
                return mid;
            }

            if (arr[mid] < targetVal) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        
        // declear a array
        int[] arr= new int[size];

        // inout array element
        System.out.println("Enter " +size+" Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        // print the aeear
        travarsal(arr);
        System.out.println("Enter the search element!");
        int element=sc.nextInt();
        // call the liner search function   
        int searchIndex=bisearch(arr,size, element);
        System.out.println("Element found in index  "+searchIndex);
  

    
    
}

}
