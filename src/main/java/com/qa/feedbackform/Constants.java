package com.qa.feedbackform;

public class Constants {

	public final static String CHROMELOCATION = "C:/Users/Admin/Desktop/chromedriver.exe";
	public final static String CHROMEDRIVER = "webdriver.chrome.driver";
	public final static String HEADLESSCHROME = "src/main/resources/chromedriver";

	
	public final static String BASEURL = "https://feedback.ukwest.cloudapp.azure.com";
	public final static String DASHBOARDURL = BASEURL + "/home";
	public final static String REGISTERURL = BASEURL + "/register";
	public final static String LOGINURL = BASEURL + "/login";
	public final static String ACCOUNTURL = BASEURL + "/account";
	public final static String VIEWTRAINEESURL = BASEURL + "/trainees";
	public final static String VIEWCOHORTSURL = BASEURL + "/cohorts";
	public final static String FORMURL = BASEURL + "/form";
	
	public final static String LOGINTESTTRAINEEEMAIL = "Tao.Afo@academytrainee.com";
	public final static String LOGINTESTTRAINEREMAIL = "The.Trainer@qa.com";
	public final static String LOGINTESTPASSWORD = "password";
	public final static String TESTTRAINEREMAIL = "Test.Trainer@qa.com";
	public final static String TESTTRAINEEEMAIL = "Test.Trainee@academytrainee.com";
	public final static String UNREGISTEREDEMAIL = "DoesNot.Exist@academytrainee.com";
	public final static String TESTRANDOMEMAIL = "Random_email@gmail.com";
	public final static String GOODPWD = "Password123!";
	public final static String BADPWD = "name";
	
	
	public final static String LOGINSUCCESSMESSAGE = "Logged in successfully.";
	public final static String LOGINFAILMESSAGE = "Username or password invalid";
	public final static String ACCOUNTDOESNOTEXISTMESSAGE = "";

	public final static String REGISTERINVALIDEMAILMESSAGE = "Email address must be a qa or academytrainee address";
	public final static String REGISTERVALIDEMAILMESSAGE = "Email is valid";

	public final static String REGISTERPASSWORDINVALIDMESSAGE = "Password between 6 and 18 characters";
	public final static String REGISTERPASSWORDVALIDMESSAGE = "Password is valid";
	public final static String REGISTERERRORMESSAGE = "Error occured. Please try again with different credentials.";
	
	public final static String FEEDBACKFORMEMPTYFIELDMESSAGE = "All fields need to be filled";
	public final static String FEEDBACKFORMSUCCESSMESSAGE = "Form has been submitted";

	
	
	public static final String FORGOTTENPASSWORDURL = "";

}
