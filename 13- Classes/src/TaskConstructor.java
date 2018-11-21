
public class TaskConstructor {
	
	public String name;
	public int age;
	public char gender;
	public int year;
	public String course;
	public static String university="Cybertek";
	
    TaskConstructor(String name,int age,char gender,int year,String course){
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}

	
	public void attendLecture() {
		System.out.println(name+" is attending lecture at "+university);
	}
	public void submitAssignment() {
		System.out.println(name+" is submitting assignments "+university);
	}
	public void attendLab() {
		System.out.println(name+" is attending lab "+university);
	}
	
}
