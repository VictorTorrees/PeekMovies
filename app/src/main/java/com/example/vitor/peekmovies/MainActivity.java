package com.example.vitor.peekmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    ListView generoListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generoListView  = findViewById(R.id.generoListView);
        //HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/genre/movie/list?language=pt-BR&api_key=6e76f8c7cc7978c3f6aa332051948498")
          //      .body("{}")
            //    .asString();
    }
}
