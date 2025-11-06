// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String inputTime = args[0];
		String suffix = "";
		int hours12 = 0;
		String minutesOutput;

		int hours24 = Integer.parseInt(inputTime.substring(0 , 2));
		int minutes = Integer.parseInt(inputTime.substring(3 , 5));

		if (hours24== 0) {
			hours12 = 0;
			suffix = "AM";
		} else if (hours24 < 12) {
			hours12 = hours24;
			suffix = "AM";
		} else if (hours24 == 12) {
			hours12 = 12;
			suffix = "PM";
		} else {
			hours12 = hours24 - 12;
			suffix = "PM";
		}
		if (minutes < 10) {
			minutesOutput = "0" + minutes;
		} else {	
			minutesOutput = "" + minutes;

		}
		System.out.println(hours12 + ":" + minutesOutput + " " + suffix);
	}
}