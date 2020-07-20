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
public class returnjudges 
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

    public void  tables()
    {
         GridPane pane=new GridPane();
         
         
         jname=new TableColumn("JUDGE NAME");
         jname.setEditable(true);
         jname.setMinWidth(200);
         jsurname=new TableColumn("JUDGE SURNAME");
         jsurname.setMinWidth(200);
         jbranch=new TableColumn("JUDGE BRANCH");
         jbranch.setMinWidth(200);
         jnumber=new TableColumn("JUDGE CELLPHONE NUMBER");
         jnumber.setMinWidth(200);
         
      
     
     
        editing = new TextField();
        editing.setPromptText("ENTER CELLPHONE NUMBER OF JUDGE YOU WANT TO DELETE");
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
         deletejudge();
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
        ObservableList<managejudge> oblist=FXCollections.observableArrayList();
        
        try
        {
            Connection con=DriverManager.getConnection(host, name, pass);
            Statement sta=con.createStatement();
            String sele="SELECT * FROM judge";
            ResultSet resu=sta.executeQuery(sele);
            while(resu.next())
            {
                oblist.add(new managejudge(resu.getString("JUDGENAME"),resu.getString("JUDGESURNAME"),resu.getString("JUDGEBRANCH"),resu.getString("JUDGENUMBER")) );
            }
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage(),null,JOptionPane.ERROR_MESSAGE); 
        }
        jname.setCellValueFactory(new PropertyValueFactory<>("name"));
        jsurname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        jbranch.setCellValueFactory(new PropertyValueFactory<>("branch"));
        jnumber.setCellValueFactory(new PropertyValueFactory<>("cellphone"));
        tabless.setItems(oblist);
    }
    public void deletejudge()
    {
        delete.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent ec)
            {
                
        try
        {
            Connection con=DriverManager.getConnection(host,name,pass);
            Statement state=con.createStatement();
            String dele=("SELECT * FROM judge where JUDGENUMBER = '"+  editing.getText()+"' ");
            ResultSet results=state.executeQuery(dele);
            if(results.next())
            {
                String delee="DELETE FROM judge where JUDGENUMBER = '"+  editing.getText()+"' ";
                PreparedStatement prs=con.prepareStatement(delee);
                prs.executeUpdate();
                JOptionPane.showMessageDialog(null,results.getString("JUDGENAME")+"IS SUCCESSFULLY DELETED","ERROR",JOptionPane.ERROR_MESSAGE);
                                  
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
