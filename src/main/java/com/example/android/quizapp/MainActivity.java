package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    /**
     * Its time to declare all the variables (fields) we would use in our app
     */

    // Question 1
    RadioButton question1_option3;
    // Question 2
    RadioButton question2_option1;
    // Question 3
    CheckBox question3_option1;
    CheckBox question2_option2;
    CheckBox question3_option3;
    CheckBox question3_option4;
    // Question 4
    RadioButton question4_option2;
    // Question 5
    RadioButton question5_option2;
    // Question 6
    CheckBox question6_option1;
    CheckBox question6_option2;
    CheckBox question6_option3;
    CheckBox question6_option4;
    // Question 7
    RadioButton question7_option1;
    //Question 8
    EditText question8_answer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is triggered when the submit order button is clicked
     */
    public void gradingButton(View view) {

        int answer_score = 0;
        int final_score;
        CharSequence resultsDisplay;

/**
 * Question 1 - Correct Answer is #3 (1960) (question1_choice3)
 */

        Boolean answer1;
        question1_option3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        answer1 = question1_option3.isChecked();
        if (answer1) {
            answer_score = answer_score + 1;
        }
/**
 * Question 2 - Correct Answer is "Abuja" (question2_choice1)
 */

        Boolean answer2;
        question2_option1 = (RadioButton) this.findViewById(R.id.question2_choice1);
        answer2 = question2_option1.isChecked();
        if (answer2) {
            answer_score = answer_score + 1;
        }

        /**
         * Question 3 - Correct Answer are #1 (Sani abacha) and #3 (Muhammadu buhari)
         * (question3_choice1 and choice3)
         */
        Boolean answer3_option1;
        Boolean answer3_option2;
        Boolean answer3_option3;
        Boolean answer3_option4;
        question3_option1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        question2_option2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        question3_option3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        question3_option4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        answer3_option1 = question3_option1.isChecked();
        answer3_option2 = question2_option2.isChecked();
        answer3_option3 = question3_option3.isChecked();
        answer3_option4 = question3_option4.isChecked();
        if (answer3_option1 && !answer3_option2 && answer3_option3 && !answer3_option4) {
            answer_score = answer_score + 1;
        }
/**
 * Question 4 - Correct Answer is Lagos (question4_option2)
 */
        Boolean answer4;
        question4_option2 = (RadioButton) this.findViewById(R.id.question4_choice2);
        answer4 = question4_option2.isChecked();
        if (answer4) {
            answer_score = answer_score + 1;
        }

        /**
         * Question 5 - Correct Answer is Tafawa Balewa (question5_choice2)
         */

        Boolean answer5;
        question5_option2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        answer5 = question5_option2.isChecked();
        if (answer5) {
            answer_score = answer_score + 1;
        }


        /**
         * Question 6 - Correct Answers are #3 (Niger) and #4 (Benue)
         * (question6_choice3, and choice4)
         */

        Boolean answer6_choice1;
        Boolean answer6_choice2;
        Boolean answer6_choice3;
        Boolean answer6_choice4;
        question6_option1 = (CheckBox) this.findViewById(R.id.question6_choice1);
        question6_option2 = (CheckBox) this.findViewById(R.id.question6_choice2);
        question6_option3 = (CheckBox) this.findViewById(R.id.question6_choice3);
        question6_option4 = (CheckBox) this.findViewById(R.id.question6_choice4);
        answer6_choice1 = question6_option1.isChecked();
        answer6_choice2 = question6_option2.isChecked();
        answer6_choice3 = question6_option3.isChecked();
        answer6_choice4 = question6_option4.isChecked();
        if (!answer6_choice1 && !answer6_choice2 && answer6_choice3 && answer6_choice4) {
            answer_score = answer_score + 1;
        }

/**
 * Question 7 - Correct Answers Micheal Taiwo Akinwunmi (question7_choice1)
 */
        Boolean answer7;
        question7_option1 = (RadioButton) this.findViewById(R.id.question7_choice1);
        answer7 = question7_option1.isChecked();
        if (answer7) {
            answer_score = answer_score + 1;
        }

        /**
         * Question 8 - Correct Answers to type is Kano
         */
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString();
        if (answer8.trim().equalsIgnoreCase("Kano")) {
            answer_score = answer_score + 1;
        }


/**
 * This adds the users name in the toast message
 */

        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();


        /**
         *This display the final score in a toast message
         *
         */

        final_score = answer_score;

        if (final_score == 8) {
            resultsDisplay = name + "Congratulations!!! You scored"  + final_score + " out of 8, you sure know a lot about Nigeria";
        } else if (final_score == 7 || final_score == 6 || final_score == 5) {
            resultsDisplay = name + " !!! Wow you really tried, your score is above average. it is " + final_score + " out of 8";
        } else if (final_score == 4) {
            resultsDisplay = name + " !!!That's nice, at least you got an average score . it is " + final_score + " out of 8";
        } else {
            resultsDisplay = name + " !!! You score is below average it is " + final_score + " out of 8, please try again";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
