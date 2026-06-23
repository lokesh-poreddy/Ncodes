public class NamePrinter {
    public  void printNames(String name, int count, int  N) {
        if (count == N) {
            return;
        }
        System.out.println(name);
        printNames(name, count + 1, N);
    }

    public class Main {
        public static void main(String[] args) {
            NamePrinter nameprinter = new NamePrinter();
            int N = 9;
            String name = "loki";
            nameprinter.printNames("loki", 1,5);
        }
    }
}  