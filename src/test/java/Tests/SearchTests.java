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


}