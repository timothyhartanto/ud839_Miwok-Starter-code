package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
//
//        for(int i = 0; i < words.length; i++)
//            Log.v("NumbersActivity", words[i]);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

//        GridView gridView = (GridView) findViewById(R.id.list);
//        gridView.setAdapter(itemsAdapter);

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.root_view);
//        TextView wordView = new TextView(this);
//        wordView.setText(words.get(0));
//        rootView.addView(wordView);
    }
}
