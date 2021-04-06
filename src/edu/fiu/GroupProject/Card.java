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
public class Card implements SelfCheckCapable {

	String type;
	int RFID;
	
	Machine Insert()
	{
		return null;
	}
	
	Machine Type()
	{
		return null;
	}
	
	Transaction_Database Enter_number()
	{
		return null;
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CARD";
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
