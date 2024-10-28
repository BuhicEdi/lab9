package lab9;

public class P9_1 {

	public static void main(String[] args) {
		StudentWithArrayList s1 = new StudentWithArrayList("fofi");
		
		s1.addQuizScore(15);
		s1.addQuizScore(5);
		
		System.out.println(s1.getNbrOfQuiz());
		System.out.println(s1.getTotalScore());
		System.out.println(s1.getAverageScore());
		System.out.println(s1.getQuizzes().size());
	}
}
