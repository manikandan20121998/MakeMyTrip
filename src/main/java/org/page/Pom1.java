package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 extends BaseClass {
	 public Pom1() {
        PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="(//span[@class='chNavText darkGreyText'])[6]")
	 private WebElement buses;
	 
	 @FindBy(xpath="(//input[@type='text'])[1]")
	 private WebElement from;
	 
	 @FindBy(xpath="//span[text()='Chennai, Tamil Nadu']")
	 private WebElement fromplace;
	 
	 @FindBy(xpath="//input[@autocomplete='off']")
	 private WebElement to;
	 
	 @FindBy(xpath="//span[text()='Delhi']")
	 private WebElement toplace;
	 
	 @FindBy(id="search_button")
	 private WebElement search;
	 
	 
	 
	 @FindBy(xpath="(//div[@class='DayPicker-Day'])[4]")
	 private WebElement date1;

	 
	public WebElement getDate1() {
		return date1;
	}

	public WebElement getBuses() {
		return buses;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getFromplace() {
		return fromplace;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getToplace() {
		return toplace;
	}

	public WebElement getSearch() {
		return search;
	}
	 
	 
	 
	 
	 
	 
	 
	 
}
