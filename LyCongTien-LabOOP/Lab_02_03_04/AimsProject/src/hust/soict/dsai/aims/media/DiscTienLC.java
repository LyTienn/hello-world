
package hust.soict.dsai.aims.media;
public class DiscTienLC extends MediaTienLC {
    private int length;
    private String director;
    //Constructor
    public DiscTienLC(String title, String category, float cost, String director, int length){
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }
    @Override
    public int getLength() {
	return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    @Override
    public String getDirector() {
	return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
}

