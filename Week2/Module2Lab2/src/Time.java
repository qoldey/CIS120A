import java.time.Duration; //import Duration class from java.time package
import java.time.LocalDateTime; //import LocalDateTime class from java.time package
import java.time.format.DateTimeFormatter; //import DateTimeFormatter class from java.time.format package

public class Time {
    public static void main(String[] args) throws InterruptedException { // throws InterruptedException = needed to use
        LocalDateTime now;
        // Will get current Date/Time and assign it to now
        // Output format: E yyyy-MM-dd "T" HH:mm:ss.ms/SSS

        String hour; // String pulled from now
        int houru; // Converted int from string

        String minute; // String pulled from now
        int minuteu; // Converted int from string

        String second; // String pulled from now
        int secondu; // Converted int from string

        int midnight; // stores seconds since midnight
        float percent; // stores (current second in day)/ (seconds in day)

        Duration sincestart; // time since Time.java was created.

        LocalDateTime start = LocalDateTime.of(2021, 9, 28, 1, 12, 32);
        // 9-28-21 @ 01:12:32
        // Finds the time since Time.java was created.

        DateTimeFormatter HourFormatter = DateTimeFormatter.ofPattern("HH");
        // Extracts hours from now
        DateTimeFormatter MinuteFormatter = DateTimeFormatter.ofPattern("mm");
        // Extracts minutes from now
        DateTimeFormatter SecondFormatter = DateTimeFormatter.ofPattern("ss");
        // Extracts seconds from now

        for (int i = 1; i > 0; i++) { // will loop forever making i go up by 1 which will always be > 0
            now = LocalDateTime.now(); // every loop, get time again. now = time

            hour = now.format(HourFormatter); // set hour string
            houru = Integer.valueOf(hour); // convert string to int

            minute = now.format(MinuteFormatter); // set minute string
            minuteu = Integer.valueOf(minute); // convert string to int

            second = now.format(SecondFormatter); // set second string
            secondu = Integer.valueOf(second); // convert string to int

            midnight = (houru * 3600 + minuteu * 60 + secondu); // gets seconds since midnight
            percent = ((float) midnight / 86400 * 100); // convert seconds since midnight to percent
            sincestart = Duration.between(start, now); // get time since Time.java created

            System.out.println("Current time: " + hour + ":" + minute + "." + second); // print current time
            System.out.println("Seconds since midnight: " + midnight); // print time since midnight
            System.out.printf("Percent of day passed: " + "%.3f%%", percent);
            // printf and %f shows only 3 decimal points from percent
            // System.out.println("%");
            System.out.println("\nSeconds since Time.java creation: " + sincestart.getSeconds());
            // convert sincestart to seconds
            System.out.println("Seconds remaining today: " + (86400 - midnight) + "\n");
            // subtract total seconds within a day from our current second. Print line.
            Thread.sleep(1000); // pause the program for 1 second
        }
    }
}