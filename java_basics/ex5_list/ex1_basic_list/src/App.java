        import java.util.ArrayList;
        import java.util.List;
public class App {
    public static void main(String[] args) throws Exception {
        
        //We see a basic examples of how to use list in Java
        //Creating a list:
        List<String> list = new ArrayList<>();

        //Adding elements to the list:
        list.add("Guilherme");
        list.add("João");
        list.add("Maria");
        list.add("Marcos");
        list.add("Ana");
        list.add("Anabel");

        //Printing the list:
        System.out.println("List: " + list);
        System.out.print("-------------");

        //Adding an element at a specific index:
        list.add(2, "Lucas");
        System.out.println("\nList after adding Lucas at index 2: " + list);
        System.out.print("-------------");

        //Removing an element by index:
        list.remove(3);// removes "Marcos"
        System.out.println("\nList after removing element at index 3: " + list);
        System.out.print("-------------");

        //Removing an element by value:
        list.remove("Ana");
        System.out.println("\nList after removing 'Ana': " + list);
        System.out.print("-------------");

        //Removing an element by predicate (Java 8+):
        list.removeIf(name -> name.startsWith("G"));
        System.out.println("\nList after removing elements starting with 'G': " + list);
        System.out.print("-------------");
        
        //Checking if the list contains an element:
        boolean containsMaria = list.contains("Maria");
        System.out.println("\nDoes the list contain 'Maria'? " + containsMaria);
        System.out.print("-------------");

        //Getting the size of the list:
        int size = list.size();
        System.out.println("\nSize of the list: " + size);
        System.out.print("-------------");

        //Filtering the list in a new list (only names starting with 'A'):
        // Adding mor names with 'A' for demonstration
        // Using a steam() e and a collector to filter the list
        list.add("Alice");
        list.add("André");
        List<String> filteredList = new ArrayList<>();
        list.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(filteredList::add);
        System.out.println("\nFiltered list (names starting with 'A'): " + filteredList);
        System.out.print("-------------");
        // Follow to the ex2_employee_problem to see how to use a list in a more complex example.
    }
}
