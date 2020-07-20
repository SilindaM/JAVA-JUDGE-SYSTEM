package javafxapplication6;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;
import java.util.ArrayList;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javafxapplication6.judgeProcess;

public class MemoryOne extends Register 
{
    Register regi=new Register();
    String host="jdbc:mysql://localhost:3306/sundayschool?zeroDateTimeBehavior=convertToNull";
    String name="root";
    String pass="";
    
    public TotallAndClearbutton mine;
    protected Label category,pname,pbranch,ptoss,jname,jbranch,jnumber;
    protected Label dpname,dpsurname,dpbranch,dptoss,djname,djsurname,djbranch,djnumber;
    protected GridPane pana,pan,pani,pano,pane,panu;
    protected Label particiNameL,judgeNameL,criteria,attire,audibility,emphasis,gesture,content,poor,fair,good,satisfactory,excellent,one,two,three,four,five;
    protected Label criteriaT,attireT,audibilityT,emphasisT,gestureT,contentT,poorT,fairT,goodT,satisfactoryT,excellentT,oneT,twoT,threeT,fourT,fiveT;
    protected Label criteriaTH,attireTH,audibilityTH,emphasisTH,gestureTH,contentTH,poorTH,fairTH,goodTH,satisfactoryTH,excellentTH,oneTH,twoTH,threeTH,fourTH,fiveTH;
    
    
    protected CheckBox oneL,twoL,threeL,fourL,fiveL;
    protected CheckBox oneA,twoA,threeA,fourA,fiveA;
    protected CheckBox oneE,twoE,threeE,fourE,fiveE;
    protected CheckBox oneG,twoG,threeG,fourG,fiveG;
    protected CheckBox oneC,twoC,threeC,fourC,fiveC;
    
    protected CheckBox oneLT,twoLT,threeLT,fourLT,fiveLT;
    protected CheckBox oneAT,twoAT,threeAT,fourAT,fiveAT;
    protected CheckBox oneET,twoET,threeET,fourET,fiveET;
    protected CheckBox oneGT,twoGT,threeGT,fourGT,fiveGT;
    protected CheckBox oneCT,twoCT,threeCT,fourCT,fiveCT;
    
    protected CheckBox oneLTH,twoLTH,threeLTH,fourLTH,fiveLTH;
    protected CheckBox oneATH,twoATH,threeATH,fourATH,fiveATH;
        protected CheckBox oneETH,twoETH,threeETH,fourETH,fiveETH;
    protected CheckBox oneGTH,twoGTH,threeGTH,fourGTH,fiveGTH;
    protected CheckBox oneCTH,twoCTH,threeCTH,fourCTH,fiveCTH;
    
    protected Button total1,total2,total3,submit,overall;
    protected Button total1clear,total2clear,total3clear,submitclear;
    protected TextField answer1,answer2,answer3,overallAnswer,namer,surnamer,branchr;
    public int values = 0;
    public int sum1,sum2,sum3,sumall;
    public  Stage stage=new Stage();
    
    
    protected CheckBox [] onec,twoc,threec,fourc,fivec;
      
    //LABELS FOR JUDGES
    protected Label judge1L,judge2L,judge3L;    
    //LABELS FOR DISPLAYING TOTAL
    protected Label judge1T,judge2T,judge3T;
    protected GridPane paneTH,paniT,panoT,paneT,panePart,panePart2,panePart3;
  
    //values for judging sheet
                int c,d,e,f,g;
                int c2,d2,e2,f2,g2;
                int c3,d3,e3,f3,g3;
         // values to be inserted into database
         int attireto,audibityto,emphasisto,gestureto,contentto;
         
        /*ARRAYLIST FOR GETTING JUDGE DETAILS*/
        ArrayList<judgeProcess> judgesa =new ArrayList<>();
        //CLASS WITH METHOD TO SET AND GET JUDGES
       judgeProcess judg=new judgeProcess();
       /*query for calling all jydges details*/
       
                             String selejud="SELECT * FROM judge";
    
    
public void Inseting()
{
        particiNameL=new Label("ENTER REGISTERED PARTICIPANTS DETAILS");
        particiNameL.setPrefHeight(30);
        particiNameL.setTranslateX(500);
        particiNameL.setTranslateY(20);
        particiNameL.setFont(new Font(20));
        
        namer=new TextField();
        namer.setPromptText("ENTER NAME");
        namer.setPrefHeight(30);
        namer.setTranslateX(10);
        namer.setTranslateY(20);
        
        surnamer=new TextField();
        surnamer.setPrefHeight(30);
        surnamer.setPromptText("ENTER SURNAME");
        surnamer.setTranslateX(10);
        surnamer.setTranslateY(20);
        
        branchr=new TextField();
        branchr.setPrefHeight(30);
        branchr.setPromptText("ENTER BRANCH");
        branchr.setTranslateX(10);
        branchr.setTranslateY(20);
        
      
       
        Sheet();
        Sheeta();
        Sheete();
        pane2();
        pane3();
        pane4();
        PanPart();
        PanPart2();
        PanPart3();
        overaltotal(sum1,sum2,sum3);
        pana=new GridPane();
        pana.setHgap(5);
        pana.setVgap(5);
        pana.add(particiNameL, 0, 0);
        pana.add(namer, 0, 1);
        pana.add(surnamer, 1, 1);
        pana.add(branchr, 2, 1);
        pana.add(pan, 0, 2);
        pana.add(pani, 2, 2);
        pana.add(pano, 1, 2);
        pana.add(overall, 0, 3);
        pana.add(overallAnswer, 1, 3);
        pana.add(submit, 2, 3);
        pana.add(panePart, 0, 1);
        pana.add(panePart2, 1, 1);
        pana.add(panePart3, 2, 1);
        
        pana.setPrefHeight(573);
        pana.setPrefWidth(1200);
        stage.setTitle("MEMORY VERSE ONE");
        Scene scen=new Scene(pana);
        stage.setScene(scen);
        stage.setResizable(false);
        stage.show();
    }
/*
GET FIRST JUDGE DETAIS
*/
public void PanPart()
    {
        java.util.ArrayList<judgeProcess> judgesa =new java.util.ArrayList<judgeProcess>();
       
        try
        {
                             Connection con=DriverManager.getConnection(host,name,pass);
                             Statement statement = con.createStatement();
                             ResultSet rs = statement.executeQuery("select * from judge");
                             if(rs.next())
                             {
                                    
                                   //CLASS WITH METHOD TO SET AND GET JUDGES
                                    judgeProcess judg=new judgeProcess();
                                    
                                    judg.setJudgename(rs.getString("JUDGENAME"));
                                    judg.setJudgesurname(rs.getString("JUDGESURNAME"));
                                    
                                    //ADD VALUES FROM DATABASE TO ARRAYLIST
                                    judgesa.add(judg);
                             }
                             judge1L=new Label("JUDGE 1"+judgesa.get(0).getJudgename().toUpperCase()+" "+judgesa.get(0).getJudgesurname().toUpperCase());
                             judge1L.setFont(new Font(17));
                             
            
        }
        catch(SQLException ex)
        {
            Alert a=new Alert(AlertType.CONFIRMATION);
        }
       
        
        panePart=new GridPane();
        panePart.setPrefHeight(40);
        panePart.setPrefWidth(400);
        panePart.setTranslateY(90);
        panePart.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart.add(judge1L, 0, 0);
        Total1();
        
    }
/*
GET SECOND JUDGE DETAILS
*/
public void PanPart2()
    {
        ArrayList<judgeProcess> jud2=new ArrayList<judgeProcess>();
         try
        {
                             Connection con=DriverManager.getConnection(host,name,pass);
                             Statement statement = con.createStatement();
                             ResultSet rs = statement.executeQuery("select * from judge ");
                             while(rs.next())
                             {
                                    judgeProcess me=new judgeProcess();
                                    me.setJudgename(rs.getString("JUDGENAME"));
                                    me.setJudgesurname(rs.getString("JUDGESURNAME"));
                                    jud2.add(me);
                             }
                             judge2L=new Label("JUDGE 2 "+jud2.get(1).getJudgename().toUpperCase()+jud2.get(1).getJudgesurname().toUpperCase());
                             judge2L.setFont(new Font(17));
        }
        catch(SQLException ex)
        {
            Alert a=new Alert(AlertType.CONFIRMATION);
        }
        
        panePart2=new GridPane();
        panePart2.setPrefHeight(40);
        panePart2.setPrefWidth(300);
        panePart2.setTranslateY(90);
        panePart2.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart2.add(judge2L, 0, 0);
        Total2();
    }
/*
GET THIRD JUDGE DETAILS
*/
public void PanPart3()
    {
        ArrayList<judgeProcess> judd=new ArrayList<judgeProcess>();
        try
        {
            Connection con=DriverManager.getConnection(host,name,pass);
            Statement state=con.createStatement();
            ResultSet rss=state.executeQuery("SELECT *FROM judge ");
            
            while(rss.next())
            {
                judgeProcess mem=new judgeProcess();
                mem.setJudgename(rss.getString("JUDGENAME"));
                mem.setJudgesurname(rss.getString("JUDGESURNAME"));
                judd.add(mem);
            }
            judge3L=new Label("JUDGE 3 "+judd.get(2).getJudgename().toUpperCase()+" "+judd.get(2).getJudgesurname().toUpperCase());
            judge3L.setFont(new Font(17));
            
        }
        catch(SQLException ex)
        {
            Alert a=new Alert(AlertType.INFORMATION);
        }
        
        panePart3=new GridPane();
        panePart3.setPrefHeight(40);
        panePart3.setPrefWidth(400);
        panePart3.setTranslateY(90);
        panePart3.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart3.add(judge3L, 0, 0);
        Total3();
    }



public void pane2()
{
    pan=new GridPane();
    pan.setPrefHeight(400);
    pan.setPrefWidth(400);
    pan.add(pane, 0, 0);
}

public void pane3()
{
    pani=new GridPane();
    pani.setPrefHeight(400);
    pani.add(paneTH, 0, 0);
    pani.setPrefWidth(400);
}

public void pane4()
{
    pano=new GridPane();
    pano.setPrefHeight(400);
    pano.add(paneT, 0, 0);
    pano.setPrefWidth(400);
}
 public void Sheet()      
    {
    
           edditing();
           ratings();
           numbers();
           contentJ();
           
           
        pane=new GridPane();
        pane.add(criteria, 0, 0);
        pane.add(attire, 0, 1);
        pane.add(audibility, 0, 2);
        pane.add(emphasis, 0, 3);
        pane.add(gesture, 0, 4);
        pane.add(content, 0, 5);
        pane.add(total1,0,6 );
        pane.add(total1clear,0,7);
        pane.add(answer1, 5, 6);
        
        pane.add(poor, 1, 0);
        pane.add(fair, 2, 0);
        pane.add(good, 3, 0);
        pane.add(satisfactory, 4, 0);
        pane.add(excellent, 5, 0);
        
       // pane.add(oneL, columnIndex, rowIndex);
        
        //ADDING THE NUMBERS IN THE SCORE SHEET
        pane.add(one, 1, 1);
        pane.add(two, 2, 1);
        pane.add(three, 3, 1);
        pane.add(four, 4, 1);
        pane.add(five, 5, 1);
        
         //ADDING VALUES FOR ATTIRE
        pane.add(oneL, 1, 2);
        pane.add(twoL, 2, 2);
        pane.add(threeL, 3, 2);
        pane.add(fourL, 4, 2);
        pane.add(fiveL, 5, 2);
        
         //ADDING VALUES FOR AUDIBILITY
        pane.add(oneA, 1, 3);
        pane.add(twoA, 2, 3);
        pane.add(threeA, 3, 3);
        pane.add(fourA, 4, 3);
        pane.add(fiveA, 5, 3);
        
        
        //ADDING VALUES FOR EMPHASISI
        pane.add(oneE, 1, 4);
        pane.add(twoE, 2, 4);
        pane.add(threeE, 3, 4);
        pane.add(fourE, 4, 4);
        pane.add(fiveE, 5, 4);
        
        //ADDING VALUES FOR GESTURES
        pane.add(oneG, 1, 5);
        pane.add(twoG, 2, 5);
        pane.add(threeG, 3, 5);
        pane.add(fourG, 4, 5);
        pane.add(fiveG, 5, 5);
        
        //ADDING VALUES FOR CONTENT
        pane.add(oneC, 1, 6);
        pane.add(twoC, 2, 6);
        pane.add(threeC, 3, 6);
        pane.add(fourC, 4, 6);
        pane.add(fiveC, 5, 6);
        
        
    }
    public void edditing()
    {
        criteria=new Label("Criteria");
        criteria.setTranslateY(100);
        criteria.setPrefWidth(90);
        criteria.setFont(new Font(18));
        criteria.setPrefHeight(80);
        criteria.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        attire=new Label("Attire");
        attire.setTranslateY(100);
        attire.setPrefWidth(90);
        attire.setFont(new Font(18));
        attire.setPrefHeight(40);
        attire.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        audibility=new Label("Audibility");
        audibility.setTranslateY(100);
        audibility.setFont(new Font(18));
        audibility.setPrefWidth(90);
        audibility.setPrefHeight(40);
        audibility.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        emphasis=new Label("Emphasis");
        emphasis.setTranslateY(100);
        emphasis.setFont(new Font(18));
        emphasis.setPrefWidth(90);
        emphasis.setPrefHeight(40);
        emphasis.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        gesture=new Label("Gesture");
        gesture.setTranslateY(100);
        gesture.setPrefWidth(90);
        gesture.setFont(new Font(18));
        gesture.setPrefHeight(40);
        gesture.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        content=new Label("Content");
        content.setTranslateY(100);
        content.setFont(new Font(18));
        content.setPrefWidth(90);
        content.setPrefHeight(40);
        content.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        total1=new Button("Total");
        total1.setTranslateY(100);
        total1.setFont(new Font(18));
        total1.setPrefWidth(90);
        total1.setPrefHeight(40);
        
        total1clear=new Button("Clear");
        total1clear.setTranslateY(100);
        total1clear.setFont(new Font(18));
        total1clear.setPrefWidth(90);
        total1clear.setPrefHeight(40);
        
        answer1=new TextField();
        answer1.setFont(new Font(18));
        answer1.setTranslateY(100);
        answer1.setPrefWidth(90);
        answer1.setPrefHeight(40);
        answer1.setDisable(true);
        
        
        
    }
    public void ratings()
    {
        
        poor=new Label("Poor");
        poor.setTranslateY(85);
        poor.setFont(new Font(15));
        poor.setPrefWidth(50);
        poor.setPrefHeight(50);
        poor.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        
        fair=new Label("Fair");
        fair.setFont(new Font(15));
        fair.setTranslateY(85);
        fair.setPrefWidth(50);
        fair.setPrefHeight(50);
        fair.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
        
        
        good=new Label("Good");
        good.setTranslateY(85);
        good.setFont(new Font(15));
        good.setPrefWidth(50);
        good.setPrefHeight(50);
        good.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        satisfactory=new Label("Satisfactory");
        satisfactory.setTranslateY(85);
        satisfactory.setFont(new Font(15));
        satisfactory.setPrefWidth(80);
        satisfactory.setPrefHeight(50);
        satisfactory.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        excellent=new Label("Excellent");
        excellent.setFont(new Font(15));
        excellent.setTranslateY(85);
        excellent.setPrefWidth(70);
        excellent.setPrefHeight(50);
        excellent.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
       
        
    }
    public void numbers()
    {
        one=new Label("1");
        one.setTranslateY(60);
        one.setFont(new Font(15));
        one.setPrefWidth(50);
        one.setPrefHeight(39);
        one.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        two=new Label("2");
        two.setTranslateY(60);
        two.setFont(new Font(15));
        two.setPrefWidth(50);
        two.setPrefHeight(39);
        two.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        three=new Label("3");
        three.setTranslateY(60);
        three.setFont(new Font(15));
        three.setPrefWidth(50);
        three.setPrefHeight(39);
        three.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        four=new Label("4");
        four.setTranslateY(60);
        four.setFont(new Font(15));
        four.setPrefWidth(80);
        four.setPrefHeight(39);
        four.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        five=new Label("5");
        five.setTranslateY(60);
        five.setFont(new Font(15));
        five.setPrefWidth(70);
        five.setPrefHeight(39);
        five.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
    }
    public void attireJ()
    {
        oneL=new CheckBox("1");
        oneL.setTranslateY(60);
        oneL.setFont(new Font(15));
        oneL.setPrefWidth(50);
        oneL.setPrefHeight(39);
        oneL.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoL=new CheckBox("2");
        twoL.setTranslateY(60);
        twoL.setFont(new Font(15));
        twoL.setPrefWidth(50);
        twoL.setPrefHeight(39);
        twoL.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeL=new CheckBox();
        threeL.setTranslateY(60);
        threeL.setFont(new Font(15));
        threeL.setPrefWidth(50);
        threeL.setPrefHeight(39);
        threeL.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourL=new CheckBox();
        fourL.setTranslateY(60);
        fourL.setFont(new Font(15));
        fourL.setPrefWidth(80);
        fourL.setPrefHeight(39);
        fourL.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveL=new CheckBox();
        fiveL.setTranslateY(60);
        fiveL.setFont(new Font(15));
        fiveL.setPrefWidth(70);
        fiveL.setPrefHeight(39);
        fiveL.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY))); 
        
       
    }
    public void Total1()
    {
        CheckBox one[]={oneL,twoL,threeL,fourL,fiveL};
        CheckBox two[]={oneA,twoA,threeA,fourA,fiveA};
        CheckBox three[]={oneE,twoL,threeE,fourE,fiveE};
        CheckBox four[]={oneG,twoG,threeG,fourG,fiveG};
        CheckBox five[]={oneC,twoC,threeC,fourC,fiveC};
        
        int a=0;
        
       total1.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                       //LOOP FOR ATTIRE CATEGORY
                       for(int a=0;a<one.length;a++)
                       {
                           if(one[0].isSelected() && !one[a].isSelected())
                           {
                               c=1;
                           }
                           if(one[1].isSelected())
                           {
                               c=2;
                           }
                           if(one[2].isSelected())
                           {
                               c=3;
                           }
                           if(one[3].isSelected())
                           {
                               c=4;
                           }
                           if(one[4].isSelected())
                           {
                               c=5;
                           }
                        } 
                       //LOOP FOR AUDIBILITY CATEGORY
                       for(int a=0;a<two.length;a++)
                       {
                           if(two[0].isSelected() )
                           {
                               d=1;
                           }
                           if(two[1].isSelected())
                           {
                               d=2;
                           }
                           if(two[2].isSelected())
                           {
                               d=3;
                           }
                           if(two[3].isSelected())
                           {
                               d=4;
                           }
                           if(two[4].isSelected())
                           {
                               d=5;
                           }
                        } 
                        //LOOP FOR EMPHASIS CATEGORY
                       for(int a=0;a<three.length;a++)
                       {
                           if(three[0].isSelected() )
                           {
                               e=1;
                           }
                           if(three[1].isSelected())
                           {
                               e=2;
                           }
                           if(three[2].isSelected())
                           {
                               e=3;
                           }
                           if(three[3].isSelected())
                           {
                               e=4;
                           }
                           if(three[4].isSelected())
                           {
                               e=5;
                           }
                        } 
                          //LOOP FOR GESTURE CATEGORY
                       for(int a=0;a<four.length;a++)
                       {
                           if(four[0].isSelected() )
                           {
                               f=1;
                           }
                           if(four[1].isSelected())
                           {
                               f=2;
                           }
                           if(four[2].isSelected())
                           {
                               f=3;
                           }
                           if(four[3].isSelected())
                           {
                               f=4;
                           }
                           if(four[4].isSelected())
                           {
                               f=5;
                           }
                        }
                          //LOOP FOR CONTENT CATEGORY
                       for(int a=0;a<five.length;a++)
                       {
                           if(five[0].isSelected() )
                           {
                               g=1;
                           }
                           if(five[1].isSelected())
                           {
                               g=2;
                           }
                           if(five[2].isSelected())
                           {
                               g=3;
                           }
                           if(five[3].isSelected())
                           {
                               g=4;
                           }
                           if(five[4].isSelected())
                           {
                               g=5;
                           }
                        }
                        sum1=c+d+e+f+g;
                        answer1.setText(String.valueOf(sum1));
                        
       
                   }
               });
       total1clear.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent v)
           {
               for(int a=0;a<one.length;a++)
               {
                   one[a].setSelected(false);
                   two[a].setSelected(false);
                   three[a].setSelected(false);
                   four[a].setSelected(false);
                   five[a].setSelected(false);
               }
               answer1.clear();
                   
           }
       });
    }
     public void Total2()
    {
        CheckBox one2[]={oneLT,twoLT,threeLT,fourLT,fiveLT};
        CheckBox two2[]={oneAT,twoAT,threeAT,fourAT,fiveAT};
        CheckBox three2[]={oneET,twoLT,threeET,fourET,fiveET};
        CheckBox four2[]={oneGT,twoGT,threeGT,fourGT,fiveGT};
        CheckBox five2[]={oneCT,twoCT,threeCT,fourCT,fiveCT};
        
        int ab=0;
        
       total2.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                       //LOOP FOR ATTIRE CATEGORY
                       for(int ab=0;ab<one2.length;ab++)
                       {
                           if(one2[0].isSelected() && !one2[ab].isSelected())
                           {
                               c2=1;
                           }
                           if(one2[1].isSelected())
                           {
                               c2=2;
                           }
                           if(one2[2].isSelected())
                           {
                               c2=3;
                           }
                           if(one2[3].isSelected())
                           {
                               c2=4;
                           }
                           if(one2[4].isSelected())
                           {
                               c2=5;
                           }
                        } 
                       //LOOP FOR AUDIBILITY CATEGORY
                       for(int  ab=0;  ab<two2.length;ab++)
                       {
                           if(two2[0].isSelected() )
                           {
                               d2=1;
                           }
                           if(two2[1].isSelected())
                           {
                               d2=2;
                           }
                           if(two2[2].isSelected())
                           {
                               d2=3;
                           }
                           if(two2[3].isSelected())
                           {
                               d2=4;
                           }
                           if(two2[4].isSelected())
                           {
                               d2=5;
                           }
                        } 
                        //LOOP FOR EMPHASIS CATEGORY
                       for(int ab=0;ab<three2.length;ab++)
                       {
                           if(three2[0].isSelected() )
                           {
                               e2=1;
                           }
                           if(three2[1].isSelected())
                           {
                               e2=2;
                           }
                           if(three2[2].isSelected())
                           {
                               e2=3;
                           }
                           if(three2[3].isSelected())
                           {
                               e2=4;
                           }
                           if(three2[4].isSelected())
                           {
                               e2=5;
                           }
                        } 
                          //LOOP FOR GESTURE CATEGORY
                       for(int ab=0;ab<four2.length;ab++)
                       {
                           if(four2[0].isSelected() )
                           {
                               f2=1;
                           }
                           if(four2[1].isSelected())
                           {
                               f2=2;
                           }
                           if(four2[2].isSelected())
                           {
                               f2=3;
                           }
                           if(four2[3].isSelected())
                           {
                               f2=4;
                           }
                           if(four2[4].isSelected())
                           {
                               f2=5;
                           }
                        }
                          //LOOP FOR CONTENT CATEGORY
                       for(int ab=0;ab<five2.length;ab++)
                       {
                           if(five2[0].isSelected() )
                           {
                               g2=1;
                           }
                           if(five2[1].isSelected())
                           {
                               g2=2;
                           }
                           if(five2[2].isSelected())
                           {
                               g2=3;
                           }
                           if(five2[3].isSelected())
                           {
                               g2=4;
                           }
                           if(five2[4].isSelected())
                           {
                               g2=5;
                           }
                        }
                        sum2=c2+d2+e2+f2+g2;
                        answer2.setText(String.valueOf(sum2));
                   }
               });
       total2clear.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent v)
           {
               for(int ab=0;ab<one2.length;ab++)
               {
                   one2[ab].setSelected(false);
                   two2[ab].setSelected(false);
                   three2[ab].setSelected(false);
                   four2[ab].setSelected(false);
                   five2[ab].setSelected(false);
               }
               answer2.clear();
           }
       });
    }
     public void Total3 ()
    {
        CheckBox one3[]={oneLTH,twoLTH,threeLTH,fourLTH,fiveLTH};
        CheckBox two3[]={oneATH,twoATH,threeATH,fourATH,fiveATH};
        CheckBox three3[]={oneETH,twoLTH,threeETH,fourETH,fiveETH};
        CheckBox four3[]={oneGTH,twoGTH,threeGTH,fourGTH,fiveGTH};
        CheckBox five3[]={oneCTH,twoCTH,threeCTH,fourCTH,fiveCTH};
        
        int b=0;
        
       total3.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                       //LOOP FOR ATTIRE CATEGORY
                       for(int b=0;b<one3.length;b++)
                       {
                           if(one3[0].isSelected() && !one3[b].isSelected())
                           {
                               c3=1;
                           }
                           if(one3[1].isSelected())
                           {
                               c3=2;
                           }
                           if(one3[2].isSelected())
                           {
                               c3=3;
                           }
                           if(one3[3].isSelected())
                           {
                               c3=4;
                           }
                           if(one3[4].isSelected())
                           {
                               c3=5;
                           }
                        } 
                       //LOOP FOR AUDIBILITY CATEGORY
                       for(int  b=0;  b<two3.length;b++)
                       {
                           if(two3[0].isSelected() )
                           {
                               d3=1;
                           }
                           if(two3[1].isSelected())
                           {
                               d3=2;
                           }
                           if(two3[2].isSelected())
                           {
                               d3=3;
                           }
                           if(two3[3].isSelected())
                           {
                               d3=4;
                           }
                           if(two3[4].isSelected())
                           {
                               d3=5;
                           }
                        } 
                        //LOOP FOR EMPHASIS CATEGORY
                       for(int b=0;b<three3.length;b++)
                       {
                           if(three3[0].isSelected() )
                           {
                               e3=1;
                           }
                           if(three3[1].isSelected())
                           {
                               e3=2;
                           }
                           if(three3[2].isSelected())
                           {
                               e3=3;
                           }
                           if(three3[3].isSelected())
                           {
                               e3=4;
                           }
                           if(three3[4].isSelected())
                           {
                               e3=5;
                           }
                        } 
                          //LOOP FOR GESTURE CATEGORY
                       for(int b=0;b<four3.length;b++)
                       {
                           if(four3[0].isSelected() )
                           {
                               f3=1;
                           }
                           if(four3[1].isSelected())
                           {
                               f3=2;
                           }
                           if(four3[2].isSelected())
                           {
                               f3=3;
                           }
                           if(four3[3].isSelected())
                           {
                               f3=4;
                           }
                           if(four3[4].isSelected())
                           {
                               f3=5;
                           }
                        }
                          //LOOP FOR CONTENT CATEGORY
                       for(int b=0;b<five3.length;b++)
                       {
                           if(five3[0].isSelected() )
                           {
                               g3=1;
                           }
                           if(five3[1].isSelected())
                           {
                               g3=2;
                           }
                           if(five3[2].isSelected())
                           {
                               g3=3;
                           }
                           if(five3[3].isSelected())
                           {
                               g3=4;
                           }
                           if(five3[4].isSelected())
                           {
                               g3=5;
                           }
                        }
                        sum3=c3+d3+e3+f3+g3;
                        answer3.setText(String.valueOf(sum3));
                   }
               });
       total3clear.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent v)
           {
               for(int b=0;b<one3.length;b++)
               {
                   one3[b].setSelected(false);
                   two3[b].setSelected(false);
                   three3[b].setSelected(false);
                   four3[b].setSelected(false);
                   five3[b].setSelected(false);
               }
               answer3.clear();
           }
       });
    }
     //TOTAL FOR EACH CATEGORY
     public void categoryTotal()
     {
         attireto=c+c2+c3;
         audibityto=d+d2+d3;
         emphasisto=e+e2+e3;
         gestureto=f+f2+f3;
         contentto=g+g2+g3;
     }
     public void overaltotal(int ca,int cb,int cc)
     {
         overall.setOnAction(new EventHandler<ActionEvent>()
         {
         int overalla;
             public void handle(ActionEvent v)
             {

                int abv[]={sum1,sum2,sum3};

                for(int sa=0;sa<abv.length;sa++)
                {
                    if(abv[0]==0 && abv[1]==0 && abv[1]==0)
                    { 
                            overalla=0;
                             }
                    else 
                    {
                        overalla=sum1+sum2+sum3;
                    }
                 }
                overallAnswer.setText(String.valueOf(overalla));
                   
                 submit.setOnAction(new EventHandler<ActionEvent>()
                 {
                     
                     public void handle(ActionEvent mn)
                     { 
                         
                         try
                         {
                             Connection con=DriverManager.getConnection(host,name,pass);
                         participant par=new participant();
                         par.setNamep(namer.getText().toUpperCase());
                         par.setSurnamep(surnamer.getText().toUpperCase());
                         par.setBranchp(branchr.getText().toUpperCase());
                         
                         String ap=par.getNamep();
                         String bp=par.getSurnamep();
                         String cp=par.getBranchp();
                         
                              String checka="select * from participant where category ='MEMORY VERSE ONE' ";
                              Statement sta=con.createStatement();
                              ResultSet res=sta.executeQuery(checka);
                              if(res.next())
                              {
                                  
                                  String namev=res.getString("NAME");
                                  String surnamev=res.getString("SURNAME");
                                  String branchv=res.getString("BRANCH");
                                  
                                  //CHECK IF USER DETAILS ARE EMPTY
                                  if(ap.isEmpty() || bp.isEmpty() || cp.isEmpty())
                                  { 
                                      JOptionPane.showMessageDialog(null, "ENTER PARTICIPANT DETAILS","ERROR",JOptionPane.ERROR_MESSAGE);
                                  }
                                  //IF USER IS REGISTERED ADD DETAILS TO DATABASE
                                  else if(ap.equals(namev) && bp.equals(surnamev) && cp.equals(branchv))
                                  {
                                    String insertin="INSERT INTO memoryonetable (ATTIREMO,AUDIBILITYMO,EMPHASISMO,GESTUREMO,CONTENTMO,TOTAL,surname,name,branch) values(?,?,?,?,?,?,?,?,?)";
                                    PreparedStatement pre=con.prepareStatement(insertin);
                                    
                                    /*METHOD ADD TOTAL FOR CATEGORIES*/
                                    categoryTotal();
                                    pre.setString(1, String.valueOf(attireto));
                                    pre.setString(2, String.valueOf(audibityto));
                                    pre.setString(3, String.valueOf(emphasisto));
                                    pre.setString(4, String.valueOf(gestureto));
                                    pre.setString(5, String.valueOf(contentto));
                                    
                                   
                                    
                                    //INSERT THE FINAL TOTAL
                                    pre.setString(6, String.valueOf(overalla));
                                    pre.setString(7, surnamer.getText().toUpperCase());
                                    pre.setString(8, namer.getText().toUpperCase());
                                    pre.setString(9, branchr.getText().toUpperCase());
                                    pre.executeUpdate();
                                    JOptionPane.showMessageDialog(null,ap+" "+bp+"IS SUCCESSFULLY JUDGED","ERROR",JOptionPane.ERROR_MESSAGE);
                                  }
                                  else
                                  {
                                      JOptionPane.showMessageDialog(null,ap+" "+bp+" HAS NOT YET REGISTERED ","ERROR",JOptionPane.ERROR_MESSAGE);
                                  }
                              }
                             //assign the values to the arraylist
                         }
                         catch(SQLException ex)
                         {
                             JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                                   }
                     }
                 }
                 );
         }  
         }
         );  
     } public void audibilityJ()
    {
        oneA=new CheckBox();
        oneA.setTranslateY(60);
        oneA.setFont(new Font(15));
        oneA.setPrefWidth(50);
        oneA.setPrefHeight(39);
        oneA.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        twoA=new CheckBox();
        twoA.setTranslateY(60);
        twoA.setFont(new Font(15));
        twoA.setPrefWidth(50);
        twoA.setPrefHeight(39);
        twoA.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeA=new CheckBox();
        threeA.setTranslateY(60);
        threeA.setFont(new Font(15));
        threeA.setPrefWidth(50);
        threeA.setPrefHeight(39);
        threeA.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourA=new CheckBox();
        fourA.setTranslateY(60);
        fourA.setFont(new Font(15));
        fourA.setPrefWidth(80);
        fourA.setPrefHeight(39);
        fourA.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveA=new CheckBox();
        fiveA.setTranslateY(60);
        fiveA.setFont(new Font(15));
        fiveA.setPrefWidth(70);
        fiveA.setPrefHeight(39);
        fiveA.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
                
    }
    
    public void emphasisJ()
    {
        oneE=new CheckBox();
        oneE.setTranslateY(60);
        oneE.setFont(new Font(15));
        oneE.setPrefWidth(50);
        oneE.setPrefHeight(39);
        oneE.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoE=new CheckBox();
        twoE.setTranslateY(60);
        twoE.setFont(new Font(15));
        twoE.setPrefWidth(50);
        twoE.setPrefHeight(39);
        twoE.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeE=new CheckBox();
        threeE.setTranslateY(60);
        threeE.setFont(new Font(15));
        threeE.setPrefWidth(50);
        threeE.setPrefHeight(39);
        threeE.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourE=new CheckBox();
        fourE.setTranslateY(60);
        fourE.setFont(new Font(15));
        fourE.setPrefWidth(80);
        fourE.setPrefHeight(39);
        fourE.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
       
        
        fiveE=new CheckBox();
        fiveE.setTranslateY(60);
        fiveE.setFont(new Font(15));
        fiveE.setPrefWidth(70);
        fiveE.setPrefHeight(39);
        fiveE.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
    
    }
    
    public void gestureJ()
    {
        oneG=new CheckBox();
        oneG.setTranslateY(60);
        oneG.setFont(new Font(15));
        oneG.setPrefWidth(50);
        oneG.setPrefHeight(39);
        oneG.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoG=new CheckBox();
        twoG.setTranslateY(60);
        twoG.setFont(new Font(15));
        twoG.setPrefWidth(50);
        twoG.setPrefHeight(39);
        twoG.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeG=new CheckBox();
        threeG.setTranslateY(60);
        threeG.setFont(new Font(15));
        threeG.setPrefWidth(50);
        threeG.setPrefHeight(39);
        threeG.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourG=new CheckBox();
        fourG.setTranslateY(60);
        fourG.setFont(new Font(15));
        fourG.setPrefWidth(80);
        fourG.setPrefHeight(39);
        fourG.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveG=new CheckBox();
        fiveG.setTranslateY(60);
        fiveG.setFont(new Font(15));
        fiveG.setPrefWidth(70);
        fiveG.setPrefHeight(39);
        fiveG.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
    }
    
    public void contentJ()
    {
        oneC=new CheckBox();
        oneC.setTranslateY(60);
        oneC.setFont(new Font(15));
        oneC.setPrefWidth(50);
        oneC.setPrefHeight(39);
        oneC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoC=new CheckBox();
        twoC.setTranslateY(60);
        twoC.setFont(new Font(15));
        twoC.setPrefWidth(50);
        twoC.setPrefHeight(39);
        twoC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeC=new CheckBox();
        threeC.setTranslateY(60);
        threeC.setFont(new Font(15));
        threeC.setPrefWidth(50);
        threeC.setPrefHeight(39);
        threeC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourC=new CheckBox();
        fourC.setTranslateY(60);
        fourC.setFont(new Font(15));
        fourC.setPrefWidth(80);
        fourC.setPrefHeight(39);
        fourC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveC=new CheckBox();
        fiveC.setTranslateY(60);
        fiveC.setFont(new Font(15));
        fiveC.setPrefWidth(70);
        fiveC.setPrefHeight(39);
        fiveC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
           attireJ();
           audibilityJ();
           emphasisJ();
           gestureJ();
           
           
           
    }
    //SECOND GRIDPANE
public void Sheeta()
    {
           edditinga();
           ratingsa();
           numbersa();
           attireJa();
           audibilityJa();
           emphasisJa();
           gestureJa();
           contentJa();
    
        paneT=new GridPane();
        paneT.add(criteriaT, 0, 0);
        paneT.add(attireT, 0, 1);
        paneT.add(audibilityT, 0, 2);
        paneT.add(emphasisT, 0, 3);
        paneT.add(gestureT, 0, 4);
        paneT.add(contentT, 0, 5);
        paneT.add(total2, 0, 6);
        paneT.add(total2clear, 0, 7);
        paneT.add(answer2, 5, 6);
        
        paneT.add(poorT, 1, 0);
        paneT.add(fairT, 2, 0);
        paneT.add(goodT, 3, 0);
        paneT.add(satisfactoryT, 4, 0);
        paneT.add(excellentT, 5, 0);
        
       // pane.add(oneL, columnIndex, rowIndex);
        
        //ADDING THE NUMBERS IN THE SCORE SHEET
        paneT.add(oneT, 1, 1);
        paneT.add(twoT, 2, 1);
        paneT.add(threeT, 3, 1);
        paneT.add(fourT, 4, 1);
        paneT.add(fiveT, 5, 1);
        
         //ADDING VALUES FOR ATTIRE
        paneT.add(oneLT, 1, 2);
        paneT.add(twoLT, 2, 2);
        paneT.add(threeLT, 3, 2);
        paneT.add(fourLT, 4, 2);
        paneT.add(fiveLT, 5, 2);
        
         //ADDING VALUES FOR AUDIBILITY
        paneT.add(oneAT, 1, 3);
        paneT.add(twoAT, 2, 3);
        paneT.add(threeAT, 3, 3);
        paneT.add(fourAT, 4, 3);
        paneT.add(fiveAT, 5, 3);
       
        
         //ADDING VALUES FOR EMPHASISI
        paneT.add(oneET, 1, 4);
        paneT.add(twoET, 2, 4);
        paneT.add(threeET, 3, 4);
        paneT.add(fourET, 4, 4);
        paneT.add(fiveET, 5, 4);
        
         //ADDING VALUES FOR GESTURES
        paneT.add(oneGT, 1, 5);
        paneT.add(twoGT, 2, 5);
        paneT.add(threeGT, 3, 5);
        paneT.add(fourGT,4, 5);
        paneT.add(fiveGT, 5, 5);
        
         //ADDING VALUES FOR CONTENT
        paneT.add(oneCT, 1, 6);
        paneT.add(twoCT, 2, 6);
        paneT.add(threeCT, 3, 6);
        paneT.add(fourCT, 4, 6);
        paneT.add(fiveCT, 5, 6);
    }
    public void edditinga()
    {
        criteriaT=new Label("Criteria");
        criteriaT.setTranslateY(100);
        criteriaT.setPrefWidth(90);
        criteriaT.setFont(new Font(18));
        criteriaT.setPrefHeight(80);
        criteriaT.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        attireT=new Label("Attire");
        attireT.setTranslateY(100);
        attireT.setPrefWidth(90);
        attireT.setFont(new Font(18));
        attireT.setPrefHeight(40);
        attireT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        audibilityT=new Label("Audibility");
        audibilityT.setTranslateY(100);
        audibilityT.setFont(new Font(18));
        audibilityT.setPrefWidth(90);
        audibilityT.setPrefHeight(40);
        audibilityT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        emphasisT=new Label("Emphasis");
        emphasisT.setTranslateY(100);
        emphasisT.setFont(new Font(18));
        emphasisT.setPrefWidth(90);
        emphasisT.setPrefHeight(40);
        emphasisT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        gestureT=new Label("Gesture");
        gestureT.setTranslateY(100);
        gestureT.setPrefWidth(90);
        gestureT.setFont(new Font(18));
        gestureT.setPrefHeight(40);
        gestureT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        contentT=new Label("Content");
        contentT.setTranslateY(100);
        contentT.setFont(new Font(18));
        contentT.setPrefWidth(90);
        contentT.setPrefHeight(40);
        contentT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        total2=new Button("Total2");
        total2.setTranslateY(100);
        total2.setFont(new Font(18));
        total2.setPrefWidth(90);
        total2.setPrefHeight(40);
        
        total2clear=new Button("Clear2");
        total2clear.setTranslateY(100);
        total2clear.setFont(new Font(18));
        total2clear.setPrefWidth(90);
        total2clear.setPrefHeight(40);
        
        
        answer2=new TextField();
        answer2.setFont(new Font(18));
        answer2.setTranslateY(100);
        answer2.setPrefWidth(90);
        answer2.setPrefHeight(40);
        answer2.setDisable(true);
        
        submit=new Button("SUBMIT");
        submit.setFont(new Font(18));
        submit.setTranslateY(50);
        submit.setPrefWidth(400);
        submit.setPrefHeight(50);
        
        
        overall=new Button("OVERALL TOTAL");
        overall.setFont(new Font(18));
        overall.setTranslateY(50);
        overall.setPrefWidth(400);
        overall.setPrefHeight(50);
        overallAnswer=new TextField(String.valueOf(sumall));
        overallAnswer.setDisable(true);
        overallAnswer.setFont(new Font(18));
        overallAnswer.setTranslateY(50);
        overallAnswer.setPrefWidth(400);
        overallAnswer.setPrefHeight(50);
        
    }
    public void ratingsa()
    {
        
        poorT=new Label("Poor");
        poorT.setTranslateY(85);
        poorT.setFont(new Font(15));
        poorT.setPrefWidth(50);
        poorT.setPrefHeight(50);
        poorT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        
        fairT=new Label("Fair");
        fairT.setFont(new Font(15));
        fairT.setTranslateY(85);
        fairT.setPrefWidth(50);
        fairT.setPrefHeight(50);
        fairT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
        
        
        goodT=new Label("Good");
        goodT.setTranslateY(85);
        goodT.setFont(new Font(15));
        goodT.setPrefWidth(50);
        goodT.setPrefHeight(50);
        goodT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        satisfactoryT=new Label("Satisfactory");
        satisfactoryT.setTranslateY(85);
        satisfactoryT.setFont(new Font(15));
        satisfactoryT.setPrefWidth(80);
        satisfactoryT.setPrefHeight(50);
        satisfactoryT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        excellentT=new Label("Excellent");
        excellentT.setFont(new Font(15));
        excellentT.setTranslateY(85);
        excellentT.setPrefWidth(70);
        excellentT.setPrefHeight(50);
        excellentT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        
        
       
        
    }
    public void numbersa()
    {
        oneT=new Label("1");
        oneT.setTranslateY(60);
        oneT.setFont(new Font(15));
        oneT.setPrefWidth(50);
        oneT.setPrefHeight(39);
        oneT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoT=new Label("2");
        twoT.setTranslateY(60);
        twoT.setFont(new Font(15));
        twoT.setPrefWidth(50);
        twoT.setPrefHeight(39);
        twoT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeT=new Label("3");
        threeT.setTranslateY(60);
        threeT.setFont(new Font(15));
        threeT.setPrefWidth(50);
        threeT.setPrefHeight(39);
        threeT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourT=new Label("4");
        fourT.setTranslateY(60);
        fourT.setFont(new Font(15));
        fourT.setPrefWidth(80);
        fourT.setPrefHeight(39);
        fourT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveT=new Label("5");
        fiveT.setTranslateY(60);
        fiveT.setFont(new Font(15));
        fiveT.setPrefWidth(70);
        fiveT.setPrefHeight(39);
        fiveT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    public void attireJa()
    {
        oneLT=new CheckBox();
        oneLT.setTranslateY(60);
        oneLT.setFont(new Font(15));
        oneLT.setPrefWidth(50);
        oneLT.setPrefHeight(39);
        oneLT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoLT=new CheckBox();
        twoLT.setTranslateY(60);
        twoLT.setFont(new Font(15));
        twoLT.setPrefWidth(50);
        twoLT.setPrefHeight(39);
        twoLT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeLT=new CheckBox();
        threeLT.setTranslateY(60);
        threeLT.setFont(new Font(15));
        threeLT.setPrefWidth(50);
        threeLT.setPrefHeight(39);
        threeLT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourLT=new CheckBox();
        fourLT.setTranslateY(60);
        fourLT.setFont(new Font(15));
        fourLT.setPrefWidth(80);
        fourLT.setPrefHeight(39);
        fourLT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveLT=new CheckBox();
        fiveLT.setTranslateY(60);
        fiveLT.setFont(new Font(15));
        fiveLT.setPrefWidth(70);
        fiveLT.setPrefHeight(39);
        fiveLT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void audibilityJa()
    {
        oneAT=new CheckBox();
        oneAT.setTranslateY(60);
        oneAT.setFont(new Font(15));
        oneAT.setPrefWidth(50);
        oneAT.setPrefHeight(39);
        oneAT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoAT=new CheckBox();
        twoAT.setTranslateY(60);
        twoAT.setFont(new Font(15));
        twoAT.setPrefWidth(50);
        twoAT.setPrefHeight(39);
        twoAT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeAT=new CheckBox();
        threeAT.setTranslateY(60);
        threeAT.setFont(new Font(15));
        threeAT.setPrefWidth(50);
        threeAT.setPrefHeight(39);
        threeAT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourAT=new CheckBox();
        fourAT.setTranslateY(60);
        fourAT.setFont(new Font(15));
        fourAT.setPrefWidth(80);
        fourAT.setPrefHeight(39);
        fourAT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveAT=new CheckBox();
        fiveAT.setTranslateY(60);
        fiveAT.setFont(new Font(15));
        fiveAT.setPrefWidth(70);
        fiveAT.setPrefHeight(39);
        fiveAT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void emphasisJa()
    {
        oneET=new CheckBox();
        oneET.setTranslateY(60);
        oneET.setFont(new Font(15));
        oneET.setPrefWidth(50);
        oneET.setPrefHeight(39);
        oneET.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoET=new CheckBox();
        twoET.setTranslateY(60);
        twoET.setFont(new Font(15));
        twoET.setPrefWidth(50);
        twoET.setPrefHeight(39);
        twoET.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeET=new CheckBox();
        threeET.setTranslateY(60);
        threeET.setFont(new Font(15));
        threeET.setPrefWidth(50);
        threeET.setPrefHeight(39);
        threeET.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourET=new CheckBox();
        fourET.setTranslateY(60);
        fourET.setFont(new Font(15));
        fourET.setPrefWidth(80);
        fourET.setPrefHeight(39);
        fourET.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveET=new CheckBox();
        fiveET.setTranslateY(60);
        fiveET.setFont(new Font(15));
        fiveET.setPrefWidth(70);
        fiveET.setPrefHeight(39);
        fiveET.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void gestureJa()
    {
        oneGT=new CheckBox();
        oneGT.setTranslateY(60);
        oneGT.setFont(new Font(15));
        oneGT.setPrefWidth(50);
        oneGT.setPrefHeight(39);
        oneGT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoGT=new CheckBox();
        twoGT.setTranslateY(60);
        twoGT.setFont(new Font(15));
        twoGT.setPrefWidth(50);
        twoGT.setPrefHeight(39);
        twoGT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeGT=new CheckBox();
        threeGT.setTranslateY(60);
        threeGT.setFont(new Font(15));
        threeGT.setPrefWidth(50);
        threeGT.setPrefHeight(39);
        threeGT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourGT=new CheckBox();
        fourGT.setTranslateY(60);
        fourGT.setFont(new Font(15));
        fourGT.setPrefWidth(80);
        fourGT.setPrefHeight(39);
        fourGT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveGT=new CheckBox();
        fiveGT.setTranslateY(60);
        fiveGT.setFont(new Font(15));
        fiveGT.setPrefWidth(70);
        fiveGT.setPrefHeight(39);
        fiveGT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void contentJa()
    {
        oneCT=new CheckBox();
        oneCT.setTranslateY(60);
        oneCT.setFont(new Font(15));
        oneCT.setPrefWidth(50);
        oneCT.setPrefHeight(39);
        oneCT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoCT=new CheckBox();
        twoCT.setTranslateY(60);
        twoCT.setFont(new Font(15));
        twoCT.setPrefWidth(50);
        twoCT.setPrefHeight(39);
        twoCT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeCT=new CheckBox();
        threeCT.setTranslateY(60);
        threeCT.setFont(new Font(15));
        threeCT.setPrefWidth(50);
        threeCT.setPrefHeight(39);
        threeCT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourCT=new CheckBox();
        fourCT.setTranslateY(60);
        fourCT.setFont(new Font(15));
        fourCT.setPrefWidth(80);
        fourCT.setPrefHeight(39);
        fourCT.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveCT=new CheckBox();
        fiveCT.setTranslateY(60);
        fiveCT.setFont(new Font(15));
        fiveCT.setPrefWidth(70);
        fiveCT.setPrefHeight(39);
        fiveCT.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }


//THIRD GRIDPANE

public void Sheete()
    {
           edditinge();
           ratingse();
           numberse();
           attireJe();
           audibilityJe();
           emphasisJe();
           gestureJe();
           contentJe();
    
        paneTH=new GridPane();
        paneTH.add(criteriaTH, 0, 0);
        paneTH.add(attireTH, 0, 1);
        paneTH.add(audibilityTH, 0, 2);
        paneTH.add(emphasisTH, 0, 3);
        paneTH.add(gestureTH, 0, 4);
        paneTH.add(contentTH, 0, 5);
        paneTH.add(total3, 0, 6);
        paneTH.add(total3clear, 0, 7);
        paneTH.add(answer3, 5, 6);
        
        paneTH.add(poorTH, 1, 0);
        paneTH.add(fairTH, 2, 0);
        paneTH.add(goodTH, 3, 0);
        paneTH.add(satisfactoryTH, 4, 0);
        paneTH.add(excellentTH, 5, 0);
        
       // pane.add(oneL, columnIndex, rowIndex);
        
        //ADDING THE NUMBERS IN THE SCORE SHEET
        paneTH.add(oneTH, 1, 1);
        paneTH.add(twoTH, 2, 1);
        paneTH.add(threeTH, 3, 1);
        paneTH.add(fourTH, 4, 1);
        paneTH.add(fiveTH, 5, 1);
        
         //ADDING VALUES FOR ATTIRE
        paneTH.add(oneLTH, 1, 2);
        paneTH.add(twoLTH, 2, 2);
        paneTH.add(threeLTH, 3, 2);
        paneTH.add(fourLTH, 4, 2);
        paneTH.add(fiveLTH, 5, 2);
        
         //ADDING VALUES FOR AUDIBILITY
        paneTH.add(oneATH, 1, 3);
        paneTH.add(twoATH, 2, 3);
        paneTH.add(threeATH, 3, 3);
        paneTH.add(fourATH, 4, 3);
        paneTH.add(fiveATH, 5, 3);
       
        
         //ADDING VALUES FOR EMPHASISI
        paneTH.add(oneETH, 1, 4);
        paneTH.add(twoETH, 2, 4);
        paneTH.add(threeETH, 3, 4);
        paneTH.add(fourETH, 4, 4);
        paneTH.add(fiveETH, 5, 4);
        
         //ADDING VALUES FOR GESTURES
        paneTH.add(oneGTH, 1, 5);
        paneTH.add(twoGTH, 2, 5);
        paneTH.add(threeGTH, 3, 5);
        paneTH.add(fourGTH,4, 5);
        paneTH.add(fiveGTH, 5, 5);
        
         //ADDING VALUES FOR CONTENT
        paneTH.add(oneCTH, 1, 6);
        paneTH.add(twoCTH, 2, 6);
        paneTH.add(threeCTH, 3, 6);
        paneTH.add(fourCTH, 4, 6);
        paneTH.add(fiveCTH, 5, 6);
    }
    public void edditinge()
    {
        criteriaTH=new Label("Criteria");
        criteriaTH.setTranslateY(100);
        criteriaTH.setPrefWidth(90);
        criteriaTH.setFont(new Font(18));
        criteriaTH.setPrefHeight(80);
        criteriaTH.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        attireTH=new Label("Attire");
        attireTH.setTranslateY(100);
        attireTH.setPrefWidth(90);
        attireTH.setFont(new Font(18));
        attireTH.setPrefHeight(40);
        attireTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        audibilityTH=new Label("Audibility");
        audibilityTH.setTranslateY(100);
        audibilityTH.setFont(new Font(18));
        audibilityTH.setPrefWidth(90);
        audibilityTH.setPrefHeight(40);
        audibilityTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        emphasisTH=new Label("Emphasis");
        emphasisTH.setTranslateY(100);
        emphasisTH.setFont(new Font(18));
        emphasisTH.setPrefWidth(90);
        emphasisTH.setPrefHeight(40);
        emphasisTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        gestureTH=new Label("Gesture");
        gestureTH.setTranslateY(100);
        gestureTH.setPrefWidth(90);
        gestureTH.setFont(new Font(18));
        gestureTH.setPrefHeight(40);
        gestureTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        contentTH=new Label("Content");
        contentTH.setTranslateY(100);
        contentTH.setFont(new Font(18));
        contentTH.setPrefWidth(90);
        contentTH.setPrefHeight(40);
        contentTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        total3=new Button("Total3");
        total3.setTranslateY(100);
        total3.setFont(new Font(18));
        total3.setPrefWidth(90);
        total3.setPrefHeight(40);
        
        total3clear=new Button("Clear3");
        total3clear.setTranslateY(100);
        total3clear.setFont(new Font(18));
        total3clear.setPrefWidth(90);
        total3clear.setPrefHeight(40);
              
        answer3=new TextField();
        answer3.setTranslateY(100);
        answer3.setFont(new Font(18));
        answer3.setPrefWidth(90);
        answer3.setPrefHeight(40);
        answer3.setDisable(true);
        
        
    }
    public void ratingse()
    {
        
        poorTH=new Label("Poor");
        poorTH.setTranslateY(85);
        poorTH.setFont(new Font(15));
        poorTH.setPrefWidth(50);
        poorTH.setPrefHeight(50);
        poorTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        
        fairTH=new Label("Fair");
        fairTH.setFont(new Font(15));
        fairTH.setTranslateY(85);
        fairTH.setPrefWidth(50);
        fairTH.setPrefHeight(50);
        fairTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
       
        
        
        goodTH=new Label("Good");
        goodTH.setTranslateY(85);
        goodTH.setFont(new Font(15));
        goodTH.setPrefWidth(50);
        goodTH.setPrefHeight(50);
        goodTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        satisfactoryTH=new Label("Satisfactory");
        satisfactoryTH.setTranslateY(85);
        satisfactoryTH.setFont(new Font(15));
        satisfactoryTH.setPrefWidth(80);
        satisfactoryTH.setPrefHeight(50);
        satisfactoryTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        excellentTH=new Label("Excellent");
        excellentTH.setFont(new Font(15));
        excellentTH.setTranslateY(85);
        excellentTH.setPrefWidth(70);
        excellentTH.setPrefHeight(50);
        excellentTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
       
        
    }
    public void numberse()
    {
        oneTH=new Label("1");
        oneTH.setTranslateY(60);
        oneTH.setFont(new Font(15));
        oneTH.setPrefWidth(50);
        oneTH.setPrefHeight(39);
        oneTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoTH=new Label("2");
        twoTH.setTranslateY(60);
        twoTH.setFont(new Font(15));
        twoTH.setPrefWidth(50);
        twoTH.setPrefHeight(39);
        twoTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeTH=new Label("3");
        threeTH.setTranslateY(60);
        threeTH.setFont(new Font(15));
        threeTH.setPrefWidth(50);
        threeTH.setPrefHeight(39);
        threeTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourTH=new Label("4");
        fourTH.setTranslateY(60);
        fourTH.setFont(new Font(15));
        fourTH.setPrefWidth(80);
        fourTH.setPrefHeight(39);
        fourTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveTH=new Label("5");
        fiveTH.setTranslateY(60);
        fiveTH.setFont(new Font(15));
        fiveTH.setPrefWidth(70);
        fiveTH.setPrefHeight(39);
        fiveTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    public void attireJe()
    {
        oneLTH=new CheckBox();
        oneLTH.setTranslateY(60);
        oneLTH.setFont(new Font(15));
        oneLTH.setPrefWidth(50);
        oneLTH.setPrefHeight(39);
        oneLTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        twoLTH=new CheckBox();
        twoLTH.setTranslateY(60);
        twoLTH.setFont(new Font(15));
        twoLTH.setPrefWidth(50);
        twoLTH.setPrefHeight(39);
        twoLTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeLTH=new CheckBox();
        threeLTH.setTranslateY(60);
        threeLTH.setFont(new Font(15));
        threeLTH.setPrefWidth(50);
        threeLTH.setPrefHeight(39);
        threeLTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourLTH=new CheckBox();
        fourLTH.setTranslateY(60);
        fourLTH.setFont(new Font(15));
        fourLTH.setPrefWidth(80);
        fourLTH.setPrefHeight(39);
        fourLTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveLTH=new CheckBox();
        fiveLTH.setTranslateY(60);
        fiveLTH.setFont(new Font(15));
        fiveLTH.setPrefWidth(70);
        fiveLTH.setPrefHeight(39);
        fiveLTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
         
       
    }
    
    public void audibilityJe()
    {
        oneATH=new CheckBox();
        oneATH.setTranslateY(60);
        oneATH.setFont(new Font(15));
        oneATH.setPrefWidth(50);
        oneATH.setPrefHeight(39);
        oneATH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoATH=new CheckBox();
        twoATH.setTranslateY(60);
        twoATH.setFont(new Font(15));
        twoATH.setPrefWidth(50);
        twoATH.setPrefHeight(39);
        twoATH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeATH=new CheckBox();
        threeATH.setTranslateY(60);
        threeATH.setFont(new Font(15));
        threeATH.setPrefWidth(50);
        threeATH.setPrefHeight(39);
        threeATH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourATH=new CheckBox();
        fourATH.setTranslateY(60);
        fourATH.setFont(new Font(15));
        fourATH.setPrefWidth(80);
        fourATH.setPrefHeight(39);
        fourATH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveATH=new CheckBox();
        fiveATH.setTranslateY(60);
        fiveATH.setFont(new Font(15));
        fiveATH.setPrefWidth(70);
        fiveATH.setPrefHeight(39);
        fiveATH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void emphasisJe()
    {
        oneETH=new CheckBox();
        oneETH.setTranslateY(60);
        oneETH.setFont(new Font(15));
        oneETH.setPrefWidth(50);
        oneETH.setPrefHeight(39);
        oneETH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoETH=new CheckBox();
        twoETH.setTranslateY(60);
        twoETH.setFont(new Font(15));
        twoETH.setPrefWidth(50);
        twoETH.setPrefHeight(39);
        twoETH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeETH=new CheckBox();
        threeETH.setTranslateY(60);
        threeETH.setFont(new Font(15));
        threeETH.setPrefWidth(50);
        threeETH.setPrefHeight(39);
        threeETH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourETH=new CheckBox();
        fourETH.setTranslateY(60);
        fourETH.setFont(new Font(15));
        fourETH.setPrefWidth(80);
        fourETH.setPrefHeight(39);
        fourETH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveETH=new CheckBox();
        fiveETH.setTranslateY(60);
        fiveETH.setFont(new Font(15));
        fiveETH.setPrefWidth(70);
        fiveETH.setPrefHeight(39);
        fiveETH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void gestureJe()
    {
        oneGTH=new CheckBox();
        oneGTH.setTranslateY(60);
        oneGTH.setFont(new Font(15));
        oneGTH.setPrefWidth(50);
        oneGTH.setPrefHeight(39);
        oneGTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoGTH=new CheckBox();
        twoGTH.setTranslateY(60);
        twoGTH.setFont(new Font(15));
        twoGTH.setPrefWidth(50);
        twoGTH.setPrefHeight(39);
        twoGTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeGTH=new CheckBox();
        threeGTH.setTranslateY(60);
        threeGTH.setFont(new Font(15));
        threeGTH.setPrefWidth(50);
        threeGTH.setPrefHeight(39);
        threeGTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourGTH=new CheckBox();
        fourGTH.setTranslateY(60);
        fourGTH.setFont(new Font(15));
        fourGTH.setPrefWidth(80);
        fourGTH.setPrefHeight(39);
        fourGTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveGTH=new CheckBox();
        fiveGTH.setTranslateY(60);
        fiveGTH.setFont(new Font(15));
        fiveGTH.setPrefWidth(70);
        fiveGTH.setPrefHeight(39);
        fiveGTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    public void contentJe()
    {
        oneCTH=new CheckBox();
        oneCTH.setTranslateY(60);
        oneCTH.setFont(new Font(15));
        oneCTH.setPrefWidth(50);
        oneCTH.setPrefHeight(39);
        oneCTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoCTH=new CheckBox();
        twoCTH.setTranslateY(60);
        twoCTH.setFont(new Font(15));
        twoCTH.setPrefWidth(50);
        twoCTH.setPrefHeight(39);
        twoCTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        threeCTH=new CheckBox();
        threeCTH.setTranslateY(60);
        threeCTH.setFont(new Font(15));
        threeCTH.setPrefWidth(50);
        threeCTH.setPrefHeight(39);
        threeCTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fourCTH=new CheckBox();
        fourCTH.setFont(new Font(15));
        fourCTH.setPrefWidth(80);
        fourCTH.setPrefHeight(39);
        fourCTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveCTH=new CheckBox();
        fiveCTH.setTranslateY(60);
        fiveCTH.setFont(new Font(15));
        fiveCTH.setPrefWidth(70);
        fiveCTH.setPrefHeight(39);
        fiveCTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        fourCTH.setTranslateY(60);
        fourCTH.setFont(new Font(15));
        fourCTH.setPrefWidth(80);
        fourCTH.setPrefHeight(39);
        fourCTH.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        fiveCTH=new CheckBox();
        fiveCTH.setTranslateY(60);
        fiveCTH.setFont(new Font(15));
        fiveCTH.setPrefWidth(70);
        fiveCTH.setPrefHeight(39);
        fiveCTH.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        
    }
    
   
}

