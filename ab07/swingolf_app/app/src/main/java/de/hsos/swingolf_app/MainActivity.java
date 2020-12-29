package de.hsos.swingolf_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  Button btnStartNewGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  onWindowFocusChanged();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        btnStartNewGame = (Button) findViewById(R.id.btn_start_new_game);

        btnStartNewGame.setOnClickListener(v -> {
         Intent intent = new Intent(this, CreateGameActivity.class);
         startActivity(intent);

        });

    }
    public void onWindowFocusChanged(boolean hasFocas){
        super.onWindowFocusChanged(hasFocas);
        View decorView = getWindow().getDecorView();
      if(hasFocas) {
          int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN |  View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
          decorView.setSystemUiVisibility(uiOptions);


      }
    }

}