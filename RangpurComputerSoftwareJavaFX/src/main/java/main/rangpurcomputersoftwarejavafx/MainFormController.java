package main.rangpurcomputersoftwarejavafx;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;


public class MainFormController {
   public class PleaseProvideControllerClassName {

        @FXML
        private TableView<?> inventory_table;
        public void initialize() {
           // Set the resize policy for the TableView
           inventory_table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
       }
    }

}
