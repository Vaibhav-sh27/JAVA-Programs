import java.util.*;
//import java.util.Arryas;

class empl{
    int age;
    String name;
    
    //constructor-->
    
    empl(String name, int age){
        this .name= name;
        this.age = age;
        
        }
    }
class Main {
	public static void main(String[] args) {
//		int[] A= {10,20,45};
		
//		int[] A;
//		A= new int[5];
//		//A[0]= 98;
//		A={10,20,45}; //Wrong method!!
		
//		
//		
//		
//		
//		int[] B[] = new int[2][2];
//		B[0][0]= 9;
//		System.out.println(Arrays.toString(A));        System.out.println(Arrays.toString(B[0]));
//		
//		
//		int [] [] C= new int[4][];
//		C[0]= new int[5];
//		C[1]= new int[3];
//		C[2]= new int[2];
//		C[3]= C[2];
//		C[2][0]= 100;
//		C[2][1]= 300;
//		System.out.println(Arrays.toString(C[3]));
//		
//		
//		
//		int [][][] D= new int[12][][];
//		D[0]= new int[23][];
//		
		
		
		//empl[] e = new empl[5];
//		e[0]= new empl();
//		e[1]= new empl();
//		e[2]= new empl();
//		e[3]= new empl();
//		e[4]= new empl();
//		System.out.println(Arrays.toString(e));
//		e[0].name= "anil";
//		e[0].age= 45;
//		
//		e[1].name= "a";
//		e[1].age= 67;
//		
//		e[2].name= "hh";
//		e[2].age= 85;
//		
//		e[3].name= "kk";
//		e[3].age= 65;
		//System.out.println("name :"+ e[0].name+ "Age :"e[0].age);
		
		//for (int i=0; i<e.length;i++){
//		    System.out.println(e[i].name+ " "+e[i].age);
//		}
		
		
		//for (empl x:e){
//		    System.out.println("name : "+ x.name +"  age : "+ x.age);
//		}


        //--->>command Line Argument
        //System.out.println("length of argument = "+ args.length);
//        System.out.println(Arrays.toString(args));
        
        
        
        
        //Constructor--->>
        
        empl[] e = new empl[5];
		e[0]= new empl("abc",45);
		e[1]= new empl("hehe", 67);
		e[2]= new empl("joe",69);
		e[3]= new empl("yu",87);
		e[4]= new empl("trii",56);
		System.out.println(e[0].name);
		
		//Array type casting--->>
		
		//wrong--->>
//		char [] c= {'a','b'};
//		int [] x = c;

           // Right ---->>
//           String [] s= {"A","B"};
//           Object[] o= s;
		
	}
}