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



public class Customer implements SelfCheckCapable {
int Head_count;
int GameToWatch;

Card mycard;

public Customer()
{
  mycard = new Card();
}


public void Select_people()
{
  System.out.println("Number of people selected");
}

public void Select_game()
{
	System.out.println("Game Selected Miami Heats vs Boston Celtics");
	
}


void Sanitize_hand()
{
	System.out.println("PLEASE SANITIZE HANDS");
	return;
}




	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Customer Class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,mycard);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer mycustomer = new Customer();
	    Card mycard = new Card();
	    Machine mymachine = new Machine();
	    Transaction_Database mytb = new Transaction_Database();
	    Application_layer myal = new Application_layer();
		Transport_layer mytl = new Transport_layer();
		Network_layer mynl = new Network_layer();
		Network_Interface_layer mynil = new Network_Interface_layer();
		Bank_interface mybi= new Bank_interface();
		Transaction_validation mytv = new Transaction_validation();
	    
		mycustomer.runSelfCheck();
		mycard.runSelfCheck();
		mymachine.runSelfCheck();
		
		mytb.runSelfCheck();
		
		myal.runSelfCheck();
	
		mytl.runSelfCheck();
	
		mynl.runSelfCheck();
		
		mynil.runSelfCheck();
		
		mybi.runSelfCheck();
	
		mytv.runSelfCheck();
		
		
		      
		mycustomer.Select_people();
        mycustomer.Select_game();
        mycard.Select_card();
        mymachine.Insert_card();
        
	}

}
