package com.example.chint.behaviouralchanges;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.widget.Toast;

/**
 * Created by chint on 8/24/2017.
 */

public class BroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //White listed implicit broadcast receiver...
        if(intent.getAction().equals(Intent.ACTION_NEW_OUTGOING_CALL)){
            Toast.makeText(context, "NEW_OUTGOING_CALL", Toast.LENGTH_LONG).show();
        }

        if(intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){
            Toast.makeText(context, "SMS_RECEIVED", Toast.LENGTH_LONG).show();
        }

        //Black listed implicit broadcast receiver...

        if(intent.getAction().equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
            Toast.makeText(context, "AIRPLANE_MODE_CHANGED", Toast.LENGTH_LONG).show();
        }
    }
}
