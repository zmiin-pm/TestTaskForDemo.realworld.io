import Pages.MainPage;
import Pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test
    public void ShouldFilterRecordsByTag() {
        MainPage main = new MainPage().open("https://demo.realworld.io/");
        SearchResultsPage resultPage = main.clickOnTag();
        String currentTagText = main.getTagText();
        boolean isThereCurrentTag = resultPage.checkThatTagsContainsCurrentText(resultPage.getTagsTexts(), currentTagText);
        Assert.assertTrue(isThereCurrentTag);
    }

}
