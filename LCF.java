import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int big=(n1<n2)? n2:n1;
        int s=(n1<n2)? n1:n2;
        int c=big;
        while(true){
            c+=big;
            if(c%s==0){
                System.out.print(c);
                return;
            }
        }
    }
}
