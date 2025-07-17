public class FindLowestValueFromArray {
    public static void findLowest(int []arr){
        int minVal=arr[0];
        for(int i:arr){
            if(i<minVal){
                minVal=i;
            }
        }
        System.out.println("minvalu = "+minVal);

    }
    public static void main(String[] args){
        int[] arr={5,7,4,2,1,9,8};
        findLowest(arr);
    }
}
