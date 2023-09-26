package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 extends BaseClass {
public Pom2() {
   PageFactory.initElements(driver, this);
}


@FindBy(xpath="//a[text()='Search New Dates']")
private WebElement newbus;

@FindBy(id="travelDate")
private WebElement date2;

@FindBy(xpath="//div[@aria-label='Tue Dec 06 2022']")
private WebElement seldate;

public WebElement getNewbus() {
	return newbus;
}

public WebElement getDate2() {
	return date2;
}

public WebElement getSeldate() {
	return seldate;
}


}
