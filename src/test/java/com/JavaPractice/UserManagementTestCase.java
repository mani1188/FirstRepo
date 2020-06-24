/*Click On Admin
 * Click On UserManagement
 * Enter UserName
 * Select the UserType
 * Search EmployeName
 * Click On Search Button
 * Print the Search Results on Console
 */


package com.JavaPractice;
import org.testng.annotations.Test;

public class UserManagementTestCase extends UserManagementPage{

	
public UserManagementTestCase() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}

@Test
public void HomePageTest() throws Throwable {
	ClickOnAdmin();
	ClickOnUsrmngmnt();
	EnterUserName();
	SelectUserType();
	SearchEmpName();
	ClickOnsearchButton();
	Chkresults() ;
	
	}





}