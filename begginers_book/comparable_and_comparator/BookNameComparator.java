package begginers_book.comparable_and_comparator;

import java.util.Comparator;

public class BookNameComparator implements Comparator<AuthorNameComparator> {
    @Override
    public int compare(AuthorNameComparator a1, AuthorNameComparator a2) {
        return a1.bookName.compareTo(a2.bookName);
    }
}
