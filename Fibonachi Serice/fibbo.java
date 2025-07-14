
public class fibbo {
    
    public static void main(String[]args){
        int prvFibo1=0;
        int prvFibo2=1;
        System.out.println( prvFibo1);
        System.out.println( prvFibo2);
        for(int i=0;i<=18;i++){
            int newFibo=prvFibo1+prvFibo2;
            System.out.println(newFibo);
            prvFibo1=prvFibo2;
            prvFibo2=newFibo;
        }
    }
}
