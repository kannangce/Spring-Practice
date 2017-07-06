package test.models;

public class CDPlayer extends MediaPlayer<CD> {
    
    private CD itsMedia;
    
    public CDPlayer(CD theMedia) {
        itsMedia = theMedia;
    }
    
    @Override
    public void play() {
        System.out.println(itsMedia.getData());
    }
}
