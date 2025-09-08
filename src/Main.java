import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicManager manager = new MusicManager();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n=== Mood-Based Music Recommender ===");
            System.out.println("1. Recommend Songs by Mood");
            System.out.println("2. Add Your Song Suggestion");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter your mood (happy, sad, relaxed, energetic): ");
                    String mood = sc.nextLine();
                    manager.recommendSongs(mood);
                    break;
                case 2:
                    System.out.print("Enter mood for the song: ");
                    String m = sc.nextLine();
                    System.out.print("Enter song name: ");
                    String song = sc.nextLine();
                    manager.addSong(m, song);
                    break;
                case 3:
                    System.out.println("Exiting... Enjoy your music!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
