package hotel;

import java.util.Objects;

class RoomPreferences {
    private BedType bedType;
    private SmokingPreference smokingPreference;

    public RoomPreferences(BedType bedType, SmokingPreference smokingPreference) {
        this.bedType = bedType;
        this.smokingPreference = smokingPreference;
    }

    public BedType getBedType() {
        return bedType;
    }

    public SmokingPreference getSmokingPreference() {
        return smokingPreference;
    }

    @Override
    public String toString() {
        return bedType + ", " + smokingPreference;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RoomPreferences)) return false;
        RoomPreferences that = (RoomPreferences) obj;
        return bedType == that.bedType && smokingPreference == that.smokingPreference;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bedType, smokingPreference);
    }
}
