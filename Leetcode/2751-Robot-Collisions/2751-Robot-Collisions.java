class Solution {
    final private int RIGHT_DIR = 0;
    final private int LEFT_DIR = 1;

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<int[]> rightRobots = new Stack<>(), leftRobots = new Stack<>();
        List<int[]> robots = new ArrayList<>();
        int[] currStackFrame;
        int j = 0;

        for (int i : positions) {
            robots.add(new int[]{
                j, 
                healths[j], 
                (directions.charAt(j) == 'R' ? RIGHT_DIR : LEFT_DIR),
                i
            });

            j++;
        }

        robots.sort((a, b) -> Integer.compare(a[3], b[3]));

        for (int[] robot : robots) {
            if (robot[2] == RIGHT_DIR) {
                rightRobots.push(robot);
                continue;
            }

            while (!rightRobots.empty()) {
                currStackFrame = rightRobots.peek();
                also 
                if (robot[1] > currStackFrame[1]) {
                    rightRobots.pop();
                    robot[1]--;
                } else if (robot[1] == currStackFrame[1]) {
                    rightRobots.pop();
                    robot = null;
                    break;
                } else {
                    currStackFrame[1]--;
                    robot = null;
                    break;
                }
            }

            if (robot != null) {
                leftRobots.push(robot);
            }
        }

        List<int[]> unprocessedResult = new ArrayList<>();

        for (int[] robot : rightRobots) {
            unprocessedResult.add(robot);
        }

        for (int[] robot : leftRobots) {
            unprocessedResult.add(robot);
        }

        unprocessedResult.sort((a, b) -> Integer.compare(a[0], b[0]));

        List<Integer> result = new ArrayList<>();

        for (int[] robot : unprocessedResult) {
            result.add(robot[1]);
        }

        return result;
    }
}