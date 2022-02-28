package tests;

import driver.Driver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.SearchPage;

public class Tests02 {
    private WebDriver driver;

    @Before
    public void criarDriver() {
        Driver wdriver = new Driver();
        driver = wdriver.WebDriver();
    }

    @org.junit.Test
    public void realizarPesquisaDePrduto() {

        String produto = "Celular motorola";
        HomePage homePage = new HomePage(driver);
        homePage.caixaDePequisa("Celular motorola");
        homePage.confirmarPesquisa();

        SearchPage searchPage = new SearchPage(driver);
        searchPage.mostrarQuantidadeDeItensEncontrados();
        System.out.println("Busca:" + "" + produto);

        searchPage.clicarSetaOrdenacao();
        searchPage.informacoesprodutoMenorPreco();


    }
    @After
    public void fecharDriver() {
        driver.close();
        driver.quit();
    }
}
