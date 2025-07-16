import java.util.Scanner;
public class ArrayDeletion {
    // Add element in array
    public static void addElement(int[]arr,int size){
        System.out.println("Enter the Element of array");
         Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }
    // array traversal or display the array
    public static void display(int[] var0, int var1) {
      System.out.print("Current array: ");

      for(int var2 = 0; var2 < var1; ++var2) {
         System.out.print(var0[var2] + " ");
      }

      System.out.println();
   }
   // array deletion:
  public static int deleteElement(int[] arr, int size, int position) {
    if (position < 0 || position >= size) {
        System.out.println("Invalid position. Try again!");
        return size; // return original size, no change
    } else {
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1; // correct new size
    }
}
    public static void main(String[]args){
        System.out.println("First Create a array\nEnter the size of the array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        // Declear the array:
        int[] arr= new int[size];
        // call addElement function elemet
        addElement(arr, size);
      

            String response;  // declared before the loop

   do {
    System.out.println("You have " + size + " elements, and their positions are from 0 to " + (size - 1) + ".");
    System.out.print("Do you want to delete any element from the array? (yes/no): ");
    response = sc.next().toLowerCase();

    if (response.equals("yes")) {
        if (size == 0) {
            System.out.println("Array is empty. Cannot delete more elements.");
            break;
        }

        System.out.print("Enter the position to delete: ");
        int position = sc.nextInt();

      
        size = deleteElement(arr, size, position);
        display(arr, size);
        
    } else if (response.equals("no")) {
        System.out.println("Thank you!");
    } else {
        System.out.println("Invalid input. Please type 'yes' or 'no'.");
    }

} while (!response.equals("no"));


   }
}
