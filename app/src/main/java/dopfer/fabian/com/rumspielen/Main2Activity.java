package dopfer.fabian.com.rumspielen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String s = intent.getStringExtra("id");

        Toast toast = Toast.makeText(getApplicationContext(),"deine name ist "+s,Toast.LENGTH_LONG);
        toast.show();

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new  Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent1);
            }
        });

        Button buttonKarte = findViewById(R.id.karte);
        buttonKarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new  Intent(getApplicationContext() , MapsActivity.class);
                startActivity( intent1);
            }
        });

        Button btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=o5aD46y-2w0")));

                // dieser Intent startet die youtube app und öffnet das video, ist also ein entspannter Intent
            }
        });
    }
}
