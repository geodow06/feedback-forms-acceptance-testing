package com.qa.feedbackform;

public class Constants {

	public final static String CHROMELOCATION = "C:/Users/Admin/Desktop/chromedriver.exe";
	public final static String CHROMEDRIVER = "webdriver.chrome.driver";
	public final static String HEADLESSCHROME = "/Users/Taoheed/Desktop/chromedriver";

	
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
	
	
	public final static String LOGINSUCCESSMESSAGE = "";
	public final static String LOGINFAILMESSAGE = "";
	public final static String ACCOUNTDOESNOTEXISTMESSAGE = "";

	public final static String REGISTERINVALIDMESSAGE = "invalid";
	public final static String REGISTERVALIDMESSAGE = "valid";
	public final static String ACCOUNTALREADYEXISTSMESSAGE = "Account already exists";
	
	public final static String FEEDBACKFORMEMPTYFIELDMESSAGE = "All fields need to be filled";
	public final static String FEEDBACKFORMSUCCESSMESSAGE = "Form has been submitted";

	
	
	public static final String FORGOTTENPASSWORDURL = "";

}
