
public class TaskConstructor {
	
	public String name;
	public int age;
	public char gender;
	public String course;
	public int year;
	public static String university="Cybertek";
	//public String university;
	
	public TaskConstructor(String studentName,int studentAge,char studentGender,String studentCourse,int studentYear) {
		name=studentName;
		age=studentAge;
		gender=studentGender;
		course=studentCourse;
		year=studentYear;
		//university=studentUniversity;
	}
	
	public void attendLecture() {
		System.out.println(name + " is attending" + course + " lecture" + " at " +  university);
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submitting" + course + " assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " is attending" + course + " lab");

	}
}
