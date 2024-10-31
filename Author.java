import java.util.*;

public class Author {

    private String name;
    private ArrayList<Title> titles;

    public Author(String name){

        this.name = name;
        this.titles = new ArrayList<>();

    }
    public void addTitle(Title title){

        titles.add(title);

    }
    public float calculateTotalPay(){

        double totalPay = 0.0;

        for (Title title:titles){

            double royalty = title.calculateRoyalty();
            System.out.println("Royalty for "+title+": "+royalty);
            totalPay += royalty;

        }

        return (float) totalPay;

    }

    @Override
    public String toString(){

        return "Author: " + name +
                "\nTitles: " + titles;

    }

    public String getName() {

        return name;

    }

}