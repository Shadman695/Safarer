package com.example.safarer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< Updated upstream
import android.widget.ImageButton;
=======
import android.widget.Button;
>>>>>>> Stashed changes

public class MainActivity extends AppCompatActivity {


    private ImageButton AddNewPostButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        


        //AddNewPostButton = (ImageButton) findViewById(R.id.add_new_post_button);
        AddNewPostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUserToPostActivity();
            }

        });

        //DisplayAllUsersPosts();
    }



    private void sendUserToPostActivity() {

            Intent addNewPostIntent = new Intent(MainActivity.this, PostActivity.class);
            startActivity(addNewPostIntent);

    }
}
