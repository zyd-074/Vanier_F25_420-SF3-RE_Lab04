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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(15,15,15,15));
        GridPane elements = new GridPane();
        elements.setPadding(new Insets(15,15,15,15));
        elements.setHgap(10);
        elements.setVgap(10);
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(15);
        root.setCenter(elements);
        root.setBottom(buttons);
        
        Label tripDays = new Label("Days on the trip: ");
        Label airfare = new Label("Amount of airfare: ");
        Label carRental = new Label("Amount of car rental fees: ");
        Label milesDriven = new Label("Number of miles driven: ");
        Label parking = new Label("Amount of parking fees: ");
        Label taxi = new Label("Amount of txi charges: ");
        Label registration = new Label("Conference or seminar registration fees: ");
        Label lodging = new Label("Lodging charges (per night): ");
        
        TextField userTripDays = new TextField();
        userTripDays.setPromptText("Required");
        TextField userAirfare = new TextField();
        userAirfare.setPromptText("Optional");
        TextField userCarRental = new TextField();
        userCarRental.setPromptText("Optional");
        TextField userMilesDriven = new TextField();
        userMilesDriven.setPromptText("If used private car");
        TextField userParking = new TextField();
        userParking.setPromptText("Optional");
        TextField userTaxi = new TextField();
        userTaxi.setPromptText("Optional");
        TextField userRegistration = new TextField();
        userRegistration.setPromptText("Optional");
        TextField userLodging = new TextField();
        userLodging.setPromptText("Per night");
        
        Button calculate = new Button("Calculate");
        Button clear = new Button("Clear");
        
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
        
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Travel Expenses Calculator");
        stage.show();
    }
    
}
