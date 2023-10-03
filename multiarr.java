import java.io.*;
import java.util.Random;
public class multiarr{
	public static void main(String[] args){
		int [][]arr=new int [3][3];
		 Random random=new Random();
		 for(int i=0;i<3;i++){
		  for(int j=0;j<3;j++){
		  arr[i][j]=random.nextInt(50)+1;
		 
		}
		}
		for(int i=0;i<3;i++){
		  for(int j=0;j<3;j++){
		 System.out.print(arr[i][j]+" ");
		 
		}
		System.out.println();
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<3;i++){
		  for(int j=0;j<3;j++){
		  if(i==j){
		  sum1+=arr[i][j];
		  }
		  if(i+j==2){
		  sum2+=arr[i][j];
		  }
		}
		}
		System.out.println("sum of main diagonal elements:"+sum1);
		System.out.println("sum of secondary diagonal elements:"+sum2);
		
	    }
	}
