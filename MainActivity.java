package com.example.apple.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Dog> dogList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDog();
        RecyclerView recyclerView=(RecyclerView )findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        DogAdapter adapter=new DogAdapter(dogList);
        recyclerView.setAdapter(adapter);

    }

    private void initDog() {
        for (int i=0;i<2;i++) {
            Dog dog1 = new Dog("dog1", R.drawable.dog1);
            dogList.add(dog1);
            Dog dog2 = new Dog("dog2", R.drawable.dog2);
            dogList.add(dog2);
            Dog dog3 = new Dog("dog3", R.drawable.dog3);
            dogList.add(dog3);
            Dog dog4 = new Dog("dog4", R.drawable.dog4);
            dogList.add(dog4);
            Dog dog5 = new Dog("dog5", R.drawable.dog5);
            dogList.add(dog5);
            Dog dog6 = new Dog("dog6", R.drawable.dog6);
            dogList.add(dog6);
            Dog dog7 = new Dog("dog7", R.drawable.dog7);
            dogList.add(dog7);
            Dog dog8 = new Dog("dog8", R.drawable.dog8);
            dogList.add(dog8);
            Dog dog9 = new Dog("dog9", R.drawable.dog9);
            dogList.add(dog9);
            Dog dog10 = new Dog("dog10", R.drawable.dog10);
            dogList.add(dog10);
        }

    }
}
