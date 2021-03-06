package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchResultsPage extends AbstractPage {

    @FindBy(css = ".article-preview .tag-list") // ul с li в блоке статьи
    List<WebElement> articlesTagList;

    // Достает текст тега из li и помещает в мапу (для ключей используется номер, начиная с 1)

    public Map<Integer, List<String>> getTagsTexts() {
        Map<Integer, List<String>> tagsValues = new HashMap<>();
        Integer counter = 0;
        for (WebElement element : articlesTagList) {
            List<String> tugs = element.findElements(
                    By.cssSelector(element.getTagName() + ">li"))
                    .stream().map(x -> x.getText()).collect(Collectors.toList());
            tagsValues.put(counter++, tugs);
        }
        return tagsValues;
    }

    // Перебирает Value мапы, проверяет что список тегов содежит текст

    public boolean checkThatTagsContainCurrentText(Map<Integer, List<String>> articleTugs, String text) {
        for (Map.Entry<Integer, List<String>> entry : articleTugs.entrySet()) {
            if (!entry.getValue().contains(text)) {
                return false;
            }
        }
        return true;
    }
}


