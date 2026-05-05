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
        ConsoleHelper.printInput("Chessboard size (n):");
        Integer n = scanner.nextInt();
        
        ConsoleHelper.printInput("Number of obstacles (k):");
        Integer k = scanner.nextInt();

        System.out.println();
        ConsoleHelper.printStep("Queen's Initial Position");
        ConsoleHelper.printInput("Row (r_q):");
        Integer r_q = scanner.nextInt();
        ConsoleHelper.printInput("Column (c_q):");
        Integer c_q = scanner.nextInt();

        List<List<Integer>> obstacles = new ArrayList<>();
        if (k > 0) {
            System.out.println();
            ConsoleHelper.printStep("Obstacle Mapping");
            for(int i = 0; i < k; i++) {
                List<Integer> point = new ArrayList<>();
                System.out.println("  Obstacle " + (i+1) + ":");
                ConsoleHelper.printInput("    Row:");
                point.add(scanner.nextInt());
                ConsoleHelper.printInput("    Column:");
                point.add(scanner.nextInt());
                obstacles.add(point);
            }
        }

        int result = queen.queensAttack(n, k, r_q, c_q, obstacles);
        
        ConsoleHelper.printResult(result);
    }
}
