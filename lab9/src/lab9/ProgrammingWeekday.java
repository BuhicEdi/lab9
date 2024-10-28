package lab9;

public enum ProgrammingWeekday {
	MONDAY(8.0),
	TUESDAY(2.0),
	WEDNESDAY(4.5),
	THURSDAY(2.0),
	FRIDAY(6.0),
	SATURDAY(0.0),
	SUNDAY(0.0);

	private double workTime;

	private ProgrammingWeekday(double hours) {
		this.workTime = hours;
	}

	public double getTime() {
		return workTime;
	}
}