package b_unused_stub;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;
import injects_mock_spy_issue.B;

@RunWith(MockitoJUnitRunner.class)
public class UnusedStubExample {

	@Mock
	private A a;

	@InjectMocks
	private B b;

	@Test
	public void unusedStub() {
		when(a.doSthOnA()).thenReturn(1);
//		when(a.doSthElseOnA(50)).thenReturn(42);

		assertSame(1, b.doSthB());
	}
}
