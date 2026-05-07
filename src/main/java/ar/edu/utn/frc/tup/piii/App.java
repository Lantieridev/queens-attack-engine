package ar.edu.utn.frc.tup.piii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Queen's Attack II - Professional Implementation
 * Optimized Algorithm with Executive Visuals
 */
public class App 
{
    public static void main( String[] args ) {
        Queen queen = new Queen();
        Scanner scanner = new Scanner(System.in);

        ConsoleHelper.printBanner();

        ConsoleHelper.printStep("Board Configuration");
        Integer n = readInt(scanner, "Chessboard size (n):");
        Integer k = readInt(scanner, "Number of obstacles (k):");

        System.out.println();
        ConsoleHelper.printStep("Queen's Initial Position");
        Integer r_q = readInt(scanner, "Row (r_q):");
        Integer c_q = readInt(scanner, "Column (c_q):");

        List<List<Integer>> obstacles = new ArrayList<>();
        if (k > 0) {
            System.out.println();
            ConsoleHelper.printStep("Obstacle Mapping");
            for(int i = 0; i < k; i++) {
                List<Integer> point = new ArrayList<>();
                System.out.println("  Obstacle " + (i+1) + ":");
                point.add(readInt(scanner, "    Row:"));
                point.add(readInt(scanner, "    Column:"));
                obstacles.add(point);
            }
        }

        int result = queen.queensAttack(n, k, r_q, c_q, obstacles);
        ConsoleHelper.printResult(result);
    }

    private static Integer readInt(Scanner scanner, String label) {
        while (true) {
            try {
                ConsoleHelper.printInput(label);
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println(ConsoleHelper.RED + "  ⚠ Invalid input. Please enter a number." + ConsoleHelper.RESET);
            }
        }
    }
}
