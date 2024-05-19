package MusicLandscape.entities;

public class Event {
    private Artist artist;
    private int attendees;
    private Date date;
    private String description;
    private Venue venue;

    public Event(){
        this.artist = new Artist();
        this.description = "";
    }

    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        if(artist != null) {
            this.artist = artist;
        }
    }
    public Venue getVenue(){
        return venue;
    }
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    public Date getDate() {
        if(date == null){
            return null;
        }else {
            return new Date(date);
        }
    }
    public void setDate(Date date) {
        if(date != null) {
            this.date = new Date(date);
        }
        else{
            this.date = null;
        }
    }
    public int getAttendees() {
        return attendees;
    }
    public void setAttendees(int attendees) {
        if(attendees >= 0) {
            this.attendees = attendees;
        }
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        if(description != null){
            this.description = description;
        }
        else{
            this.description = "";
        }
    }
}
