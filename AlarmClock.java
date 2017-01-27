
public class AlarmClock {

    private int clockHour;
    private int clockMinute;
    private boolean AlarmStatus;
    
    
    public AlarmClock(){
        clockHour = 12;
        clockMinute = 00;
        AlarmToggle = 0;
        AlarmStatus = false;
    }
    public AlarmClock(int givenHour, int givenMinute) {
        clockHour = givenHour;
        clockMinute = givenMinute;
        AlarmStatus =
    }
    
    /**
     * Each tap increases the hour by 1
     */
    public void hour() {
        clockHour = clockHour + 1;
    }
    
    /**
     * Checks if alarm is on, returns true - if on , false - if off
     */
    public boolean isAlarmOn(){
        return AlarmStatus;
    }
    
    /**
     * Each Tap increases minute by 1
     */
    public void minute() {
        clockMinute = clockMinute + 1;
    }
    
    /**
     * Toggles the alarm based on the AlarmStatus (if on, toggles off; if off, toggles on)
     */
    public void setAlarm(boolean on) {
        if(AlarmStatus == true) {
            AlarmStatus = false;
        }
        else{
            AlarmStatus = true;
        }
    }

    /**
     * Print's out the time to the clock
     */
    public String toString() {
        return String.format("%2d:%02d", hour, minute);
    }
    
    
}
