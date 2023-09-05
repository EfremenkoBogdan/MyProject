package Book;
import java.util.TreeMap;
import java.util.Scanner;

public class hashBook {

	public static void main(String[] args) 
	{
		TreeMap<String, String> book = new TreeMap<>();
		book.put("Ivan", "79996854456");
		book.put("Pavel", "79151231412");
		
		Scanner scanner = new Scanner (System.in);
		for(;;)
		{
			System.out.println("Write value");
			
			String value = scanner.nextLine();
			
			if (value.matches("LIST"))
			{
				printBook(book);
				continue;
			}
			
			else if (book.containsKey(value) || book.containsValue(value))
			{
		    printBook(book);
         	}
		    
		    else if (value.matches("[0-9]") ) {
				System.out.println("Write name");
				Scanner scanner1 = new Scanner (System.in);
				String name = scanner1.nextLine();
				book.put(name,value);
				continue;
	       }
			
	        else  {
		    System.out.println("Write number");
		    Scanner scanner2 = new Scanner (System.in);
		    String number = scanner2.nextLine();
		    book.put(value, number);
		    continue;
		    }
			
			
		}
	}
	
	private static void printBook (TreeMap<String, String> book1)
	
	{
		for (String key: book1.keySet())
		{
			System.out.println(key + " => " + book1.get(key));
		}
	}
}
