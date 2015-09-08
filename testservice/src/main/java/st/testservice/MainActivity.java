package st.testservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

import org.jdom2.Document;

import st.edittext.IAppServiceRemoteBinder;

public class MainActivity extends Activity implements View.OnClickListener, ServiceConnection {

    private Intent serviceItent;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Document doc=new Document();
        Gson g=new Gson();
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        serviceItent=new Intent();
        serviceItent.setComponent(new ComponentName("st.edittext", "st.edittext.MyService"));
        findViewById(R.id.StartS).setOnClickListener(this);
        findViewById(R.id.StopS).setOnClickListener(this);
        findViewById(R.id.BindS).setOnClickListener(this);
        findViewById(R.id.UnbindS).setOnClickListener(this);
        findViewById(R.id.SyncData).setOnClickListener(this);
        findViewById(R.id.SendBrm).setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            case R.id.StartS:
                startService(serviceItent);
                break;
            case R.id.StopS:
                stopService(serviceItent);
                break;

            case R.id.BindS:
                bindService(serviceItent,this, Context.BIND_AUTO_CREATE);
                break;

            case R.id.UnbindS:
                unbindService(this);
                binder=null;
                break;

            case R.id.SyncData:
                if(binder!=null){

                    try {
                        binder.setdata(editText.getText().toString());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                 break;

            case R.id.SendBrm:
                Intent i=new Intent(this,MyReceiver.class);
                i.putExtra("data","Good Good study");
                sendBroadcast(i);
                break;

        }
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        System.out.println("Bind service");
        binder=IAppServiceRemoteBinder.Stub.asInterface(service);
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        System.out.println("Unbind service");

    }

    private IAppServiceRemoteBinder binder=null;
}
