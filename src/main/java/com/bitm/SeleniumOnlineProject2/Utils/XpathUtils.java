package com.bitm.SeleniumOnlineProject2.Utils;

public class XpathUtils {

	public class LoginModule {

		public static final String Username = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input";
		public static final String Password = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input";
		public static final String LoginBTN = "/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input";
	}

	public class AssignLeaveModule {
		
		public static final String AssignLeaveLink = "/html/body/div[1]/div[3]/div/div[2]/div[1]/div/div/div/fieldset/div/div/table/tbody/tr/td[1]/div/a/img";
		public static final String EmployeeName="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]";
		public static final String LeaveType="//*[@id=\"assignleave_txtLeaveType\"]";
		public static final String Fromdate="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/input";
		public static final String FromDateMonth="/html/body/div[3]/div/div/select[1]";
		public static final String FromDateYear="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String Todate="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[5]/input";
		public static final String ToDateMonth="/html/body/div[3]/div/div/select[1]";
		public static final String TomDateYear="/html/body/div[3]/div/div/select[2]";
		public static final String Comment="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[10]/textarea";
		public static final String AssignButton="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input";
	}

}
