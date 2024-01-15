package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class data_collection_end_game extends AppCompatActivity {

    //Defines needed variables

    public static String Docked = "False";
    public static String Engaged = "False";
    public static String Parked = "False";
    public static String Attempted = "False";
    public static String None = "False";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection_end_game);

        //Defines Page Elements
        final RadioButton DockedRB = (RadioButton) findViewById(R.id.endgame_Docked_RB);
        final RadioButton EngagedRB = (RadioButton) findViewById(R.id.endgame_Engaged_RB);
        final RadioButton ParkedRB = (RadioButton) findViewById(R.id.endgame_Parked_RB);
        final RadioButton NoneRB = (RadioButton) findViewById(R.id.endgame_None_RB);


        //final CheckBox AttemptedHangCB = (CheckBox) findViewById(R.id.AttemptedHang_CB);
        final CheckBox AttemptedCB = (CheckBox) findViewById(R.id.endgame_Attempted_CB);


        Button To_Submission = (Button) findViewById(R.id.To_Submission_B); //Defines button for later use
        To_Submission.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {



                //Ending position variables
                //Because these are radio buttons, they may need to be changed to isChecked
                if (DockedRB.isChecked()) {
                    Docked = "True";
                }
                if (EngagedRB.isChecked()) {
                    Engaged = "True";
                }
                if (ParkedRB.isChecked())  {
                    Parked = "True";
                }
                if (AttemptedCB.isChecked()) {
                    Attempted = "True";
                }
                if (NoneRB.isChecked()) {
                    None = "True";
                }


                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });


    }

}


