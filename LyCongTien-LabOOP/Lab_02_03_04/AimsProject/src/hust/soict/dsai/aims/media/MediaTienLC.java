
package hust.soict.dsai.aims.media;
public abstract class MediaTienLC {
    private static int idCounter = 0;
    private int id;
    private String title;
    private String category;
    private float cost;    
    //Constructor
    public MediaTienLC(String title, String category, float cost){
        this.id = ++idCounter;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }    
    public int getId(){
        return id;
    }   
    public void setId(int id){
        this.id = id;
    }  
    public String getTitle(){
        return title;
    }  
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public float getCost(){
        return cost;
    } 
    public void setCost(float cost){
        this.cost = cost;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MediaTienLC media = (MediaTienLC) obj;
        return this.title != null && this.title.equals(media.title);
    }
    @Override
    public String toString(){
        return "ID: " + id + "\nTitle: " + title + "\nCategory: " + category + "\nCost: " + cost;
    }
    public abstract int getLength();
    public abstract String getDirector();
}
