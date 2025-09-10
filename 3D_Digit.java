//This program is the print the digit is satified the codition 1.3 digit num 2.num is prime number 3.sum of the digit in the num is should be prime number 4.each digit in num is prime number
import java.util.*;
public class Main
{
    public static boolean isPrime(int n){
        int i;
        if(n==1 || n==0)
        return false;
        for(i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static int sum(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            int x=temp%10;
            if(!isPrime(x))
            return 1;
            sum+=x;
            temp/=10;
        }
        return sum;
    }
    public static boolean digit(int n){
        int i;
        int temp=n;
        for(i=0;i<3;i++){
            int k=temp%10;
            if(!isPrime(k))
            return false;
            temp/=10;
        }
        return true;
    }
	public static void main(String[] args) {
		int a=100;
		for(int i=a;i<1000;i++){
		    int f=0;
		    if(isPrime(i)){
		        if(isPrime(sum(i)) && digit(i)){
		            f=1;
		        }
		    }
		    if(f==1){
		        System.out.println(i);
		    }
		}
	}
}
