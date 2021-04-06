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
public class Network_layer implements SelfCheckCapable {

	String IP_address;
	String Packets;
	String Datagrams;
	
	Transport_Layer routing()
	{
		return null;
	}
	
	void addressing()
	{
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "routing";
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
