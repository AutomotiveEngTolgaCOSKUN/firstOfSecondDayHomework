package homewok2;

public class Course {

	public Course() {
		System.out.println("Courses");

	}

	public Course(int id, String name, String instructor, double percentageOfCompletion) {

		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.percentageOfCompletion = percentageOfCompletion;

	}

	int id;
	String name;
	String instructor;
	double percentageOfCompletion;

}
