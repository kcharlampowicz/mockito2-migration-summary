package d_anyX_dont_accept_null_anymore;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;

@RunWith(MockitoJUnitRunner.class)
public class AnyWithNull {

	@Mock
	private A a;

	@Test
	public void test() {
		when(a.doSthElseOnA(any())).thenReturn(1);
		//T anyT() / <T> any(Class<T>) are no null
		//anyString, anyInt, anyObject, etc...
		assertEquals(1, a.doSthElseOnA(1));
	}
}
