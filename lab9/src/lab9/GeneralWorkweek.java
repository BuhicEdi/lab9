package lab9;

public class GeneralWorkweek {
	private double totalWorkTime;
	
	public GeneralWorkweek() {
		this.totalWorkTime = 0;
	}
	
	public void addWeekday(Weekday day) {
		switch (day) {
		case MONDAY, TUESDAY, 
			WEDNESDAY, THURSDAY -> this.totalWorkTime += 8.0;
		case FRIDAY -> this.totalWorkTime += 6.0;
		default -> this.totalWorkTime += 0;
		}
	}
	
	public double getWorktime() {
		return totalWorkTime;
	}
}
