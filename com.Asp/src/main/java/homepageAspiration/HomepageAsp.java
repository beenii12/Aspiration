package homepageAspiration;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageAsp extends BaseAPI {

public HomepageAsp(){
    PageFactory.initElements(driver, this);
}

public void navigateToSpendAndSaveLink(){
    WebElement spendAndSaveLink = driver.findElement(By.cssSelector(".Element-sc-1dc3ws0-0.Link__StyledLink-sc-17puyxl-0.eklGNJ.giYPMc.atom-link[href='https://www.aspiration.com/our-products']"));
    spendAndSaveLink.click();
}

public void validateAspirationCardIsVisible(){
    navigateToSpendAndSaveLink();
    WebElement aspirationCard = driver.findElement(By.className("card-original"));
    aspirationCard.isDisplayed();

}

public void validateAspirationPlusCardIsVisible(){
    navigateToSpendAndSaveLink();
    WebElement aspirationPlusCard = driver.findElement(By.xpath("//div[@class='card-plus']"));
    aspirationPlusCard.isDisplayed();
}

public void validateGetAspirationModalAppears() throws InterruptedException {
    navigateToSpendAndSaveLink();
    WebElement getAspirationButton = driver.findElement(By.xpath("//button[normalize-space()='Get Aspiration']"));
   Thread.sleep(5000);

    getAspirationButton.click();
    WebElement getAspirationModal = driver.findElement(By.className(".inside-form"));
    getAspirationModal.isDisplayed();
}
public void validateAspirationPlusPlansAppear(){
    navigateToSpendAndSaveLink();
    WebElement aspirationPlusCard = driver.findElement(By.cssSelector("#content-area > div > spend-save-plans > div > div > div.plan.plan-a-plus > div.plan-content > button"));
    aspirationPlusCard.click();
    WebElement getAspirationPlusModal = driver.findElement(By.className("modal-content"));
    getAspirationPlusModal.isDisplayed();
}

public void validateYearlyRadioOptionDisplays() throws InterruptedException {
    navigateToSpendAndSaveLink();
    WebElement aspirationPlusCard = driver.findElement(By.cssSelector("#content-area > div > spend-save-plans > div > div > div.plan.plan-a-plus > div.plan-content > button"));
    aspirationPlusCard.click();

    String yearlyRadioOption = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/p")).getText();

}
@FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/p")
public WebElement monthlyRadioOption;

public void validateMonthlyRadioOptionDisplays() throws InterruptedException {
    navigateToSpendAndSaveLink();
    WebElement aspirationPlusCard = driver.findElement(By.cssSelector("#content-area > div > spend-save-plans > div > div > div.plan.plan-a-plus > div.plan-content > button"));
    aspirationPlusCard.click();

    monthlyRadioOption.getText();
}

}













