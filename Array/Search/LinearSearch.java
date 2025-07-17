import java.util.Scanner;

public class LinearSearch {
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
    public static int lisearch(int[]arr,int element){
        for(int i:arr){
            if(element==arr[i]){
            return i;
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
    int searchIndex=lisearch(arr, element);
    System.out.println("Element found in index  "+searchIndex);
  

    }
    
}
