import java.util.*;

public class Main {

    static char[][] maze = {
            {'S', '.', '#', '.', '.'},
            {'#', '.', '#', '.', '#'},
            {'.', '.', '.', '.', '#'},
            {'#', '#', '.', '#', '.'},
            {'.', '.', '.', 'F', '.'}
    };

    static int rows = maze.length;
    static int cols = maze[0].length;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x;
        int y;
        Node parent;

        Node(int x, int y, Node parent) {
            this.x = x;
            this.y = y;
            this.parent = parent;
        }
    }

    public static void main(String[] args) {

        Node start = null;
        Node finish = null;

        // Localiza S e F
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (maze[i][j] == 'S')
                    start = new Node(i, j, null);

                if (maze[i][j] == 'F')
                    finish = new Node(i, j, null);
            }
        }

        bfs(start, finish);
    }

    static void bfs(Node start, Node finish) {

        Queue<Node> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            if (current.x == finish.x && current.y == finish.y) {

                System.out.println("Caminho encontrado!\n");

                List<Node> path = new ArrayList<>();

                while (current != null) {
                    path.add(current);
                    current = current.parent;
                }

                Collections.reverse(path);

                System.out.println("Passos:");

                for (Node n : path) {
                    System.out.println("(" + n.x + "," + n.y + ")");
                }

                System.out.println("\nQuantidade de passos: " + (path.size() - 1));

                printMaze(path);

                return;
            }

            for (int i = 0; i < 4; i++) {

                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (isValid(nx, ny, visited)) {

                    visited[nx][ny] = true;
                    queue.add(new Node(nx, ny, current));
                }
            }
        }

        System.out.println("Não existe caminho.");
    }

    static boolean isValid(int x, int y, boolean[][] visited) {

        return x >= 0 &&
               y >= 0 &&
               x < rows &&
               y < cols &&
               !visited[x][y] &&
               maze[x][y] != '#';
    }

    static void printMaze(List<Node> path) {

        char[][] result = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            result[i] = maze[i].clone();
        }

        for (Node node : path) {

            if (result[node.x][node.y] == '.')
                result[node.x][node.y] = '*';
        }

        System.out.println("\nLabirinto:");

        for (char[] row : result) {

            for (char c : row)
                System.out.print(c + " ");

            System.out.println();
        }
    }
}