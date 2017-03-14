package injects_mock_spy_issue;

public class C {

	private B b;

	public int doSthC() {
		return b.doSthB();
	}
}
