package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.*;

import pages.HomeBlogPage;
import utils.ConfigWeb;

public class HomeBlogSteps {

    ConfigWeb configWeb = new ConfigWeb();

    @Dado("que acessei o site da Blog do Agi")
    public void openBlogAgi() {
        configWeb.getDriver().getCurrentUrl();
    }

    @Quando("clico no botão 'abrir pesquisa de artigos")
    public void openBottonSearch() {
        HomeBlogPage homeBlogPage = new HomeBlogPage();
        homeBlogPage.clickBtnSearchOpen();
    }

    @Entao("devo visualizar o campo de 'Pesquisa'")
    public void verifyVisibleSearchField() {
        HomeBlogPage homeBlogPage = new HomeBlogPage();
        assertTrue(homeBlogPage.isVisibleSearchField());
    }

}
