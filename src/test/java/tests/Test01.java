package tests;

import driver.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.SearchPage;

public class Test01 {
    private WebDriver driver;

    @Before
    public void criarDriver() {
        Driver wdriver = new Driver();
        driver = wdriver.WebDriver();
    }

    @org.junit.Test
    public void realizarPesquisaDePrduto() {

        String produto ="notebook dell";

        HomePage homePage = new HomePage(driver);
        homePage.caixaDePequisa("notebook dell");
        homePage.confirmarPesquisa();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.verificacaoDoNomeProduto();

    }

    @After
    public void fecharDriver() {
        driver.close();
        driver.quit();
    }
}