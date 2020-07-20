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
import javafx.geometry.Insets;
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
public class returnparticipants 
{
    public TableView tabless;
    public TableColumn jname,jsurname,jbranch,jage,jcategory;
    public Stage stag;
    public Button delete;
           VBox vbox;
    public Scene sce;
    Label desci;
    public GridPane pane;
    public TextField jnames,jsurnames,jbranchs,jnumbers,editing,ppage,pbranch,psurname,pname,pcategory;

     String host="jdbc:mysql://localhost:3306/sundayschool?zeroDateTimeBehavior=convertToNull";
     String name="root";
     String pass="";
    private Object lpage;
    private Object page;

    public void  partibles()
    {
         GridPane pane=new GridPane();
         
         
         jname=new TableColumn("PARTICIPANT NAME");
         jname.setEditable(true);
         jname.setMinWidth(200);
         jsurname=new TableColumn("PARTICIPANT SURNAME");
         jsurname.setMinWidth(200);
         jage=new TableColumn("PARTICIPANT AGE");
         jage.setMinWidth(200);
         jbranch=new TableColumn("PARTICIPANT BRANCH");
         jbranch.setMinWidth(200);
         jcategory=new TableColumn("PARTICIPANT CATEGORY");
         jcategory.setMinWidth(200);
         
         /*RETUTN THE TEXTFIELD AND DELETE BUTTON*/
         setallvalues();
      
         tabless=new TableView();
         tabless.getColumns().addAll(jname,jsurname,jbranch,jage,jcategory);
         tabless.setPrefHeight(600);
         populate();
         deleteparticipant();
         vbox=new VBox();
         vbox.getChildren().addAll(desci,pname,psurname,pbranch,ppage,pcategory,delete);
         stag=new Stage();
         pane.add(tabless, 0, 0);
         pane.add(vbox, 0, 1);
         
         sce=new Scene(pane,1000,600);
         stag.setTitle("RESULTS");
         stag.setScene(sce);
         stag.show(); 
    }
    /*PASS VALUES TO THE TABLE FROM DATABASE*/
    public void populate() 
    {
        ObservableList<manageparticipant> oblist=FXCollections.observableArrayList();
        
        try
        {
            Connection con=DriverManager.getConnection(host, name, pass);
            Statement sta=con.createStatement();
            String sele="SELECT * FROM participant";
            ResultSet resu=sta.executeQuery(sele);
            while(resu.next())
            {
                oblist.add(new manageparticipant(resu.getString("NAME"),resu.getString("SURNAME"),resu.getString("AGE"),resu.getString("BRANCH"),resu.getString("CATEGORY")) );
            }
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,ex.getMessage(),null,JOptionPane.ERROR_MESSAGE); 
        }
        jname.setCellValueFactory(new PropertyValueFactory<>("pname"));
        jsurname.setCellValueFactory(new PropertyValueFactory<>("psurname"));
        jage.setCellValueFactory(new PropertyValueFactory<>("page"));
        jbranch.setCellValueFactory(new PropertyValueFactory<>("pbranch"));
        jcategory.setCellValueFactory(new PropertyValueFactory<>("pcategory"));
        tabless.setItems(oblist);
    }
    public void deleteparticipant()
    {
        delete.setOnAction((ActionEvent ec) -> {
            try
            {
                
                Connection con=DriverManager.getConnection(host,name,pass);
                Statement state=con.createStatement();
                String dele=("SELECT * FROM participant where NAME= '"+pname.getText()+"' AND SURNAME= '"+psurname.getText()+"' AND BRANCH='"+pbranch.getText()+"' AND CATEGORY ='"+pcategory.getText()+"' AND AGE='"+ppage.getText()+"'");
                ResultSet results=state.executeQuery(dele);
                if(results.next())
                {
                    String delee=("DELETE FROM participant where NAME= '"+pname.getText()+"' AND SURNAME= '"+psurname.getText()+"' AND BRANCH='"+pbranch.getText()+"' AND CATEGORY ='"+pcategory.getText()+"' AND AGE='"+ppage.getText()+"'");
                    
                    PreparedStatement prs=con.prepareStatement(delee);
                    prs.executeUpdate();
                    JOptionPane.showMessageDialog(null,results.getString("NAME")+" "+results.getString("SURNAME")+"IS SUCCESSFULLY DELETED","ERROR",JOptionPane.ERROR_MESSAGE);
                    
                }
                else if(pname.getText().isEmpty() || psurname.getText().isEmpty() || pbranch.getText().isEmpty() || ppage.getText().isEmpty() ||  pcategory.getText().isEmpty() )
                {
                    JOptionPane.showMessageDialog(null,"FILL ALL THE FIELDS","ERROR",JOptionPane.ERROR_MESSAGE);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"THE PARTICIPANT IS NOT REGISTERED",null,JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(SQLException exce)
            {
                JOptionPane.showMessageDialog(null,exce.getMessage(),null,JOptionPane.ERROR_MESSAGE);
                
            }
        }); 
    }
    public void setallvalues()
    {
     desci=new Label("FILL THE FORM IN ORDER TO DELETE A PARTICIPANT");
     desci.setFont(new Font(20));
     desci.setTranslateX(300);
     
     pname = new TextField();
     pname.setPromptText("NAME OF REGISTERED PARTICIPANT");
     pname.setPrefWidth(100);
     
     pname.setFont(new Font(15));
     
        //enter judges name
    psurname = new TextField();
    psurname.setPromptText("SURNAME OF REGISTERED PARTICIPANT");
     psurname.setFont(new Font(15));
     
     
        //enter judges name
         pbranch = new TextField();
         pbranch.setPromptText("BRANCH OF REGISTERED PARTICIPANT");
     pbranch.setFont(new Font(15));
     
      //enter judges name
      ppage = new TextField();
      ppage.setPromptText("AGE OF REGISTERED PARTICIPANT");
     ppage.setFont(new Font(15));
     
     pcategory=new TextField();
     pcategory.setPromptText("CATEGORY OF REGISTERED PARTICIPANT");
     pcategory.setFont(new Font(15));
     
     
        //DELETEbutton
        
        delete= new Button("DELETE");
        delete.setPrefWidth(1000);
        delete.setPrefHeight(48);
        delete.setFont(new Font(20));
        
        
    }
}
