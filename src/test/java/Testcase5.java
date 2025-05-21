import org.testng.annotations.*;

public class Testcase5 {

	@BeforeMethod
	
	public void Beforemethod() {
        System.out.println("Before method passed............");
	}
	
    @Test
    public void Test1800() {
        System.out.println("Test1800 is passed");
    }

    @Test
    public void Test2100() {
        System.out.println("Test2100 is passed");
    }

    @Test
    public void Test2400() {
        System.out.println("Test2400 is passed");
    }
}
