package injects_mock_spy_issue;

public interface A {
	int doSthOnA();

	default int doSthElseOnA(Integer value) {
		if (value != null && value > 50) {
			return 1;
		}
		return 42;
	}
}
