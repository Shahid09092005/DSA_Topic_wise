public class diamond {
    public static void main(String[] args) {
        int n=10;
        for(int i=0 ;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
     for(int i=n-1 ;i>=0;i--){
            for(int j=n-i-1-1;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=i*2+1-1;j>=0;j--){
                System.out.print("*");
            }
            for(int j=n-i+1-1;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
