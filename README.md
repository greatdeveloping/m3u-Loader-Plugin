# ULTIMATE IPTV PLUGIN-ADDON (V4.00+)

Find it at Play store
https://play.google.com/store/apps/details?id=com.m3uloader.player&hl=en

If you want, you can test the compatibility of the plugin with your playlist using the Playlist loader apk available in the release section before creating your own application using the example.

NOTE: ULTIMATE IPTV PLUGIN-ADDON DOES NOT ΤΑΚΕ ANY RESPONSIBILITY FOR ANY MALICIOUS OR WRONG USE. THE APPLICATION IS INDICATED ONLY FOR USE WITH LISTS THAT YOU HAVE THE COPYRIGHT TO USE SO. THE APPLICATION DOES NOT ΤΑΚΕ ANY RESPONSIBILITY IN THE OPPOSITE CASE.


WHATS NEW WITH LATEST V4.20

(1) Support epg links (multiple) inside the m3u (example m3u topic #EXTM3U url-tvg="https://MY_EPG_LINK/epg.gz")
NOTE: If you sent epg with intent then epg links inside the m3u will be ignored. Intent epg supports only one epg.

(2) Fix and updated internal players

(3) Better support mag portal, support device name (for example you can intent "MAG322").

(4) Favorites can be organized inside folders.

(5) You can ranem Channels

(6) Many other changes and tweaks.


How to Execute Ultimate IPTV Plugin-Addon from my app?    
    See the example how to intent your app use Ultimate IPTV Plugin-Addon and load your Playlist. You have two option, Classic (phone optimized or for low end devices) and TvStyle (set-top box style). See updated Example. 
    

Ultimate IPTV Plugin-Addon Support (V4+, for older versions see readme at V3- example):

-1- m3u from internet, plus EPG url (uncompressed or compressed to .gz or .xz) if you wish. Just intent your m3u and epg to the app.
    
-2- Xtream Codes (full support - livetv ,movies, series catchup,radio). Just intent your portal-username-password to the app. Great got Premium IPTV Providers who dont want to spent money for an app.

-3- Mag Portal (full support - livetv ,movies, series catchup,radio). Just intent your portal and mac# to the app (V4.06+ You can also intent mag details, serial, device id, device id2 and signature, see example).
    

.   
.   

See the Example how to switch between each type.

.   
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
- Its a plugin-addon which support
           internet m3u + EPG,
           Xtream Codes (Live Tv - Movies - Series - Catchup) and
           MAG Portal (Live Tv - Movies - Series - Radio - Catchup)
Parse your playlists and show them in grid/list/tile with logos when available, groups also supported.
EPG Supported for all m3us (needed to add your own EPG file link), Xtreams codes and Mag Portal.
Two styles to choose (see example how to choose), Classic and tvstyle. Both styles is fully supported with device remote control.
Easy and fast choose groups with \"Select Group\" button or by pressing next or previous buttons.
Has 3 internal players (can play a lot of Formats without any external player), internal youtube player but also support external players (youtube official app, MXPlayer, Vlc, Wuffy, Xplayer, Soptohttp and Acestream for P2P so far).
Support external players for chromecast,DLNS and more (LocalCast and WebViewCast)
Support many advance parameters/futures (m3u only) like internal web Browser (using internal web browser you can open websites with videos)
Look below for all advance parameters/futures
   
.   
.   
.   
.   
.   
.   
   
m3u Format supported:

Support standard m3u format files like

          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.m3u8
 
 Support your protected links with user agent or referer or both like
 
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.m3u8|user-agent=YOUR_AGENT&referer=YOUR_REFERER
          Alternate
          #EXTVLCOPT:http-user-agent=YOUR_AGENT
          #EXTVLCOPT:http-referer=YOUR_REFERER
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.m3u8
 
 Support Sopcast and acestream links.
 
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          sop://broker.sopcast.com:@@@@@@@@@

          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          acestream://@@@@@@@@@
 
 Support youtube links
 
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          https://www.youtube.com/watch?v=VIDEOID
 
 Support also host links (through wuffy player)
 
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          httphost://@@@@@@@ 
 
 Support Dash videos with custom drm (license type support=widevine,clearkey,playready)
 
          Example 1:
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.mpd|license_type=widevine&license_key=LICENSE_KEY_LINK
 
          Example 1 alternate:
          #KODIPROP:inputstream.adaptive.license_type=widevine
          #KODIPROP:inputstream.adaptive.license_key=LICENSE_KEY_LINK
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.mpd|license_type=widevine&license_key=LICENSE_KEY_LINK
 
          Example 2:
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.mpd|license_type=widevine&license_key=LICENSE_KEY_LIN&user-agent=YOUR_AGENT&referer=YOUR_REFERER
 
          Example 2 alternate:
          #KODIPROP:inputstream.adaptive.license_type=widevine
          #KODIPROP:inputstream.adaptive.license_key=LICENSE_KEY_LINK
          #EXTVLCOPT:http-user-agent=YOUR_AGENT
          #EXTVLCOPT:http-referer=YOUR_REFERER
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://yourlink.mpd|license_type=widevine&license_key=LICENSE_KEY_LINK
 
 
Support m3u8 & Dash videos with stream headers and custom drm headers [4.01+] (license type support=widevine,clearkey,playready)
        
        Example:
    
         #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
        https://channel_LINK|license_type=widevine&license_key=LICENSE_KEY_LINK&stream_headers={header1=head1_link&header2=head2_link&header3=head3_link}&license_headers={header1=head1_link&header2=head2_link&header3=head3_link}

.   
.   
.   
.   
.   
.   


  
 Advance M3U supported Fuctions: (m3u ONLY, use ONLY for your own websites)
 
 Web site loading through an internal web browser and play the website video.
          Add at the end 
          
          |webview zoom=%% scroll=x,y or |webdeskview zoom=%% scroll=x,y for desktop mode.
  .
  
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|webview zoom=100 scroll=50,100

 Web site loading through an internal web browser and play the website video in internal player
    Add at the end 
    
          |autoweb zoom=%% scroll=x,y or |autodeskweb zoom=%% scroll=x,y for desktop mode. 
          
   To use for example 2nd m3u8 add delay like 
   
          |autodelayweb$$delay=2 zoom=%% scroll=x,y or |autodeskdelayweb$$delay=2 zoom=%% scroll=x,y for desktop mode.
  .
  
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|autodelayweb$$delay=2 zoom=100 scroll=50,100
 
 Support “get m3u8” methods from websites, gives you the opportunity to play a video from a site in your favorite player.
   Add at the end  
          
          |webdig or |weballdig or |webfulldig. 
   For desktop mode use 
          
          |webdeskdig or |webdeskalldig or |webdeskfulldig
   .
   
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|weballdig
          Explanation 1 = For e.x  webdeskalldig - desk mean use Desktop agent, all means use with m3u8 user-agent and referer.
          Explanation 2 = For e.x  webdeskfulldig - desk mean use Desktop agent, full means use all m3u8 headers.
 
 Also support “get mp4,mpg” method from websites, gives you the opportunity to play a video from a site in your favorite player.
          Add at the end  
          
          |webviddig or |webvidalldig or |webvidfulldig.
   .
   
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|webvidalldig
          Explanation 1 = For e.x  webvidalldig - all means use with mp4 user-agent and referer.
          Explanation 2 = For e.x  webvidfulldig - full means use all mp4 headers
 
 To avoid first m3u8 (choose which to use) use the delay.
   Add at the end  
          
          |webdelaydig$$delay=ADD_NUMBER or |webdelayalldig$$delay=ADD_NUMBER or |webdelayfulldig$$delay=ADD_NUMBER. 
   For desktop mode use 
          
          |webdelaydeskdig$$delay=ADD_NUMBER or |webdelaydeskalldig$$delay=ADD_NUMBER  or |webdelaydeskfulldig$$delay=ADD_NUMBER.
   .
   
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|webdelayalldig$$delay=2
          Explanation = For e.x  webdelaydeskalldig$$delay=3 - delay means get 3rd m3u8 (avoid first 2), desk mean use Desktop agent, all means use with m3u8 user-agent and referer.
 
 For websites need referer to open use Referer.
   Add at the end 
   
          |webreferdig$$referer=YOUR_REFERER  or |webreferalldig$$referer=YOUR_REFERER  or |webreferfulldig$$referer=YOUR_REFERER

   For desktop mode use 
          
          |webreferdeskdig$$referer=YOUR_REFERER or |webreferdeskalldig$$referer=YOUR_REFERER or |webreferdeskfulldig$$referer=YOUR_REFERER
  . 
          
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|webreferalldig$$referer=YOUR_REFERER
 
 For websites need referer to avoid first m3u8 use Referer and delay.
   Add at the end 
          
          |webreferdelaydig$$referer=YOUR_REFERER  or |webreferdelayalldig$$referer=YOUR_REFERER  or |webreferdelayfulldig$$referer=YOUR_REFERER
          
   For desktop mode use 
          
          |webreferdelaydeskdig$$referer=YOUR_REFERER or |webreferdelaydeskalldig$$referer=YOUR_REFERER or |webreferdelaydeskfulldig$$referer=YOUR_REFERER
 .         
          
          Example:
          
          #EXTINF:-1 group-title=\"YOUR GROUP\" tvg-logo=\"LOGO LINK\",Channel name
          http://@@@@@@@|webreferdelayfulldig$$referer=YOUR_REFERER
 
 FOR MORE HELP ABOUT ADVANCE FUTURES email me.
          
  
            
