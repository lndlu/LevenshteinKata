import org.junit.Assert;
import org.junit.Test;

public class AppTest {



    @Test
    public void appShouldLaunchProperly() {
        Assert.assertEquals(0, Application.plagiarismBlamer());
    }
}
