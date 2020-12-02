package reusables;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericMethod {
	
	public static void Click(WebDriver driver , By by)
	{
		driver.findElement(by).click();
	}
	
	public static String getScreenshotPath(WebDriver webdriver,String fileWithPath) {		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);	
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);		
		String destFilePath = System.getProperty("user.dir")+ "\\src\\main\\reports\\screenshots\\"+fileWithPath+".png";
		File DestFile=new File(destFilePath);		
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return destFilePath;
	}

}
