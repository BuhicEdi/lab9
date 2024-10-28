package lab9;

public class ProgrammingWorkweek {
	private double totalWorkTime;
	
	public ProgrammingWorkweek() {
		this.totalWorkTime = 0.0;
	}
	
	public void addWeekday(ProgrammingWeekday day) {
		this.totalWorkTime += day.getTime();
	}
	
	public double getWorktime() {
		return totalWorkTime;
	}
	
	
}
