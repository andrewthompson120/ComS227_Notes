package feb_first;

public class LaserPointer {
	
	private Battery battery;
	// Represents the battery in the laser pointer
	private boolean laserState;
	// Represents the state of the laser pointer; on/off

	    
	public LaserPointer(Battery givenBattery) {
	        
	    battery = givenBattery;
	    laserState = false;
	        
	}
	/*
	 * 
	 */
	    
	public void turnOn() {
	        
	    laserState = battery.isAlive();
	        
	}
	/*
	 * 
	 */
	    
	public void turnOff(int minutesOfUse) {
	        
		battery.use(minutesOfUse);
		laserState = false;
	        
	}
	/*
	 * Determines whether the laser pointer is off or on.
	 * @return
	 * 	  true if the laser is on. otherwise false
	 */
	    
	public boolean laserState() {
	        
	    return laserState;
	        
	}
	    
	public void replace(Battery battery) {
	        
	    this.battery = battery;
	        
	}

}
