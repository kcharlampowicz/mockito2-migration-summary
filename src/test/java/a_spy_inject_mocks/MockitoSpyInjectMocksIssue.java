package a_spy_inject_mocks;

import static junit.framework.TestCase.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;
import injects_mock_spy_issue.B;
import injects_mock_spy_issue.C;

@RunWith(MockitoJUnitRunner.class)
public class MockitoSpyInjectMocksIssue {
	@Mock
	private A mockA;
	@Spy
	@InjectMocks
	private B spyB = new B();
	@InjectMocks
	private C sut;

	@Test
	public void testMethod() {
		when(mockA.doSthOnA()).thenReturn(42);

		assertSame(42, sut.doSthC());
	}
}
