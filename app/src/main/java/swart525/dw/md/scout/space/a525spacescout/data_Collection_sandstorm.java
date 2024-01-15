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
   // public static String Taxi_Yes = "False";
   // public static String Taxi_No = "False";
   // public static String AutoUpperhubScore = "0";
  //  public static String AutoUpperhubMiss = "0";

    public static String AutoAttemptedPickUp = "False";
    public static String AutoAttemptedPickUpScored = "False";
    public static String AutoAttemptedPickUpHeld = "False";
    public static String Mobility = "False";
    public static String CSNoAttempt = "False";
    public static String CSAttempted = "False";
    public static String CSDocked = "False";
    public static String CSEngaged = "False";
    public static String Fouls = "False";

    public static String AutoTopConeScore = "0";
    public static String AutoTopConeMiss = "0";
    public static String AutoTopCubeScore = "0";
    public static String AutoTopCubeMiss = "0";
    public static String AutoMidConeScore = "0";
    public static String AutoMidConeMiss = "0";
    public static String AutoMidCubeScore = "0";
    public static String AutoMidCubeMiss = "0";
    public static String AutoBottomConeScore = "0";
    public static String AutoBottomConeMiss = "0";
    public static String AutoBottomCubeScore = "0";
    public static String AutoBottomCubeMiss = "0";
    public static String Add_AutoTopConeScore = "0";
    public static String Add_AutoTopConeMiss = "0";
    public static String Add_AutoTopCubeScore = "0";
    public static String Add_AutoTopCubeMiss = "0";
    public static String Add_AutoMidConeScore = "0";
    public static String Add_AutoMidConeMiss = "0";
    public static String Add_AutoMidCubeScore = "0";
    public static String Add_AutoMidCubeMiss = "0";
    public static String Add_AutoBottomConeScore = "0";
    public static String Add_AutoBottomConeMiss = "0";
    public static String Add_AutoBottomCubeScore = "0";
    public static String Add_AutoBottomCubeMiss = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection_sandstorm);

        //Defines all Radio and CheckBoxes for positions
        final CheckBox AutoAttemptedPickUpCB = (CheckBox) findViewById(R.id.auto_AttemptedPickUp_CB);
        final CheckBox AutoAttemptedPickUpScoredCB = (CheckBox) findViewById(R.id.auto_PickedUpScored_CB);
        final CheckBox AutoAttemptedPickUpHeldCB = (CheckBox) findViewById(R.id.auto_PickedUpHeld_CB);
        final CheckBox MobilityCB = (CheckBox) findViewById(R.id.auto_Mobility_CB);
        final RadioButton CSNoAttemptRB = (RadioButton) findViewById(R.id.auto_CSNoAttempt_RB);
        final RadioButton CSAttemptedRB = (RadioButton) findViewById(R.id.auto_CSAttempted_RB);
        final RadioButton CSDockedRB = (RadioButton) findViewById(R.id.auto_CSDocked_RB);
        final RadioButton CSEngagedRB = (RadioButton) findViewById(R.id.auto_CSEngaged_RB);
        final CheckBox FoulsCB = (CheckBox) findViewById(R.id.auto_Fouls_CB);


        //final RadioButton TaxiYesRB = (RadioButton) findViewById(R.id.Auto_Taxi_Yes_RB);
        //final RadioButton TaxiNoRB = (RadioButton) findViewById(R.id.Auto_Taxi_No_RB);


        //Defines "Elegant" Number Blocks
        final ElegantNumberButton AutoTopConeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Top_Cone_Score_EB);
        final ElegantNumberButton AutoTopConeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Top_Cone_Miss_EB);
        final ElegantNumberButton AutoTopCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Top_Cube_Score_EB);
        final ElegantNumberButton AutoTopCubeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Top_Cube_Miss_EB);
        final ElegantNumberButton AutoMidConeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Mid_Cone_Score_EB);
        final ElegantNumberButton AutoMidConeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Mid_Cone_Miss_EB);
        final ElegantNumberButton AutoMidCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Mid_Cube_Score_EB);
        final ElegantNumberButton AutoMidCubeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Mid_Cube_Miss_EB);
        final ElegantNumberButton AutoBottomConeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Bottom_Cone_Score_EB);
        final ElegantNumberButton AutoBottomConeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Bottom_Cone_Miss_EB);
        final ElegantNumberButton AutoBottomCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Auto_Bottom_Cube_Score_EB);
        final ElegantNumberButton AutoBottomCubeMissEB = (ElegantNumberButton) findViewById(R.id.Auto_Bottom_Cube_Miss_EB);


        //Defines and implements Button to continue along with variable savings
        Button To_Teleop = (Button) findViewById(R.id.To_Teleop);
        To_Teleop.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                AutoTopConeScore = Integer.toString(Integer.parseInt(AutoTopConeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoTopConeScore));
                AutoTopCubeScore = Integer.toString(Integer.parseInt(AutoTopCubeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoTopCubeScore));
                AutoTopConeMiss = Integer.toString(Integer.parseInt(AutoTopConeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoTopConeMiss));
                AutoTopCubeMiss = Integer.toString(Integer.parseInt(AutoTopCubeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoTopCubeMiss));
                AutoMidConeScore = Integer.toString(Integer.parseInt(AutoMidConeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoMidConeScore));
                AutoMidCubeScore = Integer.toString(Integer.parseInt(AutoMidCubeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoMidCubeScore));
                AutoMidConeMiss = Integer.toString(Integer.parseInt(AutoMidConeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoMidConeMiss));
                AutoMidCubeMiss = Integer.toString(Integer.parseInt(AutoMidCubeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoMidCubeMiss));
                AutoBottomConeScore = Integer.toString(Integer.parseInt(AutoBottomConeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoBottomConeScore));
                AutoBottomCubeScore = Integer.toString(Integer.parseInt(AutoBottomCubeScoreEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoBottomCubeScore));
                AutoBottomConeMiss = Integer.toString(Integer.parseInt(AutoBottomConeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoBottomConeMiss));
                AutoBottomCubeMiss = Integer.toString(Integer.parseInt(AutoBottomCubeMissEB.getNumber()) + Integer.parseInt(data_Collection_sandstorm.Add_AutoBottomCubeMiss));


                /*add in data collection pieces from checkboxes*/
                if (AutoAttemptedPickUpCB.isChecked()) {
                    AutoAttemptedPickUp = "True";
                }
                if (AutoAttemptedPickUpScoredCB.isChecked()) {
                    AutoAttemptedPickUpScored = "True";
                }
                if (AutoAttemptedPickUpHeldCB.isChecked()) {
                    AutoAttemptedPickUpHeld = "True";
                }
                if (MobilityCB.isChecked()) {
                    Mobility = "True";
                }
                if (CSEngagedRB.isChecked()) {
                    CSEngaged = "True";
                }
                if (CSNoAttemptRB.isChecked()) {
                    CSNoAttempt = "True";
                }
                if (CSAttemptedRB.isChecked()) {
                    CSAttempted = "True";
                }
                if (CSDockedRB.isChecked()) {
                    CSDocked = "True";
                }
                if (CSEngagedRB.isChecked()) {
                    CSEngaged = "True";
                }
                if (FoulsCB.isChecked()){
                    Fouls = "True";
                }

                Intent startintent = new Intent(getApplicationContext(), data_collection_TeleOP.class);
                startActivity(startintent);
            }
        });

    }

}
