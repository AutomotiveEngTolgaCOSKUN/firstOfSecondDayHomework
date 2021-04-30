package homewok2;

public class Category {

	public Category() {
		System.out.println("  ");

	}

	public Category(String id, String lessonProgram, String upload, String homework1, String homework2,
			String homework3, String evalution) {

		this();
		this.id = id;
		this.lessonProgram = lessonProgram;
		this.upload = upload;
		this.homework1 = homework1;
		this.homework2 = homework2;
		this.homework3 = homework3;
		this.evalution = evalution;

	}

	String id;
	String lessonProgram;
	String upload;
	String homework1;
	String homework2;
	String homework3;
	String evalution;

}
