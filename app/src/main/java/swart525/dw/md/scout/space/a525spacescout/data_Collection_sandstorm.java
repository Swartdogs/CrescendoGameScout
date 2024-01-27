package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class data_Collection_sandstorm extends AppCompatActivity {

    //Defines variables for use
    //Static ~ tells the code that it can run without needing an instance of the class

   // public static String Taxi_Yes = "False";
   // public static String Taxi_No = "False";
   // public static String AutoUpperhubScore = "0";
  //  public static String AutoUpperhubMiss = "0";

    public static String AutoStopButtonPressed = "False";

    public static String AutoAmpScore = "0";
    public static String AutoAmpAttempt = "0";
    public static String AutoSpeakerScore = "0";
    public static String AutoSpeakerAttempt = "0";
    public static String Add_AutoAmpScore = "1";
    public static String Add_AutoAmpAttempt = "1";
    public static String Add_AutoSpeakerScore = "1";
    public static String Add_AutoSpeakerAttempt = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all CheckBoxes for positions
        final CheckBox AutoStopButtonCB = (CheckBox) findViewById(R.id.Auto_Stop_Button_CB);

        //final RadioButton TaxiYesRB = (RadioButton) findViewById(R.id.Auto_Taxi_Yes_RB);
        //final RadioButton TaxiNoRB = (RadioButton) findViewById(R.id.Auto_Taxi_No_RB);


        //Defines "Elegant" Number Blocks
        final ElegantNumberButton AutoAmpAttemptedEB = (ElegantNumberButton) findViewById(R.id.Auto_Amp_Attempted_EB);
        final ElegantNumberButton AutoSpeakerAttemptedEB = (ElegantNumberButton) findViewById(R.id.Auto_Speaker_Attempted_EB);
        final ElegantNumberButton AutoAmpScoredEB = (ElegantNumberButton) findViewById(R.id.Auto_Amp_Scored_EB);
        final ElegantNumberButton AutoSpeakerScoredEB = (ElegantNumberButton) findViewById(R.id.Auto_Speaker_Scored_EB);

        //Defines and implements Button to continue along with variable savings
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                AutoAmpAttempt = Integer.toString(Integer.parseInt(AutoAmpAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpAttempt));
                AutoAmpScore = Integer.toString(Integer.parseInt(AutoAmpScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoAmpScore));
                AutoSpeakerAttempt = Integer.toString(Integer.parseInt(AutoSpeakerAttemptedEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerAttempt));
                AutoSpeakerScore = Integer.toString(Integer.parseInt(AutoSpeakerScoredEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoSpeakerScore));

                /*add in data collection pieces from checkboxes*/
                if (AutoStopButtonCB.isChecked()) {
                    AutoStopButtonPressed = "True";
                }
                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

}
