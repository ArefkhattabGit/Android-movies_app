package com.blogapp.aws.movieuitemplate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        CircleImageView imageView = findViewById(R.id.profile);
        TextView username  = findViewById(R.id.profile_username);

        Intent intent = getIntent();
        String usern =  intent.getStringExtra("username");
        username.setText(usern);


    }
}