package c4q.com.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Books> bookList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.book_recycler_view);



        List<Books> books = new ArrayList<>();

        books.add(new Books("Pimp","Iceberg Slim","1968"));
        books.add(new Books("the cat in the hat"," Dr. Suiess","1950"));
        books.add(new Books("","",""));
        books.add(new Books("","",""));
        books.add(new Books("","",""));
        books.add(new Books("","",""));



        BookAdapter movieAdapter = new BookAdapter(books);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        bookRecyclerView.setAdapter(movieAdapter);
        bookRecyclerView.setLayoutManager(linearLayoutManager);

    }
}
