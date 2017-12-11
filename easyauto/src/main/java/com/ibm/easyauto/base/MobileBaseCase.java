package com.ibm.easyauto.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class MobileBaseCase {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("In before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("In before method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("In before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("In after method");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("In after class");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("In after test method");
	}
	
	@AfterSuite
	public void afterSuite(){
		
	}
}
