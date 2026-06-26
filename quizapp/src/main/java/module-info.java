module com.ltq.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    
    opens com.ltq.quizapp to javafx.fxml;
    exports com.ltq.quizapp;
    exports com.ltq.pojo;
}
