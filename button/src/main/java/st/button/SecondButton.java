package st.button;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;


/**
 * Created by swd3 on 8/14/15.
 */
public class SecondButton extends  Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity_button);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String str=bundle.getString("str");
    }

}
