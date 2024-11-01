package lab9;
/**
 * Program som testar klassen ProgrammingWorkweek.
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class P9_3 {

	public static void main(String[] args) {
		ProgrammingWorkweek w = new ProgrammingWorkweek();

		// Lägger till arbetstimmar
		w.addWeekday(ProgrammingWeekday.MONDAY);
		w.addWeekday(ProgrammingWeekday.TUESDAY);
		w.addWeekday(ProgrammingWeekday.WEDNESDAY);
		w.addWeekday(ProgrammingWeekday.THURSDAY);
		w.addWeekday(ProgrammingWeekday.FRIDAY);
		w.addWeekday(ProgrammingWeekday.SATURDAY);
		w.addWeekday(ProgrammingWeekday.SUNDAY);

		// Anropar totala arbetstiden
		System.out.println(w.getWorktime());
	}
}
