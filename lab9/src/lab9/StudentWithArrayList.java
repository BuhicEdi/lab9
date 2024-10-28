package lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentWithArrayList {
	// Klassattribut som lagrar namn, antal tentamen samt poäng
	private String name;
	private List<Double> quizzes = new ArrayList<Double>();

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
	public double[] getQuizzes() {
		double[] quizArray = new double[quizzes.size()];
		
		for (int i = 0; i < quizzes.size(); i++) {
			quizArray[i] = quizzes.get(i);
		} 
		return quizArray;
	}

	// Metod som returnerar en kopia av alla lagrade tentamensresultat i strängformat
	public String toString() {
		return Arrays.toString(getQuizzes());
	}
}
