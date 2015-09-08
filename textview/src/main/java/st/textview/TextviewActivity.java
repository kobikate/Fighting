package st.textview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TextviewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textview);
//        TextView tv=(TextView)findViewById(R.id.tv);
//        tv.setText(Html.fromHtml("欢迎来到<font color=blue>《世界学习》</font>课程"));
//        TextView tv=(TextView)findViewById(R.id.tv);
//        String str="欢迎来到《世界学习》课程";
//        SpannableStringBuilder style=new SpannableStringBuilder(str);
//        style.setSpan(new ForegroundColorSpan(Color.RED),0,4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        style.setSpan(new ForegroundColorSpan(Color.GREEN),5,9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        style.setSpan(new ForegroundColorSpan(Color.BLUE),9,10,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//        tv.setText(style);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_textview, menu);
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

    public boolean isFocused(){
        return true;
    }
}
