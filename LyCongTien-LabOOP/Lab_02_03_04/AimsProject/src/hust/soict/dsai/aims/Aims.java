package hust.soict.dsai.aims;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.CartTienLC;
import hust.soict.dsai.aims.media.BookTienLC;
import hust.soict.dsai.aims.media.CompactDiscTienLC;
import hust.soict.dsai.aims.media.DigitalVideoDiscTienLC;
import hust.soict.dsai.aims.media.MediaTienLC;
import hust.soict.dsai.aims.media.PlayableTienLC;
import hust.soict.dsai.aims.store.StoreTienLc;

public class Aims {

    private static StoreTienLc store = new StoreTienLc(); // Cửa hàng
    private static CartTienLC cart = new CartTienLC(); // Giỏ hàng
    private static Scanner scanner = new Scanner(System.in); // Scanner để nhập dữ liệu

    public static void main(String[] args) {
        // Thêm một số media vào cửa hàng (ví dụ)
        store.addMediaTienLC(new CompactDiscTienLC("Thriller", "Pop", 15.99f, "Michael Jackson"));
        store.addMediaTienLC(new DigitalVideoDiscTienLC("Star Wars", "Science Fiction", "George Lucas", 120, 24.95f));
        store.addMediaTienLC(new BookTienLC("Harry Potter", "Fantasy", 19.95f));
        showMenu();
    }

    // Hiển thị menu chính
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }


    // Hiển thị menu cửa hàng
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }


    // Menu chi tiết media
    public static void mediaDetailsMenu(MediaTienLC media) {
        while (true) {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to cart");
            System.out.println("2. Play");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: // Add to cart
                    cart.addMediaTienLC(media);
                    System.out.println("Media added to cart.");
                    break;
                case 2: // Play
                    if (media instanceof PlayableTienLC) {
                        ((PlayableTienLC) media).play();
                    } else {
                        System.out.println("This media cannot be played.");
                    }
                    break;
                case 0: // Back
                    return;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
    // Hiển thị menu giỏ hàng
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    // Sắp xếp media trong giỏ hàng
    public static void sortMediasInCart() {
        System.out.println("Choose sorting criteria: ");
        System.out.println("1. By title");
        System.out.println("2. By cost");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                cart.sortByTitle();
                break;
            case 2:
                cart.sortByCost();
                break;
            default:
                System.out.println("Invalid choice! Please choose again.");
        }
    }
    // Đặt hàng
    public static void placeOrder() {
        System.out.println("Order placed!");
        cart.clear();
    }
    // Cập nhật cửa hàng (thêm/xóa media)
    public static void updateStore() {
        // Chức năng thêm/xóa media trong cửa hàng có thể thêm vào sau nếu cần thiết
    }
}