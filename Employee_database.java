import java.util.*;
class cog{
    static String company="Cognizant";
    static int tax_per=10;
    static int com_profit=10000000;
   
    String name;
    int age;
    int salary;
    int share_per;
    int taxtopay;
    int share_profit;
   
    cog(String name,int age,int salary,int share_per){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.share_per=share_per;
        this.taxtopay=0;
        this.share_profit=0;
    }
   
    void calTax(){
        taxtopay=salary*tax_per/100;
    }
   
    void calprofit(){
        share_profit=com_profit*share_per/100;
    }
   
    void display(){
        calprofit();
        calTax();
        System.out.println("Compnay Name: "+company);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Tax to Pay: "+taxtopay);
        System.out.println("Share Profit Amount: "+share_profit);
        System.out.println();
    }
}

public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number of Employee:");
    int n=sc.nextInt();
    System.out.println();
    sc.nextLine();
    cog[] emp=new cog[n];
    String name;
    int age,salary,share_per;
    for(int i=0;i<n;i++){
        System.out.println("Enter the Employee "+(i+1)+" details:");
        System.out.println("-------------------------------------");
        System.out.println("Enter the Name: ");
        name=sc.nextLine();
        System.out.println("Enter the Age: ");
        age=sc.nextInt();
        System.out.println("Enter the Annual Salary: ");
        salary=sc.nextInt();
        System.out.println("Enter the Share Percentage in comapny:");
        share_per=sc.nextInt();
        System.out.println();
        sc.nextLine();
        emp[i]=new cog(name,age,salary,share_per);
    }
    for(int i=0;i<n;i++){
        System.out.println("Details of Employee"+(i+1)+":");
        System.out.println("-------------------------------------");
        emp[i].display();
    }
}
}
