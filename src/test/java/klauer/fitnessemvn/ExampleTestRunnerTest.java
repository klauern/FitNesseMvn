/**
 * An example test runner to run these sets of tests as JUnit tests.  This
 * makes running tests out of Maven's plugin architecture directly not necessary.
 *
 * To run this test, this example utilizes he FitnessSuite class to run a SUITE
 * of FitNesse tests.  I have not yet determined if this method will run a single
 * test, but the alternative would be to use JUnitHelper to accomplish single
 * test mode.
 */
package klauer.fitnessemvn;

import org.junit.runner.RunWith;

import fitnesse.trinidad.FitnesseSuite;
import fitnesse.trinidad.FitnesseSuite.Engine;
import fitnesse.trinidad.FitnesseSuite.FitnesseDir;
import fitnesse.trinidad.FitnesseSuite.Name;
import fitnesse.trinidad.FitnesseSuite.OutputDir;
import fitnesse.trinidad.SlimTestEngine;


@RunWith(FitnesseSuite.class)
@Name("FrontPage.TestSuite") // We are running a SUITE of tests.
@FitnesseDir("src/main/fitnesse")
@Engine(SlimTestEngine.class) // Fit is default, so specify engine as Slim
@OutputDir("target/fitnesse") //Specify an absolute or relative path
public class ExampleTestRunnerTest {}
