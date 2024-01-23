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

    public static String TeleTopConeScore = "0";
    public static String TeleTopConeMiss = "0";
    public static String TeleTopCubeScore = "0";
    public static String TeleTopCubeMiss = "0";
    public static String TeleMidConeScore = "0";
    public static String TeleMidConeMiss = "0";
    public static String TeleMidCubeScore = "0";
    public static String TeleMidCubeMiss = "0";
    public static String TeleBottomConeScore = "0";
    public static String TeleBottomConeMiss = "0";
    public static String TeleBottomCubeScore = "0";
    public static String TeleBottomCubeMiss = "0";
    public static String Add_TeleTopConeScore = "0";
    public static String Add_TeleTopConeMiss = "0";
    public static String Add_TeleTopCubeScore = "0";
    public static String Add_TeleTopCubeMiss = "0";
    public static String Add_TeleMidConeScore = "0";
    public static String Add_TeleMidConeMiss = "0";
    public static String Add_TeleMidCubeScore = "0";
    public static String Add_TeleMidCubeMiss = "0";
    public static String Add_TeleBottomConeScore = "0";
    public static String Add_TeleBottomConeMiss = "0";
    public static String Add_TeleBottomCubeScore = "0";
    public static String Add_TeleBottomCubeMiss = "0";

    public static String TeleFieldDropCone = "0";
    public static String TeleFieldDropCube = "0";
    public static String Add_TeleFieldDropCone = "0";
    public static String Add_TeleFieldDropCube = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection__tele_op);

        //Defines all checkboxes
        final CheckBox RobotTipCB = (CheckBox) findViewById(R.id.tele_RobotTip_CB);
        final CheckBox RobotStallCB = (CheckBox) findViewById(R.id.tele_RobotStall_CB);
        final CheckBox DefenseCB = (CheckBox) findViewById(R.id.tele_Defense_CB);
        final CheckBox FoulsCB = (CheckBox) findViewById(R.id.tele_Fouls_CB);

        //Defines "Elegant" Number Blocks
        final ElegantNumberButton TeleTopConeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Top_Cone_Score_EB);
        final ElegantNumberButton TeleTopConeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Top_Cone_Miss_EB);
        final ElegantNumberButton TeleTopCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Top_Cube_Score_EB);
        final ElegantNumberButton TeleTopCubeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Top_Cube_Miss_EB);
        final ElegantNumberButton TeleMidConeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Mid_Cone_Score_EB);
        final ElegantNumberButton TeleMidConeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Mid_Cone_Miss_EB);
        final ElegantNumberButton TeleMidCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Mid_Cube_Score_EB);
        final ElegantNumberButton TeleMidCubeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Mid_Cube_Miss_EB);
        final ElegantNumberButton TeleBottomConeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Bottom_Cone_Score_EB);
        final ElegantNumberButton TeleBottomConeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Bottom_Cone_Miss_EB);
        final ElegantNumberButton TeleBottomCubeScoreEB = (ElegantNumberButton) findViewById(R.id.Tele_Bottom_Cube_Score_EB);
        final ElegantNumberButton TeleBottomCubeMissEB = (ElegantNumberButton) findViewById(R.id.Tele_Bottom_Cube_Miss_EB);
        final ElegantNumberButton TeleFieldDropConeEB = (ElegantNumberButton) findViewById(R.id.Tele_FieldDrop_Cone_EB);
        final ElegantNumberButton TeleFieldDropCubeEB = (ElegantNumberButton) findViewById(R.id.Tele_FieldDrop_Cube_EB);


        //Below defines the button and commands for saving data and switching pages
        Button To_EndGame = (Button) findViewById(R.id.toSubmission);
        To_EndGame.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
           @Override
           public void onClick(View v) {

                TeleTopConeScore = Integer.toString(Integer.parseInt(TeleTopConeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleTopConeScore));
                TeleTopCubeScore = Integer.toString(Integer.parseInt(TeleTopCubeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleTopCubeScore));
                TeleTopConeMiss = Integer.toString(Integer.parseInt(TeleTopConeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleTopConeMiss));
                TeleTopCubeMiss = Integer.toString(Integer.parseInt(TeleTopCubeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleTopCubeMiss));
                TeleMidConeScore = Integer.toString(Integer.parseInt(TeleMidConeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleMidConeScore));
                TeleMidCubeScore = Integer.toString(Integer.parseInt(TeleMidCubeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleMidCubeScore));
                TeleMidConeMiss = Integer.toString(Integer.parseInt(TeleMidConeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleMidConeMiss));
                TeleMidCubeMiss = Integer.toString(Integer.parseInt(TeleMidCubeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleMidCubeMiss));
                TeleBottomConeScore = Integer.toString(Integer.parseInt(TeleBottomConeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleBottomConeScore));
                TeleBottomCubeScore = Integer.toString(Integer.parseInt(TeleBottomCubeScoreEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleBottomCubeScore));
                TeleBottomConeMiss = Integer.toString(Integer.parseInt(TeleBottomConeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleBottomConeMiss));
                TeleBottomCubeMiss = Integer.toString(Integer.parseInt(TeleBottomCubeMissEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleBottomCubeMiss));
                TeleFieldDropCone = Integer.toString(Integer.parseInt(TeleFieldDropConeEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleFieldDropCone));
                TeleFieldDropCube = Integer.toString(Integer.parseInt(TeleFieldDropCubeEB.getNumber()) + Integer.parseInt(data_collection_TeleOP.Add_TeleFieldDropCube));

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


                    Intent startintent = new Intent(getApplicationContext(), data_collection_end_game.class);
                    startActivity(startintent);
                }

        });
    }
}
