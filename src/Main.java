
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    static String question = "";
    static String a = "";
    static String b = "";
    static String c = "";
    static String d = "";
    static String e = "";
    static String correctAnswer = "";
    static String explanation = "";
    static boolean foundAnswer = false;
    static String output = "";
    
    public static void main(String[] args) {
	System.out.println("NOTE: Put a star (*) at the end of the correct answer");
	while (true) {
	    addProblem();
	    saveProblem();
	}
    }
    
    public static void addProblem() {
	System.out.println("Question");
	question = s.nextLine();
	if (!question.equals("stop")) {
	    System.out.println("A");
	    a = s.nextLine();
	    System.out.println("B");
	    b = s.nextLine();
	    System.out.println("C");
	    c = s.nextLine();
	    System.out.println("D");
	    d = s.nextLine();
	    System.out.println("E");
	    e = s.nextLine();
	    System.out.println("Explanation");
	    explanation = s.nextLine();
	    
	    foundAnswer = false;
	    
	    if (a.indexOf(42) >= 0) {
		correctAnswer = a.substring(0, a.length() - 1);
		a = correctAnswer;
		foundAnswer = true;
	    }
	    if (b.indexOf(42) >= 0) {
		correctAnswer = b.substring(0, b.length() - 1);
		b = correctAnswer;
		multipleCorrectAnswers();
	    }
	    if (c.indexOf(42) >= 0) {
		correctAnswer = c.substring(0, c.length() - 1);
		c = correctAnswer;
		multipleCorrectAnswers();
	    }
	    if (d.indexOf(42) >= 0) {
		correctAnswer = d.substring(0, d.length() - 1);
		d = correctAnswer;
		multipleCorrectAnswers();
	    }
	    if (e.indexOf(42) >= 0) {
		correctAnswer = e.substring(0, e.length() - 1);
		e = correctAnswer;
		multipleCorrectAnswers();
	    }
	    if (!foundAnswer) {
		noCorrectAnswers();
	    }
	} else {
	    stop();
	}
    }
    
    public static void multipleCorrectAnswers() {
	if (foundAnswer) {
	    System.out.println("Oops! Multiple correct answers!!! Which one is correct: A, B, C, D, or E?");
	    String correct = s.nextLine();
	    switch (correct) {
		case "A":
		    correctAnswer = a;
		    break;
		case "B":
		    correctAnswer = b;
		    break;
		case "C":
		    correctAnswer = c;
		    break;
		case "D":
		    correctAnswer = d;
		    break;
		case "E":
		    correctAnswer = e;
		    break;
		default:
		    stop();
	    }
	} else {
	    foundAnswer = true;
	}
    }
    
    public static void noCorrectAnswers() {
	System.out.println("Oops! No correct answers! Which one is correct: A, B, C, D, or E?");
	String correct = s.nextLine();
	if (correct.equals("A")) {
	    correctAnswer = a;
	} else if (correct.equals("B")) {
	    correctAnswer = b;
	} else if (correct.equals("C")) {
	    correctAnswer = c;
	} else if (correct.equals("D")) {
	    correctAnswer = d;
	} else if (correct.equals("E")) {
	    correctAnswer = e;
	} else {
	    System.out.println("Stop");
	    stop();
	}
    }
    
    public static void saveProblem() {
	output += "problem = new Problem(\"" + question + "\", \"" + a + "\", \"" + b + "\", \"" + c + "\", \"" + d
		+ "\", \"" + e + "\", \"" + correctAnswer + "\", \"" + explanation + "\");";
	output += "\nproblems.add(problem);\n";
    }
    
    public static void stop() {
	System.out.println("STOP!");
	System.out.println(output);
	s.nextLine();
	System.exit(0);
    }
}
