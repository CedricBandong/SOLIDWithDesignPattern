public class TestProgram {
    public static void main(String[] args) {
        BorrowHandler borrowHandler = new LibraryBorrowHandler();

        Student robi = new Student("Cedric", borrowHandler);
        Student juan = new Student("Bandong", borrowHandler);

        Resource book = new Book("The Outliers");
        Resource journal = new Journal("International Journal of Computer Engineering Research");
        Resource thesis = new Thesis("Machine learning in Everyday Life");

        robi.accessResource(book);
        robi.accessResource(journal);
        juan.accessResource(thesis);
    }
}
