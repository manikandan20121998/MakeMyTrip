package org.stepdefinition;

import java.io.FileReader;
import java.io.IOException;

import org.base.BaseClass;
import org.page.PageObjectManager;
import org.properties.Configuration_Reader;
import org.properties.FileReader_Make;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
public static PageObjectManager pom;
	@Given("user should be in official page of makemytrip")
	public void user_should_be_in_official_page_of_makemytrip() throws IOException {
     chromebrowser();
    String url = FileReader_Make.getInstance().geturl();
     urllaunch(url);
     implicitywait(10);
     maximize();
	}

	@When("user click the bus icon")
	public void user_click_the_bus_icon() {
		 pom=new PageObjectManager();
		
      click(pom.getInstancePom1().getBuses());
	}

	@When("user fill the from and to details")
	public void user_fill_the_from_and_to_details() {
		click(pom.getInstancePom1().getFrom());
   sendkeys(pom.getInstancePom1().getFrom(), "chennai");
   click(pom.getInstancePom1().getFromplace());
   sendkeys(pom.getInstancePom1().getTo(), "Delhi");
   click(pom.getInstancePom1().getToplace());
   
	}

	@When("user pass the date for departure and return")
	public void user_pass_the_date_for_departure_and_return() {
      click(pom.getInstancePom1().getDate1());
     
	}

	@Then("user click the search button for bus details")
	public void user_click_the_search_button_for_bus_details() {
      click(pom.getInstancePom1().getSearch());
	}

	@Given("user click the newbusSearch button")
	public void user_click_the_newbusSearch_button() {
		pom=new PageObjectManager();
       click(pom.getInstance2().getNewbus());
	}

	@When("user click date of departure")
	public void user_click_date_of_departure() {
     click(pom.getInstance2().getDate2());
	}

	@When("user choose decsixth for departure")
	public void user_choose_decsixth_for_departure() {
      click(pom.getInstance2().getSeldate());
	}

	@When("user again click searcch button for available check")
	public void user_again_click_searcch_button_for_available_check() {
       click(pom.getInstancePom1().getSearch());
	}

	@Then("will see the NoBusFound image take screen shot")
	public void will_see_the_NoBusFound_image_take_screen_shot() throws InterruptedException, IOException {
        Thread.sleep(13000);
        screenshot("Makemytrip");
        System.out.println("Done..");
	}
	
	
}
