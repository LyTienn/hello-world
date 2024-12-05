
package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class TestMediaTienLC {
    public static void main(String[] args) {
        // Tạo một ArrayList chứa các đối tượng Media
        ArrayList<MediaTienLC> mediaList = new ArrayList<>();

        // Thêm các đối tượng CD, DVD và Book vào danh sách
        mediaList.add(new DigitalVideoDiscTienLC("Star Wars", "Science Fiction", "George Lucas", 120, 24.95f));
        mediaList.add(new CompactDiscTienLC("Thriller", "Pop", 30.99f, "Michael Jackson"));
        mediaList.add(new BookTienLC("Harry Potter", "Fantasy", 19.95f));

        // Duyệt qua danh sách và gọi phương thức toString() để in thông tin
        for (MediaTienLC media : mediaList) {
            System.out.println(media.toString());  // Gọi phương thức toString() của từng đối tượng
        }
    }
}
