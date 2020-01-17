package com.example.quizpac;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.store_button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToStoreActivity();

            }

        });

        Button button2 = (Button) findViewById(R.id.quizzes_button);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToQuizzesActivity();

            }

        });

        Button button3 = (Button) findViewById(R.id.profile_button);

        button3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToProfileActivity();

            }

        });

        Button button4 = (Button) findViewById(R.id.collection_button);

        button4.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToCollectionActivity();

            }

        });

        Button button5 = (Button) findViewById(R.id.leaderboard_button);

        button5.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                goToLeaderboardActivity();

            }

        });
    }

    private void goToStoreActivity() {

        Intent intent = new Intent(this, Store.class);

        startActivity(intent);

    }



    private void goToQuizzesActivity() {

        Intent intent = new Intent(this, Quizzes.class);

        startActivity(intent);

    }

    private void goToProfileActivity() {

        Intent intent = new Intent(this, Profile.class);

        startActivity(intent);

    }

    private void goToCollectionActivity() {

        Intent intent = new Intent(this, Collection.class);

        startActivity(intent);

    }

    private void goToLeaderboardActivity() {

        Intent intent = new Intent(this, Leaderboard.class);

        startActivity(intent);

    }
}
