module com.gridgame.gridgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gridgame.gridgame to javafx.fxml;
    exports com.gridgame.gridgame;
}