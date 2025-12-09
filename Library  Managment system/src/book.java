public class book
{
    //Initializing
    String Title;
    String Author;
    int Year;
    boolean isAvailiable;
    boolean isBorrowed;

    //object constructor for the class
    public book(String title,String author, int year, boolean isavailiable, boolean isborrowed)
    {
        Title = title;
        Author = author;
        Year = year;
        isAvailiable = isavailiable;
        isBorrowed = isborrowed;

    }

    //Getter and Setter methods for the class
    public String getTitle()
    {
        return Title;
    }
    public String getAuthor()
    {
        return Author;
    }
    public int getYear()
    {
        return Year;
    }
    public boolean getisAvailiable() {return isAvailiable; }
    public boolean getisBorrowed() {return isBorrowed;}

    @Override
    public String toString()
    {
        return  "Title: " + Title + "Author: " + Author ;
    }

}

