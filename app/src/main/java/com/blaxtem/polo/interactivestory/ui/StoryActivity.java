package com.blaxtem.polo.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.blaxtem.polo.interactivestory.R;
import com.blaxtem.polo.interactivestory.model.Page;

public class StoryActivity extends Activity {


    public static final String TAG = StoryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));

        if(name == null){
            name = "Friend";
        }
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();



    }
}
