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
public class Application_Layer_Threats implements SelfCheckCapable {

	
	
	int Avalibility;
	
	Application_layer Cross_site_scripting()
	{
		return null;
	}
	
	Application_layer HTTP_Flood()
	{
		return null;
	}
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Threats attacking Application layer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.00001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

	class Sql_injection extends Application_Layer_Threats
	{
		int queries;
		
		Application_Layer_Threats brute_force()
		{
			return null;
		}
	}
	
	
}
