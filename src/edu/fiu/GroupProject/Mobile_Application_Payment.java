/**
 * 
 */
package edu.fiu.GroupProject;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author 18135
 *
 */
public class Mobile_Application_Payment implements SelfCheckCapable {

	String Payment_gateway;
	String Login_details;
	
	void Personal_info()
	{
		
	}
	
	void Game_info()
	{
		
	}
	
	Card Select_card()
	{
		return null;
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "loginpage";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
