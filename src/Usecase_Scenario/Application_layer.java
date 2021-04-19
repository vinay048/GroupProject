/**
 * 
 */
package Usecase_Scenario;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author 18135
 *
 */
public class Application_layer implements SelfCheckCapable {

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

	public void Session_management() {
		// TODO Auto-generated method stub
		System.out.println("Session management initiated and checking for threats");
		Application_layer_threats myalt = new Application_layer_threats();
		myalt.Threat_Detection();
		
		
		
	}

	
	

}
