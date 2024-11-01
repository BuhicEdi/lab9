package lab9;
/**
 * Program som testar klassen GeneralWorkweek.
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class P9_2 {

	public static void main(String[] args) {
		GeneralWorkweek w = new GeneralWorkweek();
		
		// Lägger till arbetsdag
		w.addWeekday(Weekday.MONDAY);
		w.addWeekday(Weekday.TUESDAY);
		w.addWeekday(Weekday.FRIDAY);

		// Returnerar totala arbetstiden
		System.out.println(w.getWorktime());
	}
}
