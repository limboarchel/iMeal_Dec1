package abbyrhies.ronquillo.com.imeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Brunch extends AppCompatActivity {
    private Button btnBack2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brunch);

        btnBack2 = (Button)findViewById(R.id.btnBack2);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page_browse = new Intent(getApplicationContext(), Browse.class);
                startActivity(page_browse);
            }
        });

    }
}
