import java.util.List;

public class Game {
    private Maze maze;
    private Pacman pacman;
    private List<Ghost> ghosts;

    public Game(){
        int[][] map = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},				
            {1,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,1},				
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},				
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},				
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},				
            {1,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,1},				
            {1,2,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,1,1,2,1},				
            {1,2,1,1,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,1,1,2,1},				
            {1,2,2,2,2,2,2,1,2,2,2,2,2,1,1,2,2,2,2,2,1,2,2,2,2,2,2,1},				
            {1,1,1,1,1,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,1,1,1,1,0,1,1,0,1,1,1,1,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,0,0,0,0,0,0,0,0,0,0,0,0,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,0,1,1,1,1,0,0,1,1,1,1,0,1,2,1,1,1,1,1,1},				
            {0,0,0,0,0,0,2,0,0,1,0,0,0,0,0,0,0,0,1,0,1,2,0,0,0,0,0,0},				
            {1,1,1,1,1,1,2,1,0,1,1,1,1,1,1,1,1,1,1,0,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,0,0,0,0,0, 0 ,0,0,0,0,0,0,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,0,1,1,1,1,1,1,1,1,1,1,0,1,2,1,1,1,1,1,1},				
            {1,1,1,1,1,1,2,1,0,1,1,1,1,1,1,1,1,1,1,0,1,2,1,1,1,1,1,1},				
            {1,2,2,2,2,2,2,2,2,2,2,2,2,1,1,2,2,2,2,2,2,2,2,2,2,2,2,1},				
            {1,2,1,1,1,1,2,1,1,1,1,1,2,1,1,2,1,1,1,1,1,2,1,1,1,1,2,1},				
            {1,2,1,1,1,1,2,2,2,1,1,1,2,1,1,2,1,1,1,2,2,2,1,1,1,1,2,1},				
            {1,4,2,2,1,1,2,1,2,2,2,2,2,2,2,2,2,2,2,2,1,2,1,1,2,2,4,1},				
            {1,1,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,2,1,1,1},				
            {1,1,1,2,1,1,2,1,2,1,1,1,1,1,1,1,1,1,1,2,1,2,1,1,2,1,1,1},				
            {1,2,2,2,2,2,2,1,2,2,2,2,2,1,1,2,2,2,2,2,1,2,2,2,2,2,2,1},				
            {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},				
            {1,2,1,1,1,1,1,1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,2,1},				
            {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,1},				
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}		
        };
        this.maze = new Maze(map); 
        this.pacman = new Pacman(22, 13);
    }
    
    public void start() {
    }
    
    public void stop() {
        // Lógica para detener el juego
    }
    
    public void handleKeyPress(int keyCode) {
        // Lógica para manejar la tecla presionada
    }
    
    public void update() {
        // Lógica para actualizar el estado del juego
    }

    public Maze getMaze() {
        return maze;
    }
    public Pacman getPacman() {
        return pacman;
    }
}