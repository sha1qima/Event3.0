public class MusicConcertEvent extends Event{
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private double musiceventCost;
    
    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, int totalParticipants, int totalEventDays, double merchandiseCost) {
        super(eventID, eventName, eventLocation, eventPointOfContact, totalParticipants, totalEventDays);
        this.merchandiseCost = merchandiseCost;
    }

    public boolean isMerchandiseRequired() {
        return merchandiseRequired;
    }

    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }

    public double getMerchandiseCost() {
        return merchandiseCost;
    }

    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    @Override
    public String toString() {
        return "Music Concert Event details: " + "\n" +
        "Event ID: " + getEventID() + "\n" +
        "Event Name: " + getEventName() + "\n" +
        "Event Location: " + getEventLocation() + "\n" +
        "Total participants: " + getTotalParticipants() + "\n" + 
        "Total Music Concert event Cost: " + musiceventCost;
    }

    @Override
    public void calculateEventCost(){
        musiceventCost = getEventCost() + (getMerchandiseCost() * getTotalParticipants()) * getTotalEventDays();
    }
}

