package map_interface;

import java.util.*;

public class VotingSystem {
    private Map<String, Integer> voteCount = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedResults = new TreeMap<>();

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
        sortedResults.put(candidate, voteCount.get(candidate));
    }

    public void displayResults() {
        System.out.println("Sorted Results: " + sortedResults);
        System.out.println("Order of Votes: " + voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        votingSystem.displayResults();
    }
}
