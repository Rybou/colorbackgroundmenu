package com.example.bourymbodj.contextualmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListview;
    private ArrayList<String> mArrayList;
    private ArrayAdapter mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListview= (ListView)findViewById(R.id.listView);
        mArrayList= new ArrayList<>();
        mArrayAdapter= new ArrayAdapter<String>(this,R.layout.activity_list_item,R.id.text,mArrayList);
        mListview.setAdapter(mArrayAdapter);
        mArrayList.add("Red");
        mArrayList.add("Blue");
        mArrayList.add("yellow");
        mArrayList.add("Green");
        mArrayList.add("Indigo");
        mArrayList.add("Violet");

    }
    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu, menu);

        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                Toast.makeText(getApplicationContext(), "Red is Selected", Toast.LENGTH_LONG).show();
                mListview.setBackgroundColor(Color.RED);
                return true;
            case R.id.blue:
                Toast.makeText(getApplicationContext(),"Blue is Selected",Toast.LENGTH_LONG).show();
                mListview.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.yellow:
                Toast.makeText(getApplicationContext(),"Yellow is Selected",Toast.LENGTH_LONG).show();
                mListview.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}


