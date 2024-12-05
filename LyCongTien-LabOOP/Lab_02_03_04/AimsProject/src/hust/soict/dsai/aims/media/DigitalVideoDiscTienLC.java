

package hust.soict.dsai.aims.media;
public class DigitalVideoDiscTienLC extends DiscTienLC implements PlayableTienLC {
    @Override
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    //Constructor day du
    public DigitalVideoDiscTienLC(String title, String category, String director, int length, float cost){
        super(title, category, cost, director, length);
    }
    public DigitalVideoDiscTienLC(String title, String category, float cost){
        super(title, category, cost, "", 0);
    }
    public DigitalVideoDiscTienLC(String title){
        super(title, "", 0, "", 0);
    }   
}