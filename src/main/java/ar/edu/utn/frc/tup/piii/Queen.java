package ar.edu.utn.frc.tup.piii;

import java.util.List;

public class Queen {

    /**
     * Calculates the number of squares the queen can attack on an n x n board
     * with k obstacles.
     *
     * @param n board size
     * @param k number of obstacles
     * @param r_q queen's row
     * @param c_q queen's column
     * @param obstacles list of obstacle coordinates
     * @return total attackable squares
     */
    public Integer queensAttack(Integer n, Integer k, Integer r_q, Integer c_q, List<List<Integer>> obstacles) {
        // Distances to the edges of the board in 8 directions
        int up = n - r_q;
        int down = r_q - 1;
        int left = c_q - 1;
        int right = n - c_q;
        int upLeft = Math.min(up, left);
        int upRight = Math.min(up, right);
        int downLeft = Math.min(down, left);
        int downRight = Math.min(down, right);

        // Adjust distances based on obstacles
        if (obstacles != null) {
            for (List<Integer> obstacle : obstacles) {
                int r_o = obstacle.get(0);
                int c_o = obstacle.get(1);

                // Vertical
                if (c_o == c_q) {
                    if (r_o > r_q) up = Math.min(up, r_o - r_q - 1);
                    else down = Math.min(down, r_q - r_o - 1);
                }
                // Horizontal
                else if (r_o == r_q) {
                    if (c_o > c_q) right = Math.min(right, c_o - c_q - 1);
                    else left = Math.min(left, c_q - c_o - 1);
                }
                // Diagonal
                else if (Math.abs(r_o - r_q) == Math.abs(c_o - c_q)) {
                    if (r_o > r_q && c_o < c_q) upLeft = Math.min(upLeft, r_o - r_q - 1);
                    else if (r_o > r_q && c_o > c_q) upRight = Math.min(upRight, r_o - r_q - 1);
                    else if (r_o < r_q && c_o < c_q) downLeft = Math.min(downLeft, r_q - r_o - 1);
                    else if (r_o < r_q && c_o > c_q) downRight = Math.min(downRight, r_q - r_o - 1);
                }
            }
        }

        return up + down + left + right + upLeft + upRight + downLeft + downRight;
    }
}
