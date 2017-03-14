package a_spy_inject_mocks;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

@Ignore
public class ArgumentShouldBeAMockButIsTest {

	// Inject here
	static class A {
		private B b;
	}

	// Inject here also
	static class B {
		private C c;
	}

	// Some dependency
	static class C {
	}

	@InjectMocks
	private final A a = new A();

	@Spy
	@InjectMocks
	private final B b = new B();

	@Mock
	private C c;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	//Test passed
	public void testArgumentShouldBeAMockButIsNonMock() {
		b.toString();
	}
}