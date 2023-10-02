/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chris Tanailidis
 */
public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private int capacity;
    private String date;
    private String description;
    private int numberOfPages;

    public Book(){
        id = 0;
        name = "-";
        author = "-";
        price = 0.0;
        capacity = 0;
        date = "-";
        description = "-";
        numberOfPages = 0;
    }
    
    public Book(int id,String name, String author, double price, int capacity, String date, String description, int numberOfPages){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.capacity = capacity;
        this.date = date;
        this.description = description;
        this.numberOfPages = numberOfPages;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    @Override
    public String toString(){
        //System.out.println(String.format("%-7s %-51s %-30s %-5s %-5s %-11s %-21s %-5s",this.getId(),this.getName(),this.getAuthor(),this.getPrice(),this.getCapacity(),this.getDate(),trimString(this.getDescription(),17)+"...",this.getNumberOfPages()));
        return String.format("%-5s %-36s %-17s %-8s %-8s %-12s %-21s %-5s",this.getId(),trimString(this.getName(),35),trimString(this.getAuthor(),15),this.getPrice(),this.getCapacity(),this.getDate(),trimString(this.getDescription(),17)+"...",this.getNumberOfPages());
    }
    
    private String trimString(String date, int size){
        String newDate = "";
        if(date.length()>size){
            for(int i=0; i<size; i++)
                newDate += date.charAt(i);
        }
        else{
            newDate=date;
        }
        return newDate;
    }
    
}
