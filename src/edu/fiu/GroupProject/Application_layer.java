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
public class Application_layer implements SelfCheckCapable {

	int API;
	String UI;
	String HTTPS;
	String FTP;
	
	void Resource_sharing()
	{
		
	}
	
	void Data_formatting()
	{
		
	}
    
	void Encryption()
	{
		
	}
	
	void Compression()
	{
		
	}
	
	Transaction_Database Authenticate()
	{
		return null;
	}
	
	void Session_management()
	{
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "message sent to transaction database";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.999);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
