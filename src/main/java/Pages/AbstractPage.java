package Pages;

import Driver.DriverHolder;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

    protected AbstractPage() {
        PageFactory.initElements(DriverHolder.INSTANCE.getDriver(), this);
    }

    protected AbstractPage open(String url) {
        DriverHolder.INSTANCE.getDriver().get(url);
        return this;
    }
}
