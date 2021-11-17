package core_java_Threads;

public class TestThreads extends Thread {
	private String name;

	public TestThreads(String name) {
		this.name=name;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i+"-->" +"hello"+"'"+ name);

		}
	}

	public static void main(String[] args) {
		TestThreads s = new TestThreads("sonu");
		TestThreads s1 = new TestThreads("mayank");
		s.start();
		s1.start();
	}
}
