package com.iptvLoader.example;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;


public class classicEPG extends Activity {

    @Override
    protected void onStart()
    {
        super.onStart();
        
        try {
            Intent url = new Intent();
            url.setClassName("com.m3uloader.player", "com.m3uloader.player.Welcome");
            //url.setClassName("com.m3uloader.player", "com.m3uloader.player.Welcometvstyle");
            // Set your playlist url
            url.setData(Uri.parse("https://raw.githubusercontent.com/possiblelife/plft/master/co.m3u"));
            // Set your epg url
            url.putExtra("EPG","https://raw.githubusercontent.com/Twilight0/repo-guide/master/guide-el.xml.gz");
            startActivity(url);
            finish();
        } catch (ActivityNotFoundException e) {
            // IPTV m3u Playlist Loader app is not installed, let's ask the user to install it.
            showIPTVPlaylistLoaderPluginNotFoundDialog();
        }
    }
    
    public void showIPTVPlaylistLoaderPluginNotFoundDialog()
    {
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


}
