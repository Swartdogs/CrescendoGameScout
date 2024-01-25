package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                Data_Collection_Page_1.NoShow = "False";

                data_Collection_sandstorm.AutoStopButtonPressed = "False";
                data_Collection_sandstorm.AutoAmpAttempt = "0";
                data_Collection_sandstorm.AutoAmpScore = "0";
                data_Collection_sandstorm.AutoSpeakerAttempt = "0";
                data_Collection_sandstorm.AutoSpeakerScore = "0";

                data_collection_TeleOP.RobotTip = "False";
                data_collection_TeleOP.RobotStall = "False";
                data_collection_TeleOP.Defense = "False";
                data_collection_TeleOP.Fouls = "False";
                data_collection_TeleOP.TeleTopConeScore = "0";
                data_collection_TeleOP.TeleTopConeMiss = "0";
                data_collection_TeleOP.TeleTopCubeScore = "0";
                data_collection_TeleOP.TeleTopCubeMiss = "0";
                data_collection_TeleOP.TeleMidConeScore = "0";
                data_collection_TeleOP.TeleMidConeMiss = "0";
                data_collection_TeleOP.TeleMidCubeScore = "0";
                data_collection_TeleOP.TeleMidCubeMiss = "0";
                data_collection_TeleOP.TeleBottomConeScore = "0";
                data_collection_TeleOP.TeleBottomConeMiss = "0";
                data_collection_TeleOP.TeleBottomCubeScore = "0";
                data_collection_TeleOP.TeleBottomCubeMiss = "0";
                data_collection_TeleOP.TeleFieldDropCone = "0";
                data_collection_TeleOP.TeleFieldDropCube = "0";

                data_collection_end_game.Docked = "False";
                data_collection_end_game.Engaged = "False";
                data_collection_end_game.Parked = "False";
                data_collection_end_game.Attempted = "False";
                data_collection_end_game.None = "False";

                Intent startintent = new Intent(getApplicationContext(), Data_Collection_Page_1.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}