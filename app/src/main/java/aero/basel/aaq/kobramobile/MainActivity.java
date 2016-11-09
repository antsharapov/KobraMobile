package aero.basel.aaq.kobramobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kobra_btn = (Button) findViewById(R.id.kobra_mobile_button);
        Button perron_btn = (Button) findViewById(R.id.mobile_perron_button);

        if (kobra_btn !=null) kobra_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("URL", "http://62.183.37.114:30880/" );
                startActivity(intent);
            }
        });

        if (perron_btn !=null) perron_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("URL","http://62.183.37.114:30000/" );
                startActivity(intent);
            }
        });

    }
}
