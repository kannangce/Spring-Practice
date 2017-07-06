package test.models;

public abstract class MediaPlayer<T extends Media> {
    private T itsMedia;
    public abstract void play();
}