/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author SILINDA
 */
public class returnbranches 
{
    public TableView tabless;
    public TableColumn jname,jsurname,jbranch,jnumber;
    public Stage stag;
    public Button delete;
    public Scene sce;
    public GridPane pane;
    public TextField jnames,jsurnames,jbranchs,jnumbers,editing;
    Label jdescrip,ljname,ljsurname,ljbranch,ljnumber;
     String host="jdbc:mysql://localhost:3306/sundayschool?zeroDateTimeBehavior=convertToNull";
     String name="root";
     String pass="";

    public void  branchtabless()
    {
         GridPane pane=new GridPane();
         
         
         jname=new TableColumn("BRANCH NAME");
         jname.setEditable(true);
         jname.setMinWidth(200);
         jsurname=new TableColumn("TEACHER'S NAME");
         jsurname.setMinWidth(200);
         jbranch=new TableColumn("TEACHER'S SURNAME");
         jbranch.setMinWidth(200);
         jnumber=new TableColumn("TEACHER'S CELLPHONE NUMBER");
         jnumber.setMinWidth(200);
         
      
     
     
        editing = new TextField();
        editing.setPromptText("ENTER CELLPHONE NUMBER OF TEACHER YOU WANT TO DELETE THEIR BRANCH");
        editing.setPrefHeight(48);
        editing.setPrefWidth(400);
        //DELETEbutton
        delete= new Button("DELETE");
        delete.setPrefWidth(400);
        delete.setPrefHeight(48);
        delete.setFont(new Font(20));
         
         
         tabless=new TableView();
         tabless.getColumns().addAll(jname,jsurname,jbranch,jnumber);
         tabless.setPrefHeight(600);
         populate();
         deletebranch();
         HBox vb=new HBox();
         vb.getChildren().addAll(editing,delete);
         stag=new Stage();
         pane.add(tabless, 0, 0);
         pane.add(vb, 0, 1);
         sce=new Scene(pane,800,600);
         stag.setTitle("RESULTS");
         stag.setScene(sce);
         stag.show(); 
    }
    public void populate() 
    {
        ObservableList<managebranch> oblist=FXCollections.observableArrayList();
        
        try
        {
            Connection con=DriverManager.getConnection(host, name, pass);
            Statement sta=con.createStatement();
            String sele="SELECT * FROM BRANCHTABLE";
            ResultSet resu=sta.executeQuery(sele);
            while(resu.next())
            {
                oblist.add(new managebranch(resu.getString("BRANCHNAME"),resu.getString("TEACHERNAME"),resu.getString("TEACHERSURNAME"),resu.getString("TEACHERNUMBER")) );
            }
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage(),null,JOptionPane.ERROR_MESSAGE); 
        }
        jname.setCellValueFactory(new PropertyValueFactory<>("tbranch"));
        jsurname.setCellValueFactory(new PropertyValueFactory<>("tsurname"));
        jbranch.setCellValueFactory(new PropertyValueFactory<>("tname"));
        jnumber.setCellValueFactory(new PropertyValueFactory<>("tcellphone"));
        tabless.setItems(oblist);
    }
    public void deletebranch()
    {
        delete.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent ec)
            {
                
        try
        {
            Connection con=DriverManager.getConnection(host,name,pass);
            Statement state=con.createStatement();
                String dele=("SELECT * FROM   branchtable where TEACHERNUMBER = '"+  editing.getText()+"' ");
            ResultSet results=state.executeQuery(dele);
            if(results.next())
            {
                String delee="DELETE FROM branchtable where TEACHERNUMBER = '"+  editing.getText()+"' ";
                PreparedStatement prs=con.prepareStatement(delee);
                prs.executeUpdate();
                JOptionPane.showMessageDialog(null,results.getString("BRANCHNAME")+"IS SUCCESSFULLY DELETED","ERROR",JOptionPane.ERROR_MESSAGE);
                                  
            }
            else if(editing.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"FILL ALL THE FIELDS","ERROR",JOptionPane.ERROR_MESSAGE);
                       
            }
            else
            { 
                JOptionPane.showMessageDialog(null,"THE JUDGE IS NOT REGISTERED",null,JOptionPane.ERROR_MESSAGE); 
            }
        } 
        catch(SQLException exce)
        {
            JOptionPane.showMessageDialog(null,exce.getMessage(),null,JOptionPane.ERROR_MESSAGE); 
              
        }
            
        }
        });
    }

}
