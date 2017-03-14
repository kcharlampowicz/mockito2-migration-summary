package e_deprecated_api;

import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;

@RunWith(MockitoJUnitRunner.class)
public class DeprecatedApi {

	@Mock
	private A a;

	public void deprecatedMatchers() {
/*		org.mockito.Matchers class is deprecated now
		org.mockito.ArgumetnMatchers should be used instead*/

		when(a.doSthElseOnA(Matchers.anyInt())).thenReturn(0);
	}

	public void deprecatedAnyVargs() {
/*		anyVargs should by replaced by any()*/

		Matchers.anyVararg();// -> ArgumentMatchers.any();
	}

	public void deprecatedHamcrestMatchers() {
/*		In order to use Hamcrest matchers we should use:
		org.mockito.hamcrest.MockitoHamcrest*/

//		Matchers.argThat(new IsNull<>());
//		org.mockito.hamcrest.MockitoHamcrest.argThat(new IsNull<>());
	}

	public void argumentInvocationOnMock() {
		doAnswer(invocation -> {
//			return invocation.getArgumentAt(0, Object.class)
//			return invocation.getArgument(0);
			return null;
		}).when(a);
	}

}
