/**
 * 
 */
package testRunner;

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;

/**
 * @author rohit
 *
 */

@RunWith(Cucumber.class)				
@CucumberOptions(features={"Features"},glue={"testSteps"})
public class Runner {

}
