
public class MainTaskCunstructor {

	public static void main(String[] args) {
	TaskConstructor student1 = new TaskConstructor("Mike", 25, 'M', 2017, "Java");
		
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();
		
		TaskConstructor student2 = new TaskConstructor("Smith", 22, 'F', 2018, "JavaSC");
		System.out.println(student2.university);
		student2.attendLecture();
		student2.attendLab();
		student2.submitAssignment();

	}

}
