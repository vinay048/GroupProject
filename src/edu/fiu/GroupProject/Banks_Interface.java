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
public class Banks_Interface implements SelfCheckCapable {

	int Traffic;
	int network;
	
	void unpacking()
	{
		
	}
	
	Network_Interface_Layer packing()
	{
		return null;
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Send data";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
