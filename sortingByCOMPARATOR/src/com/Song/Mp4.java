package com.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import api.Song;
import myUtilPackage.MyUtils;
import mycompatators.AlbumReleaseYearCompa;
import mycompatators.ArtistNameCompa;

public class Mp4 {

	public static void main(String[] args) {

	Song song1 = new Song("take me to your heart", "Micheal to rock", 2014);
	Song song2 = new Song("see you again", "Khalifa", 2015);
	Song song3 = new Song("I Just Want To Be Your Everything", "Andy Gibb", 1977);
	Song song4 = new Song("Too Close", "Next", 1997);
	Song song5 = new Song("Despacitot", "Luis Fonsi", 2017);
	Song song6 = new Song("Rolling In The Deep", "Adele", 2010);
		
		ArrayList<Song> musicList =new ArrayList<>(); 
		
		musicList.add(song1);
		musicList.add(song2);
		musicList.add(song3);
		musicList.add(song4);
		musicList.add(song5);
		musicList.add(song6);
		
		
		MyUtils.iterateList(musicList);
				
		
		
		AlbumReleaseYearCompa compa1 = new AlbumReleaseYearCompa();
		Collections.sort(musicList, compa1);
		System.out.println("after sorting by album release year----");
		
		MyUtils.iterateList(musicList);
		
		
		
		ArtistNameCompa compa2 = new ArtistNameCompa();
		Collections.sort(musicList, compa2);
		System.out.println("after sorting by Artist Name----");
		
    	MyUtils.iterateList(musicList);

	} 

}
