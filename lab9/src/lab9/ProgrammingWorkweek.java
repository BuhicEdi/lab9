package lab9;
/**
 * Denna klass lagrar hur många arbetstimmar någon har jobbat baserat på veckodag.
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class ProgrammingWorkweek {
	// Attribut som lagrar den totala arbetstiden
	private double totalWorkTime;

	// Konstruktor som genererar en ny arbetsvecka
	public ProgrammingWorkweek() {
		this.totalWorkTime = 0.0;
	}

	// Metod som adderar arbetstimmar beroende på veckodag
	public void addWeekday(ProgrammingWeekday day) {
		this.totalWorkTime += day.getTime();
	}

	// Metod som returnerar den totala arbetstiden
	public double getWorktime() {
		return totalWorkTime;
	}
}
