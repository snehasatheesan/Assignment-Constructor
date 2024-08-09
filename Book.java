1. Add a constructor to the Book class already created. Write a function to add books using constructors to an array of <Book> objects, and display all the books added.

  package constructors;

public class Book {
	    String genre;
	    String author;
	    int isbn;
	    static int bookNum=0;
	    {
	    	bookNum++;
	    }

	    Book(String genre,String author,int isbn){
	        this.genre=genre;
	        this.author=author;
	        this.isbn=isbn;
	    }
	    public void display(){
	        System.out.println("Genre: "+this.genre);
	        System.out.println("Author: "+this.author);
	        System.out.println("ISBN: "+this.isbn);
	    }
	    public static int totalBook(){
	        return bookNum;
	    }

	    public static void main(String[] args) {
	        Book[] s=new Book[3];
	        s[0]=new Book("thriller","Christopher Nolan",2000);
	        s[1]=new Book("Horror"," Hideo Nakata",2002);
	        s[2]=new Book("Science Fiction","Denis Villeneuve",2015);

	        for (Book b:s) {
	            b.display();
	            System.out.println();
	        }
	    }
}
