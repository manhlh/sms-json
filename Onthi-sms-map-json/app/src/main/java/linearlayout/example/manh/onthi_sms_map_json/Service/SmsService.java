package linearlayout.example.manh.onthi_sms_map_json.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by MANH on 27-Jul-16.
 */
public class SmsService extends Service {
    String mobile = null;
    String message = null;
    String date = null;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //Log.d("mobile",intent.getStringExtra("mobilesv"));
        mobile = intent.getStringExtra("mobilesv");
        message = intent.getStringExtra("messagesv");
        date = intent.getStringExtra("datesv");
        return super.onStartCommand(intent, flags, startId);
    }
}
