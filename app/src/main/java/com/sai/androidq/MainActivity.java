package com.sai.androidq;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewModelClass[] myListData = new ViewModelClass[]{
                new ViewModelClass("Sai1", "Chari1"),
                new ViewModelClass("Sai2", "Chari2"),
                new ViewModelClass("Sai3", "Chari3"),
                new ViewModelClass("Sai4", "Chari4"),
                new ViewModelClass("Sai5", "Chari5"),
                new ViewModelClass("Sai6", "Chari6"),
                new ViewModelClass("Sai7", "Chari7"),
                new ViewModelClass("Sai8", "Chari8"),
                new ViewModelClass("Sai9", "Chari9"),
        };

        Log.d("","");

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}
