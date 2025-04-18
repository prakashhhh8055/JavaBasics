package Basics;

public class GradeAssignUsingTernaryOperator {

	public static void main(String[] args) {
		/* Task: Write a Java program to assign grades based on the score using a ternary operator. The conditions are:
			90-100 → "A"
			75-89 → "B"
			50-74 → "C"
			0-49 → "D"
			Input: score = 85
			Expected Output: Your grade is B */
		int score=85;
		 String grade = (score >= 90) ? "A" :
             			(score >= 75) ? "B" :
             			(score >= 50) ? "C" : "D";
		 System.out.println(grade);

	}

}
