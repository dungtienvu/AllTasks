package com.example.mcalltasks; // Đảm bảo rằng đây là gói chính xác


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mcalltasks.R;

public class MainActivity extends AppCompatActivity {

    private CheckBox addToMyDayCheckBox;
    private ImageView menuIcon;
    private ImageView addTomorrowIcon;
    private ImageView addUpcomingIcon;
    private ImageView addSomedayIcon;
    private ImageView homeIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        addToMyDayCheckBox = findViewById(R.id.addToMyDayCheckBox);
        menuIcon = findViewById(R.id.menuIcon);
        addTomorrowIcon = findViewById(R.id.addTomorrowIcon);
        addUpcomingIcon = findViewById(R.id.addUpcomingIcon);
        addSomedayIcon = findViewById(R.id.addSomedayIcon);
        homeIcon = findViewById(R.id.homeIcon);

        // Set click listeners
        addToMyDayCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (addToMyDayCheckBox.isChecked()) {
                    Toast.makeText(MainActivity.this, "Added to My Day", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Removed from My Day", Toast.LENGTH_SHORT).show();
                }
            }
        });

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Menu clicked", Toast.LENGTH_SHORT).show();
            }
        });

        addTomorrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add to Tomorrow clicked", Toast.LENGTH_SHORT).show();
            }
        });

        addUpcomingIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add to Upcoming clicked", Toast.LENGTH_SHORT).show();
            }
        });

        addSomedayIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Add to Someday clicked", Toast.LENGTH_SHORT).show();
            }
        });

        homeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Home clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
