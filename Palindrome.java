import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        
        StringBuilder builder=new StringBuilder(s);
        ArrayList<Integer> ans=new ArrayList<>();

        builder.append('o');

        boolean flag=true;
        for(int i=0;i<n/2;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(n-1-i);
            if(ch1!=ch2){
                flag=false;
                
                break;
            }
        }
        System.out.println(builder);
        if(!flag){
            System.out.println("false");
        }
        else{
        System.out.println(true);}
    
      


    }
}
