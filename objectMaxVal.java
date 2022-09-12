import java.util.*;
class Employee{
    String name;
    double salary;
    Employee(String name , double salary) {
        this.name =name;
        this.salary= salary;
        }
    
    }
class ObjectMaxVal {
	public static void main(String[] args) {
	    Employee e1= new Employee("anil", 12383);
	    Employee e2= new Employee("vaib", 12557);
	    Employee e3= new Employee("ritik", 12389);
	    Employee e4= new Employee("div", 12353);
	    Employee e5= new Employee("par", 12335);
	    Employee e6= new Employee("autl", 14543);
	    Employee e7= new Employee("vkgb", 19644);
	    Employee e8= new Employee("kgf", 13959);
	    Employee e9= new Employee("iop", 17553);
	    Employee e10= new Employee("tan", 18635);
	    
	    
	    
	    
	    Employee[] arr = new Employee[10];
	    arr[0]= e1;
	    arr[1]= e2;
	    arr[2]= e3;
	    arr[3]= e4;
	    arr[4]= e5;
	    arr[5]= e6;
	    arr[6]= e7;
	    arr[7]= e8;
	    arr[8]= e9;
	    arr[9]= e10;
	    
	    
	    
	    double ans=0;
	    int i = 0;
	    String name = " ";
	    
	    while (i<arr.length)
	    {
	        if (arr[i].salary>ans)
	        {
	            ans= arr[i].salary;
	            name= arr[i].name;
	            }
	            i++;
	        }
	        
	        System.out.println(ans+" "+name);
	    
	    
	    
	}
}