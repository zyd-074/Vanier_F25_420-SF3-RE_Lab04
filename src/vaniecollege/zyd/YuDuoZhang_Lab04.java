package vaniecollege.zyd;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * @author Yu Duo Zhang (2480549)
 * https://github.com/zyd-074/Vanier_F25_420-SF3-RE_Lab04.git
 */
public class YuDuoZhang_Lab04 extends Application {
    // Text Fields Creation 
    static TextField userTripDays = new TextField();
    static TextField userAirfare = new TextField();
    static TextField userCarRental = new TextField();
    static TextField userMilesDriven = new TextField();
    static TextField userParking = new TextField();
    static TextField userTaxi = new TextField();
    static TextField userRegistration = new TextField();
    static TextField userLodging = new TextField();
    static Label statusMessage = new Label();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        // Layout Initialize
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15,15,15,15));
        GridPane elements = new GridPane();
        elements.setPadding(new Insets(15,15,15,15));
        elements.setHgap(10);
        elements.setVgap(10);
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(15);
        BorderPane.setAlignment(statusMessage, Pos.CENTER);
        root.setCenter(elements);
        root.setBottom(buttons);
        root.setTop(statusMessage);
        
        // Labels 
        Label tripDays = new Label("Days on the trip: ");
        Label airfare = new Label("Amount of airfare: ");
        Label carRental = new Label("Amount of car rental fees: ");
        Label milesDriven = new Label("Number of miles driven: ");
        Label parking = new Label("Amount of parking fees: ");
        Label taxi = new Label("Amount of taxi charges: ");
        Label registration = new Label("Conference or seminar registration fees: ");
        Label lodging = new Label("Lodging charges: ");
        
        //Set Up TextFields
        userTripDays.setPromptText("Required");
        userAirfare.setPromptText("Optional");
        userCarRental.setPromptText("Optional");
        userMilesDriven.setPromptText("Only for if used private car");
        userParking.setPromptText("Optional");
        userTaxi.setPromptText("Optional");
        userRegistration.setPromptText("Optional");
        userLodging.setPromptText("Per night");
        
        // Buttons
        Button calculate = new Button("Calculate");
        Button clear = new Button("Clear");
        
        // Set up Elements
        elements.setAlignment(Pos.CENTER);
        elements.add(tripDays, 0, 0);
        elements.add(airfare, 0, 1);
        elements.add(carRental, 0, 2);
        elements.add(milesDriven, 0, 3);
        elements.add(parking, 0, 4);
        elements.add(taxi, 0, 5);
        elements.add(registration, 0, 6);
        elements.add(lodging, 0, 7);
        
        elements.add(userTripDays, 1, 0);
        elements.add(userAirfare, 1, 1);
        elements.add(userCarRental, 1, 2);
        elements.add(userMilesDriven, 1, 3);
        elements.add(userParking, 1, 4);
        elements.add(userTaxi, 1, 5);
        elements.add(userRegistration, 1, 6);
        elements.add(userLodging, 1, 7);
        
        buttons.getChildren().addAll(calculate, clear);
        
        // Action Handler for typing letters in fields
        userTripDays.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userAirfare.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userCarRental.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userMilesDriven.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userParking.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userRegistration.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userLodging.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        userTaxi.setOnKeyTyped(e -> {
            if (checkField()) {
                statusMessage.setText("Please enter numbers");
            } else {
                statusMessage.setText("");
            }
        });
        
        // Action Handler for Clear button
        clear.setOnAction( e -> clear());
        
        // Action Handler for Calculate button
        calculate.setOnAction(e -> {
            if (statusMessage.getText() != "Please enter numbers") {
                System.out.println(totalExpenses());
            }
        });
        
        // Stage 
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Travel Expenses Calculator");
        stage.show();
    }
    
    /**
     * Clears all TextFields on the input section. 
     */
    public static void clear() {
        userTripDays.setText("");
        userAirfare.setText("");
        userCarRental.setText("");
        userMilesDriven.setText("");
        userParking.setText("");
        userTaxi.setText("");
        userRegistration.setText("");
        userLodging.setText("");
    }
    
    public static double totalExpenses() {
        double lodgingFee = (!userTripDays.getText().isBlank() && !userLodging.getText().isBlank()) 
                ? (Double.parseDouble(userLodging.getText()) * Integer.parseInt(userTripDays.getText())) 
                : 0;
        double airfare = (!userAirfare.getText().isBlank() ) 
                ? (Double.parseDouble(userAirfare.getText())) 
                : 0;
        double carRental = (!userCarRental.getText().isBlank() ) 
                ? (Double.parseDouble(userCarRental.getText()))
                : 0;
        double parking = (!userParking.getText().isBlank() ) 
                ? (Double.parseDouble(userParking.getText()))
                : 0;
        double taxi = (!userTaxi.getText().isBlank() ) 
                ? (Double.parseDouble(userParking.getText()))
                : 0;
        double registration = (!userRegistration.getText().isBlank() )
                ? (Double.parseDouble(userRegistration.getText()))
                : 0;
        
        return lodgingFee + airfare + carRental + parking + taxi + registration;
    }
    
    public static boolean checkField() {
        boolean hasLetter = false;
        char[][] text = new char[8][];
        text[0] = userAirfare.getText().toCharArray();
        text[1] = userCarRental.getText().toCharArray();
        text[2] = userLodging.getText().toCharArray();
        text[3] = userMilesDriven.getText().toCharArray();
        text[4] = userParking.getText().toCharArray();
        text[5] = userRegistration.getText().toCharArray();
        text[6] = userTaxi.getText().toCharArray();
        text[7] = userTripDays.getText().toCharArray();
        
        for (char[] array : text) {
            for (char c : array) {
                if (Character.isLetter(c)) {
                    hasLetter = true;
                }
            }
        }
        
        return hasLetter;
    }
}
