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

public class Customer implements SelfCheckCapable {
int Head_count;
int GameToWatch;

void Select_people()
{
	
}

void Select_game()
{
	
}

Card Select_card()
{
    return null;
}

void Sanitize_hand()
{
	System.out.println("PLEASE SANITIZE HANDS");
	return;
}

Mobile_Application_Payment Open_application()
{
    return null;	
}





	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "card selected is valid";
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
