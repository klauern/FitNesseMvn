/**
 * An example test runner to run these sets of tests as JUnit tests.  This
 * makes running tests out of Maven's plugin architecture directly not necessary.
 */
package klauer.fitnessemvn;

import fitnesse.trinidad.SlimTestEngine;
import fitnesse.trinidad.FitTestEngine;
import org.junit.runner.RunWith;

import fitnesse.trinidad.FitnesseSuite;
import fitnesse.trinidad.FitnesseSuite.*;

@RunWith(FitnesseSuite.class)
@Name("FitNesse.UserGuide.TwoMinuteExample")
@FitnesseDir("src/main/fitnesse")
@Engine(FitTestEngine.class) //this is optional since it's the default
//@OutputDir("/tmp/fitnesse") //Specify an absolute or relative path
@OutputDir(systemProperty = "java.io.tmpdir", pathExtension = "fitnesse")
public class ExampleTestRunnerTests {
  
}
