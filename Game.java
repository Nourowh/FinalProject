package osFinalProject;


// noor ahmed 201905802

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Game {

    private Map<String, Integer> playerGuesses = new HashMap<String, Integer>();//List to store player guesses

    private Map<String, AtomicInteger> scores = new HashMap<>();

    //private Set<String> players = new HashSet<>();

    private List<String> summary = new ArrayList<>();

    private boolean running = false;
    private int round = 1;
    private int totalPlayer;

    String currentWin = null;

    public Game() {
        playerGuesses.clear();
        round = 1;
    }

    public boolean isOnlyOne() {
        return scores.size() == 1;
    }

    public void addPlayer(String nickName) {
        this.scores.put(nickName, new AtomicInteger(5));
    }

    public void loseRound(String nickName) {
        this.scores.get(nickName).decrementAndGet();
    }

    public void winRound(String nickName) {
        this.scores.get(nickName).incrementAndGet();
    }


}