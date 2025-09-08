// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class min_max_subarray {
    public static void subarrays(int numbers[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum<minSum){
                    minSum = sum;
                }
                ts++;
                System.out.println("| Sum ="+sum);
                
            }
            System.out.println();
        }
        System.out.println("Total subarrays"+ts);
        System.out.println("Max subarray sum: " + maxSum);
        System.out.println("Min subarray sum: " + minSum);
    }
    public static void main(String[] args) {
       int numbers[] = {2,4,6,8,10};
       subarrays(numbers);
    }
}