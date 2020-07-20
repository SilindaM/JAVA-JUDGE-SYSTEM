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
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javax.swing.JOptionPane;

/**
 *
 * @author mduduzi
 */
public class Register 
{
    protected Label label,jdescrip,bdescrip, Pdscript;
    protected ListView list;
    protected TextField jnames,jsurnames,jbranchs,jnumbers;
    protected TextField bnames,tnames,tsurnames,tnumbers;
    protected TextField page,pname,psurname,pbranch;
    protected Label ljname,ljsurname,ljbranch,ljnumber;
    protected Label lcname,lteachername,lteachersurname,lteachercell;
    protected Label lpage,lpname,lpsurname,lpbranch,lpcategory;
    protected ListView category,judges;
    protected GridPane mother,one,two,three;
    protected Button registerj,registerc,registerp;
    protected Button clearj,clearc,clearp;
    protected Button viewj,viewc,viewp;
    protected ChoiceBox categories;
    public Stage alla=new Stage();
    String host="jdbc:mysql://localhost:3306/sundayschool?zeroDateTimeBehavior=convertToNull";
    String name="root";
    String pass="";
    
public Stage registering()
{
    
    //JUDGEdescription
     jdescrip=new Label("JUDGE");
     jdescrip.setTranslateX(25);
     jdescrip.setFont(new Font(28));
     jdescrip.setPrefWidth(200);
     jdescrip.setTranslateX(50);
     
     //LABEL FOR NAME
     ljname=new Label();
     ljname.setText("ENTER JUDGE NAME");
     ljname.setAlignment(Pos.CENTER);
     ljname.setTranslateX(25);
     
     jnames=new TextField();
     jnames.setAlignment(Pos.CENTER);
     jnames.setTranslateX(25);
     jnames.setFont(new Font(15));
     
      //enter judges name
     ljsurname=new Label();
     ljsurname.setText("ENTER JUDGE SURNAME");
     ljsurname.setAlignment(Pos.CENTER);
     ljsurname.setTranslateX(25);
     
       //enter judges name
     jsurnames=new TextField();
     jsurnames.setAlignment(Pos.CENTER);
     jsurnames.setTranslateX(25);
     jsurnames.setFont(new Font(15));
     
     
     ljbranch=new Label();
     ljbranch.setText("ENTER BRANCH NAME");
     ljbranch.setTranslateX(25);
       //enter judges name
     jbranchs=new TextField();
     jbranchs.setTranslateX(25);
     jbranchs.setFont(new Font(15));
     
     
     
      //enter judges name
     ljnumber=new Label();
     ljnumber.setText("ENTER CELLPHONE NUMBER");
     ljnumber.setTranslateX(25);
       //enter judges name
     jnumbers=new TextField();
     jnumbers.setTranslateX(25);
     jnumbers.setFont(new Font(15));
     
        //REGISTER BUTTON FOR PARTICIPANTS
     registerj=new Button("REGISTER");
       RegisterDetails rega=new RegisterDetails();
       registerj.setOnAction(new EventHandler<ActionEvent>() {

         public void handle(ActionEvent eb)
         {
             
                     rega.setJbranch(jbranchs.getText().toUpperCase());
                     rega.setJname(jnames.getText().toUpperCase());
                     rega.setJsurname(jsurnames.getText().toUpperCase());
                     rega.setJnumber(jnumbers.getText().toUpperCase());
                     
                     String a=rega.getJname().toUpperCase();
                     String b= rega.getJsurname().toUpperCase();
                     String c=rega.getJbranch().toUpperCase();
                     String d=rega.getJnumber().toUpperCase();
             try
             {
                 Connection con=DriverManager.getConnection(host,name,pass);
                 Statement state=con.createStatement();
                 ResultSet resu=state.executeQuery("Select * FROM judge where JUDGENUMBER = '"+d+"' ");
                 if(resu.next())
                 {
                     JOptionPane.showMessageDialog(null, "THE USER IS REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(a.isEmpty() || b.isEmpty() || c.isEmpty() || d.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "FILL ALL THE DETAILS","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
                 else if(!resu.next())
                 {
                     
                     //INSERT INTO THE DATABASE
                     String ns="INSERT INTO judge (JUDGENAME,JUDGESURNAME,JUDGEBRANCH,JUDGENUMBER) VALUES(?,?,?,?)";
                     PreparedStatement ps=con.prepareStatement(ns);
                     ps.setString(1,a );
                     ps.setString(2,b);
                     ps.setString(3,c );
                     ps.setString(4,d);
                     ps.executeUpdate();
                     con.close();
                     JOptionPane.showMessageDialog(null, rega.getJname()+" "+rega.getJsurname()+" SUCCESSFULLY REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                     
                 }
             }
             catch(SQLException ebh)
             {
                 JOptionPane.showMessageDialog(null, ebh.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
             }
         }
     });
     registerj.setFont(new Font(15));
     registerj.setTranslateX(25);
     registerj.setTranslateY(20);
     registerj.setPrefWidth(200);
     
     //CLEAR BUTTON
     clearj=new Button("CLEAR");
     clearj.setFont(new Font(15));
     clearj.setTranslateX(25);
     clearj.setTranslateY(40);
     clearj.setPrefWidth(200);
     
     
     
     clearj.setOnAction(new EventHandler<ActionEvent>()
     {
         public void handle(ActionEvent c)
         {
              jnames.clear();
              jsurnames.clear();
              jbranchs.clear();
              jnumbers.clear();
         }
     }
     );
     
      //CLEAR BUTTON
     viewj=new Button("VIEW,EDIT AND DELETE JUDGES");
     viewj.setFont(new Font(12));
     viewj.setTranslateX(25);
     viewj.setTranslateY(60);
     viewj.setPrefHeight(50);
     viewj.setPrefWidth(200);
     
     viewj.setOnAction((ActionEvent a) -> {
         returnjudges me=new returnjudges();
         me.tables();
     });
     //BRANCH DESCRIPTION
     
     bdescrip=new Label(" BRANCHES");
     bdescrip.setFont(new Font(28));
     bdescrip.setTranslateX(30);
     //enter judges name
     lcname=new Label();
     lcname.setPrefWidth(200);
     lcname.setTranslateX(25);
     lcname.setText("ENTER CHURCH NAME");
     
     
     //enter judges name
     bnames=new TextField();
     bnames.setPrefWidth(200);
     bnames.setTranslateX(25);
     bnames.setFont(new Font(15));
     
     
       //enter judges name
     lteachername=new Label();
     lteachername.setText("ENTER TEACHER'S NAME");
     lteachername.setTranslateX(25);
       //enter judges name
       //enter judges name
     tnames=new TextField();
     tnames.setTranslateX(25);
     tnames.setFont(new Font(15));
     
     
      //enter judges name
     lteachersurname=new Label();
     lteachersurname.setText("ENTER TEACHER'S SURNAME");
     lteachersurname.setTranslateX(25);
     
       //enter judges name
     tsurnames=new TextField();
     tsurnames.setTranslateX(25);
     tsurnames.setFont(new Font(15));
     
     
        //enter judges name
     lteachercell=new Label();
     lteachercell.setText("ENTER TEACHER'S CELLPHONE NUMBER");
     lteachercell.setTranslateX(25);
     
       //enter judges nameteachercell
     tnumbers=new TextField();
     tnumbers.setTranslateX(25);
     tnumbers.setFont(new Font(15));
     
     registerc=new Button("REGISTER BRANCH");
       RegisterDetails regas=new RegisterDetails();
     registerc.setOnAction(new EventHandler<ActionEvent>()
     {
         public void handle(ActionEvent ab)
         {
             
                     regas.setBname(bnames.getText().toUpperCase());
                     regas.setTname(tnames.getText().toUpperCase());
                     regas.setTsurname(tsurnames.getText().toUpperCase());
                     regas.setTnumber(tnumbers.getText().toUpperCase());
                     
                     String a=regas.getBname();
                     String b=regas.getTname();
                     String c=regas.getTsurname();
                     String d=regas.getTnumber();
             try
             {
                 Connection con=DriverManager.getConnection(host,name,pass);
                 Statement stae=con.createStatement();
                 ResultSet resu=stae.executeQuery("SELECT * FROM branchtable WHERE TEACHERNUMBER = '"+d+"' OR BRANCHNAME = '"+a+"' ");
                 
                 if(resu.next() )
                 {
                         JOptionPane.showMessageDialog(null, "THE USER IS REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                       
                 }
                     else if(a.isEmpty() | b.isEmpty() || c.isEmpty() || d.isEmpty())
                     {
                         JOptionPane.showMessageDialog(null, "FILL THE DETAILS","ERROR",JOptionPane.ERROR_MESSAGE);
                         
                     }
                     else if(!resu.next())
                     {
                         String insa="INSERT INTO branchtable (BRANCHNAME,TEACHERNAME,TEACHERSURNAME,TEACHERNUMBER) VALUES(?,?,?,?)";
                         PreparedStatement pse=con.prepareStatement(insa);
                         pse.setString(1,a);
                         pse.setString(2,b);
                         pse.setString(3, c);
                         pse.setString(4, d);
                         pse.executeUpdate();
                         con.close();
                         JOptionPane.showMessageDialog(null, regas.getTname()+" "+regas.getTsurname()+" SUCCESSFULLY REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                
             }
             catch(SQLException ec)
                         {
                 JOptionPane.showMessageDialog(null, ec.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                                            
                         }
                                        
         }
     });
    
            
     registerc.setFont(new Font(15));
     registerc.setTranslateX(25);
     registerc.setTranslateY(20);
     registerc.setPrefWidth(200);
        
     //CLEAR BUTTON
     clearc=new Button("CLEAR");
     clearc.setFont(new Font(15));
     clearc.setTranslateX(25);
     clearc.setTranslateY(40);
     clearc.setPrefWidth(200);
     clearc.setOnAction((ActionEvent a) -> {
         bnames.clear();
         tnames.clear();
         tsurnames.clear();
         tnumbers.clear();
     });
     
      //BRANCH DETAILS
     viewc=new Button("VIEW AND DELETE BRANCHS");
     viewc.setFont(new Font(12));
     viewc.setTranslateX(25);
     viewc.setTranslateY(60);
     viewc.setPrefHeight(50);
     viewc.setPrefWidth(200);
     viewc.setOnAction(new EventHandler<ActionEvent>()
     {
         public void handle(ActionEvent eb)
         {
             returnbranches ret=new returnbranches();
             ret.branchtabless();
         }
     });
     
     
     //Patiipant Description
     Pdscript = new Label("PARTICIPANT");
     Pdscript.setPrefWidth(200);
     Pdscript.setFont(new Font(28));
     Pdscript.setTranslateX(25);
     
     lpname=new Label();
     lpname.setText("ENTER NAME");
     lpname.setTranslateX(25);
     
     pname=new TextField();
     pname.setTranslateX(25);
     pname.setFont(new Font(15));
     
     lpsurname=new Label();
     lpsurname.setText("ENTER  SURNAME");
     lpsurname.setTranslateX(25);
       //enter judges name
     psurname=new TextField();
     psurname.setTranslateX(25);
     psurname.setFont(new Font(15));
     
     lpage=new Label();
     lpage.setText("ENTER  AGE");
     lpage.setTranslateX(25);
       //enter judges name
     page=new TextField();
     page.setTranslateX(25);
     page.setFont(new Font(15));
     
       //enter judges name
     lpbranch=new Label();
     lpbranch.setText("ENTER BRANCH NAME");
     lpbranch.setTranslateX(25);
       //enter judges name
     pbranch=new TextField();
     pbranch.setTranslateX(25);
     pbranch.setFont(new Font(15));
     
      //enter judges name
     lpbranch=new Label();
     lpbranch.setText("ENTER  BRANCH");
     lpbranch.setTranslateX(25);
    
     
     //category
     lpcategory=new Label();
     lpcategory.setText("SELECT CATEGORY");
     lpcategory.setTranslateX(25);
     //category
     String catelist[]={"MEMORY VERSE ONE","MEMORY VERSE TWO","SCRIPTURE READING","HYMN SONG"};
     ObservableList<String>listcatego=FXCollections.observableArrayList(catelist);
     categories=new ChoiceBox(listcatego);
     categories.setTranslateX(25);
     categories.setPrefWidth(200);
     
     
        //REGISTER BUTTON FOR PARTICIPANTS
     registerp=new Button("REGISTER");
       RegisterDetails regp=new RegisterDetails();
       registerp.setOnAction(new EventHandler<ActionEvent>()
       {
         public void handle(ActionEvent eb)
         {
          
                     regp.setPage(page.getText().toUpperCase());
                     regp.setPname(pname.getText().toUpperCase());
                     regp.setPsurname(psurname.getText().toUpperCase());
                     regp.setPbranch(pbranch.getText().toUpperCase());
                     regp.setPcategory((String)categories.getValue());
                     String a=regp.getPage();
                     String b=regp.getPname();
                     String c=regp.getPsurname();
                     String d=regp.getPbranch();
                     String e=regp.getPcategory();
             try
             {
                 Connection con=DriverManager.getConnection(host,name,pass);
                 Statement state=con.createStatement();
                 ResultSet resu=state.executeQuery("SELECT * FROM participant where AGE = '"+a+"' AND NAME='"+b+"' AND SURNAME='"+c+"' AND BRANCH='"+d+"' AND CATEGORY='"+e+"'");
                 if(resu.next())
                 {
                            //VALUES FROM DATABASE
                     JOptionPane.showMessageDialog(null, "THE USER IS ALREADY REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                 } 
                 else if(a.isEmpty() ||b.isEmpty() || c.isEmpty() || d.isEmpty() || e.isEmpty())
                     {
                         JOptionPane.showMessageDialog(null, "FILL THE DETAILS","ERROR",JOptionPane.ERROR_MESSAGE);
                     }  
                     else if(!resu.next())
                     {
                        //INSERT INTO THE DATABASE
                         String ns="INSERT INTO participant (AGE,NAME,SURNAME,BRANCH,CATEGORY) VALUES(?,?,?,?,?)";
                         PreparedStatement ps=con.prepareStatement(ns);
                         ps.setString(1, a);
                         ps.setString(2, b);
                         ps.setString(3, c);
                         ps.setString(4, d);
                         ps.setString(5,e);
                         ps.executeUpdate(); 
                         JOptionPane.showMessageDialog(null, b+" "+c+"IS SUCCESSFULLY REGISTERED","ERROR",JOptionPane.ERROR_MESSAGE);
                   
                     }
             }
             catch(SQLException ebh)
             {
                 JOptionPane.showMessageDialog(null, ebh.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
             }
         }
     });
     registerp.setFont(new Font(15));
     registerp.setTranslateX(25);
     registerp.setTranslateY(15);
     registerp.setPrefWidth(200);
     
     //CLEAR BUTTON
     clearp=new Button("CLEAR");
     clearp.setFont(new Font(15));
     clearp.setTranslateX(25);
     clearp.setTranslateY(30);
     clearp.setPrefWidth(200);
     clearp.setOnAction(new EventHandler<ActionEvent>()
             {
                 public void handle(ActionEvent e)
                 {
                     page.clear();
                     pname.clear();
                     psurname.clear();
                     pbranch.clear();
                 }
             });
     
   

      //CLEAR BUTTON
     viewp=new Button("VIEW,EDIT AND DELETE PARTICIPANTS");
     viewp.setFont(new Font(11));
     viewp.setTranslateX(25);
     viewp.setTranslateY(60);
     viewp.setPrefHeight(50);
     viewp.setPrefWidth(200);
     viewp.setOnAction(new EventHandler<ActionEvent>()
     {
         public void handle(ActionEvent eve)
         {
             returnparticipants repu=new returnparticipants();
             repu.partibles();
         }
     }
     );
     
        //GRIDPANE FOR REGISTRATION
        mother=new GridPane();
        mother.setPrefHeight(498);
        mother.setPrefWidth(700);
        
        //ADDING FOR JUDGES
        mother.add(jdescrip, 0, 0);
        mother.add(ljname, 0, 1);
        mother.add(jnames, 0, 2);
        mother.add(ljsurname, 0, 3);
        mother.add(jsurnames, 0, 4);
        mother.add(ljbranch, 0, 5);
        mother.add(jbranchs, 0, 6);
        mother.add(ljnumber, 0, 7);
        mother.add(jnumbers, 0, 8);
        mother.add(registerj, 0, 9);
        mother.add(clearj, 0, 10);
        mother.add(viewj, 0, 11);
        
        
        //ADDING FOR BRANCH
        mother.add(bdescrip, 1, 0);
        mother.add(lcname, 1, 1);
        mother.add(bnames, 1, 2);
        mother.add(lteachername, 1, 3);
        mother.add(tnames, 1, 4);
        mother.add(lteachersurname, 1, 5);
        mother.add(tsurnames, 1, 6);
        mother.add(lteachercell, 1, 7);
        mother.add(tnumbers, 1, 8);
        mother.add(registerc, 1, 9);
        mother.add(clearc, 1, 10);
        mother.add(viewc, 1, 11);
        
        //ADDING FOR PARTICIPANTS
        mother.add(Pdscript,2,0);
        mother.add(lpname, 2, 1);
        mother.add(pname, 2, 2);
        mother.add(lpsurname, 2, 3);
        mother.add(psurname, 2, 4);
        mother.add(lpage,  2,5);
        mother.add(page, 2, 6);
        mother.add(lpbranch, 2, 7);
        mother.add(pbranch, 2, 8);
        mother.add(lpcategory, 2, 9);
        mother.add(categories, 2, 10);
        mother.add(registerp, 2, 11);
        mother.add(clearp, 2, 12);
        mother.add(viewp, 2, 13);
        mother.setHgap(20);
        
        alla.setX(490);
        alla.setY(146);
        Scene sceneal=new Scene(mother);
        alla.setScene(sceneal);
        alla.show();
        return null;
      
}
}
