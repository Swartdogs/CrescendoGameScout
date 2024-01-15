package swart525.dw.md.scout.space.a525spacescout;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Actual_Submit extends AppCompatActivity {

    //Names the file it will be saved to
    public String fileName = "Red_3_Data.csv";
    public String filePath = "/ScoutData/";
    //Compiles string for CSV file
    public String Final_String = Data_Collection_Page_1.Team_Num + "," +
            Data_Collection_Page_1.Match_Num + "," +
            data_Collection_sandstorm.Fouls + "," +
            data_Collection_sandstorm.Mobility + "," +
            data_Collection_sandstorm.CSNoAttempt + "," +
            data_Collection_sandstorm.CSAttempted + "," +
            data_Collection_sandstorm.CSDocked + "," +
            data_Collection_sandstorm.CSEngaged + "," +
            data_Collection_sandstorm.AutoAttemptedPickUp + "," +
            data_Collection_sandstorm.AutoAttemptedPickUpScored + "," +
            data_Collection_sandstorm.AutoAttemptedPickUpHeld + "," +
            data_Collection_sandstorm.AutoTopConeScore + "," +
            data_Collection_sandstorm.AutoTopConeMiss + "," +
            data_Collection_sandstorm.AutoTopCubeScore + "," +
            data_Collection_sandstorm.AutoTopCubeMiss + "," +
            data_Collection_sandstorm.AutoMidConeScore + "," +
            data_Collection_sandstorm.AutoMidConeMiss + "," +
            data_Collection_sandstorm.AutoMidCubeScore + "," +
            data_Collection_sandstorm.AutoMidCubeMiss + "," +
            data_Collection_sandstorm.AutoBottomConeScore + "," +
            data_Collection_sandstorm.AutoBottomConeMiss + "," +
            data_Collection_sandstorm.AutoBottomCubeScore + "," +
            data_Collection_sandstorm.AutoBottomCubeMiss + "," +


            data_collection_TeleOP.Fouls + "," +
            data_collection_TeleOP.Defense + "," +
            data_collection_TeleOP.TeleTopConeScore + "," +
            data_collection_TeleOP.TeleTopConeMiss + "," +
            data_collection_TeleOP.TeleTopCubeScore + "," +
            data_collection_TeleOP.TeleTopCubeMiss + "," +
            data_collection_TeleOP.TeleMidConeScore + "," +
            data_collection_TeleOP.TeleMidConeMiss + "," +
            data_collection_TeleOP.TeleMidCubeScore + "," +
            data_collection_TeleOP.TeleMidCubeMiss + "," +
            data_collection_TeleOP.TeleBottomConeScore + "," +
            data_collection_TeleOP.TeleBottomConeMiss + "," +
            data_collection_TeleOP.TeleBottomCubeScore + "," +
            data_collection_TeleOP.TeleBottomCubeMiss + "," +
            data_collection_TeleOP.TeleFieldDropCone + "," +
            data_collection_TeleOP.TeleFieldDropCube + "," +
            data_collection_end_game.Parked + "," +
            data_collection_end_game.Docked + "," +
            data_collection_end_game.Engaged + "," +
            data_collection_end_game.None + "," +
            data_collection_end_game.Attempted + "," +
            data_collection_TeleOP.RobotTip + "," +
            data_collection_TeleOP.RobotStall + "," +

            Save_Page.comment + "," +
            Data_Collection_Page_1.Initials + "," +
            Data_Collection_Page_1.NoShow;

    File externalStorageDir = Environment.getExternalStorageDirectory();
    public File Scout_Data = new File(externalStorageDir , "/DCIM/" + fileName);

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);
        Button Press_Here = (Button) findViewById(R.id.Press_Here);
        Button Click_to_go_Back = (Button) findViewById(R.id.Backto);

        Click_to_go_Back.setOnClickListener(new View.OnClickListener(){//Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
    } */


    //Checks for confirmation from external storage
        private boolean isExternalStorageWritable () {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                Log.i("State", "Yes, it is writable!");
                return true;
            } else {
                return false;
            }
        }

        public void Press_Here (View v){
            if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                if(Scout_Data.exists() && Scout_Data.isFile() ){
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Scout_Data, true)));
                        out.println(Final_String);
                        out.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    File textFile = new File(Environment.getExternalStorageDirectory().getPath() + "/DCIM", fileName);
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        FileOutputStream fos = new FileOutputStream(textFile);
                        Final_String = Final_String + "\n";
                        fos.write(Final_String.getBytes());
                        fos.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                //write an else if - turn on permissions
            }
        }

    public boolean checkPermission (String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actual__submit);
            final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
            Press_Here.setVisibility(View.VISIBLE);

    }
}










