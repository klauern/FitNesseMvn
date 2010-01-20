package klauer.fitnessemvn;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;

/**
 * This test will run a bulit-in test from the FitNesse Suite itself:
 * http://localhost:8080/FitNesse.SuiteAcceptanceTests.SuiteSlimTests.ErikPragtBug
 */
@RunWith(FitNesseSuite.class)
@Name("FitNesse.SuiteAcceptanceTests.SuiteSlimTests.ErikPragtBug")
@FitnesseDir("src/main/fitnesse")
@OutputDir("target/fitnesse")
public class EricPragtBug {

  @Test
  public void dummy(){

  }
}
