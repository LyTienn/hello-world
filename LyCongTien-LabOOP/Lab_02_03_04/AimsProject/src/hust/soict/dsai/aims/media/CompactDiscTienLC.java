
package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDiscTienLC extends DiscTienLC implements PlayableTienLC {
    private final String artist;
    private final ArrayList<TrackTienLC> tracks;
    
    //Constructor cua CompactDisc
    public CompactDiscTienLC(String title, String category, float cost, String artist){
        super(title, category, cost, "", 0);
        this.artist = artist;
        this.tracks = new ArrayList<>(); //Khoi tao danh sach tracks
    }
    @Override
    public void play(){
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Artist: " + this.artist);
        for(TrackTienLC track : tracks){
            track.play();
        }
    }
    //Getter (only artist)
    public String getArtist(){
        return artist;
    }
    //add track
    public void addTrackTienLC(TrackTienLC track){
        if(!tracks.contains(track)){
            tracks.add(track);
        }
        else{
            System.out.println("Track already exists.");
        }
    }
    //remove track
    public void removeTrackTienLC(TrackTienLC track){
        if(tracks.contains(track)){
            tracks.remove(track);
        }
        else{
            System.out.println("Track not found.");
        }
    }
    //total track sum
    @Override
    public int getLength(){
        int totalLength = 0;
        for(TrackTienLC track : tracks){
            totalLength += track.getLength();
        }
        return totalLength;
    }
}
