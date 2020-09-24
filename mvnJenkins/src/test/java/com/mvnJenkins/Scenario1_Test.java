package com.mvnJenkins;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Scenario1_Test {
	 ExtentReports extent;
	 ExtentTest eTest;
	
	@BeforeMethod
	public  void extentreportsetup() {
	
    String path="C:\\Users\\Panchal\\eclipse-workspace\\mvnJenkins\\extentreport.html";

    ExtentSparkReporter reports= new ExtentSparkReporter(path);
    reports.config().setReportName("Test Report Name");
    reports.config().setDocumentTitle("Sample Project Test Name");
    
    extent= new ExtentReports();
    extent.attachReporter(reports);
    extent.setSystemInfo("Tested By ", "Venkat Prasad");
    
    
    
   
	
	}
	
	@Test
	
	public  void testOne() {
		ExtentTest eTest = extent.createTest("Test One");
		eTest.info("Test one is started ");
		 System.out.println("Extent report created for Test one");
		 
		 
	}
	
	@AfterMethod
	
	public void close() {
		
		
		
		extent.flush();
		
	}
		
}
