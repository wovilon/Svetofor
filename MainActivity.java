package wovilon.svetofor;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        mInfoTextView=(TextView)findViewById(R.id.textView);

        Button yellowButton=(Button)findViewById(R.id.buttonYellow);
        yellowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                mInfoTextView.setText(R.string.yellow);
                mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));

            }
        });
    }

    public void onRedButtonClick(View view) {
    mInfoTextView.setText(R.string.red);
    mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));

    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
    }


}
