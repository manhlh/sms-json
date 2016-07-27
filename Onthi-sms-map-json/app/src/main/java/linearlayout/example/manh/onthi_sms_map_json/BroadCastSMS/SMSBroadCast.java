package linearlayout.example.manh.onthi_sms_map_json.BroadCastSMS;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

import java.text.SimpleDateFormat;

import linearlayout.example.manh.onthi_sms_map_json.Service.SmsService;

/**
 * Created by MANH on 31-May-16.
 */
public class SMSBroadCast extends BroadcastReceiver {

//    SQLiteSMS db;
//    MainActivity main;

    @Override
    public void onReceive(Context context, Intent intent) {
        final Bundle bundle = intent.getExtras();
        //db = new SQLiteSMS(context,DB_NAME,null,DB_VERSION);
        try {

            if (bundle != null) {

                final Object[] pdusObj = (Object[]) bundle.get("pdus");
                String senderNum = null;
                String message = null;
                String time = null;

                for (int i = 0; i < pdusObj.length; i++) {
                    SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
                    senderNum = currentMessage.getDisplayOriginatingAddress();
                    message = currentMessage.getDisplayMessageBody();

                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:ss");
                    time = df.format(System.currentTimeMillis());
                    //Log.d("time",time);
                    if(message != null){
                        break;
                    }
                }
                Log.d("smsbroadcast", "number: " + senderNum + "\n message: " + message + "\n time: " + time);
//                Intent smsintent = new Intent(context, MainActivity.class);
//                //smsintent.putExtra("number","senderNumber: "+ senderNum + "\n Message: " + message);
//                smsintent.putExtra("number",senderNum);
//                smsintent.putExtra("msg",message);
//                smsintent.putExtra("time",time);
//                smsintent.addFlags(smsintent.FLAG_ACTIVITY_NEW_TASK);
//               context.startActivity(smsintent);
//
                Intent intent1 = new Intent(context,SmsService.class);
                intent1.putExtra("namesv",senderNum);
                intent1.putExtra("mobilesv",message);
                intent1.putExtra("timesv",time);
                intent1.addFlags(intent1.FLAG_ACTIVITY_NEW_TASK);
                context.startService(intent1);

            }

        } catch (Exception e) {
            Log.e("SmsReceiver", "Exception smsReceiver" +e);

        }

    }




}
