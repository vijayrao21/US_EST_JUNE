package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import testBase.commonObjects;

public class projectUtils extends commonObjects{

	private static File src;

	public void captureScreenshot(String string, WebDriver driver) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		//take screenshot is used to take screenshot oon a browser
		String dest=System.getProperty("user.dir")+"/screenshot/"+string+".png"; 
		//capturing screenshot with user defined name

		//creating destination path
		System.out.println("destination"+dest);

		FileUtils.copyFile(src, new File(dest) );
		//copying source to destination	 

	}

	public String captureScreenshot(WebDriver driver) throws IOException {

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		//take screenshot is used to take screenshot oon a browser

		String dest=System.getProperty("user.dir")+"/screenshot/"+getCurrentDateTime()+".png";
		//capturing screenshot with current date and time
		//creating destination path
		System.out.println("destination"+dest);

		FileUtils.copyFile(src, new File(dest) );
		//copying source to destination	 

		return dest;

	}

	public String getCurrentDateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMM_HHmmss");
		return myDateObj.format(myFormatObj);
	}

	public Object[][] readExcelData(String testDataPath, String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fi=new FileInputStream(testDataPath);  //read input file
		Workbook book=WorkbookFactory.create(fi);  //create workbook
		Sheet sheet1=book.getSheetAt(0);  //sheet using index
		Sheet sheet=book.getSheet(sheetName);  //sheet using name

		//		System.out.println(sheet.getRow(1).getCell(0).toString());
		//		System.out.println(sheet.getRow(1).getCell(1).toString());

		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()]; //this will get row and column numbers

		for(int r=0;r<sheet.getLastRowNum();r++) {
			for(int c=0;c<sheet.getRow(0).getLastCellNum();c++) {
				//				System.out.println(sheet.getRow(r).getCell(c).toString()); //read excel data
				data[r][c]=sheet.getRow(r).getCell(c).toString();
			}
		}
		return data;
	}

	//	@Test
	public void readExcelTest() throws EncryptedDocumentException, IOException {
		String testDataPath=System.getProperty("user.dir")+"/TestData/testdata.xlsx";
		String sheetName="tc01";
		Object[][] data=readExcelData(testDataPath, sheetName);
		for(int i=0;i<data.length;i++) {
			System.out.println("First Column info#"+data[i][0]);
			System.out.println("Second Column info#"+data[i][1]);
		}
	}

	//	@Test
	public void readExcelTest2() throws EncryptedDocumentException, IOException {
		String testDataPath=System.getProperty("user.dir")+"/TestData/testdata.xlsx";
		String sheetName="tc02";
		Object[][] data=readExcelData(testDataPath, sheetName);
		for(int i=0;i<data.length;i++) {
			System.out.println("First Column info#"+data[i][0]);
			System.out.println("Second Column info#"+data[i][1]);
		}
	}

//	@Test
	public void writeExcelTest() throws EncryptedDocumentException, IOException {
		//		String testDataPath=System.getProperty("user.dir")+"/TestData/writetestdata.xlsx";
		//		String sheetName="tc01";
		//		Object[][] data=writeExcelData(testDataPath, sheetName);
		//		for(int i=0;i<data.length;i++) {
		//			System.out.println("First Column info#"+data[i][0]);
		//			System.out.println("Second Column info#"+data[i][1]);
		//		}
		writeExcelData();
	}

	private void writeExcelData(String testDataPath, String sheetName, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fi=new FileInputStream(testDataPath);  //read input file
		Workbook book=WorkbookFactory.create(fi);  //create workbook
				Sheet sheet=book.getSheet(sheetName);  //sheet using name  get existing sheet
//		Sheet sheet=book.createSheet("tc05"); //creating new sheet
		sheet.createRow(0).createCell(0).setCellValue("Test Data1");
		sheet.getRow(0).createCell(1).setCellValue("Test Data2");
		int getLastRowNumber=sheet.getLastRowNum();
		sheet.createRow(getLastRowNumber+1).createCell(0).setCellValue(data+getLastRowNumber);

		FileOutputStream fout=new FileOutputStream(new File(testDataPath));
		book.write(fout);
		fout.close();
	}

	private void writeExcelData(String testDataPath, String sheetName, String data, int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream fi=new FileInputStream(testDataPath);  //read input file
		Workbook book=WorkbookFactory.create(fi);  //create workbook
				Sheet sheet=book.getSheet(sheetName);  //sheet using name  get existing sheet
		sheet.createRow(row).createCell(col).setCellValue(data);
		FileOutputStream fout=new FileOutputStream(new File(testDataPath));
		book.write(fout);
		fout.close();
	}
	
	@Test
	private void writeExcelData() throws EncryptedDocumentException, IOException {
		String testDataPath=System.getProperty("user.dir")+"/TestData/writetestdata.xlsx";
		String sheetName="tc04";
		String data="testData";
		writeExcelData(testDataPath,sheetName, data );
	}

}