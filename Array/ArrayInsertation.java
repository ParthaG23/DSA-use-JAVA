import java.util.Scanner;
public class ArrayInsertation {
    // traversal of array
    public static void display(int []arr,int size){
         System.out.print("Current array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
    public static int insertElement(int []arr,int size,int element,int position){
        if(position< 0|| size>=arr.length){
            System.out.println("Invalid position or array is full!");
           return size;
        }
          for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] =element;
        return size+1; // Updated size
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
        display(arr,size);

        // calculate free size present in arrey:
        int freeSize=capacity-size;
        // Asked user are entered new element or not?
     
       
        
        String response;  // declared before the loop

    do {
        System.out.print("You have "+freeSize+ " free space in array.\nAre you Ensert new element in array?(yes/no)\nyour Response:");
        response = sc.next().toLowerCase();  // use lowercase for safety

        if (response.equals("yes")) {
        // ... your insert logic here ...
             if (freeSize == 0) {
                    System.out.println("Array is full. Cannot insert more elements.");
                    break;
                }

                System.out.print("Enter the element to insert: ");
                int element = sc.nextInt();

                System.out.print("Enter the position to insert: ");
                int position = sc.nextInt();

                size = insertElement(arr, size, element, position);
                freeSize--;

                display(arr, size);
        } else if (response.equals("no")) {
        System.out.println("Thank you!");
        } else {
            System.out.println("Invalid input. Please type 'yes' or 'no'.");
        }

} while (!response.equals("no"));

        sc.close();    
    }
}
