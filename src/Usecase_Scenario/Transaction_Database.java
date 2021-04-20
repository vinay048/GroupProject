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
public class Transaction_Database implements SelfCheckCapable
{

	int amount;
	int typement_type;
	
	Application_layer myal;
	
	public Transaction_Database()
	{
		myal = new Application_layer();
	}
	
	public void Communication()
	{
	System.out.println("Initiated the communication process");
	myal.Session_management();
	}
	
     void Validiation()
     {
    	 
     }
     
   public  void Log_transaction()
     {
    	 System.out.println("Transaction being logged on Local database");
    	 System.out.println("Starting the communication process");
    	 Transaction_Database mytb = new Transaction_Database();
    	mytb.Communication();
     }
    
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return " Transaction database class";
	}

	
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(myal);
	}

	public void Update_log() {
		// TODO Auto-generated method stub
		System.out.println("Logg updated");
		Machine mymachine = new Machine();
		mymachine.Display_status();
		
	}
}