package dopfer.fabian.com.rumspielen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button klicker = findViewById(R.id.KlickerButton);
        klicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
//                startActivity(intent);
//
//                Toast toast = Toast.makeText(getApplicationContext(), "du wirst auf die zweite seite geschickt",Toast.LENGTH_LONG);
//                toast.show();


                EditText editText = findViewById(R.id.editText2);
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("id",String.valueOf(editText));
                startActivity(intent);




            }
        });




    }
}
