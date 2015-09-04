package com.example.ilse.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer firstrandomnumber = random();
        String number = firstrandomnumber.toString();
        TextView numberview = (TextView) findViewById(R.id.numberview);
        numberview.setText(number);
        View someView = findViewById(R.id.layout);
        View root = someView.getRootView();
        root.setBackgroundColor(Color.BLUE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public int random(){
        Random rand = new Random();
        int rnumber = rand.nextInt(11);
        return rnumber;

    }


    public void sendEqual(View view) {
        TextView numberview = (TextView) findViewById(R.id.numberview);
        TextView result = (TextView) findViewById(R.id.result);
        String text = numberview.getText().toString();
        int oldnumber = Integer.parseInt(text);
        Integer randomnumber = random();
        String number = randomnumber.toString();
        numberview.setText(number);
        if (oldnumber == randomnumber){
            result.setText("JAAAA");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.GREEN);
        }
        else{
            result.setText("NEEEE!");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.RED);
        }


    }

    public void sendHigh(View view) {
        TextView numberview = (TextView) findViewById(R.id.numberview);
        TextView result = (TextView) findViewById(R.id.result);
        String text = numberview.getText().toString();
        int oldnumber = Integer.parseInt(text);
        Integer randomnumber = random();
        String number = randomnumber.toString();
        numberview.setText(number);
        if (oldnumber < randomnumber){
            result.setText("JAAAA");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.GREEN);
        }
        else{
            result.setText("NEEEE!");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.RED);
        }
    }

    public void sendLow(View view) {
        TextView numberview = (TextView) findViewById(R.id.numberview);
        TextView result = (TextView) findViewById(R.id.result);
        String text = numberview.getText().toString();
        int oldnumber = Integer.parseInt(text);
        Integer randomnumber = random();
        String number = randomnumber.toString();
        numberview.setText(number);
        if (oldnumber > randomnumber){
            result.setText("JAAAA");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.GREEN);
        }
        else{
            result.setText("NEEEE!");
            View someView = findViewById(R.id.layout);
            View root = someView.getRootView();
            root.setBackgroundColor(Color.RED);
        }
    }
}
