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
public class Transport_layer implements SelfCheckCapable {

	
	
	Network_layer mynl;
	
	public Transport_layer()
	{
		mynl = new Network_layer();
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Tansport Layer class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mynl);
	}

	public void Message_Segmentation() {
		// TODO Auto-generated method stub
		//Peforms the message segmentation
		
		System.out.println("Message Segmented and ready to look out the routing table");
		mynl.Routing();
	}


	public void Ack() {
		// TODO Auto-generated method stub
		// Confirms the tcp ack 
		
		System.out.println("TCP Ack received and ready to be decoded in readable format");
		Application_layer myal = new Application_layer();
		myal.Decode();
	}

}
