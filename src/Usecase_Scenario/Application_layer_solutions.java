/**
 * 
 */
package Usecase_Scenario;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 18135
 *
 */
public class Application_layer_solutions implements SelfCheckCapable {

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

	public void Analyze_threats() {
		// TODO Auto-generated method stub
		System.out.println("Analyzing Sql injection Brute force and finding solutions available");
		Sanitizinginputs.input_check();
	}

}

class Sanitizinginputs extends Application_layer_solutions
{
	public static void input_check()
	{
		System.out.println("Checking All inputs and Applied Defense Against brute Force inputs");
		System.out.println("Resume communication");
		
	}
}

