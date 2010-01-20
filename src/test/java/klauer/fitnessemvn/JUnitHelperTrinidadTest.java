/**
 * Simple Test runner using the JUnitHelper.  Runs a single test.
 * <p>
 * What you get from this method is the tests run will match the method names.
 * In this case, runSingleTest() will be the one flagged with exceptions or
 * pass/fail metrics, but will <b>not</b> specify what Fit Pages were tested against
 * in that method.
 * <p>
 * See ExampleTestRunnerTest for a more integrated solution.
 */



package klauer.fitnessemvn;

import fitnesse.junit.JUnitHelper;

import java.io.File;
import org.junit.Before;
import org.junit.Test;

public class JUnitHelperTrinidadTest {

  JUnitHelper helper;

  @Before
  public void initHelper() throws Exception {
    helper = new JUnitHelper("src/main/fitnesse", "target");
  }

  /**
   * Produces an exception, since one of the two asserts failed.  
   * 
   * The concern with using this method is that runSomeTests() will be
   * flagged as having failed, rather than the FitNesse page itself. 
   *
   * Also, should the failure occur in a suite, you have almost no way 
   * to know which test in that suite failed, or even which assert below
   * was called to 
   * @throws Exception
   */
  @Test
  public void runSomeTests() throws Exception {
    helper.assertTestPasses("FitNesse.UserGuide.TwoMinuteExample");
    helper.assertSuitePasses("FrontPage.SecondTestSuite");
  }

}
