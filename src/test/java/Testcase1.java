import org.testng.annotations.*;

public class Testcase1 {

	@BeforeSuite
	public void Beforesuite() {
        System.out.println("Before Suite passed");
	}
	
	@AfterSuite
	public void Aftersuite() {
        System.out.println("After Suite passed");
	}
	
	
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
    public void Test100() {
        System.out.println("Test100 is passed");
    }

    @Test
    public void Test200() {
        System.out.println("Test200 is passed");
    }

    @Test
    public void Test300() {
        System.out.println("Test300 is passed");
    }
}
