import java.awt.print.Book;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    //Provides an arrayList to hold book title
    private static ArrayList<book> library = new ArrayList<>();

    public static void main(String[] args)
    {
        //book mybook = new book();
        //Scanner allows us to get user input
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        //8 loop o keep the meanu running
        while (running)
        {
            System.out.println("======= Library Menu ====");
            System.out.println("1. AddBook");
            System.out.println("2. View All Books");
            System.out.println("3. Search book by title");
            System.out.println("4. Remove book");
            System.out.println("5. Exist");
            System.out.println("Please enter your choice: ");

            //get user's choice
            int choice = scanner.nextInt();
            scanner.nextLine();// consume the newline character

            //We will add a switch statement to allow the user to choose
            switch(choice)
            {
                case 1:
                    AddBook(); //Bring the scanner to the method
                    break;
                case 2:
                    ViewAllBooks();
                    break;
                case 3:
                    SearchBookByTitle();
                    break;
                case 4:
                    RemoveBook();
                    break;
                case 5:
                    System.out.println("Existing...... goodbye!");
                    running = false;
                default:
                    System.out.println("Invalid selection.please try again");
                    break;


            }


        }
    scanner.close();

    }
    public static void AddBook()
    {
        // A scanner allows a user to read user input
        Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to The library managment system ");
      System.out.println("Please enter the title of the book ");
      String Title = scanner.nextLine();

      System.out.println("Please enter the author of the book ");
      String Author = scanner.nextLine();

      //creatting an object from the class
      book Book2 = new book(Title, Author, 2025, true, false);


      //Adding the book to the library
      library.add(Book2);
      System.out.println(Book2 + " has been added to the library");

    }


    public static void ViewAllBooks()
    {    //This will display all the books in the library
         System.out.println("These are the books that are availiable in the library:");
         if (library.isEmpty())
         {
                System.out.println("No books availiable in the library");
            }
            else
            {
                for (book b : library)
                {
                    System.out.println(b);
                }
         }

    }


    public static void SearchBookByTitle()
    {
       System.out.println("Which book are you looking for?");
       for (book b : library)
       {
           //If statment to check if the book is in the library
           if(b.getTitle().equalsIgnoreCase("title"))
           {
               System.out.println("The book is availiable in the library");
           }
           else
           {
                System.out.println("The book is not availiable in the library");
           }




       }



    }
    public static void RemoveBook()
    {
         System.out.println("Which book would you like to remove");
         String removeTitle = new Scanner(System.in).nextLine();

            for (int i = 0; i < library.size(); i++)
            {
                book b = library.get(i);
                if (b.getTitle().equalsIgnoreCase(removeTitle))
                {
                    library.remove(i);
                    System.out.println(b + " has been removed from the library");
                    return;
                }
                else
                {
                    //Remove it if found
                    System.out.println("The book is not found in the library");
                }


            }
    }




}