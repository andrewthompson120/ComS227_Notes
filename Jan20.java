public class Jan20 {

    public static void main(String[] args) {
        
        int amountCents = 1034;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;
        
        quarters = amountCents/25;
        amountCents = amountCents % 25;
        
        dimes = amountCents/10;
        amountCents = amountCents % 10;
        
        nickles = amountCents/5;
        amountCents = amountCents % 5;
        
        pennies = amountCents;
        
        System.out.println(quarters + " quarters,"); dimes + " dimes," + nickles + " nickles, " + pennies + " pennies");
        
    }
    
}

/* Notes;
 
Lecture Quiz:
 
 public class StringTest {
	public static void main(String[] args) {
 
 String Hello = "Hello World";
 System.out.println(Hello);
 int n = Hello.length();
 System.out.println(n);
 System.out.println(Hello.toLowerCase());
 System.out.println(Hello.replace("World","Ames"));
	}
 }
 
 
 
*/
