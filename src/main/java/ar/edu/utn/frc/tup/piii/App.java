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
        Integer n = Integer.parseInt(scanner.next());
        
        ConsoleHelper.printInput("Number of obstacles (k):");
        Integer k = Integer.parseInt(scanner.next());

        System.out.println();
        ConsoleHelper.printStep("Queen's Initial Position");
        ConsoleHelper.printInput("Row (r_q):");
        Integer r_q = Integer.parseInt(scanner.next());
        ConsoleHelper.printInput("Column (c_q):");
        Integer c_q = Integer.parseInt(scanner.next());

        List<List<Integer>> obstacles = new ArrayList<>();
        if (k > 0) {
            System.out.println();
            ConsoleHelper.printStep("Obstacle Mapping");
            for(int i = 0; i < k; i++) {
                List<Integer> point = new ArrayList<>();
                System.out.println("  Obstacle " + (i+1) + ":");
                ConsoleHelper.printInput("    Row:");
                point.add(Integer.parseInt(scanner.next()));
                ConsoleHelper.printInput("    Column:");
                point.add(Integer.parseInt(scanner.next()));
                obstacles.add(point);
            }
        }

        int result = queen.queensAttack(n, k, r_q, c_q, obstacles);
        
        ConsoleHelper.printResult(result);
    }
}
