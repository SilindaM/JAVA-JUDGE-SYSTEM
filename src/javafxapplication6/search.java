/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author mduduzi
 */
public class search 
{
    protected Label label,lcategory;
    protected ListView list;
    protected TextField jname,jsurname,jbranch,jnumber;
    protected TextField cname,code,teachername,teachercell;
    protected TextField age,pname,psurname,pbranch;
    protected ListView category,judges;
    protected  GridPane pane;
    protected ChoiceBox choicebox;
    
public Stage searching()
{
    String mdu[]={"ONE","TWO","THREE"};
    choicebox=new ChoiceBox();
    choicebox.getItems().add(mdu[0]);
    choicebox.getItems().add(mdu[1]);
    choicebox.getItems().add(mdu[2]);
    
    pane=new GridPane();
    pane.setPrefHeight(500);
    pane.setPrefWidth(400);
    pane.add(choicebox, 0, 0);
    
    Scene scen=new Scene(pane);
    Stage stage=new Stage();
    stage.setScene(scen);
    stage.show();
    
    
 return null;        
}
        

    
}
