package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import logic.Hello;

public class TestHello {
	@Test
	public void TestRetString(){
		Hello hello = new Hello();
		String hi = hello.retString();
		assertEquals("Hello",  hi);
	}
}
