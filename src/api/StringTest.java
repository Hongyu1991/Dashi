package api;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		String str = new String("This is a unit test.");
		assertEquals("is", str.substring(2, 4));
	}

}
