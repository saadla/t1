package demoUtest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestCalc {
	
	Calc c = new Calc();
	
	@Test
	void TestAdd() {
		int ex = 10;
		int r = c.add(5, 5);
		Assert.assertEquals(ex, r);
		
	}
	
	@Test
	void TestAbc() {
		String ex = null;
		String r = c.abc();
		Assert.assertEquals(ex, r);
		
	}
}
