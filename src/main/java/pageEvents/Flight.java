package pageEvents;

import pageObjects.Flights;
import utils.ElementFetch;
import utils.BaseTest;
import org.testng.Assert;

public class Flight {
    public void ClickOnTheRoundTripButton() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", Flights.RoundTripButton).click();
        Thread.sleep(2000);
    }

    public void ClickOneWayButton() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.OneWayButton).click();
        Thread.sleep(2000);
    }

    public void ClearFromTextField() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.FromTextField).clear();
        Thread.sleep(2000);
    }
    public void EnterFromDestination() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.FromTextField).sendKeys("Nig");
        Thread.sleep(2000);
    }

    public void SelectFromLocation() throws InterruptedException{
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.FromLocation).click();
        Thread.sleep(2000);
    }

    public void ClickOnDepartureDateButton()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.DepartureDate).click();
        Thread.sleep(2000);
    }

    public void SelectDepatureDate()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.DateSelector).click();
        Thread.sleep(2000);
    }

    public void ConfirmDateSelected()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.ConfirmDate).size() > 0, "Incorrect Date displayed");
        Thread.sleep(2000);
    }

    public void VerifyAdultText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.AdultText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickAdultDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.AdultDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfAdult()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.SelectAdultNum).click();
        Thread.sleep(2000);
    }

    public void VerifyChildrenText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.ChildrenText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickChildrenDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.ChildrenDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfChildren()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.SelectChildrenNum).click();
        Thread.sleep(2000);
    }

    public void VerifyInfantText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.InfantText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickOnInfantDropDown()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.InfantDropDown).click();
        Thread.sleep(2000);
    }

    public void SelectNumOfInfants()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.SelectInfantNum).click();
        Thread.sleep(2000);
    }

    public void VerifyMoreOptionText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.MoreOptions).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClickOnMoreOptions()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.MoreOptions).click();
        Thread.sleep(2000);
    }

    public void VerifyPreferredAirline()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.AirlineText).size() > 0, "Incorrect Text Displayed");
        Thread.sleep(2000);
    }

    public void ClearAirlineText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.PreferredAirlineTextField).clear();
        Thread.sleep(2000);
    }

    public void EnterPreferredAirlineText()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",Flights.PreferredAirlineTextField).sendKeys("Qatar Airways");
        Thread.sleep(2000);
    }
    public void ScrollToErrorMessage()throws InterruptedException {
        BaseTest.ScrollDown();
        Thread.sleep(2000);

    }

    public void ClickSearchButton()throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CSS",Flights.SearchFlightButton).click();
        Thread.sleep(2000);

    }


    public void VerifyErrorMessage() throws InterruptedException{
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH",Flights.ErrorMessage).size() > 0, "Incorrect Text Displayed");
    }
}
