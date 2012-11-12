package ca.tru.comp2160.mouthworthy.model;

public class FoodSquareItem {

    private String title;
    private String pubDate;
    private String link;
    
    public FoodSquareItem(String title, String pubDate, String link) {
       this.title = title;
       this.pubDate = pubDate;
       this.link = link;
    }
    
	public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getPubDate() { return this.pubDate; }
    public void setPubDate(String pubDate) { this.pubDate = pubDate; }
    
    public String getLink() { return this.link; }
    public void setLink(String link) { this.link = link; }  
	
	
}
