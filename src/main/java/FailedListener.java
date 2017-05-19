import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by DenisShklyannik on 17.05.2017.
 */
public class FailedListener implements ITestListener{

    //@Attachment(value = "Screenshot", type = "image/png")
    //private byte[] takeScreenshot() {
    //    return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    //}

    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult result) {
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
