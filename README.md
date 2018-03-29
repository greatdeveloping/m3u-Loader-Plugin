# m3u-Loader-Plugin

- What is m3u Playlist Loader Plugin.
    Its a plugin which load m3u files, parse them and show them in grid with logo when available. Plugin also has its own internal player.
    
- Benefits of m3u Playlist Loader Plugin.  
   Has its own internal player, can play a lot of Formats without any external player.
   Support external players (MXPlayer, Vlc, Wuffy and Xplayer so far). Can convert links between player to make them playable to all.
   Can regognice which player is able to play a link and show only the working one (through a dialog).
   
- m3u Format supported.
   Support standard m3u format files.
   
   e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name
          http://thelink.m3u8
          
          With User agent
    e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name    
          http://thelink.ts|user-agent=Youragent&referrer=Yourreferrer     
          
          Sop to http / sopcast links
    e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name    
          sop://broker.sopcast.com:@@@@@@@@@ 
          
          Acestream / acestream links
    e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name    
          acestream://@@@@@@@@@
          
          Youtube
    e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name      
          https://www.youtube.com/watch?v=@@@@@
          
          
    e.x   #EXTINF:-1 tvg-logo="logo link" , Channels name     
          httphost://@@@@@@@
           
          
 - How to Execute IPTV m3u Playlist Loader from my app?
    See the example how to intent your app use IPTV m3u Playlist Loader and load your Playlist.   
            
