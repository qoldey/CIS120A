import java.time.LocalDateTime; //import LocalDateTime to get current Date/time
import java.time.format.DateTimeFormatter; //import DateTimeFormatter to be able to format the output from LocalDateTime

public class Date {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // Get Current Date/Time and assign it to now
        // Output format: yyyy-MM-dd "T" HH:mm:ss.ms
        // 2021-09-27 T18:57:26.604537847

        DateTimeFormatter DayFormatter = DateTimeFormatter.ofPattern("E");
        // DayFormatter will extract day of the week from now
        DateTimeFormatter YearFormatter = DateTimeFormatter.ofPattern("yyyy");
        // YearFormatter will extract current year from now
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd");
        // DateFormatter will extract current day of month from now
        DateTimeFormatter MonthFormatter = DateTimeFormatter.ofPattern("MMM");
        // MonthFormatter will extract current month in year from now

        String day = now.format(DayFormatter); // Use DayFormatter to set current day to day
        String year = now.format(YearFormatter); // Use YearFormatter to set current year to year
        String date = now.format(DateFormatter); // Use DateFormatter to set current day of month to date
        String month = now.format(MonthFormatter); // Use MonthFormatter to set current month in year to month

        // Expands day format to include whole day name
        // Since DayFormatter returns the first 3 letters of the current day of week.
        if (day.equals("Sun")) {
            day = "Sunday";
        }
        if (day.equals("Mon")) {
            day = "Monday";
        }
        if (day.equals("Tue")) {
            day = "Tuesday";
        }
        if (day.equals("Wed")) {
            day = "Wednesday";
        }
        if (day.equals("Thu")) {
            day = "Thursday";
        }
        if (day.equals("Fri")) {
            day = "Friday";
        }
        if (day.equals("Sat")) {
            day = "Saturday";
        }

        // Expands month format to include whole month name
        // Since MonthFormatter returns the first 3 letters of the current month in year
        if (month.equals("Jan")) {
            month = "January";
        }
        if (month.equals("Feb")) {
            month = "February";
        }
        if (month.equals("Mar")) {
            month = "March";
        }
        if (month.equals("Apr")) {
            month = "April";
        }
        if (month.equals("May")) {
            month = "May";
        }
        if (month.equals("Jun")) {
            month = "June";
        }
        if (month.equals("Jul")) {
            month = "July";
        }
        if (month.equals("Aug")) {
            month = "August";
        }
        if (month.equals("Sep")) {
            month = "September";
        }
        if (month.equals("Oct")) {
            month = "October";
        }
        if (month.equals("Nov")) {
            month = "November";
        }
        if (month.equals("Dec")) {
            month = "December";
        }

        String american = day + ", " + month + " " + date + ", " + year;
        String european = day + " " + date + " " + month + " " + year;
        System.out.println("American format:\n" + american);
        System.out.println("European format:\n" + european);

    }
}
