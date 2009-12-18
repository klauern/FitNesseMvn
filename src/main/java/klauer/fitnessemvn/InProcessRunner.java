package klauer.fitnessemvn;

import fit.Counts;
import fitnesse.trinidad.*;

public class InProcessRunner {
	public static void main(String[] args) throws Exception {
		TestRunner tdd=new TestRunner(new FitNesseRepository("/path/to/your/fitnesse/folder"),
				new FitTestEngine(),"/path/to/output/");

		Counts cs=tdd.runSuite("MySuite.MySubSuite");
		System.err.println("Total right="+cs.right +"; wrong="+cs.wrong+ " exceptions="+cs.exceptions);
	}
}