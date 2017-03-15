package e_deprecated_api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import injects_mock_spy_issue.A;

@RunWith(MockitoJUnitRunner.class)
public class DeprecatedApi {

	@Mock
	private A a;

	@Test
	public void deprecatedMatchers() {
//		org.mockito.Matchers.any(); //class is deprecated now
//		org.mockito.ArgumentMatchers.any(); //should be used instead
	}

	public void deprecatedAnyVargs() {
/*		anyVargs should by replaced by any()*/

//		Matchers.anyVararg();
//		ArgumentMatchers.any();
	}

	public void deprecatedHamcrestMatchers() {
/*		In order to use Hamcrest matchers we should use:
		org.mockito.hamcrest.MockitoHamcrest*/

//		Matchers.argThat(new IsNull<>());
//		org.mockito.hamcrest.MockitoHamcrest.argThat(new IsNull<>());
	}

	public void argumentInvocationOnMock() {
//		doAnswer(new Answer() {
//			@Override
//			public Object answer(InvocationOnMock invocation) throws Throwable {
//				return invocation.getArgumentAt(0, Object.class);
//			}
//		}).when(a);
	}

}
