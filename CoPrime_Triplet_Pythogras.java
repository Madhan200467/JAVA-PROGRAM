import java.util.*;
public class Main1{
    public static boolean hcf(int a,int b){
        return coprime(a,b)==1;
    }
    
    public static int coprime(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i<n;i++){
            for(int j=4;j<i;j++){
                for(int k=3;k<i;k++){
                    if(((j*j)+(k*k)==(i*i)) && hcf(i,j) && hcf(j,k) && hcf(i,k)){
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
