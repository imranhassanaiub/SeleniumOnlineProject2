package com.bitm.SeleniumOnlineProject2.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.SeleniumOnlineProject2.DTO.AssignLeaveDTO;
import com.bitm.SeleniumOnlineProject2.DTO.LoginDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;

	private static Sheet getSheet(int sheetNo) throws IOException {
		// Get the file from locally
		File f = new File("C:\\Users\\Imran\\Desktop\\data.xlsx");
		inputStream = new FileInputStream(f);

		//Get the file ftom project location
		//File f = new File("src/main/java");
		//File fs= new File(f, "data.xlsx");
		//inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		
		// get workbook
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;

	}

	// LoginTest

	public static List<LoginDTO> getLoginData() throws IOException {

		List<LoginDTO> logindata = new ArrayList<LoginDTO>();
		DataFormatter formater = new DataFormatter();

		Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();
		while (rowiterator.hasNext()) {

			Row nextRow = rowiterator.next();

			Iterator<Cell> celliterator = nextRow.cellIterator();
			LoginDTO login = new LoginDTO();
			byte cellCounter = 0;
			while (celliterator.hasNext()) {
				Cell cell = celliterator.next();

				switch (cellCounter) {
				case 0:
					login.setUsername(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					login.setPassword(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					login.setUsername(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					login.setPassword(formater.formatCellValue(cell));
					break;
				}
			}

			logindata.add(login);

		}
        close();
		return logindata;
	}

	//AssignleaveTest
	
	public static List<AssignLeaveDTO> getAssignLeaveData() throws IOException {

		List<AssignLeaveDTO> assignleavendata = new ArrayList<AssignLeaveDTO>();
		DataFormatter formater = new DataFormatter();

		Iterator<Row> rowiterator = ExcelUtils.getSheet(1).iterator();
		while (rowiterator.hasNext()) {

			Row nextRow = rowiterator.next();

			Iterator<Cell> celliterator = nextRow.cellIterator();
			AssignLeaveDTO assignleave = new AssignLeaveDTO();
			byte cellCounter = 0;
			while (celliterator.hasNext()) {
				Cell cell = celliterator.next();

				switch (cellCounter) {
				case 0:
					assignleave.setEmployeename(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					assignleave.setLeavetype(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					assignleave.setFromdatemonth(formater.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
                    assignleave.setFromdateyear(formater.formatCellValue(cell));
                    cellCounter++;
					break;
				case 4:
                    assignleave.setFromdatedate(formater.formatCellValue(cell));
                    cellCounter++;
					break;
				case 5:
                    assignleave.setTodatemonth(formater.formatCellValue(cell));
                    cellCounter++;
					break;
				case 6:
                    assignleave.setTodateyear(formater.formatCellValue(cell));
                    cellCounter++;
					break;
				case 7:
                    assignleave.setTodatedate(formater.formatCellValue(cell));  
                    cellCounter++;
					break;
				case 8:
                    assignleave.setComment(formater.formatCellValue(cell));                
					break;
				}
			}

			assignleavendata.add(assignleave);

		}
        close();
		return assignleavendata;
	}

	
	
	
	
	
	private static void close() throws IOException {
		workbook.close();
		inputStream.close();
		
	}

}
