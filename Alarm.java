import java.awt.*;
import java.time.LocalTime;

public class AlarmClock implements Runnable{

    private final LocalTime alarmTime;
    AlarmClock(LocalTime alarmTime) {

        this.alarmTime = alarmTime;
    }
    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
      try {
          LocalTime now = LocalTime.now();

          Thread.sleep(1000);
          int hours = now.getHour();
          int mins = now.getMinute();
          int seconds =now.getSecond();



          System.out.printf("\r%02d:%02d:%02d" , hours , mins , seconds);
      }catch (InterruptedException e){
          System.out.println("Thread is interrupted");
      }
   }System.out.println();
        System.out.println("ALARM NOICES");

        Toolkit.getDefaultToolkit().beep();
    }
}
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmtime = null;
     while (alarmtime == null){
       try {
           System.out.print("Enter an alarm time (HH:MM:SS): ");
           String inputTime = scanner.nextLine();

           alarmtime = LocalTime.parse(inputTime , formatter);
           System.out.println("Alarm set for " + alarmtime);



       } catch (DateTimeParseException e) {
           System.out.println("Invalid Date to be set");
       }
      AlarmClock alarmClock = new AlarmClock(alarmtime);
      Thread alarmThread = new Thread(alarmClock);
      alarmThread.start();




       }
}}

