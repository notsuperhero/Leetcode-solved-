public class primes_in_a_range {
    // public static boolean prime(int n){
    //     if (n < 2) return false;
    //     for(int i = 2;i<=Math.sqrt(n);i++){
    //         if(n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primesInRange(int n){
    //     for(int i=2;i<=n;i++){
    //         if(prime(i)){
    //             System.out.print(i+" ");
    //         }
            
    //     }
    //     System.out.println();
    // }
    // public static void binToDec(int binNum){
    //     int myNum =  binNum;
    //     int pow = 0;
    //     int decNum = 0;
    //     while(binNum>0){
    //         int lastDigit = binNum%10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2, pow) );

    //         pow ++;
    //         binNum = binNum/10;
    //     }
    //     System.out.println("decimal of" + myNum +" ="+ decNum);
    // }
    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * Math.pow(10, pow));
            pow ++;
            n=n/2;


        }

    }
    public static void main(String[]args){
        // primesInRange(100);
        // binToDec(111);
        decToBin(3);
        
    }
}
