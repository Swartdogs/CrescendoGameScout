package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines Variables for Match/Team Number
    public static int Team_Num = 0;
    public static int Match_Num = 0;
    public static int Match_Num_Real = 0;
    public static String Initials = "We got a runner";
    public static String NoShow = "false";
    public static ArrayList<String> MatchSchedule;


    //List<List<String>> records = new ArrayList<>();
   // try BufferedReader br = new BufferedReader(new FileReader("matchschedule.csv"));{
      //  String line;
      //  while (true) {
        //    try {
      //          if (!((line = br.readLine()) != null)) break;
        //    } catch (IOException e) {
        //        throw new RuntimeException(e);
       //     }
        //    String[] values = line.split(",");
        //    records.add(Arrays.asList(values));
      //  }
  //  }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison numbers
        final int Compare_Match_Num = 80; //Match must be less than 150
        final int Compare_Team_Num = 1; //Team must be greater than 1

        //Defines text boxes for Match/Team Number
        final EditText Match_Num_txt = (EditText) findViewById(R.id.Match_Num_txt);
        final EditText Team_Num_txt = (EditText) findViewById(R.id.Team_Num_txt);
        final EditText Initials_txt = (EditText) findViewById(R.id.Init_Txt);

        //Defines checkboxes
        final CheckBox NoShowCB = (CheckBox) findViewById(R.id.No_Show_CB);



        EditText et = (EditText)findViewById(R.id.Team_Num_txt);
        et.setVisibility(View.INVISIBLE);

        TextView tv = (TextView)findViewById(R.id.TeamNumTB);
        tv.setVisibility(View.VISIBLE);



        //Defines button needed and actions to cancel a data collection
        Button Cancel_Collection = (Button) findViewById(R.id.Cancel_Collection_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override

            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });
        MatchSchedule = new ArrayList<>();
        MatchSchedule.add("6706");
        MatchSchedule.add("8737");
        MatchSchedule.add("5935");
        MatchSchedule.add("8766");
        MatchSchedule.add("6217");
        MatchSchedule.add("167");
        MatchSchedule.add("1625");
        MatchSchedule.add("4859");
        MatchSchedule.add("8822");
        MatchSchedule.add("9570");
        MatchSchedule.add("4624");
        MatchSchedule.add("9543");
        MatchSchedule.add("7541");
        MatchSchedule.add("1625");
        MatchSchedule.add("967");
        MatchSchedule.add("8744");
        MatchSchedule.add("6420");
        MatchSchedule.add("7848");
        MatchSchedule.add("9543");
        MatchSchedule.add("6706");
        MatchSchedule.add("2526");
        MatchSchedule.add("7309");
        MatchSchedule.add("5041");
        MatchSchedule.add("1785");
        MatchSchedule.add("4728");
        MatchSchedule.add("5576");
        MatchSchedule.add("7541");
        MatchSchedule.add("7848");
        MatchSchedule.add("967");
        MatchSchedule.add("3928");
        MatchSchedule.add("4143");
        MatchSchedule.add("8298");
        MatchSchedule.add("8822");
        MatchSchedule.add("9639");
        MatchSchedule.add("5275");
        MatchSchedule.add("9570");
        MatchSchedule.add("4607");
        MatchSchedule.add("1785");
        MatchSchedule.add("9639");
        MatchSchedule.add("9508");
        MatchSchedule.add("2654");
        MatchSchedule.add("6420");
        MatchSchedule.add("9579");
        MatchSchedule.add("2847");
        MatchSchedule.add("6419");
        MatchSchedule.add("8766");
        MatchSchedule.add("4607");
        MatchSchedule.add("4728");
        MatchSchedule.add("6217");
        MatchSchedule.add("9061");
        MatchSchedule.add("6455");
        MatchSchedule.add("6805");
        MatchSchedule.add("167");
        MatchSchedule.add("6424");
        MatchSchedule.add("7531");
        MatchSchedule.add("8821");
        MatchSchedule.add("4624");
        MatchSchedule.add("2654");
        MatchSchedule.add("5041");
        MatchSchedule.add("1625");
        MatchSchedule.add("9639");
        MatchSchedule.add("5837");
        MatchSchedule.add("5935");
        MatchSchedule.add("4646");
        MatchSchedule.add("8766");
        MatchSchedule.add("3723");
        MatchSchedule.add("8821");
        MatchSchedule.add("5041");
        MatchSchedule.add("4260");
        MatchSchedule.add("1156");
        MatchSchedule.add("4655");
        MatchSchedule.add("8744");
        MatchSchedule.add("8824");
        MatchSchedule.add("9508");
        MatchSchedule.add("4260");
        MatchSchedule.add("525");
        MatchSchedule.add("7541");
        MatchSchedule.add("9092");
        MatchSchedule.add("7021");
        MatchSchedule.add("7531");





        Match_Num_txt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!Match_Num_txt.getText().toString().isEmpty()){
                    Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());
                    Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
                    if (Compare_Match_Num < Match_Num_Real){
                        Toast.makeText(Data_Collection_Page_1.this, "That is not a valid match number. Please try again!", Toast.LENGTH_LONG).show();
                    }
                    else {
                        TextView TeamNumTB = findViewById(R.id.TeamNumTB);
                        TeamNumTB.setText(MatchSchedule.get(Match_Num_Real - 1));
                    }
                }

            }
        });
        Button OverrideTeamnum = (Button) findViewById(R.id.Override_Teamnum_B);
        OverrideTeamnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.Team_Num_txt);
                et.setVisibility(View.VISIBLE);

                TextView tv = (TextView)findViewById(R.id.TeamNumTB);
                tv.setVisibility(View.INVISIBLE);
           //     Match_Num = Integer.parseInt(Match_Num_txt.getText().toString());
            }
        });

        //Defines Start button and takes to next page as well as recording data
        Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
        Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                if (Initials_txt.getText().toString().isEmpty() || Match_Num_txt.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter ALL Information!", Toast.LENGTH_LONG).show();
                } else {
                    int Match_Num_Real = Integer.parseInt(Match_Num_txt.getText().toString());

                    if (NoShowCB.isChecked()) {
                        NoShow = "True";
                    }

                    if (Compare_Match_Num > Match_Num_Real) {

                        if(et.getText().toString().isEmpty() ) {
                            Team_Num = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1)); //Sets team num data to txt box information
                        }
                        else {
                            Team_Num = Integer.parseInt(et.getText().toString());
                        }
                        Match_Num = Integer.parseInt(Match_Num_txt.getText().toString()); //Sets match num data to txt box information
                        Initials = Initials_txt.getText().toString();
                        Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                        startActivity(startintent);

                    } else {
                        Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();
                    }

                    //Defines Start button and takes to next page as well as recording data
                    Button Start_Collection = (Button) findViewById(R.id.Start_Collection);
                    Start_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button ~ an onclick listener is when the code is looking for you to click(event) so that it can make something visible
                        @Override
                        public void onClick(View v) {
                            TextView TeamNumTB = findViewById(R.id.TeamNumTB);
                            TeamNumTB.setText(MatchSchedule.get(Match_Num_Real - 1));
                            int Team_Num_Real = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1));
                            if (Compare_Team_Num < Team_Num_Real) {
                                Team_Num = Integer.parseInt(MatchSchedule.get(Match_Num_Real-1)); //Sets team num data to txt box information

                                Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                                startActivity(startintent);
                            } else {
                                Toast.makeText(Data_Collection_Page_1.this, "Did you make a mistake? Please make sure Team Number and Match Number aren't flipped.", Toast.LENGTH_LONG).show();

                            }

                        }
                    });
                }
            }
        });}}