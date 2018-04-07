package se.crisp.edu.refactor.gildedrose.step;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import se.crisp.edu.refactor.gildedrose.GildedRose;
import se.crisp.edu.refactor.gildedrose.Inventory;
import se.crisp.edu.refactor.gildedrose.Item;

import static org.junit.Assert.assertEquals;

public class GeneralSteps {

    private static final String SOME_NAME = "some name";
    private GildedRose gildedRose;
    private Inventory inventory;
    private Item currentItem;

    @Before
    public void beforeAll() {
        inventory = new Inventory();
        gildedRose = new GildedRose(inventory);
    }

    @Given("^an item with quality (\\d+) and sell by date (.*)")
    public void anItemWithQualityAndSellByDate(int quality, String relativeDay) throws Throwable {
        currentItem = new Item(SOME_NAME, parseRelativeDay(relativeDay), quality);
        inventory.addItem(currentItem);
    }

    @When("^(\\d+) day passed$")
    public void dayPassed(int days) throws Throwable {
        for (int n = 0; n < days; n++) {
            gildedRose.updateQuality();
        }
    }

    @Then("^the item has quality (\\d+)$")
    public void theItemHasQuality(int quality) throws Throwable {
        assertEquals(quality, currentItem.quality);
    }

    @And("^the item has sell by date (.*)")
    public void theItemHasSellByDate(String relativeDay) throws Throwable {
        assertEquals(parseRelativeDay(relativeDay), currentItem.sellIn);
    }


    private int parseRelativeDay(String relativeDay) {
        if (relativeDay.equalsIgnoreCase("yesterday")) {
            return -1;
        }
        if (relativeDay.equalsIgnoreCase("today")) {
            return 0;
        }
        if (relativeDay.equalsIgnoreCase("tomorrow")) {
            return 1;
        }
        throw new IllegalArgumentException(relativeDay + " is not understood.");
    }

}

