import java.util.ArrayList;

public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author1 = new Author("Big Hank");

        Title hanksEventyr = new PrintedBook("Hanks Eventyr","BI",439);
        author1.addTitle(hanksEventyr);

    }

}
