package mycompatators;

import java.util.Comparator;

import api.Song;

public class AlbumReleaseYearCompa implements Comparator<Song> {

	
	@Override
	public int compare(Song song1, Song song2) {
if(song1.getYear()<song2.getYear()) {
	return -1;
		}
if(song1.getYear()>song2.getYear()) {
	return +1;
}
		return 0;
	}
}
