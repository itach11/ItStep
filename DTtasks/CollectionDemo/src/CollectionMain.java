import java.io.IOException;
import java.util.*;

import com.student.Student;

public class CollectionMain 
{
   public static void main(String [] args)
   {
	   CollectionImplement collection = new CollectionImplement();
	   Scanner scanner = new Scanner(System.in);
	   List<Student> list =null;
		Set<Student> set =null;
	   Map <Integer,Student> map=null;
	   System.out.printf("Hello, your file contains information about company employees. %n"
	   + "What information you want to get for your specific needs.%n "
	   + "Please select a type of collection according to your needs.%n ");
	    
	   System.out.printf("Please enter: %n"
	   + "\"Print all\" for printing all employyes names.%n" //Array list
	   + "\"Print all by order of input\" for printing all employyes names by order of input.%n" //Linked list
	   + "\"Print unique\" prints all unique names.%n"// Hash set
	   + "\"Print unique\" prints all unique names by order of input.%n"// Linked Hash Set
	   + "\"Print employees by department\" - prints all names by department and by order of input of department.%n"// Hash Map
	   + "\"Print employees by department\" - prints all names by department and by order of input of department.%n" //Linked Hash Map
	   + "\"Print employees ordered by department\" - prints all names by department. Department names are ordered in ascending order%n");// Tree Map

	   
	  try { 
	 byte choise;
	 
	 do
	 {
		System.out.println("Choose: ");
		 choise = scanner.nextByte();
	
	 }
	while(choise>7||choise<1);


	 try {
		switch (choise)
		{
			case 1 : list= (ArrayList<Student>) collection.readFile(choise);break;
			case 2 :  list= (LinkedList<Student>) collection.readFile(choise);break;
			case 3 : set= (HashSet<Student>) collection.readFile(choise);break;
			case 4  : set = (LinkedHashSet<Student>) collection.readFile(choise);break;
			case 5 : map = (HashMap<Integer,Student>) collection.readFileMap(choise);break;
			case 6: map = (LinkedHashMap<Integer,Student>) collection.readFileMap(choise);break;
			case 7:  map = (TreeMap<Integer,Student>) collection.readFileMap(choise);break;
		}

	  
	  
	  } catch (IOException e) {
		
		e.printStackTrace();
	}
	  }

	  finally {
		scanner.close();
	}

	   System.out.println(list);
	   System.out.println(set);
	   System.out.println(map);
	   
	   
	   
	   
	   
   }
	
}
