package ar.edu.utn.frc.tup.piii;

public class ConsoleHelper {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void printBanner() {
        System.out.println(CYAN + BOLD + "===============================================" + RESET);
        System.out.println(CYAN + BOLD + "    ____  __  _________________   __" + RESET);
        System.out.println(CYAN + BOLD + "   / __ \\/ / / / ____/ ____/ | / /" + RESET);
        System.out.println(CYAN + BOLD + "  / / / / / / / __/ / __/ /  |/ / " + RESET);
        System.out.println(CYAN + BOLD + " / /_/ / /_/ / /___/ /___/ /|  /  " + RESET);
        System.out.println(CYAN + BOLD + " \\___\\_\\____/_____/_____/_/ |_/   " + RESET);
        System.out.println(CYAN + BOLD + "           A T T A C K" + RESET);
        System.out.println(CYAN + BOLD + "===============================================" + RESET);
        System.out.println(WHITE + "      Professional Logical Engine | Lantieridev" + RESET);
        System.out.println();
    }

    public static void printStep(String message) {
        System.out.println(BLUE + BOLD + "» " + RESET + WHITE + message + RESET);
    }

    public static void printInput(String label) {
        System.out.print(YELLOW + label + RESET + " ");
    }

    public static void printResult(int result) {
        System.out.println();
        System.out.println(GREEN + BOLD + "Calculation Complete!" + RESET);
        System.out.println(CYAN + "Total Attackable Squares: " + WHITE + BOLD + result + RESET);
        System.out.println(GREEN + BOLD + "===============================================" + RESET);
    }
}
