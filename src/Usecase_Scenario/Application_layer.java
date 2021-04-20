/**
 * 
 */
package Usecase_Scenario;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author 18135
 *
 */
public class Application_layer implements SelfCheckCapable {

	Transport_layer mytl;
	 public Application_layer()
	 {
		 mytl = new Transport_layer();
	 }
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Application Layer class ";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mytl);
	}

	public void Session_management() {
		// TODO Auto-generated method stub
		//Performs the session managment here and checks fro threats
		
		System.out.println("Session management initiated and checking for threats");
		Application_layer_threats myalt = new Application_layer_threats();
		myalt.Threat_Detection();
		mytl.Message_Segmentation();
		
		
	}


	public void Decode() {
		// TODO Auto-generated method stub
		System.out.println("Message decoded in readable format and ready to be logged in local database");
		Transaction_Database mytb = new Transaction_Database();
		mytb.Update_log();
		
		
	}

	
	

}
