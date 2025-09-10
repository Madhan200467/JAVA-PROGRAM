import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int n=a.length();
		if(n<8){
		    System.out.print("Bad");
		    return;
		}
		int a1=0,a2=0,a3=0,a4=0;
		for(int i=0;i<n;i++){
		    char b=a.charAt(i);
		    if(b>='a' && b<='z')
		    a1=1;
		    else if(b>='A' && b<='Z')
		    a2=1;
		    else if(b>='0' && b<='1')
		    a3=1;
		    else
		    a4=1;
		}
		if(a1==1 && a2==1 && a3==1 && a4==1)
		System.out.print("Good");
		else
		System.out.print("Bad");
	}
}
