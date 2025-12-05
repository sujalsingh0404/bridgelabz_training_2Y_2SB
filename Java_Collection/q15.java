import java.util.*;

// Team class
class Team implements Comparable<Team> {
    String name;
    int points;

    public Team(String name) {
        this.name = name;
        this.points = 0;
    }

    @Override
    public int compareTo(Team other) {
        // Sort by points descending, then name ascending
        if (this.points != other.points) {
            return other.points - this.points; // descending
        } else {
            return this.name.compareTo(other.name);
        }
    }

    @Override
    public String toString() {
        return name + " (" + points + " pts)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Team)) return false;
        Team other = (Team) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

// Match class
class Match {
    Team team1;
    Team team2;

    public Match(Team t1, Team t2) {
        this.team1 = t1;
        this.team2 = t2;
    }

    @Override
    public String toString() {
        return team1.name + " vs " + team2.name;
    }
}

// Result class
class Result {
    Match match;
    Team winner; // null if draw

    public Result(Match match, Team winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        if (winner == null) return match + " -> Draw";
        return match + " -> Winner: " + winner.name;
    }
}

public class TournamentScheduler {
    public static void main(String[] args) {
        // 1. Register teams
        Set<Team> teams = new HashSet<>();
        teams.add(new Team("Team A"));
        teams.add(new Team("Team B"));
        teams.add(new Team("Team C"));
        teams.add(new Team("Team D"));

        System.out.println("Registered Teams: " + teams);

        // 2. Schedule matches
        Queue<Match> matchQueue = new LinkedList<>();
        List<Team> teamList = new ArrayList<>(teams);
        for (int i = 0; i < teamList.size(); i++) {
            for (int j = i + 1; j < teamList.size(); j++) {
                matchQueue.add(new Match(teamList.get(i), teamList.get(j)));
            }
        }

        System.out.println("\nScheduled Matches:");
        for (Match m : matchQueue) System.out.println(m);

        // 3. Process matches
        List<Result> results = new ArrayList<>();
        Random rand = new Random();

        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();
            // Randomly decide winner or draw
            int outcome = rand.nextInt(3); // 0 -> team1 wins, 1 -> team2 wins, 2 -> draw
            Team winner = null;
            if (outcome == 0) {
                winner = match.team1;
                match.team1.points += 3;
            } else if (outcome == 1) {
                winner = match.team2;
                match.team2.points += 3;
            } else {
                match.team1.points += 1;
                match.team2.points += 1;
            }
            results.add(new Result(match, winner));
        }

        // 4. Display results
        System.out.println("\nMatch Results:");
        for (Result r : results) System.out.println(r);

        // 5. Display leaderboard using TreeSet
        TreeSet<Team> leaderboard = new TreeSet<>(teams);
        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) System.out.println(t);
    }
}
