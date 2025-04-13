public class Student {
    private String name;
    private BorrowHandler borrowHandler;

    public Student(String name, BorrowHandler borrowHandler) {
        this.name = name;
        this.borrowHandler = borrowHandler;
    }

    public String getName() {
        return name;
    }

    public void accessResource(Resource resource) {
        borrowHandler.handleBorrow(name, resource);
    }
}
