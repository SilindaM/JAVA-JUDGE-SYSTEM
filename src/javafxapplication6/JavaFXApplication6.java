/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author mduduzi
 */
public class JavaFXApplication6 extends Application 
{
   private Label label;
   private String Username="SchoolSunday";
   private String Password="Sundayschool6510";
   private TextField username;
   private PasswordField password;
   private Button login;
   private Alert user,pass;
  
   home mime=new home();
   Register r=new Register();
 
   
    public void start(Stage primaryStage)
    {
        //top label
        label=new Label("");
        label.setTranslateX(200);
        label.setTranslateY(20);
        
        //username
        username=new TextField();
        username.setTranslateX(300);
        username.setTranslateY(100);
        username.setMinHeight(80);
        
        //password field
        password=new PasswordField();
        password.setTranslateX(300);
        password.setTranslateY(120);
        password.setMinHeight(80);
        
          
        //login button
        login = new Button("LOGIN");
        login.setTranslateX(300);
        login.setTranslateY(140);
        login.setMinHeight(80);
        login.setMinWidth(400);
        
        GridPane pane=new GridPane();
        pane.setVgap(20);
        pane.add(label, 0, 0);
        pane.add(username, 0, 1);
        pane.add(password, 0, 2);
        pane.add(login, 0, 3);
        
        Scene scene=new Scene(pane,1000,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
        
        login.setOnAction(new EventHandler<ActionEvent>()
        {
            String Username="a",Password="b";
            
            public void handle(ActionEvent e)
            {
                try
                {
                if(username.getText().isEmpty() || password.getText().isEmpty())
                  {
                   JOptionPane.showMessageDialog(null,"ENTER LOGIN DETAILS",null,JOptionPane.ERROR_MESSAGE); 
                   mime.starta();
                   primaryStage.close();
                  }
                else if(username.getText().equals(Username) && password.getText().equals(Password))
                {
                   mime.starta();
                   primaryStage.close();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "INCORRECT LOGIN DETAILS",null,JOptionPane.ERROR_MESSAGE);
                  }
                }
                catch(Exception error)
                {
                    JOptionPane.showMessageDialog(null, error.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
