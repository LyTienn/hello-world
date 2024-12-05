
package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.media.DigitalVideoDiscTienLC;
import hust.soict.dsai.aims.cart.CartTienLC;
public class TestCart {
    public static void main(String[] args) {
        CartTienLC anOrder = new CartTienLC();
    
    //Them dia vao gio hang
    DigitalVideoDiscTienLC dvd1 = new DigitalVideoDiscTienLC("Tom and Jerry", "Cartoon", "Gene Deitch", 20, 120);
    anOrder.addMediaTienLC(dvd1);
    DigitalVideoDiscTienLC dvd2 = new DigitalVideoDiscTienLC("The Lion king", "anime", "Roger Allers", 15, 87);
    anOrder.addMediaTienLC(dvd2);
    DigitalVideoDiscTienLC dvd3 = new DigitalVideoDiscTienLC("Toy Story", "anime", "John Lasseter", 17, 150);
    anOrder.addMediaTienLC(dvd3);
    anOrder.print();
    //Test search by ID method
        anOrder.searchById(3);
        anOrder.searchById(1);

        //Test search by Title method
        anOrder.searchByTitle("The Lion king");
}
}


