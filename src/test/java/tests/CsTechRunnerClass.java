package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"E:\\leelajava\\cstech\\src\\test\\resources\\repository\\cstech_feature.feature"},
							monochrome=true,
							plugin={"pretty","html:target\\result" ,"rerun:target\\failed.txt"}
				)

public class CsTechRunnerClass 
{

}
