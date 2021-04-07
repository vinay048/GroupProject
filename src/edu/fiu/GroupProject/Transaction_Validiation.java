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
public class Transaction_Validiation implements SelfCheckCapable {

	String Database;
	int Abalance;
	
	void Account_deatils()
	{
		
	}
	
	Banks_Interface Transacation()
	{
		return null;
	}
	
	void Error_checksum()
	{
		
	}
	
	void Update()
	{
		
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "bank Transaction validiation";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0000000000000000001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}


