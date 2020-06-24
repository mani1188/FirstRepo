/*Click On Admin Module
 * Select the Organization Tab
 * Select the information from Organization dropdown
 * Verify that Edit button is enabled or not
 * Print it on console
 * Disabled the Edit Button 
 * Clear the values Already filled in textbox
 * Enter the New Values
 * Save the information
 */

package com.JavaPractice;

import org.testng.annotations.Test;

public class OrganisationTestCase extends OrganisationPage {

public OrganisationTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
public void OrganisationTest() throws Throwable {
	ClickOnAdmin(); 
	ClickOnOrganization();
	ClickOnInformation();
	ChkFieldEnabled();
	ClickOnEditButton();
	ClearNametextBox();
	EnterName();
	ClearFax();
	EnterFax();
	ClickOnSaveButton();
}
}