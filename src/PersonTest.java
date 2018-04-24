import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		
		Person person = new Person("Ramesh");
		assertEquals("Ramesh", person.name);
	}

}
