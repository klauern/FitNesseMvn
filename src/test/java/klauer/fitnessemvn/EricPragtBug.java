package klauer.fitnessemvn;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;


@RunWith(FitNesseSuite.class)
@Name("FitNesse.SuiteAcceptanceTests.SuiteSlimTests.ErikPragtBug")
@FitnesseDir("src/main/fitnesse")
@OutputDir("target/fitnesse")
public class EricPragtBug {

  @Test
  public void dummy(){

  }
}