package com.example.recycleview;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
//import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview_example);
        recyclerView = findViewById(R.id.recycleview);

        String[] name = {"jhyamputali","shaktiman","fulkumar","fulkumari","devdas"};
         int[] image = {
                R.drawable.jhyamputali,
                R.drawable.shaktiman,
                R.drawable.fulkumar,
                R.drawable.fulkumari,
                R.drawable.devdas

        };


        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this,name,image);
        recyclerView.setAdapter(adapter);

    }
}