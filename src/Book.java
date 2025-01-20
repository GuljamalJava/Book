import java.time.LocalDate;

public class Book {
    private Long bookId;
    private String  bookName;
    private int bookPrice;
    private LocalDate publishedDate;
    private String authorName;

   public Book(){

   }
    public  Book (Long bookId,String bookName,int bookPrice,LocalDate publishedDate,String authorName){
        this.bookId=bookId;
        this.bookName=bookName;
        this.bookPrice=bookPrice;
        this.publishedDate=publishedDate;
        this.authorName=authorName;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPrice() {
        return bookPrice;
    }
    public void setBookPrice(int bookPrice){
       this.bookPrice=bookPrice;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
public void getIfo(){
    System.out.printf("""
    bookId:%d
    bookName:%s
    bookPrice:%d
    publishedDate: %s
    String authorName: %s""",bookId,bookName,bookPrice,publishedDate,authorName);
}
//todo
public void getByid(){

}

}
