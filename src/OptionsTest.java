import static org.junit.Assert.*;

import org.junit.Test;

public class OptionsTest {

	@Test
	public void test() {
		Options op = new Options("Test",1000);
		assertEquals(1000, op.price);
	}

}
