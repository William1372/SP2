public class AudioBook extends Title {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {

        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }

    @Override
    public double calculatePoints(){



    }

    @Override
    public double calculateLiteraturePoints(){



    }

}