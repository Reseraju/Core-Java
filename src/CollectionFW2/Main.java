package CollectionFW2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
 
	public static void main(String[] args) {
		
		
//		List <Student>users= new ArrayList();
//		Student s1= new Student(101,"asha",20.0);
//		Student s2= new Student(104,"jay",20.0);
// 
//		Student s3= new Student(108,"ajay",20.0);
// 
//		Student s4= new Student(109,"arti",20.0);
// 
//		Student s5= new Student(1099,"kavita",20.0);
//		users.add(s1);
//		users.add(s2);
// 
//		users.add(s3);
// 
//		users.add(s4);
//		users.add(s5);
		
		
		
//		Collections.sort(users, (o1, o2) -> o1.Roll - o2.Roll);
		
//		Collections.sort(users, (o1, o2) -> o1.getName().compareTo(o2.getName()));
// 
//		
//		   for(Student s : users)
//		   {
//			   System.out.println(s.toString());
//		   }
		
		List <String>users=new ArrayList();
		users.add("asha");
		users.add("jatin");
		users.add("kavita");
		users.add("deepa");
		users.add("parul");
//		users.stream().filter((temp)-> temp.startsWith("a")).forEach((i)->System.out.println(i));
		
		//users.stream().filter((temp) -> temp.equalsIgnoreCase("asha")).forEach((i) -> System.out.println(i));
		
		
		List <Student>users1= new ArrayList();
		Student s1= new Student(101,"asha",20.0);
		Student s2= new Student(104,"jay",80.0);
 
		Student s3= new Student(108,"ajay",70.0);
 
		Student s4= new Student(109,"arti",20.0);
 
		Student s5= new Student(1099,"kavita",90.0);
		users1.add(s1);
		users1.add(s2);
 
		users1.add(s3);
 
		users1.add(s4);
		users1.add(s5);
		
//		List<Student> passedStudents = users1.stream().filter(temp -> temp.getMarks() > 30).collect(Collectors.toList());
//		passedStudents.forEach(temp -> System.out.println(temp.getName() + " - Marks: " + temp.getMarks()));
		
		
		users1.stream()
		.sorted(Comparator.comparingInt(Student::getRoll))
		.forEach(System.out::println);
				
		System.out.println("----------------------------------------------------------");
				
		users1.stream()
		.sorted(Comparator.comparing(Student::getName))
		.forEach(System.out::println);
				
		System.out.println("----------------------------------------------------------");
		Student maxStudent = users1.stream()
		.max(Comparator.comparingDouble(Student::getMarks))
		.orElse(null);  // Returns null if the list is empty
		 
		if (maxStudent != null) {
		System.out.println("Student with highest marks: " + maxStudent);
		} else {
		System.out.println("No students available.");
		}
		
	}
 
}
 
 

 
 