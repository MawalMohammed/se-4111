import static org.junit.Assert.*;

import org.junit.*;

public class SingletonTest {
	
	static Singleton sn ;
	
	@Before
	   public void setUpClass() {
	       sn=Singleton.getInstance();
	   }
	     
	@Test
	public void testSetConfig1() {
		sn.setConfig1(5);
		
		assertEquals (5, sn.getConfig1());
	}

}
