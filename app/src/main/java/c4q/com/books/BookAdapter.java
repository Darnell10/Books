package c4q.com.books;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by D on 11/5/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {

    List<Books> booksList;

    public BookAdapter(List<Books> booksList) {
        this.booksList = booksList;
    }

    @Override
    public BookViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_itemview, parent, false);
        return new BookViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position){
        Books book = booksList.get(position);
        holder.onBind(book);
    }

    @Override
    public int getItemCount(){
        return booksList.size();
    }



}
