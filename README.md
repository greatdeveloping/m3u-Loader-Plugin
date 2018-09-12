# m3u-Loader-Plugin

How to Execute IPTV m3u Playlist Loader from my app?    
    See the example how to intent your app use IPTV m3u Playlist Loader and load your Playlist.  
    
 
What is m3u Playlist Loader Plugin:    
- Its a plugin which load m3u lists, can parse your playlists (from web or your storage) and show them in grid with logo when available, groups also supported.
- Support search function (add them as groups if your playlist has groups).
- Easy and fast choose groups with “Select Group” button or by pressing next or previous buttons.
- When you click a channel/video a video player dialog appears so you can choose the player you want.
- Has 3 internal players (can play a lot of Formats without any external player), internal youtube player but also support external players (youtube official app, MXPlayer, Vlc, Wuffy, Xplayer, Soptohttp and Acestream for P2P so far). Can regognice which player is able to play a link and show only the working one (through a dialog).
- Support LocalCast and WebViewCast for chromecast,DLNS and more
- Support Website video (using internal web browser open websites with videos)
- Exclusive: This app has also internal web Browser, so you can add official site links as a channel and this app will load site inside app ,then when video load you can fullscreen as you done on your browser (Look below how to enable web Browser).

   
   
   
   
   
   
   
   
m3u Format supported:

Support standard m3u format files like

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://yourlink.m3u8

Support your protected links with user agent or referer or both like

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

http://yourlink.m3u8|user-agent=YOUR_AGENT&referer=YOUR_REFERER

Support Sopcast and acestream links.

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name

sop://broker.sopcast.com:@@@@@@@@@

#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
acestream://@@@@@@@@@

Support youtube links
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
https://www.youtube.com/watch?v=VIDEOID

Support also host links
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
httphost://@@@@@@@

Support wuffy protected links
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
xmtv://@@@@@@@

Support website load through internal Web Browser and play the website video(add at the end |webview zoom=% scroll=x,y)
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
http://@@@@@@@|webview zoom=100 scroll=50,100

Support website load through internal Web Browser and play the website video with autoplay feature if video wont load automatically with webview(add at the end |autoweb zoom=% scroll=x,y)
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
http://@@@@@@@|autoweb zoom=120 scroll=50,100

Support full screen website Video load (using android webkit), supported for limited websites (add at the end |fullweb). Will open website in background and open video in fullscreen if recognised.
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
http://@@@@@@@|fullweb

Also support “channel get” method for some sites (if you are lucky 0,01 %), which give you the chance to play a video from a site to your favorite player (add at the end |webdown or webnoagent).
#EXTINF:-1 group-title="YOUR GROUP" tvg-logo="LOGO LINK",Channel name
http://@@@@@@@|webdown



"Video supported:"
Support all video formats like m3u8, ts, rtmp, mms, mmsh, httphost, UDP etc.
           
          
  
            
