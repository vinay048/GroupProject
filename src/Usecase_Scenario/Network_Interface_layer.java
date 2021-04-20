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
public class Network_Interface_layer implements SelfCheckCapable {

	
	Bank_interface mybi;
	
	public Network_Interface_layer()
	{
		mybi = new Bank_interface();
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Network Layer class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mybi);
	}

	public void Mac_address() {
		// TODO Auto-generated method stub
		System.out.println("Mac address assigned// Bit streams ready to be sent to banks interface");
		mybi.Unpacking();
	}

	public void Decode() {
		// TODO Auto-generated method stub
		System.out.println("Message Decoded From bits and reasy to be sent for routing");
		Network_layer mynl = new Network_layer();
		mynl.routing();
	}

}
