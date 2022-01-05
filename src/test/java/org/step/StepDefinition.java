package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {

	 Pom p;
	
	@Given("I am on a Adactin page on Chrome Browser")
	public void i_am_on_a_Adactin_page_on_Chrome_Browser() {
	    setDriver();
	    launch("https://adactinhotelapp.com/");
	    maximize();
	}

	@When("I need to enter {string} and {string}")
	public void i_need_to_enter_and(String string, String string2) {
	    p = new Pom();
	    WebElement userName = p.getUserName();
	    sendK(userName, string);
	    WebElement password = p.getPassword();
	    sendK(password, string2);
	}

	@When("I need to click Login button")
	public void i_need_to_click_Login_button() {
	    WebElement loginbut = p.getLoginbut();
	    buttonCl(loginbut);
	}

	@Then("I need to verify the Home page Screen appear or not")
	public void i_need_to_verify_the_Home_page_Screen_appear_or_not() {
	    System.out.println("Adactin logged in");
	}

	@When("I need to select {string} , {string} , {string} , {string}")
	public void i_need_to_select(String string, String string2, String string3, String string4) {
	    WebElement location = p.getLocation();
	    sendK(location, string);
	    WebElement hotel = p.getHotel();
	    sendK(hotel, string2);
	    WebElement roomType = p.getRoomType();
	    sendK(roomType, string3);
	    WebElement roomNoos = p.getRoomNoos();
	    sendK(roomNoos, string4);
	}

	@When("Enter {string} and {string}")
	public void enter_and(String string, String string2) {
	    WebElement date = p.getDate();
	    date.clear();
	    sendK(date, string);
	    WebElement dateo = p.getDateo();
	    dateo.clear();
	    sendK(dateo, string2);
	}

	@Then("I need to select {string} and {string}")
	public void i_need_to_select_and(String string, String string2) {
	    WebElement adult = p.getAdult();
	    sendK(adult, string);
	    WebElement child = p.getChild();
	    sendK(child, string2);
	}

	@Then("I need to click Search button")
	public void i_need_to_click_Search_button() {
	    WebElement search = p.getSearch();
	    buttonCl(search);
	}

	@Then("I need to verify whether browser navigated to payment page")
	public void i_need_to_verify_whether_browser_navigated_to_payment_page() {
	    System.out.println("Hotel selected");
	}

	@When("I need to select the booking and click continue")
	public void i_need_to_select_the_booking_and_click_continue() {
	    WebElement select = p.getSelect();
	    buttonCl(select);
	    WebElement cont = p.getCont();
	    buttonCl(cont);
	}

	@Then("I need to check browser navigated to next page")
	public void i_need_to_check_browser_navigated_to_next_page() {
	    System.out.println("navigated to payment page");
	}

	@When("I need to enter {string} , {string} , {string} and {string}")
	public void i_need_to_enter_and(String string, String string2, String string3, String string4) {
	    WebElement firstname = p.getFirstname();
	    sendK(firstname, string);
	    WebElement lastname = p.getLastname();
	    sendK(lastname, string2);
	    WebElement address = p.getAddress();
	    sendK(address, string3);
	    WebElement ccnum = p.getCcnum();
	    sendK(ccnum, string4);
	}

	@When("{string} , {string} and {string}")
	public void and(String string, String string2, String string3) {
	    WebElement cctype = p.getCctype();
	    sendK(cctype, string);
	    WebElement expmonth = p.getExpmonth();
	    sendK(expmonth, string2);
	    WebElement expyear = p.getExpyear();
	    sendK(expyear, string3);
	}

	@Then("I need to enter {string} and click book now")
	public void i_need_to_enter_and_click_book_now(String string) {
	    WebElement cvv = p.getCvv();
	    sendK(cvv, string);
	    WebElement booknow = p.getBooknow();
	    buttonCl(booknow);
	}

	@When("I need to click itenarary and navigte to next page")
	public void i_need_to_click_itenarary_and_navigte_to_next_page() throws InterruptedException {
	    Thread.sleep(10000);
	    WebElement findElement = driver.findElement(By.xpath("//input[@id='order_no']"));
	    String attribute = findElement.getAttribute("value");
	    System.out.println(attribute);
		WebElement itinerary = p.getItinerary();
	    buttonCl(itinerary);
	    
	}

	@When("Need to print the ID")
	public void need_to_print_the_ID() {
	    System.out.println("final page");
	}

}
