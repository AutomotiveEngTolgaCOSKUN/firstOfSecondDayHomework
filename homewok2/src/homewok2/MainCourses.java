package homewok2;

public class MainCourses {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giri� ��in Temel Kurs", "Engin Demiro�", 100);

		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 14);

		Course course3 = new Course(3, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (Java + REACT)", "Engin Demiro�", 50);

		Course[] courses = { course1, course2, course3 };

		for (Course lessons : courses) {

			System.out.println(lessons.id);
			System.out.println(lessons.name);
			System.out.println(lessons.instructor);
			System.out.println(lessons.percentageOfCompletion);
		}

		Category category1 = new Category("1.G�n-21 Nisan 2021", "Ders Program�", "1.G�n Sonu Kay�t", "�dev 1",
				"�dev 2", "�dev 3", "De�erlendirme");

		Category category2 = new Category("2.G�n-24 Nisan 2021", "Ders Program�", "2.G�n Sonu Kay�t", "�dev 1",
				"�dev 2", "...", "De�erlendirme");

		Category category3 = new Category("3.G�n-28 Nisan 2021", "Ders Program�", "3.G�n Sonu Kay�t", "�dev 1",
				"�dev 2", "...", "De�erlendirme");

		Category[] categories = { category1, category2, category3 };

		for (Category category : categories) {

			System.out.println(category.id);
			System.out.println(category.lessonProgram);
			System.out.println(category.upload);
			System.out.println(category.homework1);
			System.out.println(category.homework2);
			System.out.println(category.homework3);
			System.out.println(category.evalution);
			System.out.println("  ");

		}

		CourseManager courseManager2 = new CourseManager();
		courseManager2.finishAndContinue(course1);

		courseManager2.finishAndContinue(course2);

		courseManager2.finishAndContinue(course3);

		System.out.println("  ");

		CourseManager courseManager = new CourseManager();
		courseManager.finishAndContinue(category1);

		courseManager.finishAndContinue(category2);

		courseManager.finishAndContinue(category3);

	}

}
