import Pages.MainPage;
import Pages.SearchResultsPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne extends BaseTest {

    @Test
    @Description("Check that records are filtered after 15 tag click")
    public void ShouldFilterRecordsByTag() {
        MainPage main = new MainPage().open("https://demo.realworld.io/");
        SearchResultsPage resultPage = main.clickOnTag(15);
        String currentTagText = main.getTagText();
        boolean isThereCurrentTag = resultPage.checkThatTagsContainCurrentText(resultPage.getTagsTexts(), currentTagText);
        Assert.assertTrue(isThereCurrentTag);
    }
}
