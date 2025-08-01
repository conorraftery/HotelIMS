package hotel;

public class Room {
    private String number;
    private BedType bedType;
    private SmokingPreference smokingPreference;
    private RoomStatus status;
    private Guest guest;

    public Room(String number, BedType bedType, SmokingPreference smokingPreference, RoomStatus status) {
        this.number = number;
        this.bedType = bedType;
        this.smokingPreference = smokingPreference;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public BedType getBedType() {
        return bedType;
    }

    public SmokingPreference getSmokingPreference() {
        return smokingPreference;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return number + " - " + bedType + ", " + smokingPreference + " - " + status;
    }
}
