package com.ivan.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    public MusicPlayer(){}
    public void setMusicList(List<Music> myList){
        this.musicList = myList;
    }
    public void setVolume(int volume){this.volume = volume;}
    public void setName(String name){this.name = name;}
    public void playMusic() {
        try{
            System.out.println("This is " + name + "'s player.");
            Thread.sleep(1000);
            System.out.println("The volume is: " + volume + ".");
            Thread.sleep(1000);
            for (Music music : musicList) {
                System.out.println("Playing: " + music.getSong());
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
