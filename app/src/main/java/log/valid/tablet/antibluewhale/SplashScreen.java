package log.valid.tablet.antibluewhale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        Thread thread = new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(2000);
                }catch (InterruptedException ex){
                    ex.printStackTrace();
                }
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("Task Number",R.string.task1);
                intent.putExtra("Task",R.string.task);
                startActivity(intent);
                finish();
            }
        };
        thread.start();
    }
}

