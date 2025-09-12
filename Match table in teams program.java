import java.util.*;
public class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Total Number of Teams:");
    int n=sc.nextInt();
    sc.nextLine();
    String teams[]=new String[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter the Team Name"+(i+1)+":");
        teams[i]=sc.nextLine();
    }
    System.out.println("Enter the number of Matches Between the same Team:");
    int m1=sc.nextInt();
    int m=0;
    ArrayList<String[]> pairs=new ArrayList<>();
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            for(int k=0;k<m1;k++){
                pairs.add(new String[]{teams[i],teams[j]});
                m++;
            }
        }
    }
    System.out.println("Total numbr of Matches:"+m);
    Collections.shuffle(pairs);
    System.out.println("Match Table:");
    int index=1;
    for(String[] ch:pairs){
        System.out.println("Match "+index+" : "+ch[0]+" vs "+ch[1]);
        index++;
    }
}
}
