package my.admin.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class NewActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        
        finish();
    }

 }