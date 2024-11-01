package lab9;
/**
 * Program som testar klassen StudentWithArrayList. 
 * 
 * @version 2024-11-01
 * @author Edi Buhic
 */

public class P9_1 {

	public static void main(String[] args) {
		StudentWithArrayList s1 = new StudentWithArrayList("Maggre Pucksacsson");

		// Adderar tentaresultat
		s1.addQuizScore(15);
		s1.addQuizScore(5);

		// Anropar olika metoder
		System.out.println(s1.getNbrOfQuiz());
		System.out.println(s1.getTotalScore());
		System.out.println(s1.getAverageScore());
		System.out.println(s1.getQuizzes().size());
	}
}
