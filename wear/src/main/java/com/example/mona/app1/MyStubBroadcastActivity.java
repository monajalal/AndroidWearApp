package com.example.mona.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

//import com.example.mywatchface.R;


/**
 * Example shell activity which simply broadcasts to our receiver and exits.
 */
public class MyStubBroadcastActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setAction("com.example.mona.app1.SHOW_NOTIFICATION");
        i.putExtra(MyPostNotificationReceiver.CONTENT_KEY, getString(R.string.title));
        sendBroadcast(i);
        finish();
    }
}
