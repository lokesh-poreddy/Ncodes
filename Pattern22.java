public class Pattern22 {
  public void pattern22(int n) {

    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        int distance_of_x_from_centre = Math.abs((n -1) - i);
        int distance_of_y_from_centre = Math.abs((n-1) - j);
        int print_value = Math.max(distance_of_x_from_centre, distance_of_y_from_centre) + 1;
        System.out.print(print_value+" ");
      }
      System.out.println();
    }
  }
    public static void main(String[] args) {
        Pattern22 sol = new Pattern22();
        sol.pattern22(5); // Pass 5 to get up to 'E'
    }
}
