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
public class Transport_Layer implements SelfCheckCapable {

	
	int TCP;
	int UDP;
	String segment;
	
	void Message_segmentation()
	{
		
	}
	
	Application_layer Aknowledgement()
	{
		return null;
	}
	
	void Reliabiltty()
	{
		
	}
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "TCP Ack";
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
