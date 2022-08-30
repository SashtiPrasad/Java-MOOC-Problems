public class Book {
    private String bookname;
    private int pages;
    private int pubyear;

    public Book(String bookname, int pages, int pubyear){
        this.bookname=bookname;
        this.pages= pages;
        this.pubyear=pubyear;
    }

    public String getBookName(){
        return bookname;
    }

    public int getPages(){
        return pages;
    }

    public int getPubYear(){
        return pubyear;
    }

    public String toString() {
        return this.bookname + ", " + this.pages + " pages, " + this.pubyear;
    }

}
