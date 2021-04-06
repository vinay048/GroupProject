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
public class Transaction_Database implements SelfCheckCapable {

	int amount;
	int typement_type;
	
	void Communication()
	{
		
	}
	
     void Validiation()
     {
    	 
     }
     
     void Log_transaction()
     {
    	 
     }
    
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Tansaction logged";
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer myCustomer = new Customer();
	     myCustomer.runSelfCheck(); 
	     
	     Customer myCustomer1 = new Customer();
	     myCustomer1.Sanitize_hand();    
	     
	     Card myCard = new Card();
	     myCard.runSelfCheck();  
	    
	     Mobile_Application_Payment myMobile_Application_Payment = new Mobile_Application_Payment();
	     myMobile_Application_Payment.runSelfCheck();
	     
	    
	     
	     Machine myMachine1 = new Machine();
	     myMachine1.Sanitize_hand();
	     
	     Transaction_Validiation myTransaction_Validiation = new Transaction_Validiation();
	     myTransaction_Validiation.runSelfCheck();
	     
	     Banks_Interface myBanks_Interface = new Banks_Interface();
	     myBanks_Interface.runSelfCheck();
	     
	     Network_Interface_Layer myNetwork_Interface_Layer = new Network_Interface_Layer();
	     myNetwork_Interface_Layer.runSelfCheck();
	     
	     Network_layer myNetwork_layer = new Network_layer();
	     myNetwork_layer.runSelfCheck();
	     
	     Application_layer myApplication_layer = new Application_layer();
	     myApplication_layer.runSelfCheck();
	     
	     Transaction_Database myTransaction_Database =  new Transaction_Database();
	     myTransaction_Database.runSelfCheck();
	     
	     Machine myMachine = new Machine();
	     myMachine.runSelfCheck(); 
	     
	    
	}

}
