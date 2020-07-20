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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author mduduzi
 */
public class StartJudging 
{
    protected Label PAname,PAcategory, PAMARKS,PA_age,PA_branch;
    protected ChoiceBox choicebox;
    protected TextField Name,CaName,PA_AGE,PA_BRANCH;
    protected TextArea Marks;
 
public String judges()     
{
    //label for Participant Name
    PAname = new Label("enter Participant Name");
    PAname.setTranslateX(30);
  PAname.setFont(new Font(15));
  
  //label for catergory
  PAcategory = new Label("enter Catergory");
 PAcategory.setTranslateX(30);
  PAcategory.setFont(new Font(15));
  
  //label for marks
   PAMARKS= new Label("enter Participant Marks");
  PAMARKS .setTranslateX(30);
 PAMARKS .setFont(new Font(15));
 
 //Label for branch name & code
   PA_branch= new Label("enter Participant Marks");
  PA_branch .setTranslateX(30);
 PA_branch .setFont(new Font(15));
 
 
 //label for age
 PA_age = new Label("enter Participant Age");
 PA_age.setTranslateX(30);
 PA_age.setFont(new Font(15));
      
//participant textfield name
  Name = new TextField();
  Name.setTranslateX(30);
  Name.setFont(new Font(15));
  
  //CATERGORY TEXTFIELD
    CaName = new TextField();
  CaName.setTranslateX(30);
 CaName .setFont(new Font(15));
 
 
 //AGE textField
  PA_AGE = new TextField();
 PA_AGE .setTranslateX(30);
  PA_AGE.setFont(new Font(15));
 
 //branch name and code textfield
    PA_BRANCH = new TextField();
 PA_BRANCH.setTranslateX(30);
 PA_BRANCH .setFont(new Font(15));
  
  
  //Participant Marksarea
  Marks = new TextArea();
  Marks.setTranslateX(30);
  Marks.setFont(new Font(15));

  
  GridPane sas=new GridPane();
   sas.setVgap(20);
        sas.setHgap(20);
   sas.setPrefHeight(498);
        sas.setPrefWidth(700);
        sas.add(PAcategory, 0, 0);
        sas.add(CaName, 0, 2);
        sas.add(PA_branch, 0, 3);
        sas.add(PA_BRANCH , 0, 4);
        sas.add(PAname, 1, 0);
        sas.add(Name, 1, 1);
        sas.add(PA_AGE,1 , 3);
        sas.add(PA_age,1 , 2);
        sas.add( PAMARKS, 2, 0);
        sas.add(Marks , 2, 1);
       

 
  Stage stage=new Stage();
    Scene mama=new Scene(sas);
  stage.initStyle(StageStyle.UTILITY);
  stage.setX(490);
        stage.setY(146);
  stage.setScene(mama);
  stage.show();
  
   return null;
}
public void branches()
{
    
}
public void participants()
{
    
}
    
}
