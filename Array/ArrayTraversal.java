import java.util.Scanner;
public class ArrayTraversal {
    public static void travarsal(int []arr){
        System.out.println("Your given array:");
        for (int item:arr) {
            
            System.out.println(item+" ");
        }
        System.out.println();

          
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
        travarsal(arr);
        sc.close();    
    }
    }
    

