public class pattern {
      static void  pattern10(int n){
        for (int i=1;i<=2*n-1;i++){
            int stars;
            if(i>n){
                stars=2*n-i;
            }
            else{
            stars=i;}
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("0");
                }
                
            }
        }
     }
    public static void main(String[] args) {
        pattern10(5);
    }
}
