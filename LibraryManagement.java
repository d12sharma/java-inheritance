class Book{
     String title;
     int publicationYear;

    public Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void displayDetails(){
        System.out.println("title :"+title+"publication year"+publicationYear);
    }

}
class Author extends Book{
     String name;
     String bio;
    public Author(String title , int publicationYear ,String name,String bio){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Author Name:"+name+"Bio:"+bio);
    }

}




public class LibraryManagement {
    public static void main(String[] args) {
        Author author1 = new Author("abcd",2025,"dhruv sharma","abcdefghijklmnopqrstuvwxyz");
        author1.displayDetails();

    }

}
