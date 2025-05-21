import org.testng.annotations.*;

public class Testcase2 {

	@BeforeClass
	public void Beforeclass() {
        System.out.println("Before class passed");
	}
	
	@AfterClass
	public void Afterclass() {
        System.out.println("After class passed");
	}
	
	@BeforeMethod
	
	public void Beforemethod() {
        System.out.println("Before method passed");
	}
	
	@AfterMethod
	
	public void Aftermethod() {
        System.out.println("After method passed...\n");
	}
	
    @Test
    public void Test400() {
        System.out.println("Test400 is passed");
    }

    @Test
    public void Test500() {
        System.out.println("Test500 is passed");
    }

    @Test
    public void Test600() {
        System.out.println("Test600 is passed");
    }
}
