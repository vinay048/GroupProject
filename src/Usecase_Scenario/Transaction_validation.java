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
public class Transaction_validation implements SelfCheckCapable {

	@Override
	
	
	
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Transaction Validation Class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return true ;
	}

	public void Validation() {
		// TODO Auto-generated method stub
		System.out.println("Transaction approved and Proceeding to update the balance");
		Transaction_validation mytv = new Transaction_validation();
		mytv.Update();
		
		System.out.println("Staring the reverse communication process");
		Bank_interface mybi = new Bank_interface();
		mybi.Packing();
		
		
		
	}

	private void Update() {
		// TODO Auto-generated method stub
		
		System.out.println("Funds updated");
		
	}

}
