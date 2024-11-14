public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;
        int newHoures = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        String minutesCalc = "" + newMinutes;
        if (newMinutes < 10) {
            minutesCalc = "0" + newMinutes;
		}
        String houresCalc = "" + newHoures;
        if (newHoures < 10) {
            houresCalc = "0" + newHoures;
		}
        System.out.println(houresCalc + ":" + minutesCalc);

    }
}
