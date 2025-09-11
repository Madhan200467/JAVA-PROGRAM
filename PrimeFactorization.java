import java.util.*;
public class Main{
    public static void primeFactor(int n){
        if(n==1)
        return;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                primeFactor(n/i);
                break;
            }
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeFactor(n);
    }
}
