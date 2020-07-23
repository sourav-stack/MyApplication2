package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String > adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.searchView);
        listView = (ListView) findViewById(R.id.lv1);

        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Orange");
        list.add("Lychee");
        list.add("Gavava");
        list.add("Peech");
        list.add("Melon");
        list.add("Watermelon");
        list.add("Papaya");
        list.add("AB");
        list.add("ABC");
        list.add("ABD");list.add("ABH");
        list.add("ABR");
        list.add("ABE");
        list.add("ABF");
        list.add("ABG");
        list.add("AB");
        list.add("ABC");
        list.add("ABD");list.add("ABH");
        list.add("ABR1");
        list.add("ABE2");
        list.add("ABF3");
        list.add("ABG4");
        list.add("AB5");
        list.add("ABC6");
        list.add("ABD7");list.add("ABH");
        list.add("ABR8");
        list.add("ABE9");
        list.add("ABF0");
        list.add("ABG11");
        list.add("AB111");
        list.add("ABC2");
        list.add("ABD45");list.add("ABHDC");
        list.add("ABR56");
        list.add("SABE");
        list.add("GABF");
        list.add("EABG");
        list.add("RAB");
        list.add("EABC");
        list.add("ARBD");list.add("ABHNFG");
        list.add("ABHR");
        list.add("ABED");
        list.add("ABFLDF");
        list.add("ABGFLDM");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if(list.contains(query)){
                    adapter.getFilter().filter(query);
                }else{
                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //    adapter.getFilter().filter(newText);
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
