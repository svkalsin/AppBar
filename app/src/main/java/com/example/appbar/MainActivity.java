package com.example.appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        /*if (id == R.id.action_open_notes) {
            //Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(this, NotesActivity.class);
            startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_open_checkBox){
            Intent intentNotes = new Intent(this, ChBActivity.class);
            startActivity(intentNotes);
            return true;
        }*/
        switch (id) {
            case R.id.action_open_notes: {
                //Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();
                Intent intentNotes = new Intent(this, NotesActivity.class);
                startActivity(intentNotes);
                return true;
            }

            case R.id.action_open_checkBox: {
                Intent intentNotes = new Intent(this, ChBActivity.class);
                startActivity(intentNotes);
                return true;
            }

            case R.id.action_open_spiner: {
                Intent intentNotes = new Intent(this, SpinActivity.class);
                startActivity(intentNotes);
                return true;
            }

            case R.id.action_open_calendar: {
                Intent intentNotes = new Intent(this, CalendarActivity.class);
                startActivity(intentNotes);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}