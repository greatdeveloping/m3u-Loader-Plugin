package com.iptvLoader.example;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.Gravity;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.UnknownHostException;


public class startmeup extends Activity {

    private int CLASSIC_m3u=0;
    private int TVSTYLE_m3u=1;
    private int CLASSIC_xtream_codes=2;
    private int TVSTYLE_xtream_codes=3;
    private int CLASSIC_mag_portal=4;
    private int TVSTYLE_mag_portal=5;

    @Override
    protected void onStart() {
        super.onStart();

        //add type you want from above list (change classic_m3u accordingly)
        int type=CLASSIC_m3u;

        boolean pluginInstalled = isAppInstalled("com.m3uloader.player");

        if (pluginInstalled) {

            boolean need_update_plugin=need_update();

            if (!need_update_plugin){
                try {
                    Intent url = new Intent();
                    url.setClassName("com.m3uloader.player", "com.m3uloader.player.startup");
                    url.putExtra("type",type);

                    //Change below cases depends on your type e.x if type 2 (classic_xtream_codes) edit only case 2
                    switch (type) {
                        case 0:
                            // Set your m3u url
                            url.setData(Uri.parse("YOUR M3u URL"));
                            // Set your epg url if available,else delete below (url.putExtra("YOUR EPG URL");)
                            url.putExtra("EPG","YOUR EPG URL" );
                            break;
                        case 1:
                            // Set your m3u url
                            url.setData(Uri.parse("YOUR M3u URL"));
                            // Set your epg url if available,else delete below (url.putExtra("YOUR EPG URL");)
                            url.putExtra("EPG","YOUR EPG URL" );
                            break;
                        case 2:
                            // Set Portal
                            url.putExtra("portal","http://my_portal.com:port");
                            // Set username
                            url.putExtra("username","username");
                            // Set password
                            url.putExtra("password","password");
                            break;
                        case 3:
                            // Set Portal
                            url.putExtra("portal","http://my_portal.com:port");
                            // Set username
                            url.putExtra("username","username");
                            // Set password
                            url.putExtra("password","password");
                            break;
                        case 4:
                            // Set Mag Portal
                            url.putExtra("portal","http://my_mag_portal.com:port");
                            // Set mac number
                            url.putExtra("mac","YOUR_MAC_NUMBER");
                            break;
                        case 5:
                            // Set Mag Portal
                            url.putExtra("portal","http://my_mag_portal.com:port");
                            // Set mac number
                            url.putExtra("mac","YOUR_MAC_NUMBER");
                            break;
                    }
                    startActivity(url);
                    finishAffinity();
                } catch (ActivityNotFoundException e) {
                    // IPTV m3u Playlist Loader app is not installed, let's ask the user to install it.
                    showIPTVPlaylistLoaderPluginNotFoundDialog();
                }
            }
            else{
                showIPTVPlaylistLoaderPluginOldDialog();
            }

        }
        else {
            showIPTVPlaylistLoaderPluginNotFoundDialog();
        }


    }



    public void showIPTVPlaylistLoaderPluginNotFoundDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.not_installed_title);
        builder.setMessage(R.string.not_installed_message);
        builder.setPositiveButton(R.string.button_install,
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int id)
                {
                    try {
                        // try to open Google Play app first 
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.m3uloader.player")));
                    } catch (ActivityNotFoundException e) {
                        // if Google Play is not found for some reason, let's open browser
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.m3uloader.player")));
                    }
                    finish();
                }
            });
        builder.setNegativeButton(R.string.button_cancel,
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int id)
                {
                    // if cancelled - just close the app
                    finish();
                }
            });
        builder.setCancelable(false);
        builder.create().show();
    }

    public void showIPTVPlaylistLoaderPluginOldDialog() {
        //lower version installed
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(R.string.old_installed_title);
        builder.setMessage(getResources().getString(R.string.app_name)+" "+getResources().getString(R.string.old_installed_message));
        builder.setPositiveButton(R.string.button_update,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int id) {
                        try {
                            // try to open Google Play app first
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.m3uloader.player")));
                        } catch (ActivityNotFoundException e) {
                            // if Google Play is not found for some reason, let's open browser
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.m3uloader.player")));
                        }
                        finish();
                    }
                });
        builder.setNegativeButton(R.string.button_cancel,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int id) {
                        dialogInterface.dismiss();
                        finish();

                    }
                });
        builder.setCancelable(false);
        builder.create().show();
    }

    protected boolean need_update() {
        boolean needed;
        try{
            PackageInfo pInfo = this.getPackageManager().getPackageInfo("com.m3uloader.player", 0);
            int version = pInfo.versionCode;
            String lower = "106" ;

            int low = Integer.parseInt(lower);

            if (version >= low) {
                needed=false;
            }
            else{
                needed=true;
            }

        } catch (PackageManager.NameNotFoundException e) {
            needed=true;
        }

        return needed;
    }

    protected boolean isAppInstalled(String uri) {
        PackageManager pm = getPackageManager();
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {

        }

        return false;
    }
}
