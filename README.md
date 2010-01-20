FitNesse Maven Examples
=======================

I am still having some difficulty finding out how to integrate [FitNesse][1] with
[Maven][2], so I created this project to document my successes.  In particular,
I found a few Maven plugins that would handle the integration of FitNesse, but I 
stumbled over older versions on newer ones, which plugin does what, etc.  At the 
end of the day, I've found the [Trinidad][3] plugin is the best overall choice.  
Having picked the /winner/, I tried to integrate it with a bare-bones FitNesse 
installation, but had some difficult with that as well.  In this code is a very 
simplistic model of FitNesse integration with Maven.

Requirements:  Maven and Java are all you need to run these examples.

What Examples you can use
-------------------------
There are a number of examples that I'm trying to get working, so my luck has been
mixed.  Here's some things you can do right now:
    mvn clean install exec:exec
will run a local FitNesse installation on port 18080, which you can access at
http://localhost:18080/

The tests I've written are both on wiki pages and as JUnit tests to integrate the
results with.  If there are results to show, you would find them under 
    target/surefire-reports/
But this is where I'm missing something.

Some other examples to run:

    > mvn test -Dtest=ThrowSomeExceptionWikiTest
	> mvn test -Dtest=ExampleTestRunnerTest
	> mvn test -Dtest=JUnitHelperTrinidadTest

In each of these examples, output isn't necessarily correlated to expectations.

### JUnitHelperTrinidadTest ###
In this test, I try two things:

 1. Run the [FrontPage.ExceptionThrowingWikiTest][4] and assert that it passed (it 
 	shouldn't.
 2. Run the [FrontPage.SecondTestSuite][5] suite and assert that it passed (it
 should).

What I would expect is that the JUnit result shows that the first test threw an
exception, and the second one passed.  However, no output in target/surefire-reports/
for the JUnitHelperTrinidadTest shows up at all.  Instead, a 0 byte file is there,
so it probably exited prematurely before generating test results.


Where I've been pulling these examples from:
--------------------------------------------
 1. http://fitnesse.info/trinidad - Trinidad Plugin page


[1]: http://fitnesse.org/
[2]: http://maven.apache.org/
[3]: http://fitnesse.info/trinidad
[4]: http://localhost:18080/FrontPage.ExceptionThrowingWikiTest
[5]: http://localhost:18080/FrontPage.SecondTestSuite
[6]: http://localhost:18080/FrontPage.TestSuite
