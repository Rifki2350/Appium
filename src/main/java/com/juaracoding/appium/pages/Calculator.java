package com.juaracoding.appium.pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	private AndroidDriver<MobileElement> driver;
	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	//Locator
	By btnsatu = By.id("com.sec.android.app.popupcalculator:id/bt_01");
	By btndua = By.id("com.sec.android.app.popupcalculator:id/bt_02");
	By btntiga = By.id("com.sec.android.app.popupcalculator:id/bt_03");
	By btnempat = By.id("com.sec.android.app.popupcalculator:id/bt_04");
	By btnlima = By.id("com.sec.android.app.popupcalculator:id/bt_05");
	By btnenam = By.id("com.sec.android.app.popupcalculator:id/bt_06");
	By btntujuh = By.id("com.sec.android.app.popupcalculator:id/bt_07");
	By btndelapan = By.id("com.sec.android.app.popupcalculator:id/bt_08");
	By btnsembilan = By.id("com.sec.android.app.popupcalculator:id/bt_09");
	By btntambah = By.id("com.sec.android.app.popupcalculator:id/bt_add");
	By btnkurang = By.id("com.sec.android.app.popupcalculator:id/bt_sub");
	By btnkali = By.id("com.sec.android.app.popupcalculator:id/bt_mul");
	By btnbagi = By.id("com.sec.android.app.popupcalculator:id/bt_div");
	By btnSamaDengan = By.id("com.sec.android.app.popupcalculator:id/bt_equal");
	By btnhasil = By.id("com.sec.android.app.popupcalculator:id/txtCalc");
	
	//method 
	public void calcAdd() {
		driver.findElement(btnlima).click();
		driver.findElement(btntambah).click();
		driver.findElement(btndua).click();
		driver.findElement(btnSamaDengan).click();	
		driver.findElement(btnhasil).click();
	
	}
	public void calcSub() {
		driver.findElement(btnlima).click();
		driver.findElement(btnkurang).click();
		driver.findElement(btndua).click();
		driver.findElement(btnSamaDengan).click();	
		driver.findElement(btnhasil).click();
	
	}
	public void calcMul() {
		driver.findElement(btnlima).click();
		driver.findElement(btnkali).click();
		driver.findElement(btndua).click();
		driver.findElement(btnSamaDengan).click();	
		driver.findElement(btnhasil).click();
	
	}
	public void calcDiv() {
		driver.findElement(btndelapan).click();
		driver.findElement(btnbagi).click();
		driver.findElement(btndua).click();
		driver.findElement(btnSamaDengan).click();	
		driver.findElement(btnhasil).click();
	
	}
	//
	public String getResult() {
		return driver.findElement(btnhasil).getText();
	}
	
	
	
}
