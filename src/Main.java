public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
        MusicConcertEvent musicconcertEvent = new MusicConcertEvent("002", "Music", "school", "XX", 200,2,50);
        musicconcertEvent.calculateEventCost();
        System.out.println(musicconcertEvent);
    }
}
