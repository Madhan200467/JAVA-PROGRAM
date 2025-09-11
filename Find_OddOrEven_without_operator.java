import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if((a&1)==1)
		System.out.print(a+" is Odd Number");
		else
		System.out.print(a+" is Even Number");
	}
}
