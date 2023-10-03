import java.io.*;
import java.util.Random;
public class sortjava{
	public static void main(String args[]){
		
		int arr[]={10,5,20,23,45,65,43,34,78,90};
		System.out.println("original array:");
		for(int k=0;k<10;k++){
		 	System.out.print(arr[k]+" ");
		 }
		     	
		 	int t;
		 	for(int i=0;i<10;i++){
		 		for(int j=i+1;j<10;j++){
		 	  		if(arr[i]>arr[j]){
		 		 		t=arr[i];
		 	       			arr[i]=arr[j];
		 	       			arr[j]=t;	
		 	  		}
		 	         }
		 		System.out.println();
		 		for(int k=0;k<10;k++){
		 			System.out.print(arr[k]+" ");
		 		}
		     }		 	
		}
	}
