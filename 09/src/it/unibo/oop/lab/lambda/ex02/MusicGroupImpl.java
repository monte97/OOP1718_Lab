package it.unibo.oop.lab.lambda.ex02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Stream;



/**
 *
 */
public class MusicGroupImpl implements MusicGroup {

    private final Map<String, Integer> albums = new HashMap<>();
    private final Set<Song> songs = new HashSet<>();

    @Override
    public void addAlbum(final String albumName, final int year) {
        this.albums.put(albumName, year);
    }

    @Override
    public void addSong(final String songName, final Optional<String> albumName, final double duration) {
        if (albumName.isPresent() && !this.albums.containsKey(albumName.get())) {
            throw new IllegalArgumentException("invalid album name");
        }
        this.songs.add(new MusicGroupImpl.Song(songName, albumName, duration));
    }

    /*
     * sorto tutti gli elementi dello stream specificando la logica di ordinamento
     * dopo avere sortato mappo ogni song con il suo titolo
     * */
    @Override
    public Stream<String> orderedSongNames() {
        return songs.stream()
                .sorted((s1, s2) -> s1.getSongName().compareTo(s2.getSongName()))
                .map(Song::getSongName);
    }

    /*ATTENZIONE
     *  con le mappe si itera sulle entry della stessa!
     *  quindi le funzioni prenderanno in input le entry!
     *  avendo le entry posso gettare le chiavi/valori
     * */
    @Override
    public Stream<String> albumNames() {
        return albums.entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .map(e -> e.getKey().toString());
     }

    @Override
    public Stream<String> albumInYear(final int year) {
        return albums.entrySet().stream()
                .filter(e -> e.getValue().equals(year))
                .map(e -> e.getKey().toString());
    }

    /*
     * in questo esempio sto lavorando con degli opzionali quindi devo prima controllare se sono presenti*/
    @Override
    public int countSongs(final String albumName) {
        return (int) songs.stream()
                .filter(s -> s.getAlbumName().isPresent())
                .filter(s -> s.getAlbumName().get().equals(albumName))
                .count();
    }

    @Override
    public int countSongsInNoAlbum() {
        return (int) songs.stream()
                .filter(s -> !s.getAlbumName().isPresent())
                .count();
    }

    @Override
    public OptionalDouble averageDurationOfSongs(final String albumName) {
        return songs.stream()
                .filter(s -> s.getAlbumName().isPresent())
                .filter(s -> s.getAlbumName().get().equals(albumName))
                .mapToDouble(Song::getDuration)
                .average();
    }

    @Override
    public Optional<String> longestSong() {
        return songs.stream()
                .max((s1, s2) -> Double.compare(s1.getDuration(), s2.getDuration()))
                .map(Song::getSongName);
    }

    @Override
    public Optional<String> longestAlbum() {
        Map<String, Double > durations = new HashMap<>();
        albums.entrySet().forEach(e -> {
            durations.put(e.getKey(), songs.stream()
                .filter(s -> s.getAlbumName().isPresent())
                .filter(s -> s.getAlbumName().get().equals(e.getKey()))
                .mapToDouble(Song::getDuration)
                .sum());
        });
        return durations.entrySet().stream()
                .max((e1, e2) -> Double.compare(e1.getValue(), e2.getValue()))
                .map(Entry::getKey);
//                .map(Song::toString)
//                .map(e -> e.getKey().toString());
       }

    private static final class Song {

        private final String songName;
        private final Optional<String> albumName;
        private final double duration;
        private int hash;

        Song(final String name, final Optional<String> album, final double len) {
            super();
            this.songName = name;
            this.albumName = album;
            this.duration = len;
        }

        public String getSongName() {
            return songName;
        }

        public Optional<String> getAlbumName() {
            return albumName;
        }

        public double getDuration() {
            return duration;
        }

        @Override
        public int hashCode() {
            if (hash == 0) {
                hash = songName.hashCode() ^ albumName.hashCode() ^ Double.hashCode(duration);
            }
            return hash;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj instanceof Song) {
                final Song other = (Song) obj;
                return albumName.equals(other.albumName) && songName.equals(other.songName)
                        && duration == other.duration;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Song [songName=" + songName + ", albumName=" + albumName + ", duration=" + duration + "]";
        }

    }

}
