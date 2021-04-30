package homewok2;

public class MainCourses {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð", 100);

		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 14);

		Course course3 = new Course(3, "Yazýlým Geliþtirici Yetiþtirme Kampý (Java + REACT)", "Engin Demiroð", 50);

		Course[] courses = { course1, course2, course3 };

		for (Course lessons : courses) {

			System.out.println(lessons.id);
			System.out.println(lessons.name);
			System.out.println(lessons.instructor);
			System.out.println(lessons.percentageOfCompletion);
		}

		Category category1 = new Category("1.Gün-21 Nisan 2021", "Ders Programý", "1.Gün Sonu Kayýt", "Ödev 1",
				"Ödev 2", "Ödev 3", "Deðerlendirme");

		Category category2 = new Category("2.Gün-24 Nisan 2021", "Ders Programý", "2.Gün Sonu Kayýt", "Ödev 1",
				"Ödev 2", "...", "Deðerlendirme");

		Category category3 = new Category("3.Gün-28 Nisan 2021", "Ders Programý", "3.Gün Sonu Kayýt", "Ödev 1",
				"Ödev 2", "...", "Deðerlendirme");

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
