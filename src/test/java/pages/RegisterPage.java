package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.ConfigReader;

import java.time.Duration;

public class RegisterPage {

    private WebDriver driver;

    // Constructor - Driver'ı initialize ediyoruz
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    // Web Elements
    private By signupsigninBtn = By.xpath("//a[normalize-space()='Signup / Login']");
    private By signupVisible = By.xpath("//h2[normalize-space()='New User Signup!']");
    private By nameField = By.xpath("//input[@placeholder='Name']");
    private By emailField = By.xpath("//input[@data-qa='signup-email']");
    private By signupBtn = By.xpath("//button[normalize-space()='Signup']");
    private By enteraccountVisible = By.xpath("//b[normalize-space()='Enter Account Information']");
    private By titleoption = By.xpath("//input[@id='id_gender2']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By dayField = By.xpath("//select[@id='days']");
    private By monthField = By.xpath("//select[@id='months']");
    private By yearField = By.xpath("//select[@id='years']");
    private By signupcheckbox = By.xpath("//input[@id='newsletter']");
    private By partnercheckbox = By.xpath("//input[@id='optin']");

    // Ana sayfa doğrulama
    public void verifyHomepage() {
        driver.get(ConfigReader.getProperty("ae_url"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Automation Exercise"));
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
    }

    // "Signup/Login" butonuna tıklama
    public void clickSignupButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(signupsigninBtn));
        signupButton.click();
    }

    // "New User Signup!" başlığının görünür olup olmadığını kontrol etme
    public boolean isNewUserSignupVisible() {
        return driver.findElement(signupVisible).isDisplayed();
    }

    // İsim alanına veri girme
    public void enterName() {
        driver.findElement(nameField).sendKeys(ConfigReader.getProperty("name"));
    }

    // E-posta alanına veri girme
    public void enterEmail() {
        driver.findElement(emailField).sendKeys(ConfigReader.getProperty("email"));
    }

    // Signup butonuna tıklama
    public void clickSignupBtn() {
        driver.findElement(signupBtn).click();
    }

    // "Enter Account Information" başlığının görünüp görünmediğini kontrol etme
    public boolean isEnterAccountInformationVisible() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element_enteraccount = wait.until(ExpectedConditions.visibilityOfElementLocated(enteraccountVisible));
        return element_enteraccount.isDisplayed();
    }

    // Title seçimi
    public void fillTitle() {
        driver.findElement(titleoption).click();
    }

    // Şifre girme
    public void enterPassword() {
        driver.findElement(passwordField).sendKeys(ConfigReader.getProperty("password"));
    }

    // Doğum tarihi gün seçimi
    public void dateofbirth_day() {
        WebElement dateofbirthDropdown_day = driver.findElement(dayField);
        Select select = new Select(dateofbirthDropdown_day);
        select.selectByVisibleText("21");
    }

    // Doğum tarihi ay seçimi
    public void dateofbirth_month() {
        WebElement dateofbirthDropdown_month = driver.findElement(monthField);
        Select select = new Select(dateofbirthDropdown_month);
        select.selectByVisibleText("June");
    }

    // Doğum tarihi yıl seçimi
    public void dateofbirth_year() {
        WebElement dateofbirthDropdown_year = driver.findElement(yearField);
        Select select = new Select(dateofbirthDropdown_year);
        select.selectByVisibleText("2002");
    }
}
