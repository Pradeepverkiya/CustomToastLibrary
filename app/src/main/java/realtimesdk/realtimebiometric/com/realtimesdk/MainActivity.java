package realtimesdk.realtimebiometric.com.realtimesdk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import realtimesdk.realtimebiometric.com.androidlibrary.CustomToast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
    }

    public void normalColorText(View view) {
        CustomToast.normal(this, "Custom toast library ", Toast.LENGTH_SHORT).show();
    }

    public void successColorText(View view) {
        CustomToast.success(this, "Custom toast library ", Toast.LENGTH_SHORT).show();
    }

    public void infocolorText(View view) {
        CustomToast.info(this, "Custom toast library ", Toast.LENGTH_SHORT).show();
    }

    public void errorTextColor(View view) {
        CustomToast.error(this, "Custom toast library ", Toast.LENGTH_SHORT).show();
    }

    public void warningColorText(View view) {
        CustomToast.warning(this, "Custom toast library ", Toast.LENGTH_SHORT).show();

    }
}
