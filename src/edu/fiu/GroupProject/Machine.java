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
public class Machine implements SelfCheckCapable {
int Length;
int QR_Code;

void Insert_card()
{
	
}

void Remove_card()
{
	
}

void Email_ticket()
{
	
}

Transaction_Database Display_amount()
{
	return null;
}

void Sanitize_hand()
{
	System.out.println("PLEASE SANITIZE HANDS");
	return;
}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Transaction Successfull";
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
