package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalculator {
	private static AndroidDriver<MobileElement> driver;
	private Calculator calculator;

@BeforeClass
public void setUp(Capabilities Capabilities) throws MalformedURLException {
	DesiredCapabilities capiliCapabilities = new DesiredCapabilities();
	capiliCapabilities.setCapability("deviceName", "SM-M205G");
	capiliCapabilities.setCapability("uuid", "3201fd79410b2603");
	capiliCapabilities.setCapability("platformName", "Android");
	capiliCapabilities.setCapability("platformVersion", "8.1.0");
	capiliCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
	capiliCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
 
	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities); 
}

@BeforeMethod
public void pageObject() {
	calculator = new Calculator(driver);
}

//Post Test 20
@Test
public void testAdd() {
	calculator.calcAdd();
	System.out.println("Hasil = "+calculator.getResult());
	assertEquals(calculator.getResult(), "= 7");
}
@Test
public void testSub() {
	calculator.calcSub();
	System.out.println("Hasil = "+calculator.getResult());
	assertEquals(calculator.getResult(), "= 3");
}

@Test
public void testMul() {
	calculator.calcMul();
	System.out.println("Hasil = "+calculator.getResult());
	assertEquals(calculator.getResult(), "= 14");
}
@Test
public void testDiv() {
	calculator.calcDiv();
	System.out.println("Hasil = "+calculator.getResult());
	assertEquals(calculator.getResult(), "= 4");
}
@AfterClass
public void closeApp() {
	driver.quit();
}
static void delay(int detik) {
	try {
		Thread.sleep(1000 * detik);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
}
