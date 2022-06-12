package modules;

import pageEvents.Flight;
import utils.BaseTest;
import org.testng.annotations.Test;

public class FlightPage extends BaseTest {
    @Test
    public void ClearTripTest() throws InterruptedException {


        Flight flightPageEvents = new Flight();

        flightPageEvents.ClickOnTheRoundTripButton();
        flightPageEvents.ClickOneWayButton();
        flightPageEvents.ClearFromTextField();
        flightPageEvents.EnterFromDestination();
        flightPageEvents.SelectFromLocation();
        flightPageEvents.ClickOnDepartureDateButton();
        flightPageEvents.SelectDepatureDate();
        flightPageEvents.ConfirmDateSelected();
        flightPageEvents.VerifyAdultText();
        flightPageEvents.ClickAdultDropDown();
        flightPageEvents.SelectNumOfAdult();
        flightPageEvents.VerifyChildrenText();
        flightPageEvents.ClickChildrenDropDown();
        flightPageEvents.SelectNumOfChildren();
        flightPageEvents.VerifyInfantText();
        flightPageEvents.ClickOnInfantDropDown();
        flightPageEvents.SelectNumOfInfants();
        flightPageEvents.VerifyMoreOptionText();
        flightPageEvents.ClickOnMoreOptions();
        flightPageEvents.VerifyPreferredAirline();
        flightPageEvents.ClearAirlineText();
        flightPageEvents.EnterPreferredAirlineText();
        flightPageEvents.ScrollToErrorMessage();
        flightPageEvents.ClickSearchButton();
        flightPageEvents.VerifyErrorMessage();



    }

}
