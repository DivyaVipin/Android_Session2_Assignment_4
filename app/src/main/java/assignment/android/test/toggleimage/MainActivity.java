package assignment.android.test.toggleimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnToggle;
    TextView txtImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtImage=(TextView) findViewById(R.id.txtViewImage);
        btnToggle=(Button)findViewById(R.id.btnToggle);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=(String)btnToggle.getText().toString();
                if(text.equals("Hide"))
                {
                    txtImage.setVisibility(View.GONE);
                    btnToggle.setText("Show");
                }
                else
                {
                    txtImage.setVisibility(View.VISIBLE);
                    btnToggle.setText("Hide");
                }
            }
        });
    }
}
