public abstract class Title {

    private String title;
    private String literatureType;
    protected int copies;
    protected double rate;

    public Title(String title, String literatureType, int copies){

        this.title = title;
        this.copies = copies;
        this.literatureType = literatureType;

    }

    public void calculateRoyalty(){



    }

    public abstract double calculatePoints();

    public abstract double calculateLiteraturePoints();

}
