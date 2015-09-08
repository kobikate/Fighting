package st.button;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class Button extends Activity implements View.OnClickListener {
    private View btn1=null;
    private Intent serviceItent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
//        btn1=findViewById(R.id.button);
//        btn1.setOnClickListener(listener);
        serviceItent.setComponent(new ComponentName("st.edittext","st.edittext.MyService"));
        findViewById(R.id.StartService).setOnClickListener(this);
        findViewById(R.id.StopService).setOnClickListener(this);
    }

    private View.OnClickListener listener=new View.OnClickListener () {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
////            intent.setAction(intent.ACTION_CALL);
////            intent.setData(Uri.parse("tel:110"));
//            intent.setAction(intent.ACTION_SENDTO);
//            intent.setData(Uri.parse("smsto:5554"));
//            intent.putExtra("sms_body","Welcome to ......");
//          //  intent.putExtra(Intent.EXTRA_KEY_CONFIRM, false);
//            startActivity(intent);
            intent.setClass(Button.this,SecondButton.class);
            intent.putExtra("Str", "Intent demo");

            startActivity(intent);

        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_button, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.StartService:
                 startService(serviceItent) ;
                break;
            case R.id.StopService:
                stopService(serviceItent);
                break;
        }
    }
}
