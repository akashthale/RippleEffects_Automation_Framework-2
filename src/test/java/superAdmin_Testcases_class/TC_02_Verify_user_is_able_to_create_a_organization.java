package superAdmin_Testcases_class;

import org.testng.annotations.Test;

import RE_Login_Action_Class.Create_Login_Action_Class;
import RE_Support_Admin_Actions.Support_Admin_Action_Class_OrganizationCreation;
import base.BaseTest;

public class TC_02_Verify_user_is_able_to_create_a_organization extends BaseTest {

	public Create_Login_Action_Class loginAction;
	public Support_Admin_Action_Class_OrganizationCreation superadmin_org_action_class;

	
	@Test
	public void createORganization() {
		loginAction = new Create_Login_Action_Class(driver);
		loginAction.login(config.getProperty("username"), config.getProperty("password"));
		superadmin_org_action_class = new Support_Admin_Action_Class_OrganizationCreation(driver);
		superadmin_org_action_class.createOrganization("Testsborg1", "Testsborg1", "Ohio", "testfirst", "Testlast",
				"TestingDemo@123.com", "Sunil Game");

	}

}
