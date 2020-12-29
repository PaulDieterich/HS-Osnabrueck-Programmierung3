package de.hsos.swingolf_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {


    TableLayout tbl;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game);
        drawTabel();

    }


    private void drawTabel(){
        tbl = (TableLayout) findViewById(R.id.scoreTabel);
        //add a new Row
        for (int row = 1; row < 10; row++) {
            TableRow newRow = new TableRow(this);
            //add colums/textviews for every row
            TextView tv = new TextView(this);
            tv.append(Integer.toString(row));
            for (int colum = 0; colum < 4; colum++) {
                tv.setGravity(View.TEXT_ALIGNMENT_CENTER);
                newRow.addView(tv);
                tbl.addView(newRow);
            }
        }
        TableRow newRow = new TableRow(this);
        TextView tv = new TextView(this);
        tv.append("Total");
        for (int colum = 0; colum < 4; colum++) {
            tv.setGravity(View.TEXT_ALIGNMENT_CENTER);
            newRow.addView(tv);
            tbl.addView(newRow);
        }



    }
}