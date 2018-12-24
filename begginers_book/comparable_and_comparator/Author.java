package begginers_book.comparable_and_comparator;

class Author implements Comparable<Author> {
    String firstName;
    String lastName;
    String bookName;

    Author(String firstName, String lastName, String bookName) {
        this.bookName = bookName;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /*
     * This is where we write the logic to sort. This method sort
     * automatically by the first name in case that the last name is
     * the same.
     */
    public int compareTo(Author aut) {
        int last = this.lastName.compareTo(aut.lastName);
        return last == 0 ? this.firstName.compareTo(aut.firstName) : last;
    }

    public String toString(){
        return lastName + ", " + firstName + ", " + bookName;
    }


}
