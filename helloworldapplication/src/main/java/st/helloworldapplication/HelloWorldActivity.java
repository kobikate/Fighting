package st.helloworldapplication;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class HelloWorldActivity extends Activity implements View.OnClickListener {

    private TextView textView;
    private Intent serviceItent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        serviceItent.setComponent(new ComponentName("st.edittext", "st.edittext.MyService"));
        setContentView(R.layout.activity_hello_world);
//        findViewById(R.id.StartBAtivity).setOnClickListener(this);
//        findViewById(R.id.button4).setOnClickListener(this);
//        textView=(TextView)findViewById(R.id.textView);
//        textView.setText(String.format("cureent taskid:%d\n,current activityid:%s", getTaskId(), toString()));
        System.out.println(" A onCreate");
//        findViewById(R.id.StartBAtivity).setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View v) {
//                //    Intent i=new Intent(HelloWorldActivity.this,AnotherAty.class);
////                startActivity(new Intent(HelloWorldActivity.this, HelloWorldActivity.class));
//                startService(new Intent(HelloWorldActivity.this,MyService.class));
////                i.putExtra("data","Hello welcome to stockmaket");
////                Bundle b=new Bundle();
////                b.putString("name","stock");
////                b.putInt("age",5);
////                b.putString("name1","owen");
//////                i.putExtras(b);
////                i.putExtra("data",b);
////
//                // startActivity(new Intent(HelloWorldActivity.this,AnotherAty.class));
//                //  startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://baidu.com")));
////                i.putExtra("user", new User("xiaoming", 5));
//////                startActivity(i);
////                startActivityForResult(i,0);
//            }
//        });
//
//        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////              startActivity(new Intent(HelloWorldActivity.this, AnotherAty.class));
//                stopService(new Intent(HelloWorldActivity.this,MyService.class));
//
//            }
//        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText("another ativity return value:"+ data.getStringExtra("data"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(" A onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("A onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(" A onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("A onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("A onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("A onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
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
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.StartBAtivity:
//                startService(serviceItent);
//                break;
//            case R.id.button4:
//                stopService(serviceItent);
//                break;
//        }
//    }
}
