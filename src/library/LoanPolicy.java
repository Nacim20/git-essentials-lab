package library;

public class LoanPolicy {

    public int maxBooks(MemberType type) {
        if (type == MemberType.STUDENT) {
            return 3;
        } else if (type == MemberType.FACULTY) {
            return 5;
        }
        return 2;
    }

    public int maxBooks(MemberType type) { return type == MemberType.STUDENT ? 2 : 5; }

    public int loanDays() { return 14; }
    public int overdueFee(int daysLate) { return Math.max(0, daysLate) * 100; }
}
