package vaniecollege.zyd;

import javafx.application.Application;
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
        GridPane root = new GridPane();
        
        Label tripDays = new Label("Days on the trip: ");
        Label airfare = new Label("Amount of airfare: ");
        Label carRental = new Label("Amount of car rental fees: ");
        Label milesDriven = new Label("Number of miles driven: ");
        Label parking = new Label("Amount of parking fees: ");
        Label taxi = new Label("Amount of txi charges: ");
        Label registration = new Label("Conference or seminar registration fees: ");
        Label lodging = new Label("Lodging charges (per night): ");
        
        TextField userTipDays = new TextField("Required");
        TextField userAirfare = new TextField("Optional");
        TextField userCarRental = new TextField("Optional");
        TextField userMilesDriven = new TextField("If private vehicle was used");
        TextField userParking = new TextField("Optional");
        TextField userTaxi = new TextField("Optional");
        TextField userRegistration = new TextField("Optional");
        TextField userLodging = new TextField("Per night");
    }
    
}
