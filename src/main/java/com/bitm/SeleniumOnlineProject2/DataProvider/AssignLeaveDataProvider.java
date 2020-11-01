package com.bitm.SeleniumOnlineProject2.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.SeleniumOnlineProject2.Utils.ExcelUtils;

public class AssignLeaveDataProvider {

	@DataProvider(name = "assignleaveData")
	public static Object [][] getAssignLeaveData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getAssignLeaveData()
					},
				};
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}	        
    }
}
