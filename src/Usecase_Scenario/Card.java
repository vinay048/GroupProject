/**
 * 
 */
package Usecase_Scenario;


import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author 18135
 *
 */
public class Card implements SelfCheckCapable {

	String type;
	int RFID;
	
	Machine mymachine;
	
	public Card() 
	{
		mymachine = new Machine();
	}
	
	Machine Type()
	{
		return null;
	}
	
	Machine Enter_number()
	{
		return null;
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CARD Class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}
    
	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mymachine);
	}

	public void Select_card() {
		// TODO Auto-generated method stub
		
		System.out.println("Card is selected");
		
		
	}

}
