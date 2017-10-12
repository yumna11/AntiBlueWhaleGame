package log.valid.tablet.antibluewhale;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonNxt;
    Button buttonLst;
    TextView taskNumtxt;
    TextView taskDeftxt;
    String[] tasks ;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNxt = (Button) findViewById(R.id.buttonNext);
        buttonLst = (Button) findViewById(R.id.buttonLast);
        taskNumtxt = (TextView) findViewById(R.id.taskNum);
        taskDeftxt = (TextView) findViewById(R.id.taskDef);
        tasks = new String[31];
        tasks[0] = "Fetch a glass a water for siblings!";
        tasks[1] = "Clean your room in 15 minutes!";
        tasks[2] = "Talk to a family member or friend and ask what they most need help with you";
        tasks[13] = "Walk a minimum of 100 steps";
        tasks[4] = "Find ways to express your love to others";
        tasks[5] = "Respect your elders";
        tasks[6] = "Do 10 pushs up";
        tasks[7] = "Change your FB status to 'I am the Best!'";
        tasks[28] = "Send a nice message(quote) to someone! ";
        tasks[9] = "Lend your ear to someone who is sad," +
                " depressed, angry!" ;
        tasks[30] ="Take the time to teach someone a skill you know!" ;
        tasks[11] ="Donate something you don’t use!";
        tasks[12]="Have fun! Do what you actually enjoy doing! ";
        tasks[3]=" Blow up a balloon,then ask someone to pop it,when they do it,start screaming!";
        tasks[22]="Donate foods like unopened spices,toffess, or chocalate!";
        tasks[15]="Weight your body and tell your 10 friends!";
        tasks[26]="Sleep 2 hour in the afternoon!";
        tasks[17]="Talk with your mother for 1 hour!";
        tasks[18]="Post your funny picture on facebook!";
        tasks[19]="Slicing an onion without crying";
        tasks[20]="Say Hello to 10 unknown peoples!";
        tasks[21]="Throw a watermelon infront of someone.Then get on your knees,grab your hair";
        tasks[14]="Run up to someone random on the street and slap them with a loaf of bread";
        tasks[23]="Point at someone and shout 'You one of them!Run and pretend to trip'";
        tasks[24]="Go up to random people at the mall,show them Your ID,and say HAVE YOU SEEN THIS MAN";
        tasks[25]="Go to mcdonalds and ask for directions to burgerking";
        tasks[16]="Throw a book at someone's face and say You've been facebooked";
        tasks[27]="Call pizza hurt and and to deliver water";
        tasks[8]="GO to a libary and ask for a book on how to read";
        tasks[29]="Go to the dentist and tell them your toe hurts";
        tasks[10]="Find a ramdom person on a bendch,sit on their lap and say,'My mummy say's I AM Special'" ;



        buttonLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Main","Value of i "+i);
                i=i-1;
                if (i<1)
                {
                    Toast.makeText(getBaseContext(),"Proceed to Next Tasks!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    taskNumtxt.setText("Task # "+ i);
                    taskDeftxt.setText(tasks[i]);
                }

            }
        });

        buttonNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i<30)
                {
                    i++;
                    taskNumtxt.setText("Task # "+ i);
                    taskDeftxt.setText(tasks[i]);
                }
                else
                    Toast.makeText(getBaseContext(),"Your challenges are done!",Toast.LENGTH_SHORT).show();

            }
        });


    }

    private int value() {
        return i;
    }
}
