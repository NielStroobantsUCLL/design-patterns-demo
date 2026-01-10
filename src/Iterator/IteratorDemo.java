package Iterator;


public class IteratorDemo {
    public static void main(String[] args) {

        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song A"));
        playlist.addSong(new Song("Song B"));
        playlist.addSong(new Song("Song C"));

        SongIterator iterator = playlist.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }
    }
}

