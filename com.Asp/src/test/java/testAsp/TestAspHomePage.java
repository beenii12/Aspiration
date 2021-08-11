package testAsp;

import common.BaseAPI;
import homepageAspiration.HomepageAsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestAspHomePage extends BaseAPI {

    HomepageAsp homepage;

    @Test(priority = 1, enabled = false)
    public void testSpendAndSaveLink() {
        homepage = new HomepageAsp();
        homepage.navigateToSpendAndSaveLink();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Cash Management Services - Investing & Retirement Planning | Aspiration";

        Assert.assertEquals(actualTitle, expectedTitle, "Titles do not match !");
    }

    @Test(priority = 2, enabled = false)
    public void testAspirationCardVisibility() {
        homepage = new HomepageAsp();
        homepage.validateAspirationCardIsVisible();
        boolean act = driver.findElement(By.className("card-original")).isDisplayed();
        assertTrue(act);
    }

    @Test(priority = 3, enabled = false)
    public void testAspirationPlusCardVisibility() {
        homepage = new HomepageAsp();
        homepage.validateAspirationPlusCardIsVisible();
        boolean act = driver.findElement(By.xpath("//div[@class='card-plus']")).isDisplayed();
        assertTrue(act);
    }

    @Test(priority = 4, enabled = false)
    public void testGetAspirationModal() throws InterruptedException {
        homepage = new HomepageAsp();
        homepage.validateGetAspirationModalAppears();
        boolean act = driver.findElement(By.className(".inside-form")).isDisplayed();
        assertTrue(act);
    }
    @Test(priority = 5, enabled = false)
    public void testAspirationPlusPlansAppear(){
        homepage = new HomepageAsp();
        homepage.validateAspirationPlusPlansAppear();
        boolean act = driver.findElement(By.className("modal-content")).isDisplayed();
        assertTrue(act);

    }
    @Test(priority = 6, enabled = false)
    public void testYearlyRadioOptionDisplays() throws InterruptedException {
        homepage = new HomepageAsp();
        homepage.validateYearlyRadioOptionDisplays();
        boolean act = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/p")).isDisplayed();
        assertTrue(act);
    }
    @Test(priority = 7, enabled = true)
    public void testMonthlyRadiOptionDisplays() throws InterruptedException {
        homepage = new HomepageAsp();
        homepage.validateMonthlyRadioOptionDisplays();
        Assert.assertTrue(isElementDisplayed(homepage.monthlyRadioOption));

    }




}











