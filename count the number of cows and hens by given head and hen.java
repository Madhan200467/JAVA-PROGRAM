import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Head:");
    int head=sc.nextInt();
    System.out.println("Enter the Number of Legs:");
    int leg=sc.nextInt();
    if(leg%2==1){
        System.out.println("The solution is not possible");
        return;
    }
    int cow=0;
    int hen=head;
    while(cow<=head){
        int a=(cow*4)+(hen*2);
        if(a==leg){
           System.out.println("Total Number of Cow: "+cow+"\nTotal Number of Hen: "+hen);
           return;
        }
        cow++;
        hen--;
    }
    System.out.println("It is Cannot Predicted");
}
}
