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
public class Network_layer implements SelfCheckCapable {

	Network_Interface_layer mynil;
	
	public Network_layer()
	{
		mynil = new Network_Interface_layer();
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Network layer class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mynil);
	}


	public void Routing() {
		// TODO Auto-generated method stub
		// performs routing towrd banks side
		
		System.out.println("Looking up the routing table to transter it to next hop");
		mynil.Mac_address();
	}


	public void routing() {
		// TODO Auto-generated method stub
		// performs routing towards machine side
		
		
		System.out.println("Ready to be sent to next hop and get Acknowledgement");
		Transport_layer mytl = new Transport_layer();
		mytl.Ack();
		
	}

}
