package st.helloworldapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnotherAty extends Activity {
    private TextView tv;
//    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_aty);
//        tv=(TextView)findViewById(R.id.textView);
//        tv.setText(String.format("cureent taskid:%d\n,current activityid:%s", getTaskId(), toString()));
//        System.out.println(" B onCreate");
//        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View v) {
//
//                startActivity(new Intent(AnotherAty.this, HelloWorldActivity.class));
//
//            }
//        });
//
//        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(AnotherAty.this, AnotherAty.class));
//            }
//        });
    }




    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(" B onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("B onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(" B onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("B onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("B onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("B onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_another_aty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
