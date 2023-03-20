package org.assignment;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecentSongsStoreTest {

    @Test
    public void testAddAndGetRecentSongs() {
        RecentSongsStore store = new RecentSongsStore(3);

        store.addSong("user1", "song1");
        store.addSong("user1", "song2");
        store.addSong("user1", "song3");
        assertArrayEquals(new String[] {"song1", "song2", "song3"}, store.getRecentSongs("user1"));

        store.addSong("user1", "song4");
        assertArrayEquals(new String[] {"song2", "song3", "song4"}, store.getRecentSongs("user1"));

        store.addSong("user1", "song2");
        assertArrayEquals(new String[] {"song3", "song4", "song2"}, store.getRecentSongs("user1"));

        store.addSong("user1", "song1");
        assertArrayEquals(new String[] {"song4", "song2", "song1"}, store.getRecentSongs("user1"));
    }
}
