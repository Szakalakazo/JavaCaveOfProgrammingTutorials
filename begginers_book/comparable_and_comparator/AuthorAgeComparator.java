package begginers_book.comparable_and_comparator;

import java.util.Comparator;

class AuthorAgeComparator implements Comparator<AuthorNameComparator> {
    public int compare(AuthorNameComparator a1, AuthorNameComparator a2) {
        if (a1.auAge == a2.auAge) return 0;
        else if (a1.auAge > a2.auAge) return 1;
        else return -1;
    }
}
