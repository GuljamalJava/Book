import java.io.PrintStream;

public class Librarry {
    private  Long id;
    private  String name;
    private  Book[] books=new Book[10];
    private  int bookCount;


   public Librarry(){

   }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

//  todo Massivdin ichine 1den book kelip tushup turat.
      public void addBook(Book book){
       this.books[bookCount++] = book;
  }
//
  public void  getAllBook(){
      for (int i = 0; i < bookCount; i++) {
          System.out.printf("""
                  id: %s
                  bookName: %s
                  bookPrice:%d
                  publishedYear: %s
                  authorName:%s""", books[i].getBookId(), books[i].getBookName(), books[i].getBookPrice(), books[i].getPublishedDate(), books[i].getAuthorName());
      }
  }
 public void getById(Long bookId){
     for (int i = 0; i < books.length; i++) {
         if (books[i].getBookId().equals(bookId)) {
             System.out.printf("""
                     id: %s
                     bookName: %s
                     bookPrice:%d
                     publishedYear: %s
                     authorName:%s""", books[i].getBookId(), books[i].getBookName(), books[i].getBookPrice(), books[i].getPublishedDate(), books[i].getAuthorName());
             break;
         } else {
             System.err.println("not found" + bookId);
         }
     }

//public void upDateBooksId(Long bookId,Book newBook){



         }







     }












