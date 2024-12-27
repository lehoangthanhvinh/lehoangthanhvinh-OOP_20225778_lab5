package hust.soict.ict.javafx;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.*;
public class PainterController {

    @FXML
    private Pane drawingAreaPane;
    @FXML
    private ToggleGroup PaintTool;
    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
    
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle=new Circle(event.getX(),event.getY(),4,chooseTool());
    	drawingAreaPane.getChildren().add(newCircle);
    }
    Color chooseTool() {
    	RadioButton SelectedToggle=(RadioButton) PaintTool.getSelectedToggle();
    	if(SelectedToggle.getText().equals("Pen"))return Color.BLACK;
    	else return Color.WHITE;
    }
}
