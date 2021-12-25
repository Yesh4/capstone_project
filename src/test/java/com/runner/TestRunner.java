//package com.runner;

//import org.testng.annotations.Test;

//public class TestRunner {
//  @Test
//  public void f() {
//  }
//}

package com.runner;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Feature",
glue = {"stepDef"})

public class TestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
