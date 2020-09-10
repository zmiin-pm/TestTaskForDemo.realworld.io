package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends AbstractPage {

    @FindBy(css = ".sidebar .tag-list a")
    private List<WebElement> tagsFromSideBar;

    private WebElement tag;

    public MainPage open(String url) {
        super.open(url);
        return this;
    }

    public SearchResultsPage clickOnTag() {
        tag = tagsFromSideBar.get(15);
        tag.click();
        return new SearchResultsPage();
    }

    public String getTagText() {
        return tag.getText();
    }
}
