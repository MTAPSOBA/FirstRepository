package mycompatators;

import java.util.Comparator;

import api.Song;

public class ArtistNameCompa implements Comparator<Song> {

	@Override
	public int compare(Song song1, Song song2) {
		return song1.getArtist().compareTo(song2.getArtist()) ;
	}

	
	
	
}
