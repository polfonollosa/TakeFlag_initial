package endOfTerm;

import java.awt.Color;


import jconsole.JConsole;

public class EndOfTerm 
{
	public static void main (String [] args) {
		JConsole console = new JConsole(80,35);
		
		String [] students;
		String [] subjects;
		double [][] marks;
		
		int group;
		int NUMBER_OF_GROUPS = 3;
		
		console.println ("MARKS PROCESSING");
		console.println ("----------------");
		console.println ();
		
		group = readGroupNumber (NUMBER_OF_GROUPS, console);
		students = TestData.getStudents(group);
		subjects = TestData.getSubjects(group);
		marks = TestData.getMarks(group);
		
		/* COMPLETE FROM THIS POINT*/
	
		
		console.print ("\n\n\nPress any key to exit");
		console.readKey ();
		System.exit(0);	
		
	} // main ends here
	
	// PROCEDURAL SECTION STARTS HERE...
	static int readGroupNumber(int ng, JConsole console) {
		/* COMPLETE */
	} 
	
	static double studentAverage (double[][] m, int student) {
		// calculate the average of the student
		/* COMPLETE */
	}
	
	static void showStudentAverage (String [] students, double[][] marks, JConsole console) {
		// for each student show student average
		/* COMPLETE */	
	}
	
	static int bestAverageStudent (double[][] m) {
		// find the (index of the) student with the best average 
		/* COMPLETE */
	}
	
	static int worstAverageStudent (double[][] m) {
		// find the (index of the ) student with the worst average 
		/* COMPLETE */
	}
	
	static void showBestAndWorstStudents (String[] students, double[][] marks, JConsole console) {
		// show best and worst students (with their averages)
		/* COMPLETE */
	}
	
	static int subjectCountEqualOrGreater(double [][] m, int subject, int value) {
		// count how many students have a mark higher than value in subject
		/* COMPLETE */
	}
	
	static void showPassCount (String [] subjects, double [][] marks, JConsole console) {
		// show how many students pass each subject
		/* COMPLETE */
	}

}