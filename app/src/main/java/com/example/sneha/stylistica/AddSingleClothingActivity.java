package com.example.sneha.stylistica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddSingleClothingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_single_clothing);
    }

    public void addSingleClothing(View view){
        Toast toast = Toast.makeText(this,"Item Added!",Toast.LENGTH_LONG);
        toast.show();

    }
}
