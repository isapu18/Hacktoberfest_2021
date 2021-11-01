import java.nio.file.*;

class Main {
  public static void main(String[] args) {

    try {

      // make a connection to the file
      Path file = Paths.get("input.txt");

      // read all lines of the file
      long count = Files.lines(file).count();
      System.out.println("Total Lines: " + count);

    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
