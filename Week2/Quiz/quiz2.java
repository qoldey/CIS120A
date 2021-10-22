public class quiz2 {

    public static void main(String[] args) throws InterruptedException {
        message();
        adder(19, 25);
        adder(25, 41);
    }

    public static void adder(int x, int y) {
        System.out.println(x + y);

    }

    public static void message() {

        int hour;
        int minute;

        for (int i = 0; i < 23; i++) {
            hour = 02;
            minute = 50;
            hour = hour + i;
            // minute = minute;
            System.out.print("The current time is " + hour + ":" + minute + ".");
            Thread.sleep(3600000); // ms in a day
            // This will wait an hour before looping again
        }

    }
}
