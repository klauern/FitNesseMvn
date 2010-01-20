package klauer.fitnessemvn;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;

@RunWith(FitNesseSuite.class)
@Name("FrontPage.ExceptionThrowingTest") // We are running a SUITE of tests.
@FitnesseDir("src/main/fitnesse")
@OutputDir("target/fitnesse") //Specify an absolute or relative path
public class ThrowSomeExceptionWikiTest {
  
  @Test
  public void dummy() {}
}
