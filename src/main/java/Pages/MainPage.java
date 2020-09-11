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

//  Метод выбирает тег из бокового меню по его порядковому номеру

    public SearchResultsPage clickOnTag(int number) {
        tag = tagsFromSideBar.get(number);
        tag.click();
        return new SearchResultsPage();
    }

// Возвращает текст тега который был нажат

    public String getTagText() {
        return tag.getText();
    }
}
