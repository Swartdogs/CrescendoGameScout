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

                data_Collection_sandstorm.AutoAmpAttempt = "0";
                data_Collection_sandstorm.AutoAmpScore = "0";
                data_Collection_sandstorm.AutoSpeakerAttempt = "0";
                data_Collection_sandstorm.AutoSpeakerScore = "0";
                data_collection_TeleOP.RobotTip = "False";
                data_collection_TeleOP.RobotStall = "False";
                data_collection_TeleOP.Defense = "False";
                data_collection_TeleOP.Fouls = "False";
                data_collection_TeleOP.SoloHang = "False";
                data_collection_TeleOP.HarmonyHang = "False";
                data_collection_TeleOP.ScoredTrap = "False";
                data_collection_TeleOP.AttemptedTrap = "False";
                data_collection_TeleOP.AttemptedHang = "False";
                data_collection_TeleOP.NoneHang = "False";
                data_collection_TeleOP.NoneTrap = "False";
                data_collection_TeleOP.TeleAmpScore = "0";
                data_collection_TeleOP.TeleAmpMiss = "0";
                data_collection_TeleOP.TeleSpeakerMiss = "0";
                data_collection_TeleOP.TeleSpeakerScore = "0";


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