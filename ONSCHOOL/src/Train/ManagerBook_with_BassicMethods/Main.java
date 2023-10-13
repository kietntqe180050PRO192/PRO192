package Train.ManagerBook_with_BassicMethods;

public class Main {
    public static void main(String[] args) {
        Day day1 = new Day(15, 5, 2020);
        Day day2 = new Day(15, 9, 2030);
        Day day3 = new Day(15, 9, 2021);

        Author author1 = new Author("Kiet", day1);
        Author author2 = new Author("Kiet1", day2);
        Author author3 = new Author("Kiet2", day3);

        Book book1 = new Book("Java", 100000, 2023, author1);
        Book book2 = new Book("Java1", 100001, 2024, author2);
        Book book3 = new Book("Java2", 100002, 2024, author3);

        book1.printfNameBook();
        book2.printfNameBook();
        book3.printfNameBook();

        System.out.println("Compare publishing year of book1 and book3: "+book1.checkSamePublishingYear(book3));
        System.out.println("Compare publishing year of book2 and book3: "+book2.checkSamePublishingYear(book3));

        System.out.println("Book 1 reduce 10%: "+ book1.priceAfftersell(10));
        System.out.println("Book 2 reduce 20%: "+ book1.priceAfftersell(20));
        System.out.println("Book 3 reduce 50%: "+ book1.priceAfftersell(50));


    }
}
