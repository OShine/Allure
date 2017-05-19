import org.testng.Assert;

/**
 * Created by DenisShklyannik on 17.05.2017.
 */

public class Mathematics {


    private int result;

    public void add(int x, int y) {
        if (result != 0) {
            Assert.fail("Before make operations, you should set result variable to zero.");
        }
        result = x + y;
    }

    public void deduct(int x, int y) {
        if (result == 0) {
            Assert.fail("Before make operations, you should set result variable to zero.");
        }
        result = x - y;
    }

    public void multiply(int x, int y) {
        if (result != 0) {
            Assert.fail("Before make operations, you should set result variable to zero.");
        }
        result = x * y;
    }

    public void divide(int x, int y) {
        if (result != 0) {
            Assert.fail("Before make operations, you should set result variable to zero.");
        }
        result = x / y;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int number) {
        result = number;
    }
}