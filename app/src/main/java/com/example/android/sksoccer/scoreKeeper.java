package com.example.android.sksoccer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.edit;
import static android.R.id.keyboardView;

public class scoreKeeper extends AppCompatActivity {


    /**
     * Global variables and constants.
     */
    /**
     * value for one goal, card or penalty
     */
    final int VALUE_ONE = 1;
    /**
     * tracks TeamA: scores, state and views
     */
    int goalsTeamA = 0;
    String hola = "0";
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int penaltysTeamA = 0;
    String currentGoalsTeamA = "currentGoalsTeamA";
    String currentYellowCardsA = "currentYellowCardsA";
    String currentRedCardsTeamA = "currentRedCardsTeamA";
    String currentPenaltyTeamA = "currentPenaltyTeamA";
    TextView goalsViewA;
    TextView yellowCardsViewA;
    TextView redCardsViewA;
    TextView penaltyViewA;

    /**
     * tracks TeamB
     */
    int goalsTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;
    int penaltysTeamB = 0;
    String currentGoalsTeamB = "currentGoalsTeamB";
    String currentYellowCardsB = "currentYellowCardsB";
    String currentRedCardsTeamB = "currentRedCardsTeamB";
    String currentPenaltyTeamB = "currentPenaltyTeamB";
    TextView goalsViewB;
    TextView yellowCardsViewB;
    TextView redCardsViewB;
    TextView penaltyViewB;

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        /*
        Save UI state changes to the savedInstanceState.
        This bundle will be passed to onCreate if the process is
        killed and restarted.
        */
        savedInstanceState.putInt(currentGoalsTeamA, goalsTeamA);
        savedInstanceState.putInt(currentYellowCardsA, yellowCardsTeamA);
        savedInstanceState.putInt(currentRedCardsTeamA, redCardsTeamA);
        savedInstanceState.putInt(currentPenaltyTeamA, penaltysTeamA);

        savedInstanceState.putInt(currentGoalsTeamB, goalsTeamB);
        savedInstanceState.putInt(currentYellowCardsB, yellowCardsTeamB);
        savedInstanceState.putInt(currentRedCardsTeamA, redCardsTeamA);
        savedInstanceState.putInt(currentPenaltyTeamB, penaltysTeamB);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);
    /* Restore UI state from the savedInstanceState. */
        if (savedInstanceState != null) {
            goalsTeamA = savedInstanceState.getInt(currentGoalsTeamA);
            yellowCardsTeamA = savedInstanceState.getInt(currentYellowCardsA);
            redCardsTeamA = savedInstanceState.getInt(currentRedCardsTeamA);
            penaltysTeamA = savedInstanceState.getInt(currentPenaltyTeamB);

            goalsTeamB = savedInstanceState.getInt(currentGoalsTeamB);
            yellowCardsTeamB = savedInstanceState.getInt(currentYellowCardsB);
            redCardsTeamB = savedInstanceState.getInt(currentRedCardsTeamB);
            penaltysTeamB = savedInstanceState.getInt(currentPenaltyTeamB);

        }

        /**
         * casting views
         */
        goalsViewA = (TextView) findViewById(R.id.team_a_score);
        yellowCardsViewA = (TextView) findViewById(R.id.yellow_card_a_score);
        redCardsViewA = (TextView) findViewById(R.id.red_card_a_score);
        penaltyViewA = (TextView) findViewById(R.id.penalty_a_score);
        goalsViewB = (TextView) findViewById(R.id.team_b_score);
        yellowCardsViewB = (TextView) findViewById(R.id.yellow_card_B_score);
        redCardsViewB = (TextView) findViewById(R.id.red_card_B_score);
        penaltyViewB = (TextView) findViewById(R.id.penalty_B_score);

        displayScore(goalsTeamA, goalsViewA);
        displayScore(yellowCardsTeamA, yellowCardsViewA);
        displayScore(redCardsTeamA, redCardsViewA);
        displayScore(penaltysTeamA, penaltyViewA);
        displayScore(goalsTeamB, goalsViewB);
        displayScore(yellowCardsTeamB, yellowCardsViewB);
        displayScore(redCardsTeamB, redCardsViewB);
        displayScore(penaltysTeamB, penaltyViewB);

    }

    /**
     * Displays a given score into a given view
     */
    public void displayScore(int score, TextView scoreView) {

        scoreView.setText(String.valueOf(score));

    }

    /**
     * This method is called when goal_a button is clicked.
     */
    public void goalForTeamA(View view) {
        goalsTeamA = goalsTeamA + VALUE_ONE;
        displayScore(goalsTeamA, goalsViewA);
    }

    /**
     * This method is called when YellowCardA button is clicked.
     */
    public void yellowCardForTeamA(View view) {
        yellowCardsTeamA = yellowCardsTeamA + VALUE_ONE;
        displayScore(yellowCardsTeamA, yellowCardsViewA);
    }

    /**
     * This method is called when RedCardA button is clicked.
     */
    public void redCardForTeamA(View view) {
        redCardsTeamA = redCardsTeamA + VALUE_ONE;
        displayScore(redCardsTeamA, redCardsViewA);
    }

    /**
     * This method is called when PenaltyA button is clicked.
     */
    public void penaltysForTeamA(View view) {
        penaltysTeamA = penaltysTeamA + VALUE_ONE;
        displayScore(penaltysTeamA, penaltyViewA);
    }


    /**
     * This method is called when goaLB button is clicked.
     */
    public void goalForTeamB(View view) {
        goalsTeamB = goalsTeamB + VALUE_ONE;
        displayScore(goalsTeamB, goalsViewB);
    }

    /**
     * This method is called when YellowCardB button is clicked.
     */
    public void yellowCardForTeamB(View view) {
        yellowCardsTeamB = yellowCardsTeamB + VALUE_ONE;
        displayScore(yellowCardsTeamB, yellowCardsViewB);
    }

    /**
     * This method is called when RedCardB button is clicked.
     */
    public void redCardForTeamB(View view) {
        redCardsTeamB = redCardsTeamB + VALUE_ONE;
        displayScore(redCardsTeamB, redCardsViewB);
    }

    /**
     * This method is called when PenaltyB button is clicked.
     */
    public void penaltysForTeamB(View view) {
        penaltysTeamB = penaltysTeamB + VALUE_ONE;
        displayScore(penaltysTeamB, penaltyViewB);
    }

    //EditText Test
    public void getPhone1(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String phone = editText.getText().toString();
        int finalPhone = Integer.parseInt(phone);

        TextView textView = (TextView) findViewById(R.id.show_phone);
        displayScore(finalPhone, textView);
    }
    /**
     * Resets ALL counters (play the game again)
     * this method is called when the
     * ResetButton is clicked.
     */

    public void resetGame(View view) {
        goalsTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        penaltysTeamA = 0;
        goalsTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;
        penaltysTeamB = 0;
        displayScore(goalsTeamA, goalsViewA);
        displayScore(yellowCardsTeamA, yellowCardsViewA);
        displayScore(redCardsTeamA, redCardsViewA);
        displayScore(penaltysTeamA, penaltyViewA);
        displayScore(goalsTeamB, goalsViewB);
        displayScore(yellowCardsTeamB, yellowCardsViewB);
        displayScore(redCardsTeamB, redCardsViewB);
        displayScore(penaltysTeamB, penaltyViewB);
    }
}