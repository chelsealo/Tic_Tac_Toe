package com.example.chelsea.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private boolean OsTurn=false;
    private char board [][]= new char[3][3];
    private int [] blankButtons = {R.id.buttonOne, R.id.buttonTwo, R.id.buttonThree, R.id.buttonFour,R.id.buttonFive, R.id.buttonSix, R.id.buttonSeven, R.id.buttonEight, R.id.buttonNine};
    private int turn=0;
    private String buttonValue;
    private boolean gameover=false;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BlankButtonListener blankButtonListener = new BlankButtonListener ();
        for (int id : blankButtons) {
            findViewById(id).setOnClickListener(blankButtonListener);

        }
    }
    private class BlankButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            Button button = (Button)v;
            if ("".equals(button.getText())) {

                if (turn % 2 == 0) {
                    button.setText("X");
                } else {
                    button.setText("O");
                }
                turn += 1;
            }
            
        }
    }
}
