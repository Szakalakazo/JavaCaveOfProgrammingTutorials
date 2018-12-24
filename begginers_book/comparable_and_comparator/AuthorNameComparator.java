package begginers_book.comparable_and_comparator;

public class AuthorNameComparator implements Comparable<AuthorNameComparator>{
    String firstName;
    String bookName;
    int auAge;

    public AuthorNameComparator(String firstName, String bookName, int auAge) {
        this.firstName = firstName;
        this.bookName = bookName;
        this.auAge = auAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuAge() {
        return auAge;
    }

    public void setAuAge(int auAge) {
        this.auAge = auAge;
    }


    @Override
    public int compareTo(AuthorNameComparator au) {
        return this.firstName.compareTo(au.firstName);
    }

    @Override
    public String toString() {
        return "Author name: " + firstName + ", Books name: " + bookName + ", Authors age: " + auAge;
    }
}
