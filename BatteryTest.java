package feb_first;

public class BatteryTest {
	
	public static void main(String[] args) {
		
		Battery b1 = new Battery(100.0); // Create a new Battery that has initial life of 100 minutes. 
		b1.use(50.0); // After using it for 50 min, it should be still alive. Use it for another 50 minutes, it should be dead. 		
		System.out.println("Expected: true; actual: " + b1.isAlive());
		b1.use(50.0);
		System.out.println("Expected: false; actual: " + b1.isAlive());
		

		Battery b2 = new Battery(100.0); // Create a new Battery that has initial life of 100 minutes. 
		b2.use(100.0); // After using it for 100 minutes, it should be dead.
		System.out.println("Expected: false; actual: " + b2.isAlive());

		
		Battery b3 = new Battery(0.0); // Create a new Battery that has initial life of 0 minutes, 
		System.out.println("Expected: false; actual: " + b3.isAlive()); // When checked if it is alive, it should return false. 

	}
}
