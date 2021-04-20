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
public class Bank_interface implements SelfCheckCapable {

	Transaction_validation mytv;

	public Bank_interface()
	{
		mytv = new Transaction_validation();
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Bank Interface Class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mytv);
	}

	public void Unpacking() {
		// TODO Auto-generated method stub
		// banks communication process From network interface to appplication layer
		
		System.out.println("The Process from banks Network layer to Apllication takes Place in this class");
		mytv.Validation();
	}

	public  void Packing() {
		// TODO Auto-generated method stub
		// banks communication process from Application layer to network interface layer
		
		System.out.println("Starting the Process from banks Application Layer to Netowrk Interface layer ");
		System.out.println("Sending Bits to Netowrk interface layer ");
		Network_Interface_layer mynil = new Network_Interface_layer();
		mynil.Decode();
		
		
		
	}

}
