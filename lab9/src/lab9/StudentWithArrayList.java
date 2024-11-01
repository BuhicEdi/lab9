package lab9;

import java.util.ArrayList;
/**
 * Denna klass lagrar en students tentamenresultat med hjälp utav ArrayList. 
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class StudentWithArrayList {
	// Klassattribut som lagrar namn, antal tentamen samt poäng
	private String name;
	private ArrayList<Double> quizzes = new ArrayList<Double>();

	// Konstruktor som skapar en ny student och tar emot personens namn
	public StudentWithArrayList(String name) {
		if (name == null) {
			throw new NullPointerException();
		} else if (name.isBlank()) {
			throw new IllegalArgumentException();
		} else {
			this.name = name;
		}
	}

	// Metod som returnerar studenens fulla namn
	public String getName() {
		return name;
	}

	// Metod som adderar ny tentamensresultat
	public void addQuizScore(double score) {
		if (score < 0) {
			throw new IllegalArgumentException();
		} else {
			quizzes.add(score);
		}
	}

	// Metod som returnerar totalpoängen
	public double getTotalScore() {
		double sum = 0;

		for (double e: quizzes) {
			sum += e;
		}

		return sum;
	}

	// Metod som tar fram studentens medelvärde
	public double getAverageScore() {
		if (quizzes.size() == 0) {
			return 0.0;
		}

		return getTotalScore() / quizzes.size();
	}

	// Metod som returnerar antalet skrivna/lagrade tentor
	public int getNbrOfQuiz() {
		return quizzes.size();
	}

	// Metod som returnerar ett visst tentamensresultat baserat på vilket index som matas in
	public double getQuizScore(int index) {
		return quizzes.get(index);
	}

	// Metod som returnerar en kopia av alla lagrade tentamen i arrayformat
	public ArrayList<Double> getQuizzes() {
		return quizzes;
	}

	// Metod som returnerar en kopia av alla lagrade tentamensresultat i strängformat
	public String toString() {
		return quizzes.toString();
	}
}
