package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initData() {

        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.discord, "Taasir", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.dp, "sam", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.discord, "max", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.dp, "jan", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.discord, "emma", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.dp, "starlight", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.discord, "homelander", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.dp, "jake", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.discord, "logan", "10:09 am", "hope you are fine.", "___________________________"));
        userList.add(new ModelClass(R.drawable.dp, "trap", "10:09 am", "hope you are fine.", "___________________________"));

    }

    private void initRecyclerView() {

        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();
    }
}