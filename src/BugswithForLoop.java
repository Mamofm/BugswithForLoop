public class BugswithForLoop {
    public static void main(String args[]) {
        int total = 0;

        for (int i = 8; i > 0; i -= 2) {
            total += i;
        }

        System.out.println("Total = " + total);
    }
}
