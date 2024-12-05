
package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import hust.soict.dsai.aims.media.MediaTienLC;

public class CartTienLC {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private final ArrayList<MediaTienLC> itemsOrdered = new ArrayList<>();
    
    public void addMediaTienLC(MediaTienLC media){
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full. Can't add more items.");
        }
        else if(itemsOrdered.contains(media)){
            System.out.println(media.getTitle() + " is already in the cart.");
        }
        else{
            itemsOrdered.add(media);
            System.out.println("The item \"" + media.getTitle() + "\" has been added.");
        }
    }
    
    //ham them mot danh sach cac doi tuong media vao cart
    public int addMediaTienLC(MediaTienLC... mediaArray){
        int addedCount = 0;
        for(MediaTienLC media : mediaArray){
            if(itemsOrdered.size() == MAX_NUMBERS_ORDERED){
                System.out.println("The cart is full. Can't add more items.");
            }
            else if(itemsOrdered.contains(media)){
            System.out.println(media.getTitle() + " is already in the cart.");
            }
            else{
                itemsOrdered.add(media);
                System.out.println("The item \"" + media.getTitle() + "\" has been added.");
                addedCount++;
            }
        }
        return addedCount;
    }    
    //Xoa media
    public void removeMediaTienLC(MediaTienLC media){
        if(itemsOrdered.isEmpty()){
            System.out.println("Your cart is empty.");
        }
        if(itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("Removed \"" + media.getTitle() + "\" successfully.");
        }
        else{
            System.out.println("Item you want to remove not found.");
        }
    }
    //update total cost
    public float totalCostTienLC(){
        float sum = 0.00f;
        for(MediaTienLC media : itemsOrdered){
            sum += media.getCost();
        }
        return sum;
    }
     public void print() {
        StringBuilder output = new StringBuilder("*********************CART************************** \nOrdered items: \n");
        for (int i = 0; i < itemsOrdered.size(); i++) {
            MediaTienLC media = itemsOrdered.get(i);
            output.append(i + 1 + ".[" + media.getTitle() + "] - [" + media.getCategory() + "] - [" 
                    + media.getDirector() + "] - [" + media.getLength() + "]: " 
                    + media.getCost() + " $\n");
        }
        output.append("total: ").append(totalCostTienLC()).append(" $\n");
        output.append("***************************************************\n");
        System.out.println(output);
    }
 // Tìm kiếm theo ID (index)
    public void searchById(int i) {
        if (i > itemsOrdered.size() || i <= 0) {
            System.out.println("No match found!");
        } else {
            MediaTienLC media = itemsOrdered.get(i - 1);
            System.out.println("Result: " + "[" + media.getTitle() + "] - [" + media.getCategory() + "] - [" 
                    + media.getDirector() + "] - [" + media.getLength() + "]: " + media.getCost() + " $\n");
        }
    }

    // Tìm kiếm theo tiêu đề
    public void searchByTitle(String title) {
        for (MediaTienLC media : itemsOrdered) {
            if (media.getTitle().equals(title)) {
                System.out.println("Result: " + "[" + media.getTitle() + "] - [" + media.getCategory() + "] - [" 
                        + media.getDirector() + "] - [" + media.getLength() + "]: " + media.getCost() + " $\n");
                return;
            }
        }
        System.out.println("No match found!");
    }

    // Lọc các món trong giỏ hàng theo tiêu đề
    public void filterByTitle(String title) {
        for (MediaTienLC media : itemsOrdered) {
            if (media.getTitle().contains(title)) {
                System.out.println("Result: " + "[" + media.getTitle() + "] - [" + media.getCategory() + "] - [" 
                        + media.getDirector() + "] - [" + media.getLength() + "]: " + media.getCost() + " $\n");
            }
        }
    }

    // Sắp xếp giỏ hàng theo tiêu đề
    public void sortByTitle() {
        Collections.sort(itemsOrdered, new Comparator<MediaTienLC>() {
            public int compare(MediaTienLC m1, MediaTienLC m2) {
                int titleComparison = m1.getTitle().compareTo(m2.getTitle());
                if (titleComparison != 0) {
                    return titleComparison;
                }
                return Float.compare(m2.getCost(), m1.getCost()); // Nếu tiêu đề giống nhau, sắp xếp theo giá
            }
        });
        System.out.println("Cart sorted by title and cost!");
    }

    // Sắp xếp giỏ hàng theo giá
    public void sortByCost() {
        Collections.sort(itemsOrdered, new Comparator<MediaTienLC>() {
            public int compare(MediaTienLC m1, MediaTienLC m2) {
                int costComparison = Float.compare(m2.getCost(), m1.getCost());
                if (costComparison != 0) {
                    return costComparison;
                }
                return m1.getTitle().compareTo(m2.getTitle()); // Nếu giá giống nhau, sắp xếp theo tiêu đề
            }
        });
        System.out.println("Cart sorted by cost!");
    }
    // Làm sạch giỏ hàng khi đặt hàng
    public void clear() {
        itemsOrdered.clear();
        System.out.println("Your cart has been cleared.");
    }
}
