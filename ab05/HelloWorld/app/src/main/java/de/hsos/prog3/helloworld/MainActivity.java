package de.hsos.prog3.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView;
    private Canvas canvas;
    private Bitmap bitmap;
    private Paint paint;

    private Timer timer = new Timer();
    private final int textsize = 50;

    int breite = 800;
    int hoehe = 800;
    int ballRadius = 20; float ballX = 100f; float ballY = 700f; float velociteX = 4.5f; float velociteY = 4.5f;
    int grenzeLinks = 0; int grenzeRechts = breite-100; int grenzeOben = 20; int grenzeUnten = 770;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.bitmap = Bitmap.createBitmap(this.breite, this.hoehe, Bitmap.Config.ARGB_8888);
        this.canvas = new Canvas(this.bitmap);
        this.imageView = new ImageView(this);
        this.imageView.setImageBitmap(this.bitmap);
        this.paint = new Paint();

        setContentView(imageView);

        this.canvas.drawColor(Color.argb(255, 0, 0, 255));
        this.paint.setTextSize(50);
        //this.halloWelt();
        //this.halloNachbar();
        //zeichneSmiley(150);
        setContentView(R.layout.activity_main);

        setContentView(imageView);

        this.timer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        MainActivity.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                halloWelt();
                                halloNachbar();
                                zeichneSmiley(150);
                                derSpringendePunkt();

                            }
                        });
                        //derSpringendePunkt();
                    }
                }
                , 0, 17);
    }

    private void halloWelt() {
        String text = "Hallo Welt!";
        textZentrieren(text, 100);
    }
    private void halloNachbar(){
        String text = "Hallo Finn + Stefan!";
        textZentrieren(text, hoehe / 100 * 20);
    }
    private void textZentrieren(String text, int y){
        float textWidth = this.paint.measureText(text);
        this.paint.setColor(Color.WHITE);
        this.canvas.drawText(text, breite/ 2 - textWidth/ 2, y, this.paint);

    }
    public void zeichneSmiley(int radius){
        int yPercentage = 45;
        int eyeMarginX = 50;
        int eyeMarginY = 20;
        int mouthMarginY = 40;
        int mouthWidth = 90;
        int earradius = 50;
        int yPercentageEar = 35;
        this.paint.setColor(Color.GREEN);
        this.canvas.drawCircle(breite / 2, (hoehe / 100 * yPercentage), radius, this.paint); // gesicht
        this.canvas.drawCircle(breite / 3, (hoehe / 100 * yPercentageEar), earradius, this.paint); //ohr links
        this.canvas.drawCircle(breite * 2/ 3, (hoehe / 100 * yPercentageEar), earradius, this.paint); //ohr rechts
        this.paint.setColor(Color.BLACK);


        this.canvas.drawCircle((breite / 2) - eyeMarginX, (hoehe / 100 * yPercentage) - eyeMarginY, radius / 10, this.paint); // linkes auge
        this.canvas.drawCircle((breite / 2) + eyeMarginX, (hoehe / 100 * yPercentage) - eyeMarginY, radius / 10, this.paint); // rechts auge
        this.paint.setStrokeWidth(10);
        this.canvas.drawLine((breite / 2) - mouthWidth / 2, (hoehe / 100 * yPercentage) + mouthMarginY, (breite / 2) + mouthWidth / 2, (hoehe / 100 * yPercentage) + mouthMarginY, this.paint);


    }
    public void derSpringendePunkt(){
       // Log.i("MainActivity", LocalDateTime.now()  + ": der springende Punkt");
        this.paint.setColor(Color.BLUE);
        this.canvas.drawText("DVD",ballX,ballY,this.paint);

       // this.canvas.drawCircle(ballX, ballY, ballRadius, this.paint);
        this.ballX += velociteX;
        this.ballY += velociteY;

        if (ballY <= grenzeOben || ballY >= grenzeUnten) this.velociteY *= -1;
        if (ballX >= grenzeRechts ||ballX <= grenzeLinks) this.velociteX *= -1;

        this.paint.setColor(Color.YELLOW);
        this.canvas.drawText("DVD",ballX,ballY,this.paint);
        this.imageView.invalidate();
    }
}