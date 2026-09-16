package RE_Support_Admin_Actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import RE_Support_Admin_Locator.RE_Support_Admin_Locator_Class;
import Wrappers.TestLogger;
import Wrappers.WebWaits;

public class Support_Admin_Action_Class_OrganizationCreation {

	private WebDriver driver;
	private RE_Support_Admin_Locator_Class supportAdminLocators;

	public Support_Admin_Action_Class_OrganizationCreation(WebDriver driver) {
		this.driver = driver;
		supportAdminLocators = new RE_Support_Admin_Locator_Class(driver);
		TestLogger.info("Support Admin Action Class initialized");
	}

	public void clickonOrganizationnuton() {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.getOrganizationButton(), Duration.ofSeconds(10));
		supportAdminLocators.getOrganizationButton().click();
		TestLogger.pass("District button clicked successfully");
	}

	public void clickOnAddButton() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.getOrganizationAddButton(), Duration.ofSeconds(10));
		supportAdminLocators.getOrganizationAddButton().click();
		TestLogger.pass("Organization add  button clicked successfully");

	}

	public void enterOrganizationID(String orgname) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.EnterOrganizationId(), Duration.ofSeconds(10));
		supportAdminLocators.EnterOrganizationId().sendKeys(orgname);
		TestLogger.pass("Organization name entered successfully");
	}

	public void enterOrganizationTitle(String orgTitle) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.EnterOrganizationTitle(), Duration.ofSeconds(10));
		supportAdminLocators.EnterOrganizationTitle().sendKeys(orgTitle);
		TestLogger.pass("Organization title entered successfully");

	}

	public void selectOrganizationState(String stateName) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.organizationStateDropdown(), Duration.ofSeconds(10));
		Select select = new Select(supportAdminLocators.organizationStateDropdown());
		select.selectByVisibleText(stateName);
		TestLogger.pass("Organization state selected successfully");

	}

	public void enterAccountOwnerFirstName(String FirstName) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.EnterAccountOwnerFirstName(), Duration.ofSeconds(10));
		supportAdminLocators.EnterAccountOwnerFirstName().sendKeys(FirstName);
		TestLogger.pass("Organization first name entered successfully");
	}

	public void enterAccountOwnerLastName(String LastName) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.EnterAccountOwnerLastName(), Duration.ofSeconds(10));
		supportAdminLocators.EnterAccountOwnerLastName().sendKeys(LastName);
		TestLogger.pass("Organization Last name entered successfully");
	}

	public void enterAccountOwnerEmailId(String EmailId) {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.EnterAccountOwnerEmailId(), Duration.ofSeconds(10));
		supportAdminLocators.EnterAccountOwnerEmailId().sendKeys(EmailId);
		TestLogger.pass("Organization Email entered successfully");
	}

	public void clickOnDsignatedRippleEffectsCheckBox() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkDesignatedRippleEffectsAdmin(),
				Duration.ofSeconds(10));
		supportAdminLocators.checkDesignatedRippleEffectsAdmin().click();
		TestLogger.pass("Designated Ripple Effects check box clicked successfully");
	}

	public void selectSupportAdmin(String supportAdmin) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				supportAdminLocators.getSupportAdminDropdown());
		WebWaits.visibilityOfElement(driver, supportAdminLocators.getSupportAdminDropdown(), Duration.ofSeconds(10));
		Select select = new Select(supportAdminLocators.getSupportAdminDropdown());
		select.selectByVisibleText(supportAdmin);
		TestLogger.pass("support Admin selected successfully");
	}

	public void clickOnPreviewModeCheckBox() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				supportAdminLocators.checkpreviewModeCheckBox());
		WebWaits.visibilityOfElement(driver, supportAdminLocators.checkpreviewModeCheckBox(), Duration.ofSeconds(10));
		supportAdminLocators.checkpreviewModeCheckBox().click();
		TestLogger.pass("Preview Mode  button clicked successfully");
	}

	public void clickonLegacyACCessCgeckBox() {
		WebWaits.visibilityOfElement(driver, supportAdminLocators.legacyAccessCheckbox(), Duration.ofSeconds(10));
		supportAdminLocators.legacyAccessCheckbox().click();
		TestLogger.pass("Legacy Access check box  button clicked successfully");
	}

	public void clickOnRippleEffectsForKidsCheckBox() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				supportAdminLocators.checkRippleEffectsForKidsCheckBox());
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkRippleEffectsForKidsCheckBox(),
				Duration.ofSeconds(10));
		supportAdminLocators.checkRippleEffectsForKidsCheckBox().click();
		TestLogger.pass("RE for Kids checkbox clicked successfully");
	}

	public void clickOnRippleEffectsForTeensCheckBox() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkRippleEffectsForTeensCheckBox(),
				Duration.ofSeconds(10));
		supportAdminLocators.checkRippleEffectsForTeensCheckBox().click();
		TestLogger.pass("RE for Teens checkbox clicked successfully");
	}

	public void clickOnSFSkidsCheckBox() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkSFSKidsCheckBox(), Duration.ofSeconds(10));
		supportAdminLocators.checkSFSKidsCheckBox().click();
		TestLogger.pass("SFS kids checkbox clicked successfully");
	}

	public void clickOnSFSTeenCheckBox() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkSFSteensCheckBox(), Duration.ofSeconds(10));
		supportAdminLocators.checkSFSteensCheckBox().click();
		TestLogger.pass("SFS Teens checkbox clicked successfully");
	}

	public void clickOnBouncyCheckBox() {
		WebWaits.elementToBeClickable(driver, supportAdminLocators.checkBouncyProgramCheckBox(),
				Duration.ofSeconds(10));
		supportAdminLocators.checkBouncyProgramCheckBox().click();
		TestLogger.pass("Bouncy checkbox clicked successfully");
	}

	public void clickOnSubmitButton() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
				supportAdminLocators.submitButton());
		WebWaits.elementToBeClickable(driver, supportAdminLocators.submitButton(), Duration.ofSeconds(10));
		supportAdminLocators.submitButton().click();
		TestLogger.pass("Submit button clicked successfully");

	}

	public void createOrganization(String orgname, String orgTitle, String stateName, String FirstName, String LastName,
			String EmailId, String supportAdmin) {
		clickonOrganizationnuton();
		clickOnAddButton();
		enterOrganizationID(orgname);
		enterOrganizationTitle(orgTitle);
		selectOrganizationState(stateName);
		enterAccountOwnerFirstName(FirstName);
		enterAccountOwnerLastName(LastName);
		enterAccountOwnerEmailId(EmailId);
		clickOnDsignatedRippleEffectsCheckBox();
		selectSupportAdmin(supportAdmin);
		clickOnPreviewModeCheckBox();
		clickonLegacyACCessCgeckBox();
		clickOnRippleEffectsForKidsCheckBox();
		clickOnRippleEffectsForTeensCheckBox();
		clickOnSFSkidsCheckBox();
		clickOnSFSTeenCheckBox();
		clickOnSubmitButton();

	}

}
