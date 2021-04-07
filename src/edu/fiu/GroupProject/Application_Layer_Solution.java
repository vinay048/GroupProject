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
public class Application_Layer_Solution implements SelfCheckCapable {

	int argon2id;
	
	void encryption()
	{
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "solution implemented";
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

	class Santitizing_inputs extends Application_Layer_Solution
	{
		String input;
		
		Application_Layer_Solution input_check()
		{
			return null;
		}
		
	}
	
	
}
