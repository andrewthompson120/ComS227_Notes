public class AlarmClockTest{
    static public void main(String[] argc) {
        int initHour = 5;
        int initMin = 53;
        boolean initStatus = true;
        
        AlarmClock clock;
        clock = new AlarmClock(initHour,initMin,initStatus);
        
        System.out.println("%2d:%02d"initHour,initMin);
        System.out.println(isAlarmOn());
        
        
        
    }
}
