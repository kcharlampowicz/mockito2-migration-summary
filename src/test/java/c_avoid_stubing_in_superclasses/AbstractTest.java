package c_avoid_stubing_in_superclasses;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;
import injects_mock_spy_issue.B;

@RunWith(MockitoJUnitRunner.class)
public abstract class AbstractTest {
	@Mock
	private A a;

	@InjectMocks
	B b;

	@Before
	public void initMocks() {
		when(a.doSthOnA()).thenReturn(42);
	}
}
