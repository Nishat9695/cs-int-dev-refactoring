package kata.app;

import kata.alarm.Alarm;
import kata.alarm.IAlarm;

public class App {
    public static void main(String[] args){
        IAlarm alarm = new Alarm();
       
            alarm.isAlarmOn();
        
    }
}
