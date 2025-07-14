public class FiboWithRecursion{
    static int count=2;
    public static void fibbo(int prev1,int prev2){
        if(count<=19){
            int newFibo=prev1+prev2;
            System.out.println(newFibo);
            prev2=prev1;
            prev1=newFibo;
            count+=1;
            fibbo(prev1,prev2);
        }else{
            return ;
        }
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fibbo(1,0);

    }
}