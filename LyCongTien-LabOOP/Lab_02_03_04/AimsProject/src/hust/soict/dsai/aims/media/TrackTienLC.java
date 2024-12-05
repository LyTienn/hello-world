
package hust.soict.dsai.aims.media;
import java.util.Objects;
public class TrackTienLC implements PlayableTienLC {
    private final String title;
    private final int length;
    //Constructor
    public TrackTienLC(String title, int length){
        super();
        this.title = title;
        this.length = length;
    }
    @Override
    public void play(){
        System.out.println("Playing track: " + this.title);
        System.out.println("Track length: " + this.length);
    }
    public String getTitle(){
        return title;
    }
    public int getLength(){
        return length;
    }
    @Override
    public int hashCode(){
        return Objects.hash(length, title);
    }
    @Override
    public boolean equals(Object obj) {
	// Kiểm tra đối tượng truyền vào có phải là đối tượng Track hay không
	if (this == obj) return true;  // So sánh tham chiếu
	if (obj == null || getClass() != obj.getClass()) return false;  // Kiểm tra null và kiểu đối tượng
	TrackTienLC track = (TrackTienLC) obj;  // Ép kiểu đối tượng
	return this.title != null && this.title.equals(track.title) && this.length == track.length;  // So sánh title và length
	}
}
