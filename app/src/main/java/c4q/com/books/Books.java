package c4q.com.books;

import android.widget.TextView;

/**
 * Created by D on 11/5/17.
 */

public class Books {

    private String bookTitle;
    private String bookAuthor;
    private String publishYear;

    public Books(String bookTitle,String bookAuthor,String publishYear){
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publishYear = publishYear;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getPublishYear() {
        return publishYear;
    }
}