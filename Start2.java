import java.util.Scanner;


class Student{
    private String name;
    byte age;
    int roll;
    static double rate = 13;
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
            return name ;
    }
    
}
public class Start2 {
	public static void main(String[] args) {
		//Scanner sc;
//		sc= new Scanner(System.in);
//		System.out.print("Enter Name");
//		String name = sc.next();
//		String nam = sc.nextLine();
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//s2.name = "Hehe";
//		s1.name = "goo";
        s1.setName("jaaaaa=");
        Student.rate= 12;
        //s1= s2;
		System.out.println("Name : "+s1.getName());
		System.out.println("age : "+s2.age);
		System.out.println("roll : "+s1.roll);
		System.out.println("rate : "+s2.rate);
	}
}