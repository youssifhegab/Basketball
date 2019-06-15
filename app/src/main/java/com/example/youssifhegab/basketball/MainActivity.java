package com.example.youssifhegab.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsA;
    int pointsB;
    int reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void A3 (View view){
        pointsA = pointsA + 3;
        getTeamA(pointsA);
    }
    public void A2 (View view){
        pointsA= pointsA + 2;
        getTeamA(pointsA);
    }
    public void Afree (View view){
        pointsA = pointsA + 1;
        getTeamA(pointsA);
    }
    public void B3 (View view){
        pointsB = pointsB + 3;
        getTeamB(pointsB);
    }
    public void B2 (View view){
        pointsB = pointsB + 2;
        getTeamB(pointsB);
    }
    public void Bfree (View view){
        pointsB = pointsB + 1;
        getTeamB(pointsB);
    }
    public void reset (View view){
        pointsA = 0;
        pointsB = 0;
        getTeamA(pointsA);
        getTeamB(pointsB);
    }

    private void getTeamA (int i){
        TextView teamA = (TextView) findViewById(R.id.teamA);
        teamA.setText(String.valueOf(i));
    }
    private void getTeamB (int i){
        TextView teamB = (TextView) findViewById(R.id.teamB);
        teamB.setText(String.valueOf(i));
    }
}
