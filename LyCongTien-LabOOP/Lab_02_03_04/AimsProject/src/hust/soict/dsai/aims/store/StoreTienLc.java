
package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.MediaTienLC;
import java.util.ArrayList;
public class StoreTienLc {
    private final ArrayList<MediaTienLC> itemsInStore = new ArrayList<MediaTienLC>();
    private boolean checkMediaTienLC(MediaTienLC media){
        for(MediaTienLC m : itemsInStore){
            if (m.equals(media)){
                return true;
            }
        }
        return false;
    }   
    public void addMediaTienLC(MediaTienLC media){
        if(!checkMediaTienLC(media)){
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " 've been added to the store !");
        }
        else{
            System.out.println(media.getTitle() + " 'already exists in the store.");
        }
    }
    
    public void removeMediaTienLC(MediaTienLC media){
        if(checkMediaTienLC(media)){
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " 've been deleted from the store.");
        }
        else{
            System.out.println("There is no "+ media.getTitle() + " in the store.");
        }
    }
    
    public void printStore(){
        System.out.println("\n--- Store ---");
        if(itemsInStore.isEmpty()){
            System.out.println("No Dvds in store.");
        }
        else{
            itemsInStore.forEach(dvd -> System.out.println(dvd));
        }
        System.out.println("------------");
    }
    
    @Override //Dinh nghia lai phuong thuc trong lop Object cua thu vien java.lang
    public String toString() {
        StringBuilder string = new StringBuilder("****************STORE***************\nitems in the store: \n");
        if(itemsInStore.isEmpty()) string.append("There is no media items in the store.\n");
        else {
            for (MediaTienLC media : itemsInStore) {
                string.append(media.getTitle()).append(" - ").append(media.getCost()).append(" $\n");
            }
        }
        string.append("***************************************");
        return string.toString();
    }
}
