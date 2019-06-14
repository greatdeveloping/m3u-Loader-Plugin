# ULTIMATE IPTV PLUGIN-ADDON (V3.00)-XtreamCodes

Find it at Play store
https://play.google.com/store/apps/details?id=com.m3uloader.player&hl=en

How to Execute Ultimate IPTV Plugin-Addon from my app?    
    See the example how to intent your app use Ultimate IPTV Plugin-Addon and load your Playlist. You have two option, Classic (phone optimized or for low end devices) and TvStyle (set-top box style). See updated Example. 
    

Example has 6 different Activities:

-1- classic (Classic Style without EPG). Just sent your m3u to app.
    
-2- classicEPG (Classic Style with EPG). Just sent your m3u and EPG File (uncompressed or compressed to .gz or .xz) to app. 

-3- classicXtream (Classic Style with XtreamCodes full support - livetv ,movies, series catchup,radio). Just sent your portal-username-password to app. Great got Premium IPTV Providers who dont want to spent money for an app.
    
-4- tvstyle (tvstyle Style without EPG). Just sent your m3u and player (player1,player2,player3) to app.
    
-5- tvstyleEPG (tvstyle Style with EPG). Just sent your m3u,EPG File (uncompressed or compressed to .gz or .xz) and player (player1,player2,player3)to app. 
    
    
-6- tvstyleXtream (tvstyle Style with XtreamCodes full support - livetv ,movies, series catchup,radio). Just sent your portal-username-password  and player (player1,player2,player3) to app. Great got Premium IPTV Providers who dont want to spent money for an app.
    
.

For Example if you want to use tvstyleEPG Just edit tvstyleEPG.java with your m3u and EPG url. Then go to androidmanifest.xml and move 
<category android:name="android.intent.category.LAUNCHER" />
<category android:name="android.intent.category.LEANBACK_LAUNCHER" />
.
to tvstyleEPG activity. Should look from
.
<activity
android:name=".tvstyleEPG"
android:label="@string/app_name" >
<intent-filter>
<action android:name="android.intent.action.MAIN" />
</intent-filter>
</activity>
.
        
to
.
<activity
android:name=".tvstyleEPG"
android:label="@string/app_name" >
<intent-filter>
<action android:name="android.intent.action.MAIN" />
<category android:name="android.intent.category.LAUNCHER" />
<category android:name="android.intent.category.LEANBACK_LAUNCHER" />
</intent-filter>
</activity>
.
Be sure have it in only one activity otherwise you may have to icons in your menu.

.



General Info about Ultimate IPTV Plugin-Addon:    
- Its a plugin-addon which load m3u lists, can parse your playlists and show them in grid with logo when available, groups also supported.
- Support search function (add them as groups if your playlist has groups).
- Easy and fast choose groups with “Select Group” button or by pressing next or previous buttons.
- When you click a channel/video a video player dialog appears so you can choose the player you want (Default player can also selected).
- Has 3 internal players (can play a lot of Formats without any external player), internal youtube player but also support external players (youtube official app, MXPlayer, Vlc, Wuffy, Xplayer, Soptohttp and Acestream for P2P so far). Can regognice which player is able to play a link and show only the working one (through a dialog).
- Support LocalCast and WebViewCast for chromecast,DLNS and more
- Support Website video (using internal web browser open websites with videos)
- Exclusive: This app has also internal web Browser, so you can add official site links as a channel and this app will load site inside app ,then when video load you can fullscreen as you done on your browser (Look below how to enable web Browser).

   
.   
.   
.   
.   
.   
.   
   
m3u Format supported:

Support standard m3u format files like

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://yourlink.m3u8

.

Support your protected links with user agent or referer or both like

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://yourlink.m3u8|user-agent=YOUR_AGENT&referer=YOUR_REFERER

.

Support Sopcast and acestream links.

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

sop://broker.sopcast.com:@@@@@@@@@

.


#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

acestream://@@@@@@@@@

.

Support youtube links

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

https://www.youtube.com/watch?v=VIDEOID

.

Support also host links

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

httphost://@@@@@@@

.

Support wuffy protected links

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

xmtv://@@@@@@@

.

Support website load through internal Web Browser and play the website video(add at the end |webview zoom=% scroll=x,y)

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://@@@@@@@|webview zoom=100 scroll=50,100

.

Support website load through internal Web Browser and play the website video with autoplay feature if video wont load automatically with webview(add at the end |autoweb zoom=% scroll=x,y)

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://@@@@@@@|autoweb zoom=120 scroll=50,100

.

Support full screen website Video load (using android webkit), supported for limited websites (add at the end |fullweb). Will open website in background and open video in fullscreen if recognised.

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://@@@@@@@|fullweb

.

Also support “channel get” method for some sites (if you are lucky 0,01 %), which give you the chance to play a video from a site to your favorite player (add at the end |webdown or webnoagent).

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://@@@@@@@|webdown

.
.
.
.

"Video supported:"
Support all video formats like m3u8, ts, rtmp, mms, mmsh, httphost, UDP etc.
           
          
  
            
