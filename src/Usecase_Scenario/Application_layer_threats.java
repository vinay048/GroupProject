/**
 * 
 */
package Usecase_Scenario;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 18135
 *
 */
public class Application_layer_threats implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	public void Threat_Detection() {
		// TODO Auto-generated method stub
		// dectects which type of threats
		
		System.out.println("Detecting the invasions");
		sql_injection.Brute_force();
	}

}

class sql_injection extends Application_layer_threats
{
  public static void Brute_force()
  {
	  //type of apllication layer threat
	  
	  System.out.println("Invasions match sql-injection Brute force");
	  System.out.println("Initiating Analyzing threats.");
	  Application_layer_solutions myals = new Application_layer_solutions();
		myals.Analyze_threats();
	  
  }
}
