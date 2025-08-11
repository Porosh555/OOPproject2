module all.oopproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens all.oopproject to javafx.fxml;
    exports all.oopproject;
}