package and.test.first.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void clickAboutMe(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,FirstActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe1(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,SocondActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe2(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,ThirdActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe3(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,FourthActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe4(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,FifthActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe5(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,SixthActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe6(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,SeventhActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe7(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,EighthActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe8(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,NinthActivity.class);
        startActivity(aboutmeIntent);

    }
    public void clickAboutMe9(View view) {
        Intent aboutmeIntent = new Intent(Main2Activity.this,TenthActivity.class);
        startActivity(aboutmeIntent);

    }
}
