package Iterator;

import java.util.List;

public class PlaylistIterator implements SongIterator {
    private List<Song> songs;
    private int index = 0;

    public PlaylistIterator(List<Song> songs) {
        this.songs = songs;
    }

    public boolean hasNext() {
        return index < songs.size();
    }

    public Song next() {
        return songs.get(index++);
    }
}

