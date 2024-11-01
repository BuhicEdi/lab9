package lab9;
/**
 * Denna enum-klass lagrar och hanterar hur många arbetstimmar
 * en anställd arbetar beroende på veckodag.
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

// Enum-konstruktor som lagrar antalet arbetstimmar varje veckodag har
public enum ProgrammingWeekday {
	MONDAY(8.0),
	TUESDAY(2.0),
	WEDNESDAY(4.5),
	THURSDAY(2.0),
	FRIDAY(6.0),
	SATURDAY(0.0),
	SUNDAY(0.0);

	// Attribut som används för att lagra antalet timmar
	private double workTime = 0;

	// Privat konstruktor
	private ProgrammingWeekday(double hours) {
		this.workTime += hours;
	}

	// Metod som returnerar antalet timmar
	public double getTime() {
		return workTime;
	}
}