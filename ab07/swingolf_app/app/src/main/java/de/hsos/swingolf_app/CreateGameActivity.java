package de.hsos.swingolf_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class CreateGameActivity extends AppCompatActivity {

    public static final String COURSE_NAME = "de.hsos.swingolf_app.CreateGame.COURSE_NAME";
    public static final String NUMBER_TRACKS = "de.hsos.swingolf_app.CreateGame.NUMBER_TRACKS";
    public static final String PERSON_NAME_ONE = "de.hsos.swingolf_app.CreateGame.PERSON_NAME_ONE";
    public static final String PERSON_NAME_TWO = "de.hsos.swingolf_app.CreateGame.PERSON_NAME_TWO";
    private  static final String TAG ="CreateGameActivity";
    private Button btn_create;
    private EditText edt_courseName;
    private EditText edt_countOfTracks;
    private EditText edt_personNameOne;
    private EditText edt_personNameTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_create_game);
        setTitle("Create a Game");

        btn_create = this.findViewById(R.id.btn_create_game);
        edt_courseName = this.findViewById(R.id.editTextCourseName);
        edt_countOfTracks = this.findViewById(R.id.numberTracks);
        edt_personNameOne = this.findViewById(R.id.personNameOne);
        edt_personNameTwo = this.findViewById(R.id.personNameTwo);

        btn_create.setOnClickListener(v -> {
            Log.d(TAG, "OnClickListener");
            Intent intent = new Intent(this, GameActivity.class);
            Log.d(TAG, "start a new game");
            startActivity(intent);
        /*    String courseName = edt_courseName.getText().toString();
            String countOfTracks = edt_countOfTracks.getText().toString();
            String personNameOne = edt_personNameOne.getText().toString();
            String personNameTwo = edt_personNameTwo.getText().toString();

            if(checkStringInput(courseName)){

                intent.putExtra(COURSE_NAME,courseName);
                intent.putExtra(NUMBER_TRACKS, countOfTracks);
                intent.putExtra(PERSON_NAME_ONE, personNameOne);
                intent.putExtra(PERSON_NAME_TWO, personNameTwo);

            }else{
                Log.e(TAG, "starting game not sucsessfull, wrong input");
            }
*/
        });


    }
    private boolean checkNumericInput(int input){

        return true;
    }
    private boolean checkStringInput(String input){
        return true;
    }

}