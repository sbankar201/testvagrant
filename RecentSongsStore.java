package org.assignment;
import java.util.LinkedHashMap;
import java.util.Map;

public class RecentSongsStore {

    private int capacity;
    private Map<String, LinkedHashMap<String, Boolean>> usersSongsMap;

    public RecentSongsStore(int capacity) {
        this.capacity = capacity;
        this.usersSongsMap = new LinkedHashMap<>();
    }

    public void addSong(String user, String song) {
        // get the user's songs map
        LinkedHashMap<String, Boolean> songsMap = usersSongsMap.get(user);
        if (songsMap == null) {
            // create a new songs map for the user if it doesn't exist
            songsMap = new LinkedHashMap<>();
            usersSongsMap.put(user, songsMap);
        }

        // add the song to the user's songs map
        songsMap.put(song, true);

        // if the songs map exceeds the capacity, remove the least recently played song
        if (songsMap.size() > capacity) {
            String leastRecentSong = songsMap.keySet().iterator().next();
            songsMap.remove(leastRecentSong);
        }
    }

    public String[] getRecentSongs(String user) {
        // get the user's songs map
        LinkedHashMap<String, Boolean> songsMap = usersSongsMap.get(user);
        if (songsMap == null) {
            return new String[0];
        }

        // return the songs in reverse order of insertion
        return songsMap.keySet().toArray(new String[0]);
    }
}

