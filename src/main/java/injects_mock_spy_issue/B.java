package injects_mock_spy_issue;

public class B {
	private A dependencyA;

	public int doSthB() {
		return dependencyA.doSthOnA();
	}

}