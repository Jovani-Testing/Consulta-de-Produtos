package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    //map
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/section[4]/div[3]/div[1]/ul[1]/li[1]/a[1]/div[2]/h2[1]")
    private WebElement verificacaoNome;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/section[4]/div[2]/div[1]/p[1]")
    private WebElement resultadotaPesquisa;

    @FindBy(how = How.ID, using = "select-desktop-with-label")
    private WebElement clicarEmrelevancia;

    @FindBy(how = How.XPATH, using = "//*[@id=\"select-desktop-with-label\"]/option[1]")
    private WebElement ordenarPorMenorPreco;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/section[4]/div[3]/div[1]/ul[1]/li[1]/a[1]/div[2]/h2[1]")
    private WebElement RetornarNomeMenorPreco;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/main[1]/section[4]/div[3]/div[1]/ul[1]/li[1]/a[1]/div[2]/div[2]/div[1]/p[1]")
    private WebElement RetornarValorMenorPreco;

    @FindBy(how = How.XPATH, using = "//*[@id=\"select-desktop-with-label\"]/option[6]")
    private WebElement ordenarPorMaiorrPreco;


    @FindBy(how = How.XPATH, using = "")
    private WebElement RetonarMaiorPreco;


    //construtor
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }

    public void verificacaoDoNomeProduto() {
        String result = verificacaoNome.getText();
        System.out.println(result);

        if (result.contains("Dell") || result.contains("dell")) {
            System.out.println("Pesquisa realizada com sucesso !");
        } else {
            System.out.println("Não foi encontrado o item da pesquisa.");
        }
    }

    public void mostrarQuantidadeDeItensEncontrados() {
        String resposta = resultadotaPesquisa.getText();
        System.out.println("Informaçãoes sobre a pesquisa:" + " " + resposta);
    }

    public void clicarSetaOrdenacao() {
        clicarEmrelevancia.click();
        ordenarPorMenorPreco.click();
    }

    public void informacoesprodutoMenorPreco(){
        String nomeProduto =  RetornarNomeMenorPreco.getText();
        String precoProduto =  RetornarValorMenorPreco.getText();
        System.out.println("Produto encontrado:" + " " + nomeProduto);
        System.out.println("Preço do produto"    + " " + precoProduto);

    }
}




