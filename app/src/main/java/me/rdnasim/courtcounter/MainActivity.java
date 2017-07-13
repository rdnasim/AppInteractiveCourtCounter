package me.rdnasim.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView displayScore = (TextView) findViewById(R.id.display_team_score);
        displayScore.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        displayForTeamA(3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(2);
    }

    public void addForTeamA(View view) {
        displayForTeamA(1);
    }
}
