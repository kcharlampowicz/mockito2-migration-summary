package c_avoid_stubing_in_superclasses;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.C;

//@RunWith(MockitoJUnitRunner.Silent.class)
@RunWith(MockitoJUnitRunner.class)
public class SubClassWithoutMockUsage extends AbstractTest {

	@Mock
	private C c;

	@Test
	public void testWithoutMock() {
		when(c.doSthC()).thenReturn(987);

		assertEquals(987, c.doSthC());
	}
}
