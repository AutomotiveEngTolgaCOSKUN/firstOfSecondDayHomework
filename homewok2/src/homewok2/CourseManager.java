package homewok2;

public class CourseManager {

	public void finishAndContinue(Course lessons) {

		System.out.println("Bitir ve devam et: " + lessons.name);

	}

	public void finishAndContinue(Category categories) {

		System.out.println(categories.id);
		System.out.println(categories.lessonProgram + " : Bitir ve devam et");
		System.out.println(categories.upload + " : Bitir ve devam et");
		System.out.println(categories.homework1 + " : Bitir ve devam et");
		System.out.println(categories.homework2 + " : Bitir ve devam et");
		System.out.println(categories.homework3 + " : Bitir ve devam et");
		System.out.println(categories.evalution + " : Bitir ve devam et");
		System.out.println("  ");

	}
}
