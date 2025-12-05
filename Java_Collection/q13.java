import java.util.*;

// Movie class
class Movie {
    String title;
    String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}

public class StreamingApp {
    public static void main(String[] args) {

        // 1. All available movies
        List<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("The Godfather", "Crime"));
        allMovies.add(new Movie("Pulp Fiction", "Crime"));
        allMovies.add(new Movie("The Lion King", "Animation"));
        allMovies.add(new Movie("Finding Nemo", "Animation"));

        // 2. Queue for "Up Next"
        Queue<Movie> upNext = new LinkedList<>();
        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(2));
        upNext.add(allMovies.get(4));

        // 3. Stack for watch history
        Stack<Movie> watchHistory = new Stack<>();

        // 4. Set for unique genres watched
        Set<String> genresWatched = new HashSet<>();

        // Simulate watching movies
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();       // take next movie
            System.out.println("Watching: " + current);

            // Add to watch history stack
            watchHistory.push(current);

            // Track unique genres
            genresWatched.add(current.genre);
        }

        System.out.println("\nWatch History (Most recent on top):");
        for (Movie m : watchHistory) System.out.println(m);

        System.out.println("\nUnique Genres Watched:");
        for (String genre : genresWatched) System.out.println(genre);

        // 5. Display recommendations based on watched genres
        System.out.println("\nRecommendations based on your genres:");
        for (Movie m : allMovies) {
            if (genresWatched.contains(m.genre) && !watchHistory.contains(m)) {
                System.out.println(m);
            }
        }
    }
}
