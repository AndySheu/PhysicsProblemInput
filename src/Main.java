
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
    static boolean foundAnswer = false;
    static String output = "";
    
    public static void main(String[] args) {
	System.out.println("NOTE: Put a star (*) at the end of the correct answer");
	while (true) {
	    if (addProblem()) {
		saveProblem();
	    }
	}
    }
    
    public static boolean addProblem() {
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
	    
	    foundAnswer = false;
	    
	    if (a.indexOf(42) >= 0) {
		correctAnswer = a.substring(0, a.length() - 1);
		a = correctAnswer;
		foundAnswer = true;
	    }
	    if (b.indexOf(42) >= 0) {
		correctAnswer = b.substring(0, b.length() - 1);
		b = correctAnswer;
		if (foundAnswer) {
		    System.out.println("Oops! Multiple correct answers!!!");
		    return false;
		} else {
		    foundAnswer = true;
		}
	    }
	    if (c.indexOf(42) >= 0) {
		correctAnswer = c.substring(0, c.length() - 1);
		c = correctAnswer;
		if (foundAnswer) {
		    System.out.println("Oops! Multiple correct answers!!!");
		    return false;
		} else {
		    foundAnswer = true;
		}
	    }
	    if (d.indexOf(42) >= 0) {
		correctAnswer = d.substring(0, d.length() - 1);
		d = correctAnswer;
		if (foundAnswer) {
		    System.out.println("Oops! Multiple correct answers!!!");
		    return false;
		} else {
		    foundAnswer = true;
		}
	    }
	    if (e.indexOf(42) >= 0) {
		correctAnswer = e.substring(0, e.length() - 1);
		e = correctAnswer;
		if (foundAnswer) {
		    System.out.println("Oops! Multiple correct answers!!!");
		    return false;
		} else {
		    foundAnswer = true;
		}
	    }
	    if (!foundAnswer) {
		System.out.println("Oops! No correct answers!!!");
		return false;
	    }
	    return true;
	}
	stop();
	return false;
    }
    
    public static void saveProblem() {
	output += "problem = new Problem(\"" + question + "\", \"" + a + "\", \"" + b + "\", \"" + c + "\", \"" + d + "\", \"" + e + "\", \"" + correctAnswer + "\");";
	output += "\nproblems.add(problem);\n";
    }
    
    public static void stop() {
	System.out.println(output);
	s.nextLine();
	System.exit(0);
    }
}
