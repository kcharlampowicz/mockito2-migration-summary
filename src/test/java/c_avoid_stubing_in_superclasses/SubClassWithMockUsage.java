package c_avoid_stubing_in_superclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubClassWithMockUsage extends AbstractTest {

	@Test
	public void testB() {
		assertSame(42, b.doSthB());
	}
}
