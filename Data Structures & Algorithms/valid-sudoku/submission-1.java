class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> st = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (st.contains(board[i][j])) {
                    return false;
                }
                st.add(board[i][j]);
            }
            st.clear();
        }
        st.clear();

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (st.contains(board[i][j])) {
                    return false;
                }
                st.add(board[i][j]);
            }
             st.clear();
        }

        st.clear();

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                int lowX = 3 * x + 0;
                int highX = 3 * x + 2;

                int lowY = 3 * y + 0;
                int highY = 3 * y + 2;

                for (int m = lowX; m <= highX; m++) {
                    for (int n = lowY; n <= highY; n++) {
                        if (board[m][n] == '.') {
                            continue;
                        }
                        if (st.contains(board[m][n])) {
                            return false;
                        }
                        st.add(board[m][n]);
                    }
                }

                st.clear();
            }
        }

        return true;
    }
}
