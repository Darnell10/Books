package c4q.com.books;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by D on 11/5/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder {

    private TextView book;
    private TextView author;
    private TextView year;

    public BookViewHolder(View itemView) {
        super(itemView);

        book = (TextView) itemView.findViewById(R.id.book_title_textview);
        author = (TextView) itemView.findViewById(R.id.book_author_textview);
        year = (TextView) itemView.findViewById(R.id.publish_year_textview);

    }

    public void onBind(Books books) {
        book.setText("Title: " + books.getBookTitle());
        author.setText("Author: " + books.getBookAuthor());
        year.setText("Year Published: " + books.getPublishYear());
    }
}
