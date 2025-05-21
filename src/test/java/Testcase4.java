import org.testng.annotations.*;

public class Testcase4 {

	@BeforeMethod
	
	public void Beforemethod() {
        System.out.println("Before method passed");
	}
	
    @Test
    public void Test1000() {
        System.out.println("Test1000 is passed");
    }

    @Test
    public void Test1200() {
        System.out.println("Test1200 is passed");
    }

    @Test
    public void Test1500() {
        System.out.println("Test1500 is passed");
    }
}
