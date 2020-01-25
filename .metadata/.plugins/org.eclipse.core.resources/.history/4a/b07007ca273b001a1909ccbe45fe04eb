package ExcelUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) {
		System.out.println("yes work");
		ExcelRead objTest = new ExcelRead();
		System.out.println(objTest.getCellData("SampleExcelFile.xls", "Input", 1, "storeState"));

	}

	public static String GetSSN() {

		String area;
		String group;
		String serial;
		//ArrayList<String> ssn = new ArrayList<String>();
		Random rand = new Random();

		//while(ssn.size() < size){

		int n = rand.nextInt(799) + 1;

		NumberFormat formatter = new DecimalFormat("000");
		area = formatter.format(n);

		n = rand.nextInt(99) + 1;

		formatter = new DecimalFormat("00");
		group = formatter.format(n);

		n = rand.nextInt(9999) + 1;

		formatter = new DecimalFormat("0000");
		serial = formatter.format(n);

		//if(!ssn.contains(area + group + serial)) {
		//	ssn.add(area + group + serial);
		//}

		//}
		System.out.println("SSN: " + area +"-"+ group +"-"+ serial);	

		return area + group + serial;
	}
	public String getCellData(String workbookpath,String sheetName,int RowNo,String colName) 
	{
		workbookpath = System.getProperty("user.dir")+"/Files/"+workbookpath;
		String cellContent=null;
		int cell = 0;
		try{
			cell=getColoumnIndex(workbookpath,colName, sheetName);
		}catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		File file=new File(workbookpath);
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheet(sheetName);
		Row row=sheet.getRow(RowNo);
		Cell cel=row.getCell(cell);
		cel.setCellType(Cell.CELL_TYPE_STRING);
		cellContent=cel.getStringCellValue().toString();
		return cellContent;
	}

	public int getColoumnIndex(String workbookpath,String colName,String sheetName) throws FileNotFoundException, InvalidFormatException, IOException 
	{	 
		int colIndex=0;
		File file=new File(workbookpath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Workbook wb=null;
		try{
			wb= WorkbookFactory.create(fis);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		Sheet sheet=wb.getSheet(sheetName);
		Row row=sheet.getRow(0);

		for (colIndex = 0; colIndex < row.getPhysicalNumberOfCells(); colIndex++) {
			try{
				String cell=row.getCell(colIndex).getStringCellValue();
				if (cell != null) {
					if ( cell.equalsIgnoreCase(colName)) {
						break;
					}
				}else{
					System.out.println("coloumn with name: "+colName+" not found in "+sheetName+" table");
				}
			}
			catch(Exception e)
			{
				System.out.println("in catch block"+e.getMessage());

			}
		}
		return colIndex;

	}






}
