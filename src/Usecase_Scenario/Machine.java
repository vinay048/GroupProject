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
public class Machine implements SelfCheckCapable {
int Length;
int QR_Code;


Transaction_Database mytb;

public Machine()
{
	mytb = new Transaction_Database();
	}

void Insert_card()
{
	System.out.println("Card Inserted");
	System.out.println("PIN entered");
	System.out.println("Waiting for Validtion");
	mytb.Log_transaction();
}

void Remove_card()
{
	
}

void Email_ticket()
{
	
}

Transaction_Database Display_amount()
{
	return null;
}

void Sanitize_hand()
{
	System.out.println("PLEASE SANITIZE HANDS");
	return;
}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Machine Class";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.0001);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(mytb);
	}

	public void Display_status() {
		// TODO Auto-generated method stub
		System.out.println("Tickets book and email sent.//// transaction completed //// Sanitize your hands");
	}

}
