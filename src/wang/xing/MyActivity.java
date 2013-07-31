package wang.xing;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private static final String TAG = "MyActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
        Log.e(TAG,"on create..... ");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"on start..... ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"on restart..... ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"on resume..... ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"on pause..... ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"on stop..... ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"on destory..... ");
    }
}
