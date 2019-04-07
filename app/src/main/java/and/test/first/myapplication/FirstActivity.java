package and.test.first.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void OpenNext1(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_down,R.anim.slide_down_out);
    }
}
