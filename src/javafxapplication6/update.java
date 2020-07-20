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
import javafx.scene.Node;
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
public class update 
{
    protected Label label,lcategory;
    protected ListView list;
    protected TextField jname,jsurname,jbranch,jnumber;
    protected TextField cname,code,teachername,teachercell;
    protected TextField age,pname,psurname,pbranch;
    protected ListView category,judges;
    protected  GridPane mother,one;
    protected ChoiceBox choicebox;
   
    
public Stage updating()
{
    judgess();
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
        //enter judges name
        Node jdescrip = new Label("REGISTER JUDGES");
     jname=new TextField();
     jname.setPromptText("ENTER NAME");
     jname.setAlignment(Pos.CENTER);
       //enter judges name
     jsurname=new TextField();
     jsurname.setPromptText("ENTER SURNAME");
     jsurname.setAlignment(Pos.CENTER);
       //enter judges name
     jbranch=new TextField();
     jbranch.setPromptText("ENTER BRANCH");
        //enter judges name
        TextField jcode = new TextField();
     jcode.setPromptText("ENTER BRANCH CODE");
       //enter judges name
     jnumber=new TextField();
     jnumber.setPromptText("ENTER CELLPHONE NUMBER");
     
     
        //gridpane
        GridPane one = new GridPane();
     one.add(jdescrip, 0, 0);
     one.add(jname, 0, 1);
     one.add(jsurname, 0, 2);
     one.add(jbranch, 0, 3);
     one.add(jcode, 0, 4);
     one.add(jnumber, 0, 5);
    
}
public void branches()
{
    
}
public void participants()
{
    
}
    
}
