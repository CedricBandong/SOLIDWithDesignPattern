public class LibraryBorrowHandler implements BorrowHandler {
    public void handleBorrow(String studentName, Resource resource) {
        System.out.println(studentName + " borrowed a " + resource.getType() + " titled '" + resource.getTitle() + "'.");
    }
}
