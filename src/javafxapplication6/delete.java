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
public class delete 
{
    protected Label label,lcategory;
    protected ListView list;
    protected TextField jname,jsurname,jbranch,jnumber;
    protected TextField cname,code,teachername,teachercell;
    protected TextField age,pname,psurname,pbranch;
    protected ListView category,judges;
    protected  GridPane mother;
    protected ChoiceBox choicebox;
    
public Stage deleting()
{
       //CHOICE BOX
         String[] listArray={"BRANCH","CATEGORY","PARTICIPANT"};
         ObservableList<String> catego = FXCollections.observableArrayList(listArray);
         ChoiceBox choicebox=new ChoiceBox(catego);
         
         
        
        label =new Label("FILL THE FORM TO REGISTER");
        label.setFont(new Font(20));
        label.setLayoutY(100);
        jname=new TextField("NAME");
        jname.setTranslateX(7);
        jsurname=new TextField("SURNAME");
        jsurname.setTranslateX(7);
        jbranch=new TextField("BRANCH");
        jbranch.setTranslateX(7);
        jnumber=new TextField("NUMBER");
        jnumber.setTranslateX(7);
        
        
        //GRIDPANE FOR REGISTRATION
        GridPane gridpane=new GridPane();
        gridpane.setVgap(20);
        gridpane.setHgap(20);
        gridpane.setPrefHeight(498);
        gridpane.setPrefWidth(700);
        
        gridpane.add(label, 10, 0);
        gridpane.add(choicebox, 5, 1);
        
      
        Stage Dialog = new Stage();
          //POP FOR REGISTRATION
        Dialog.initStyle(StageStyle.UTILITY);
        Dialog.setX(490);
        Dialog.setY(146);
        Scene scene = new Scene(gridpane);
        Dialog.setScene(scene);
        Dialog.show();
        
        
        return null;
}
public void judgess()
{

    
}
public void branches()
{
    
}
public void participants()
{
    
}
    
}
