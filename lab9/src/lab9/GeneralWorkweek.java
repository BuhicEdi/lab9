package lab9;
/**
 * Denna klass beräknar antalet arbetstimmar på en vecka beroende på arbetsdag. 
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class GeneralWorkweek {
	// Attribut som lagrar den totala arbetstiden
	private double totalWorkTime;

	// Konstruktor som genererar en ny arbetsvecka
	public GeneralWorkweek() {
		this.totalWorkTime = 0;
	}

	// Metod som tar emot en arbetsdag och beräknar antalet timmar
	public void addWeekday(Weekday day) {
		switch (day) {
		case MONDAY, 
			TUESDAY, 
			WEDNESDAY, 
			THURSDAY -> this.totalWorkTime += 8.0;
		case FRIDAY -> this.totalWorkTime += 6.0;
		default -> this.totalWorkTime += 0;
		}
	}

	// Metod som returnerar totala arbetstiden
	public double getWorktime() {
		return totalWorkTime;
	}
}
