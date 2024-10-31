public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author = new Author("Big Hank");
        Title book1 = new PrintedBook("Hank on Adventure", "BI", 140, 72);
        Title book2 = new PrintedBook("Hank on Adventure 2", "TE", 200, 130);
        Title audioBook = new AudioBook("The Great Escape", "SKØN", 10, 400);

        Author author1 = new Author("Karl Smart");
        Title audioBook1 = new AudioBook("How to Scam People Online","FAG",18634,1);
        Title book3 = new PrintedBook("How I scammed the internet by selling a fake audiobook", "FAG", 984,5);
        Title book4 = new PrintedBook("How I survived prison after scamming people twice by selling fake books","FAG",520,196);

        author.addTitle(book1);
        author.addTitle(book2);
        author.addTitle(audioBook);

        author1.addTitle(book3);
        author1.addTitle(audioBook1);
        author1.addTitle(book4);

        System.out.println(author);
        System.out.println(author.getName() + ": " + String.format("%.2f", author.calculateTotalPay()) + " kr");
        System.out.println(author1);
        System.out.println(author1.getName() + ": " + String.format("%.2f", author1.calculateTotalPay()));

    }

}