module com.example.sinlessrunner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens studio.rrprojects.sinlessrunner to javafx.fxml;
    exports studio.rrprojects.sinlessrunner;
}