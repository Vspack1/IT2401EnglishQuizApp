module com.ltq.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ltq.quizapp to javafx.fxml;
    exports com.ltq.quizapp;
}
