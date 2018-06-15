package ke.co.tyche.rugbyscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Display the score of Team A **/
    public void displayQuinsScore (int x){
        TextView quinscore = (TextView) findViewById(R.id.Quinns_score);
        quinscore.setText(String.valueOf(x));
    }

    /** Display the score of Team B **/
    public void displayMwambaScore (int x){
        TextView mwambascore = (TextView) findViewById(R.id.mwamba_score);
        mwambascore.setText(String.valueOf(x));
    }


    /** Tries */
    public void quinTry (View v){
        scoreTeamA = scoreTeamA + 5;
        displayQuinsScore(scoreTeamA);
    }

    public void mwambaTry (View v){
        scoreTeamB = scoreTeamB + 5;
        displayMwambaScore(scoreTeamB);
    }


    /** Conversions */
    public void quinConversion (View v){
        scoreTeamA = scoreTeamA + 2;
        displayQuinsScore(scoreTeamA);
    }

    public void mwambaConversion (View v){
        scoreTeamB = scoreTeamB + 2;
        displayMwambaScore(scoreTeamB);
    }


    /** Drop Goals */
    public void quinDropGoal (View v){
        scoreTeamA = scoreTeamA + 3;
        displayQuinsScore(scoreTeamA);
    }

    public void mwambaDropGoal (View v){
        scoreTeamB = scoreTeamB + 3;
        displayMwambaScore(scoreTeamB);
    }


    /** Penalties */
    public void quinPenalty (View v){
        scoreTeamA = scoreTeamA + 3;
        displayQuinsScore(scoreTeamA);
    }

    public void mwambaPenalty (View v){
        scoreTeamB = scoreTeamB + 3;
        displayMwambaScore(scoreTeamB);
    }

    /** Reset */
    public void reset(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayMwambaScore(scoreTeamB);
        displayQuinsScore(scoreTeamA);
    }
}
