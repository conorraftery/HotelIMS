package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        for (int i = 1; i <= 15; i++) {
            BedType bedType = (i % 2 == 0) ? BedType.KING : BedType.TWO_QUEENS;
            SmokingPreference smokingPreference = (i % 3 == 0) ? SmokingPreference.SMOKING : SmokingPreference.NON_SMOKING;
            rooms.add(new Room("Room " + i, bedType, smokingPreference, RoomStatus.VACANT));
        }
    }

    public List<Room> getAvailableRooms(RoomPreferences preferences) {
        return rooms.stream()
                .filter(room -> room.getStatus() == RoomStatus.VACANT)
                .filter(room -> room.getBedType() == preferences.getBedType())
                .filter(room -> room.getSmokingPreference() == preferences.getSmokingPreference())
                .collect(Collectors.toList());
    }

    public void assignGuest(Guest guest, Room room) {
        room.setGuest(guest);
        room.setStatus(RoomStatus.OCCUPIED);
    }

    public List<Room> getAllRooms() {
        return rooms;
    }
}
