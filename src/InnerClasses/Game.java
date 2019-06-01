package InnerClasses;

public class Game {
    private final String name;
    private final String genre;
    private final String type;

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return type;
    }

    private Game(String name, String genre, String type){
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public static GameDisk getDisk(String name, String genre, String description) {
        GameDisk dota = new GameDisk("dota2", "MMORPG", "cool game");
        return dota;
    }



    public static class GameDisk{
        final String description;
        final Game data;

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }

        private GameDisk(String name, String genre, String description){
            this.data = new Game(name, genre, "DVD");
            this.description = description;
        }
    }
    public static class VirtualGame {
        int rating;
        final Game data;

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public Game getData() {
            return data;
        }

        private VirtualGame(String name, String genre){
            this.data = new Game (name, genre, "PSP");
        }
    }
}
