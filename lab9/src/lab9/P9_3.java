package lab9;

public class P9_3 {

	public static void main(String[] args) {
		ProgrammingWorkweek w = new ProgrammingWorkweek();
		
		w.addWeekday(ProgrammingWeekday.MONDAY);
		w.addWeekday(ProgrammingWeekday.TUESDAY);
		w.addWeekday(ProgrammingWeekday.WEDNESDAY);
		w.addWeekday(ProgrammingWeekday.THURSDAY);
		w.addWeekday(ProgrammingWeekday.FRIDAY);
		w.addWeekday(ProgrammingWeekday.SATURDAY);
		w.addWeekday(ProgrammingWeekday.SUNDAY);

		System.out.println(w.getWorktime());

	}

}
