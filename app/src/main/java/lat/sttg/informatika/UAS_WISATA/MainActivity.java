package lat.sttg.informatika.UAS_WISATA;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bagendit = (Button)findViewById(R.id.Bagendit);

        Bagendit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Bagendit.class);
                startActivity(myIntent);
            }
        });

        Button Papandaian = (Button)findViewById(R.id.Papandaian);

        Papandaian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Papandaian.class);
                startActivity(myIntent);
            }
        });

        Button Santolo = (Button)findViewById(R.id.Santolo);

        Santolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Santolo.class);
                startActivity(myIntent);
            }
        });

        Button Darajat = (Button)findViewById(R.id.Darajat);

        Darajat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Darajat.class);
                startActivity(myIntent);
            }
        });

        Button Talagabodas = (Button)findViewById(R.id.Talagabodas);

        Talagabodas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Talagabodas.class);
                startActivity(myIntent);
            }
        });

        }
}
