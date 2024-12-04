package ansi;

public final class AnsiCodes {
    // ANSI escape codes
    public static final String RESET = "\033[0m";
    public static final String BOLD = "\033[1m";
    public static final String ITALIC = "\033[3m";
  
    // Foreground colors
    public static final String BLACK = "\033[30m";
    public static final String RED = "\033[31m";
    public static final String GREEN = "\033[32m";
    public static final String YELLOW = "\033[33m";
    public static final String BLUE = "\033[34m";
    public static final String MAGENTA = "\033[35m";
    public static final String CYAN = "\033[36m";
    public static final String WHITE = "\033[37m";
  
    public static final String BLACK_BG = "\033[40m";
    public static final String RED_BG = "\033[41m";
    public static final String GREEN_BG = "\033[42m";
    public static final String YELLOW_BG = "\033[43m";
    public static final String BLUE_BG = "\033[44m";
    public static final String MAGENTA_BG = "\033[45m";
    public static final String CYAN_BG = "\033[46m";
    public static final String WHITE_BG = "\033[47m";
}
