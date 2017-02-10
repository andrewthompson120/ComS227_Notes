import java.util.Scanner;
public class Feb8 {
    public static final double EPSILON = 1.0 e-12;
    static public void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two ints: ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        
        if (i1 == i2) {
            System.out.println("The two ints are the same");
        }
        else {
            System.out.println(Math.max(i1,i2) + " " + Math.min(i1,i2));
        }
        
        System.out.println("Enter two doubles: ");
        double d1 = in.nextDouble();
        double d2 = in.nextDouble();
        if(Math.abs(d1-d2) < EPSILON) {
            System.out.println("The two doubles are equal");
        }
        else if (d1 > d2) {
            System.out.println(d1 + " " + d2);
        }
        else {
            System.out.println(d2 + " " + d1);
        }
        
        System.out.println("Enter two strings: ");
        
        
    }
}

/* Notes:
 
 Main points:
 - Comparing strings
 - if/else combinations
 
    String S1 = "abc" , S2 = "def";
    
    
 

*/
