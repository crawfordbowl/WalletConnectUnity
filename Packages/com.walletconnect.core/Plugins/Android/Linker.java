package com.walletconnect.unity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public  class Linker  {
    public boolean canOpenURL(Context context, String url){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        return intent.resolveActivity(context.getPackageManager()) != null;
    }
}
