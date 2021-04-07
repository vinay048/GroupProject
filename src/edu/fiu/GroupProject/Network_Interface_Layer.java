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
public class Network_Interface_Layer implements SelfCheckCapable {

	
	String Mac_address;
	int Frame;
	int Bits;
	
	void Error_control()
	{
		
	}
	
	void Transport_bitstream()
	{
		
	}
	
	Network_layer Decode()
	{
		return null;
	}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "decode";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		
		return SelfCheckUtils.randomCheck(0.000001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
