package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.HomeBlogPage;
import pages.ResultSearchPage;

import static org.junit.Assert.assertTrue;

public class ResultSearchTest {

    @E("clico no botão abrir pesquisa de artigos do blog")
    public void openBTNSearch() {
        HomeBlogPage homeBlogPage = new HomeBlogPage();
        homeBlogPage.clickBtnSearchOpen();
    }

    @Quando("^insiro os dados no campo de 'Pesquisa' \"([^\"]*)\"$")
    public void inputSearch(String search) {
        HomeBlogPage homeBlogPage = new HomeBlogPage();
        homeBlogPage.setInputSearchField(search);
    }

    @E("clico no botão 'Submit'")
    public void clickBtnSubmit() {
        HomeBlogPage homeBlogPage = new HomeBlogPage();
        homeBlogPage.clickBtnSubmit();
    }

    @Entao("^devo visualizar os resultados da busca por \"([^\"]*)\"$")
    public void verifyResultSearch(String search) {
        ResultSearchPage resultSearchPage = new ResultSearchPage();
        assertTrue(resultSearchPage.getResultsSearch(search));
    }
}
