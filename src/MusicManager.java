import java.util.*;

public class MusicManager {
    private Map<String, List<String>> songsByMood = new HashMap<>();

    public MusicManager() {
        songsByMood.put("happy", new ArrayList<>(Arrays.asList("Happy - Pharrell", "Uptown Funk", "Shake It Off")));
        songsByMood.put("sad", new ArrayList<>(Arrays.asList("Someone Like You", "Stay With Me", "Fix You")));
        songsByMood.put("relaxed", new ArrayList<>(Arrays.asList("Weightless", "Clair de Lune", "Moonlight Sonata")));
        songsByMood.put("energetic", new ArrayList<>(Arrays.asList("Eye of the Tiger", "Thunderstruck", "Stronger")));
    }

    public void recommendSongs(String mood) {
        mood = mood.toLowerCase();
        if(songsByMood.containsKey(mood)) {
            System.out.println("Top songs for " + mood + " mood:");
            List<String> songs = songsByMood.get(mood);
            for(int i=0; i<songs.size(); i++) {
                System.out.println((i+1) + ". " + songs.get(i));
            }
        } else {
            System.out.println("Mood not found. Try: happy, sad, relaxed, energetic");
        }
    }

    public void addSong(String mood, String song) {
        mood = mood.toLowerCase();
        songsByMood.putIfAbsent(mood, new ArrayList<>());
        songsByMood.get(mood).add(song);
        System.out.println("Song added!");
    }
}
