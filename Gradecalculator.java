package gradecalculator;
class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	void calculateGrade(int totalmarks) {
		getgrade(totalmarks);
	}
	void calculateGrade(int m1,int m2,int m3) {
		int average=(m1+m2+m3)/3;
		System.out.println("Average:"+average);
	}
	void calculateGrade(double gpa) {
		getgrade(gpa);
	}
	void getgrade(double value) {
		 String grade=" ";
		if(value>=90 || value>=9.0) {
			grade="A+";
		}else if(value>=80 || value>=8.0) {
			grade="A";
		}else if(value>=70 || value>=7.0) {
			grade="B+";
		}else if(value>=60 || value>=6.0) {
			grade="B";
		}else {
			grade="C";
		}
		System.out.println("Grade:"+grade);
			}
}
public class Main {
	public static void main(String[]args) {
		Student s1=new Student("Nancy",101);
		s1.calculateGrade(90);
		s1.calculateGrade(8.3);
		s1.calculateGrade(78,89,76);
		}
}
