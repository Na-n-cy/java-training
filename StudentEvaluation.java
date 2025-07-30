package Encapsulation;

 interface Evaluable {
 double calculateFinalGrade(); 
}
class Student implements Evaluable {
 private String name;
 private int rollNumber;
 private double quizScore;
 private double assignmentScore;
 private double projectScore;
 public Student(String name, int rollNumber, double quizScore, double assignmentScore, double projectScore) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.quizScore = quizScore;
     this.assignmentScore = assignmentScore;
     this.projectScore = projectScore;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 public double getQuizScore() {
     return quizScore;
 }

 public void setQuizScore(double quizScore) {
     this.quizScore = quizScore;
 }

 public double getAssignmentScore() {
     return assignmentScore;
 }

 public void setAssignmentScore(double assignmentScore) {
     this.assignmentScore = assignmentScore;
 }

 public double getProjectScore() {
     return projectScore;
 }

 public void setProjectScore(double projectScore) {
     this.projectScore = projectScore;
 }
 public double calculateFinalGrade() {
     return (quizScore * 0.2) + (assignmentScore * 0.3) + (projectScore * 0.5);
 }
}

public class StudentEvaluation {
	    public static void main(String[] args) {
	      
	        Student student = new Student("Alice", 101, 85, 90, 95);
	        System.out.println("Student: " + student.getName());
	        System.out.println("Roll No: " + student.getRollNumber());
	        System.out.println("Final Grade: " + student.calculateFinalGrade());
	    }
	}


