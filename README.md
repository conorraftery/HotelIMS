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
│ └── hotel/
│ ├── BedType.java
│ ├── Bookable.java
│ ├── Guest.java
│ ├── Hotel.java
│ ├── HotelApp.fxml
│ ├── HotelApp.java
│ ├── HotelAppController.java
│ ├── Room.java
│ ├── RoomPreferences.java
│ ├── RoomStatus.java
│ ├── SmokingPreference.java
│ └── Main.java
├── .gitignore
├── README.md
└── HotelIMS.iml


## To Access the Project

Clone the repo using one of the following methods:

HTTPS:
git clone https://github.com/conorraftery/HotelIMS.git

SSH:
git clone git@github.com:conorraftery/HotelIMS.git

GitHub CLI:
gh repo clone conorraftery/HotelIMS

## How to Run the Application

1. Open IntelliJ IDEA.
2. Go to File > Open and select the room-manager-fx project folder.
3. Make sure JavaFX is installed and added to your project.  
   Go to File > Project Structure > Libraries and add the JavaFX SDK if it's not already there.
4. Set up VM options:  
   Go to Run > Edit Configurations > VM options and paste the following (update path to your own JavaFX SDK):

The main class of this JavaFX application is HotelApp, which initializes the GUI and launches the hotel inventory system.

## Authors

-nulljules

-jetethan

-conorrafftery
