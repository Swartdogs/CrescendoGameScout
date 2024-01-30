package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;


//After the first competition, we decided to only count the inner and outer
//goals as the top goal instead of separating them. When scouting, it was too
//hard to distinguish whether it hit the inner or outer.

//We also decided we did not need the cycle time data, so the Cycle Counter
//buttons were deleted. The same was true for the Crossing through the shield generator.

//The code for the above deleted was commented and not deleted.

public class data_collection_TeleOP extends AppCompatActivity {

    //Defines variables for data collection

    public static String RobotTip = "False";
    public static String RobotStall = "False";
    public static String Defense = "False";
    public static String Fouls = "False";
    public static String Hung = "False";
    public static String AttemptedHang = "False";
    public static String Parked = "False";
    public static String Solo = "False";
    public static String Harmony = "False";
    public static String ScoredTrap = "False";
    public static String AttemptedTrap = "False";
    public static String NoneTrap = "False";
    public static String NoneHang = "False";
    public static String TeleAmpScore = "0";
    public static String TeleSpeakerScore = "0";
    public static String TeleAmpMiss = "0";
    public static String TeleSpeakerMiss = "0";

    public static String Add_TeleAmpScore = "0";
    public static String Add_TeleSpeakerScore = "0";
    public static String Add_TeleAmpMiss = "0";
    public static String Add_TeleSpeakerMiss = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxes
        final CheckBox RobotTipCB = (CheckBox) findViewById(R.id.tipped_CB);
        final CheckBox RobotStallCB = (CheckBox) findViewById(R.id.stalled_CB);
        final CheckBox DefenseCB = (CheckBox) findViewById(R.id.defense_CB);
        final CheckBox FoulsCB = (CheckBox) findViewById(R.id.foul_CB);
        final CheckBox HungCB = (CheckBox) findViewById(R.id.hung_CB);
        final CheckBox AttemptedHangCB = (CheckBox) findViewById(R.id.attemptedhang_CB);
        final CheckBox ParkedCB = (CheckBox) findViewById(R.id.parked_CB);
        final CheckBox SoloCB = (CheckBox) findViewById(R.id.solo_CB);
        final CheckBox HarmonyCB = (CheckBox) findViewById(R.id.harmony_CB);
        final CheckBox ScoredTrapCB = (CheckBox) findViewById(R.id.scoredtrap_CB);
        final CheckBox AttemptedTrapCB = (CheckBox) findViewById(R.id.attemptedtrap_CB);
        final CheckBox NoneTrapCB = (CheckBox) findViewById(R.id.nonetrap_CB);
        final CheckBox NoneHangCB = (CheckBox) findViewById(R.id.nonehang_CB);

        //Defines "Elegant" Number Blocks
        final ElegantNumberButton TeleAmpScoredEB = (ElegantNumberButton) findViewById(R.id.TeleAmpScore_EB);
        final ElegantNumberButton TeleAmpMissedEB = (ElegantNumberButton) findViewById(R.id.TeleAmpMissed_EB);
        final ElegantNumberButton TeleSpeakerMissedEB = (ElegantNumberButton) findViewById(R.id.TeleSpeakerMissed_EB);
        final ElegantNumberButton TeleSpeakerScoredEB = (ElegantNumberButton) findViewById(R.id.TeleSpeakerScore_EB);

        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.toSubmission);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
           @Override
           public void onClick(View v) {

                TeleAmpScore = Integer.toString(Integer.parseInt(TeleAmpScoredEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleAmpScore));
                TeleAmpMiss = Integer.toString(Integer.parseInt(TeleAmpMissedEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleAmpMiss));
                TeleSpeakerMiss = Integer.toString(Integer.parseInt(TeleSpeakerMissedEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleSpeakerMiss));
                TeleSpeakerScore = Integer.toString(Integer.parseInt(TeleSpeakerScoredEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleSpeakerScore));

                if (RobotTipCB.isChecked()) {
                    RobotTip = "True";
                }
                if (RobotStallCB.isChecked()) {
                    RobotStall = "True";
                }
                if (DefenseCB.isChecked()) {
                    Defense = "True";
                }
                if (FoulsCB.isChecked()) {
                    Fouls = "True";
                }
                if (HungCB.isChecked()) {
                    Hung = "True";
                }
                if (RobotTipCB.isChecked()) {
                   RobotTip = "True";
                }
                if (AttemptedHangCB.isChecked()) {
                   AttemptedHang = "True";
                }
                if (ParkedCB.isChecked()) {
                    Parked = "True";
                }
                if (SoloCB.isChecked()) {
                    Solo = "True";
                }
                if (HarmonyCB.isChecked()) {
                    Harmony = "True";
                }
                if (ScoredTrapCB.isChecked()) {
                    ScoredTrap = "True";
                }
                if (AttemptedTrapCB.isChecked()) {
                    AttemptedTrap = "True";
                }
                if (NoneTrapCB.isChecked()) {
                    NoneTrap = "True";
                }
                if (NoneHangCB.isChecked()) {
                    NoneHang = "True";
                }


                    Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                    startActivity(startintent);
                }

        });
    }
}
