class Solution {
    public int[] closestPrimes(int left, int right) {
        if(right<2) return new int[]{-1,-1};
        int[] arr = new int[right+1];
        for(int i=0;i<=right;i++){
            arr[i] =1;
        }
        arr[0] = arr[1] = 0;
        for(int i=2;i*i<=right;i++){
            if(arr[i]==1){
                for(int j=i*i;j<=right;j+=i){
                    arr[j]=0;
                }
            }
        }
        // initilization of newArr with -1
        int[] newArr = {-1, -1};
        int prevPrime = -1;
        int diff = Integer.MAX_VALUE;

        for(int i=left;i<=right;i++){
            if(arr[i]==1){ // found prime number
                if(prevPrime!=-1){
                    int t = i-prevPrime;
                    if(t<diff){
                        newArr[0]= prevPrime;
                        newArr[1]=i;
                        diff=t;
                        if(diff==1) return newArr; //Early break for smallest difference
                    }
                }
                prevPrime=i;
            }
        }
        return newArr;
        
    }
}
