class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range(9):
            seen = set()

            for j in range(9):
                if board[i][j] == ".":
                    continue
                if board[i][j] in seen:
                    return False

                seen.add(board[i][j])

        for j in range(9):
            seen = set()

            for i in range(9):
                if board[i][j] == ".":
                    continue
                if board[i][j] in seen:
                    return False

                seen.add(board[i][j])

        for s in range(9):
            seen = set()

            for i in range(3):
                for j in range(3):
                    row = (s // 3) * 3 + i
                    col = (s % 3) * 3 + j

                    if board[row][col] == ".":
                        continue
                    if board[row][col] in seen:
                        return False

                    seen.add(board[row][col])

        return True
