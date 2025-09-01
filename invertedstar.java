import java.util.*;
public class invertedstar {
    public static void main(String[]args){
        System.out.println("Enter a number you like");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int lines=1;lines<=n;lines++){
            for(int star = 1;star<=n-lines+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
