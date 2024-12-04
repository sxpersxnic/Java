package ansi;

public class AnsiColor {
  /** 
   * Method to set RGB color
   * 
   * Example: String ansiRed = rgb(255, 255, 255, true);
   * 
   * @param r
   * @param g
   * @param b
   * @param isForeground
   * @return String - e.g. '\033[38;2;255;255;255m'
   */
  public static String rgb(int r, int g, int b, boolean isForeground) {
      return String.format("\033[%d;2;%d;%d;%dm", isForeground ? 38 : 48, r, g, b);
  }

  
  /** 
   * Method to convert hex to RGB 
   * 
   * Example: String ansiRed = hex("#ff0000", true)
   * @param hex
   * @param isForeground
   * 
   * @return String
   */
  public static String hex(String hex, boolean isForeground) {
      int r = Integer.valueOf(hex.substring(1, 3), 16);
      int g = Integer.valueOf(hex.substring(3, 5), 16);
      int b = Integer.valueOf(hex.substring(5, 7), 16);
      return rgb(r, g, b, isForeground);
  }
  
  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * print("This is a green and bold message", GREEN, BOLD);
   * print("This is a custom RGB color message", rgb(255, 155, 78, true), ITALIC);
   * print("This is a custom hex color message", hex("#FF9B4E", true), ITALIC);
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   * @param styles style e.g. BOLD or ITALIC
   */
  public static void println(String text, String color, String... styles) {
      StringBuilder styleBuilder = new StringBuilder();
      for (String style : styles) {
          styleBuilder.append(style);
      }
      System.out.println(styleBuilder.toString() + color + text + AnsiCodes.RESET);
  }

  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * println("This is a green and bold message", GREEN);
   * println("This is a custom RGB color message", rgb(255, 155, 78, true));
   * println("This is a custom hex color message", hex("#FF9B4E", true));
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   */
  public static void println(String text, String color) {
      System.out.println(color + text + AnsiCodes.RESET);
  }

  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * println("This is normal white text", "This is a green and bold message", GREEN);
   * println("This is a custom RGB color message", rgb(255, 155, 78, true));
   * println("This is a custom hex color message", hex("#FF9B4E", true));
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   */
  public static void println(String text, String coloredText, String color) {
      System.out.println(text + color + coloredText + AnsiCodes.RESET);
  }

  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * print("This is a green and bold message", GREEN, BOLD);
   * print("This is a custom RGB color message", rgb(255, 155, 78, true), ITALIC);
   * print("This is a custom hex color message", hex("#FF9B4E", true), ITALIC);
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   * @param styles style e.g. BOLD or ITALIC
   */
  public static void print(String text, String color, String... styles) {
      StringBuilder styleBuilder = new StringBuilder();
      for (String style : styles) {
          styleBuilder.append(style);
      }
      System.out.print(styleBuilder.toString() + color + text + AnsiCodes.RESET);
  }

  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * print("This is a green and bold message", GREEN, BOLD);
   * print("This is a custom RGB color message", rgb(255, 155, 78, true), ITALIC);
   * print("This is a custom hex color message", hex("#FF9B4E", true), ITALIC);
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   */
  public static void print(String text, String color) {
      System.out.print(color + text + AnsiCodes.RESET);
  }

  /**
   * 
   * Method to print text with custom color and style
   * Example usage:
   * 
   * print("This is a green and bold message", GREEN, BOLD);
   * print("This is a custom RGB color message", rgb(255, 155, 78, true), ITALIC);
   * print("This is a custom hex color message", hex("#FF9B4E", true), ITALIC);
   *
   * @param text The text to print
   * @param color The `rgb` or `hex` color
   */
  public static void print(String text, String coloredText, String color) {
      System.out.print(text + color + coloredText + AnsiCodes.RESET);
  }
} 
