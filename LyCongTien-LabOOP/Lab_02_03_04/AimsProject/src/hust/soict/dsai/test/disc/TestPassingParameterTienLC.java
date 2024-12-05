
package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDiscTienLC;
public class TestPassingParameterTienLC {
    public static void main(String[] args) {
        DigitalVideoDiscTienLC jungleDVD = new DigitalVideoDiscTienLC("Jungle");
        DigitalVideoDiscTienLC cinderellaDVD = new DigitalVideoDiscTienLC("Cinderella");
        swapTienLC(jungleDVD,cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        changeTitleTienLC(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
//    public static void swapTIENLC(Object o1, Object o2){
//        Object tmp = o1;
//        o1 = o2;
//        o2 = tmp;
//    }
//    public static void changeTitletienlc(DigitalVideoDiscTienLC dvd, String title){
//        String oldTitle = dvd.getTitle();
//        dvd.setTitle(title);
//        dvd = new DigitalVideoDiscTienLC(oldTitle);
//    }
    public static void swapTienLC(DigitalVideoDiscTienLC dvd1, DigitalVideoDiscTienLC dvd2){
        String tmpTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmpTitle);
        
        String tmpCategory = dvd1.getCategory();
        dvd1.setCategory(dvd2.getCategory());
        dvd2.setCategory(tmpCategory);
        
        String tmpDirector = dvd1.getDirector();
        dvd1.setDirector(dvd2.getDirector());
        dvd2.setDirector(tmpDirector);
        
        int tmpLength = dvd1.getLength();
        dvd1.setLength(dvd2.getLength());
        dvd2.setLength(tmpLength);
        
        float tmpCost = dvd1.getCost();
        dvd1.setCost(dvd2.getCost());
        dvd2.setCost(tmpCost);
    }
    
    public static void changeTitleTienLC(DigitalVideoDiscTienLC dvd, String title){
        dvd.setTitle(title);
    }
}
