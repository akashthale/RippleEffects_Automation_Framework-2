package RE_Support_Admin_Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RE_Support_Admin_Locator_Class {

	public WebDriver driver;

	public RE_Support_Admin_Locator_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='District']")
	private WebElement Districtbtn;

	public WebElement DistrictButton() {
		return Districtbtn;
	}

	@FindBy(xpath = "//a[@href='https://staging.rippleeffectsweb.com/superadmin/District/add']//span[@class='sidemenu-item'][normalize-space()='Add']")
	private WebElement Addbutton;

	public WebElement addlListtButton() {
		return Addbutton;
	}

	@FindBy(xpath = "//input[@id='district_name']")
	private WebElement enterDistrctName;

	public WebElement enterDistrictName() {
		return enterDistrctName;
	}

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement enterFirstName;

	public WebElement enterFirstName() {
		return enterFirstName;
	}

	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement enterLadtName;

	public WebElement enterlastName() {
		return enterLadtName;
	}

	@FindBy(xpath = "//input[@id='emailid1']")
	private WebElement enterEmailID;

	public WebElement EnterEmailID() {
		return enterEmailID;
	}

	@FindBy(xpath = "//div[@id='uniform-make_primary_admin']//span")
	private WebElement designatedCheckBox;

	public WebElement DesignatedCheckBox() {
		return designatedCheckBox;
	}

	@FindBy(xpath = "//select[@id='support_admin_name_1']")
	private WebElement supportAdminDropdown;

	public WebElement getSupportAdminDropdown() {
		return supportAdminDropdown;
	}

	@FindBy(xpath = "//input[@name='data_viewer_access']")
	private WebElement DDVAccess;

	public WebElement ddvCheckbox() {
		return DDVAccess;
	}

	@FindBy(xpath = "//input[@name='data_viewer_permanent_access']")
	private WebElement legacyAccess;

	public WebElement legacyAccessCheckbox() {
		return legacyAccess;
	}

	@FindBy(css = "div[class='button-wrapper dist-add'] button[type='submit']")
	private WebElement submitBtn;

	public WebElement submitButton() {
		return submitBtn;
	}

	@FindBy(xpath = "//button[@name='no']")
	private WebElement emailPopUp;

	public WebElement getEmailpopUp() {
		return emailPopUp;
	}

	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement districtCreatedSuccessMessage;

	public WebElement districtCreatedSuccessMessage() {
		return districtCreatedSuccessMessage;
	}

	// ---------------------------organization
	// locators-------------------------------------//

	@FindBy(xpath = "//span[normalize-space()='Organization']")
	private WebElement organizationButton;

	public WebElement getOrganizationButton() {
		return organizationButton;
	}

	@FindBy(xpath = "(//span[@class='sidemenu-item'][normalize-space()='Add'])[1]")
	private WebElement organizationAddbutton;

	public WebElement getOrganizationAddButton() {
		return organizationAddbutton;
	}

	@FindBy(xpath = "//input[@id='schoolid']")
	private WebElement organizationID;

	public WebElement EnterOrganizationId() {
		return organizationID;
	}

	@FindBy(xpath = "//input[@id='title']")
	private WebElement organizationTitle;

	public WebElement EnterOrganizationTitle() {
		return organizationTitle;
	}

	@FindBy(xpath = "//select[@id='geo_state']")
	private WebElement selectOrgState;

	public WebElement organizationStateDropdown() {
		return selectOrgState;
	}

	@FindBy(xpath = "//input[@id='primary_contact_first_name']")
	private WebElement accountOwnerFirstName;

	public WebElement EnterAccountOwnerFirstName() {
		return accountOwnerFirstName;
	}

	@FindBy(xpath = "//input[@id='primary_contact_last_name']")
	private WebElement accountOwnerLastName;

	public WebElement EnterAccountOwnerLastName() {
		return accountOwnerLastName;
	}

	@FindBy(xpath = "//input[@id='emailid1']")
	private WebElement accountOwnerEmailID;

	public WebElement EnterAccountOwnerEmailId() {
		return accountOwnerEmailID;
	}

	@FindBy(xpath = "//div[@id='uniform-make_primary_admin']//span")
	private WebElement designatedRippleEffetsCheckBox;

	public WebElement checkDesignatedRippleEffectsAdmin() {
		return designatedRippleEffetsCheckBox;
	}

	@FindBy(xpath = "//input[@name='preview_mode']")
	private WebElement previewModeCheckBox;

	public WebElement checkpreviewModeCheckBox() {
		return previewModeCheckBox;
	}

	@FindBy(xpath = "//input[@id='turn_on']")
	private WebElement LegacyAccessCheckBox;

	public WebElement checkLegacyAccessCheckBox() {
		return LegacyAccessCheckBox;
	}

	@FindBy(xpath = "//input[@id='kids_mode']")
	private WebElement RippleEffectsForKidsCheckBox;

	public WebElement checkRippleEffectsForKidsCheckBox() {
		return RippleEffectsForKidsCheckBox;
	}

	@FindBy(xpath = "//input[@id='teens_mode']")
	private WebElement RippleEffectsForTeensCheckBox;

	public WebElement checkRippleEffectsForTeensCheckBox() {
		return RippleEffectsForKidsCheckBox;
	}

	@FindBy(xpath = "//input[@id='sfsk_mode']")
	private WebElement SFSkidsCheckBox;

	public WebElement checkSFSKidsCheckBox() {
		return SFSkidsCheckBox;
	}

	@FindBy(xpath = "//input[@id='sfst_mode']")
	private WebElement SFSTeensCheckBox;

	public WebElement checkSFSteensCheckBox() {
		return SFSTeensCheckBox;
	}

	@FindBy(xpath = "//input[@id='bouncy_resources']")
	private WebElement bouncyProgramCheckBox;

	public WebElement checkBouncyProgramCheckBox() {
		return bouncyProgramCheckBox;
	}

	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Submit'])[1]")
	private WebElement submitbuttonfororganization;

	public WebElement clickOnOrganizationSubmitButton() {
		return submitbuttonfororganization;
	}

}
