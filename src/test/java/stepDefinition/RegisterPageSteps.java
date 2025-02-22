package stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegisterPage;
import utility.BrowserDriver;
import utility.ConfigReader;

public class RegisterPageSteps extends BrowserDriver {

    private RegisterPage registerPage;
    private static final String BROWSER_TYPE = ConfigReader.getProperty("browser");

    @Given("Kullanıcı tarayıcıyı başlatır")
    public void initializeBrowser(){
        BrowserDriver.getDriver(BROWSER_TYPE); // Tarayıcıyı başlatma
        registerPage = new RegisterPage(BrowserDriver.getDriver(BROWSER_TYPE)); // RegisterPage nesnesini güncel driver ile başlatma
    }

    @And("Kullanıcı ilgili adrese gider.")
    public void navigateToURL() throws InterruptedException {
        BrowserDriver.getDriver(BROWSER_TYPE).get(ConfigReader.getProperty("ae_url"));
        BrowserDriver.getDriver(BROWSER_TYPE).manage().deleteAllCookies();
    }

    @Then("Kullanıcı ana sayfanın başarılı bir şekilde görüntülendiğini doğrular.")
    public void verify_Homepage(){
        registerPage.verifyHomepage();
    }

    @When("Kullanıcı {string} butonuna tıklar")
    public void click_SignupLogin_Btn(String signupButton){
        registerPage.clickSignupButton();
    }

    @Then("Kullanıcı 'New User Signup!' yazısının görünürlüğünü doğrular.")
    public void verifySignUp(){
        registerPage.isNewUserSignupVisible();
    }

    @When("Kullanıcı adını girer.")
    public void enter_name(){
        registerPage.enterName();
    }

    @When("Kullanıcı emailini girer.")
    public void enter_email(){
        registerPage.enterEmail();
    }

    @And("Kullanıcı 'Signup' butonuna tıklar.")
    public void click_Signup_Btn(){
        registerPage.clickSignupBtn();
    }

    @Then("Kullanıcı 'ENTER ACCOUNT INFORMATION' yazısının görünürlüğünü doğrular.")
    public void enter_account_visible(){
        registerPage.isEnterAccountInformationVisible();
    }

    @When("Kullanıcı Title,Name,Email,Password,Date of Birth bilgilerini girer.")
    public void fill(){
        registerPage.fillTitle();
        registerPage.enterPassword();
        registerPage.dateofbirth_day();
        registerPage.dateofbirth_month();
        registerPage.dateofbirth_year();
    }

    @And("Kullanıcı 'Sign up for our newsletter!' kutucuğunu seçer.")
    public void checkbox_Signup(){
        registerPage.checkboxSignup();
    }

    @And("Kullanıcı 'Receive special offers from our partners!' kutucuğunu seçer.")
    public void checkbox_Partner(){
        registerPage.checkboxPartner();
    }

    @When("Kullanıcı First name, Last name, Company, Adress, Adress2, Country, State, City,Zipcode,Mobile Number bilgilerini girer.")
    public void enter_info(){
        registerPage.enterFirstname();
        registerPage.enterLastname();
        registerPage.enterCompany();
        registerPage.enterAdress();
        registerPage.enterAdress2();
        registerPage.selectCountry();
        registerPage.enterState();
        registerPage.enterCity();
        registerPage.enterZipcode();
        registerPage.enterphoneno();
    }

    @And("Kullanıcı 'Create Account' butonuna tılar.")
    public void create_Account(){
        registerPage.createAccount();
    }

    @Then("Kullanıcı 'ACCOUNT CREATED!' yazısının görünürlüğünü doğrular.")
    public void verify_AccountCreated(){
        registerPage.verifyAccountCreated();
    }

    @When("Kullanıcı 'Continue' butonuna tıklar.")
    public void click_ContinueButton(){
        registerPage.clickContinueButton();
    }

    @Then("Kullanıcı 'Logged in as username' yazısının görünürlüğünü doğrular.")
    public void verify_UserIsLoggedIn(){
        registerPage.verifyUserIsLoggedIn();
    }

    @When("Kullanıcı 'Delete Account' butonuna tıklar.")
    public void click_DeleteAccountBtn(){
        registerPage.clickDeleteAccountBtn();
    }

    @Then("Kullanıcı 'ACCOUNT DELETED!' görünürlüğünü doğrular")
    public void verify_AccountDeleted(){
        registerPage.verifyAccountDeleted();
    }

    @And("Kullanıcı diğer 'Continue' butonuna tıklar.")
    public void click_ContinueButton2(){
        registerPage.clickContinueButton2();
    }
}
