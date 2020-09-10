import Driver.DriverHolder;
import Driver.DriverType;
import Pages.MainPage;
import Pages.SearchResultsPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

//    protected static MainPage mainPage;
//    protected static SearchResultsPage resultsPage;

    @BeforeSuite
    public void beforeSuite() {
        DriverHolder.INSTANCE.initDriver(
                DriverType.CHROME,
                10,  // implicitly
                0); // explicitly
    }

    @AfterSuite
    public void afterSuite() {
        DriverHolder.INSTANCE.getDriver().quit();
    }
}
