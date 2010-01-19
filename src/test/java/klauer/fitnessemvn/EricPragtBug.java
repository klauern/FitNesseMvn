package klauer.fitnessemvn;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;


/**
 * This is a simple example of running a FitNesse Suite or Test from JUnit.  This
 * also allows you to test FitNesse pages from your IDE of choice (Eclipse or
 * NetBeans).
 *
 * To test a different suite of tests, replace the name of the Suite page under
 * @Name with your own.  Leave the rest as defaults for this.
 * 
 * @author A03182
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