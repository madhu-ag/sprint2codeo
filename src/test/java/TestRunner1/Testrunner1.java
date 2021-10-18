package TestRunner1;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Feature1"
		,glue= {"StepDefination1","hooks1"}
		,dryRun=true
		,monochrome=true
		//,tags={"@Sanity"}   //single tag
		//tags={"@Sanity","@Regression"},   //AND condition
		//tags={"@Smoke, @Regression"},   //AND condition
		//tags= {"~@Smoke"},   //skip tag
		
		
		,plugin= { "pretty" , "junit:target/report.xml" , "html:target/cucumber-pretty" , "json:target/jsonreport.json"}
		)


public class Testrunner1 {

}
