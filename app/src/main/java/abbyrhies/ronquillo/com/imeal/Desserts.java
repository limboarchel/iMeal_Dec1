package abbyrhies.ronquillo.com.imeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Desserts extends AppCompatActivity {
    private Button btnBack6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desserts);

        btnBack6 = (Button)findViewById(R.id.btnBack6);
        btnBack6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent page_browse = new Intent(getApplicationContext(), Browse.class);
                startActivity(page_browse);
            }
        });

    }
}
