# Room Manager FX

## Overview
Room Manager FX is a JavaFX-based hotel room inventory management system (HIMS) developed for the INFO 5100 final project. It simulates a 30-room hotel and demonstrates key object-oriented programming concepts, including encapsulation, polymorphism, inheritance, and use of collections.

## Features
- Add, assign, and check out hotel guests
- Match guests to rooms based on smoking and bed preferences
- Track room occupancy and availability
- Search rooms and retrieve guest information
- Graphical user interface built with JavaFX

## Technologies Used
- Java 17
- JavaFX
- IntelliJ IDEA
- Git & GitHub

## Project Structure

HotelIMS/  
├── .idea/  
├── src/  
│   └── hotel/  
│       ├── BedType.java  
│       ├── Bookable.java  
│       ├── Guest.java  
│       ├── Hotel.java  
│       ├── HotelApp.fxml  
│       ├── HotelApp.java  
│       ├── HotelAppController.java  
│       ├── Room.java  
│       ├── RoomPreferences.java  
│       ├── RoomStatus.java  
│       └── SmokingPreference.java  
├── Main.java  
├── .gitignore  
├── HotelIMS.iml  
└── README.md  


## To Access the Project

Clone the repo using one of the following methods:

HTTPS:
git clone https://github.com/conorraftery/HotelIMS.git

SSH:
git clone git@github.com:conorraftery/HotelIMS.git

GitHub CLI:
gh repo clone conorraftery/HotelIMS

## How to Run the Application

### System Requirements
- Java 17 or higher
- JavaFX SDK (version compatible with Java 17)
- IntelliJ IDEA (Community or Ultimate)
- SceneBuilder (for editing the .fxml UI files)

### Setup Instructions

1. Download and install [SceneBuilder](https://gluonhq.com/products/scene-builder/).
2. Download and install [JavaFX SDK](https://gluonhq.com/products/javafx/), and unzip it to a known location.
3. Open IntelliJ IDEA.
4. Select **File > Open**, then choose the root project folder (HotelIMS).
5. Go to **File > Project Structure > Libraries**, click the `+` icon, and add the `lib` folder from the unzipped JavaFX SDK.
6. Go to **File > Settings (or Preferences on Mac) > Languages & Frameworks > JavaFX**, and under "SceneBuilder path", link it to your downloaded SceneBuilder app.

### VM Options (Required for JavaFX)
1. Go to **Run > Edit Configurations > VM Options** and paste the following (update the path as needed for your local system):
--module-path /path/to/javafx-sdk-XX/lib --add-modules javafx.controls,javafx.fxml

### Running the Application
1. In the `hotel` package, right-click `HotelApp.java` and select **Run**.
2. This will launch the Hotel Inventory Management System GUI and allow interaction with features such as:
- Guest entry
- Room assignment
- Room availability search


## Authors

-nulljules

-jetethan

-conorrafftery
