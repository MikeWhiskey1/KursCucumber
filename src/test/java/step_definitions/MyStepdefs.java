package step_definitions;

import cucumber.api.java.en.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyStepdefs {


    private WebDriver driver;


    // my function which includes delays after steps
    private void waitt(int timee) {
        try {Thread.sleep(timee);}
        catch (InterruptedException ex) {Thread.currentThread().interrupt();}
    }


    @Given("something is done")
    public void somethingIsDone() {
        System.out.println("Udalo sie skonfigurowac Ogorka");
    }

    @When("{string} is printed")
    public void isPrinted(String parameter) {
        System.out.println(parameter);
    }

    @And("{int} is printed correctly")
    public void isPrintedCorrectly(int parameter) {
        int i = parameter + 3;
        System.out.println(i);
    }


//    @But("we can use a list a well")
//    public void weCanUseAListAWell(List<String> list) {
//        for (String animal : list)
//            System.out.println(animal);
//    }


    // lub Java 8
    @But("we can use a list a well")
    public void weCanUseAListAWell(List<String> list) {
        list.forEach(System.out::println);
//        list.forEach(s -> System.out.println(s));
    }

    @Given("people trying singing")
    public void peopleTryingSinging() {
        System.out.println("***singing***");
    }

    @When("now (.*) trying")
    public void nowPersonTrying(String person) {
        System.out.println("***" + person + "***");
    }

    @Then("sings (.*)")
    public void singsHow(String how) {
        System.out.println("***" + how + "***");
    }






    @Given("an open browser with google.com")
    public void anOpenBrowserWithGoogleCom() {
        System.setProperty("webdriver.chrome.driver", "/home/miki/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.pl");

    }


    @When("{string} word has been written into input field and submitted")
    public void wordHasBeenWrittenIntoInputFieldAndSubmitted(String input) {
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys((input));
        inputField.submit();
    }

    @And("close browser")
    public void closeBroser() {
        driver.quit();
    }

    @Then("the first one contains {string} result")
    public void theFirstOneContainsResult(String parameter) {
//        System.out.println(parameter);
//        List<WebElement> elements = driver.findElements(By.cssSelector(".rc"));
//        assertTrue(elements.get(1).getText().contains(parameter));

        // lub
        List<WebElement> elements = driver.findElements(By.cssSelector(".rc"));
        for (WebElement element : elements) {
            assertTrue(element.getText().contains(parameter));
        }

        //lub
//        elements.forEach(webElement -> assertTrue(webElement.getText().contains(parameter)));

    }







    @Given("there is browser opened with the home page {string}")
    public void thereIsBrowserOpenedWithTheHomePage(String url) {
        System.setProperty("webdriver.chrome.driver", "/home/miki/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("user click on registration button")
    public void userClickOnRegistrationButton() {
        driver.findElement(By.cssSelector(".bodytxt a")).click();
    }

    @Then("user is on registration page")
    public void userIsOnRegistrationPage() {
        assertEquals("Add New User", driver.getTitle());
    }


    @When("user fills all mandatory fields")
    public void userFillsAllMandatoryFields(List<String> inputValues) {
        driver.findElement(By.name("first_name")).sendKeys(inputValues.get(0));
        driver.findElement(By.name("last_name")).sendKeys(inputValues.get(1));
        driver.findElement(By.name("email")).sendKeys(inputValues.get(2));
        driver.findElement(By.name("user_name")).sendKeys(inputValues.get(3));
        driver.findElement(By.name("address1")).sendKeys((inputValues.get(4)));
        driver.findElement(By.name("address2")).sendKeys((inputValues.get(5)));
        driver.findElement(By.name("phone")).sendKeys((inputValues.get(6)));
        driver.findElement(By.name("city")).sendKeys((inputValues.get(7)));
        driver.findElement(By.name("prov")).sendKeys((inputValues.get(8)));
        driver.findElement(By.name("zip")).sendKeys((inputValues.get(9)));
        driver.findElement(By.name("password")).sendKeys((inputValues.get(10)));
        driver.findElement(By.name("Submit")).click();
        driver.quit();


    }


    @Given("repeating there is browser opened with the home page {string}")
    public void repeatingThereIsBrowserOpenedWithTheHomePage(String url) {
        System.setProperty("webdriver.chrome.driver", "/home/miki/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


    @When("repeating user click on registration button")
    public void repeatingUserClickOnRegistrationButton() {
        driver.findElement(By.cssSelector(".bodytxt a")).click();
    }

    @Then("repeating user is on registration page")
    public void repeatingUserIsOnRegistrationPage() {
        assertEquals("Add New User", driver.getTitle());
    }

    @When("repeating user fills (.*) (.*) (.*) (.*) (.* .*) (.* .*) (.*) (.*) (.*) (.*) (.*)")
    public void repeatingUserFillsFnLn(String fn, String ln, String email, String userName,
                                       String addr1, String addr2, String phone, String city, String prov, String zip,
                                       String pass) {
        driver.findElement(By.name("first_name")).sendKeys(fn);
        driver.findElement(By.name("last_name")).sendKeys(ln);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("user_name")).sendKeys(userName);
        driver.findElement(By.name("address1")).sendKeys(addr1);
        driver.findElement(By.name("address2")).sendKeys(addr2);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("prov")).sendKeys(prov);
        driver.findElement(By.name("zip")).sendKeys(zip);
        driver.findElement(By.name("password")).sendKeys(pass);
        driver.findElement(By.name("Submit")).click();
        waitt(5000);
        driver.quit();

    }


    @Given("zadII there is browser opened with the home page {string}")
    public void zadiiThereIsBrowserOpenedWithTheHomePage(String url) {        System.setProperty("webdriver.chrome.driver", "/home/miki/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("zadII user click on registration button")
    public void zadiiUserClickOnRegistrationButton() {
        driver.findElement(By.cssSelector(".bodytxt a")).click();
    }

    @Then("zadII user is on registration page")
    public void zadiiUserIsOnRegistrationPage() {
        assertEquals("Add New User", driver.getTitle());
    }

    @And("zadII Entering")
    public void zadiiEntering(DataTable mydata) {
        List<List<String>> list = mydata.asLists(String.class);
        for(List<String> element : list) {
            driver.findElement(By.name(element.get(0))).sendKeys(element.get(1));
            waitt(3000);
        }
    }
}