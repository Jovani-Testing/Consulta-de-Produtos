package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


    //map
    private WebDriver driver;

    @FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/main/section[1]/div[2]/header/div/div[1]/ul[1]/li[1]/a")
    private WebElement nossasLojas;

    @FindBy(how = How.CSS, using = "sc-iUKqMP fDNgum sc-cBIieI bgScgT sc-cBIieI bgScgT")
    private WebElement tenhaSuaLoja;

    @FindBy(how = How.CSS, using = "sc-iUKqMP fDNgum sc-cBIieI bgScgT sc-cBIieI bgScgT")
    private WebElement regulamentos;

    @FindBy(how = How.CSS, using = "sc-iUKqMP fDNgum sc-cBIieI bgScgT sc-cBIieI bgScgT")
    private WebElement acessibilidade;

    @FindBy(how = How.CSS, using = "sc-iUKqMP fDNgum sc-cBIieI bgScgT sc-cBIieI bgScgT")
    private WebElement guiaDeSeguranca;

    @FindBy(how = How.CSS, using = "sc-iUKqMP fDNgum sc-cBIieI bgScgT sc-cBIieI bgScgT")
    private WebElement atendimento;

    @FindBy(how = How.CSS, using = "sc-iUKqMP eeYgXG sc-wkwDy fEdSMd sc-wkwDy fEdSMd")
    private WebElement cadastro;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/section[1]/div[2]/header[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")
    private WebElement barraDePesquisa;

    @FindBy(how = How.XPATH, using = "(//*[name()='svg'][@class='sc-dkPtRN gQoOew'])[1]")
    private WebElement lupaPesquisa;


    //Construtor
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void acessarNossaslojas() {
        nossasLojas.click();
    }

    public void tnhaSualoja() {
        tenhaSuaLoja.click();
    }

    public void Regulamentos() {
        regulamentos.click();
    }

    public void Acessibilidade() {
        acessibilidade.click();
    }

    public void GuiaDeSeguranca() {
        guiaDeSeguranca.click();
    }

    public void Cadastro() {
        cadastro.click();
    }

    public void Atendimento() {
        atendimento.click();
    }

    public void caixaDePequisa(String produto) {
        barraDePesquisa.sendKeys(produto);
    }

    public void confirmarPesquisa() {
        lupaPesquisa.click();
    }


}
