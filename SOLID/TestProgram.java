public class TestProgram {
    public static void main(String[] args) {
        BorrowHandler borrowHandler = new LibraryBorrowHandler();

        Student robi = new Student("Cyriljosh", borrowHandler);
        Student juan = new Student("Juan", borrowHandler);

        Resource book = new Book("The Outliers");
        Resource journal = new Journal("International Journal of Computer Engineering Research");
        Resource thesis = new Thesis("Machine learning in Everyday Life");

        robi.accessResource(book);
        robi.accessResource(journal);
        juan.accessResource(thesis);
    }
}
