package Ex1;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
	 @Override
	 public void start(Stage primaryStage) {
     Rectangle r = new Rectangle();
     Line line = new Line();     
     Circle circle = new Circle();
     Group root = new Group(r,line,circle);
     
     circle.setCenterX(200);
     circle.setCenterY(200);
     circle.setRadius(50);
     circle.setFill(Color.RED);
     
     line.setStartX(100); 
     line.setStartY(150); 
     line.setEndX(500); 
     line.setEndY(150); 
     line.setFill(Color.GREEN);

	 r.setX(50);
	 r.setY(50);
	 r.setWidth(200);
	 r.setHeight(100);
     r.setFill(Color.BLUE);

	 Scene scene = new Scene(root, 300, 250, Color.WHITE);

	 primaryStage.setTitle("Ma premi?re fen?tre");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
	}