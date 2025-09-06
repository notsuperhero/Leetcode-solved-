public class primes_in_a_range {
    public static boolean prime(int n){
        if (n < 2) return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primesInRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
    }
    public static void main(String[]args){
        primesInRange(100);
    }
}
