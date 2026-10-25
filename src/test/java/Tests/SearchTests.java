package Tests;

import org.junit.Assert;
import org.junit.Test;

public class SearchTests extends BaseTests {

    @Test
    public void testUspesnaPretraga() {
        homePage.open();
        homePage.acceptCookies();
        homePage.searchForProduct("KALLAX");

        String trenutniUrl = driver.getCurrentUrl();
        Assert.assertTrue(trenutniUrl.contains("q=KALLAX"));

    }

    @Test
    public void testDodavanjeUKorpu() {
        homePage.open();
        homePage.acceptCookies();
        homePage.searchForProduct("jastuk");

        // Klik na prvi proizvod u rezultatima i dodavanje u korpu
        searchResultsPage.clickOnFirstResult();
        singleProductPage.addProductToCart();

        // Provera da je korpa ažurirana (npr. da se vidi broj 1 u korpi ili da pređe na korpu)
        boolean jeDodato = driver.getCurrentUrl().contains("cart") ||
                driver.getPageSource().contains("Proizvod je dodat") ||
                driver.getPageSource().contains("Korpa");

        Assert.assertTrue("Proizvod nije uspešno dodat u korpu!", jeDodato);

    }
}