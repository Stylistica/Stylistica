package com.example.sneha.stylistica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToAddSingleClothing();
    }

    private void goToAddSingleClothing(){
        Intent intent = new Intent(this, AddSingleClothingActivity.class);
        startActivity(intent);
    }
}
