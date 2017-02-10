
public class Battery
{
    /**
     * lift left in the battery.
     */
    private double lifeLeft;
    /**
     * the battery's initial life.
     */
    private double initialLife;
    
    
    /**
     * Constructs a battery with given initial life.
     * @param initialLife
     *   initial life in minutes
     */
    public Battery(double initialLife)
    {
        lifeLeft = initialLife;
        this.initialLife = initialLife;
    }
    
    /**
     * Determines whether this battery has any life left.
     * @return
     *   true if the battery still has useful life,
     *   false otherwise
     */
    public boolean isAlive()
    {
        return lifeLeft > 0;
    }
    
    /**
     * Simulates using the battery for the given number
     * of minutes.
     * @param requestedMinutes
     *   number of minutes to try to use the battery
     */
    public void use(double requestedMinutes)
    {
        // compute the actual minutes that you use the battery
        double actualMinutes = Math.min(lifeLeft, requestedMinutes);
        
        lifeLeft = lifeLeft - actualMinutes;
        
    }
    
    /**
     * Return the percentage of life left on this battery. The percentage
     * cannot go below 0
     * @return the percentage
     */
    public double lifeLeft() {
        
        double percentage = (lifeLeft/initialLife)*100;
        return percentage;
        
    }
}
