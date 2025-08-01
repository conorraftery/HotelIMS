package hotel;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import java.util.List;

public class HotelAppController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField emailField;

    @FXML
    private ComboBox<BedType> bedPrefBox;

    @FXML
    private CheckBox smokingBox;

    @FXML
    private Label statusLabel;

    @FXML
    private ListView<Room> roomListView;

    private Hotel hotel;

    public void initialize() {
        hotel = new Hotel();
        bedPrefBox.getItems().addAll(BedType.KING, BedType.TWO_QUEENS);
        roomListView.setVisible(false); // hide initially
    }

    @FXML
    public void handleShowRooms() {
        BedType bedType = bedPrefBox.getValue();
        boolean smokingSelected = smokingBox.isSelected();

        if (bedType == null) {
            statusLabel.setText("Please select a bed preference.");
            return;
        }

        SmokingPreference smokingPref = smokingSelected ? SmokingPreference.SMOKING : SmokingPreference.NON_SMOKING;
        RoomPreferences preferences = new RoomPreferences(bedType, smokingPref);
        List<Room> matchingRooms = hotel.getAvailableRooms(preferences);

        roomListView.getItems().setAll(matchingRooms);
        roomListView.setVisible(true); // show after preferences submitted
    }

    @FXML
    public void handleAssignRoom() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            statusLabel.setText("Please fill in all guest fields.");
            return;
        }

        Room selectedRoom = roomListView.getSelectionModel().getSelectedItem();
        if (selectedRoom == null) {
            statusLabel.setText("Please select a room to assign.");
            return;
        }

        Guest guest = new Guest(firstName, lastName, phone, email);
        selectedRoom.setGuest(guest);
        selectedRoom.setStatus(RoomStatus.OCCUPIED);
        statusLabel.setText("Room assigned to " + firstName + " " + lastName);
        roomListView.refresh();
    }
}
