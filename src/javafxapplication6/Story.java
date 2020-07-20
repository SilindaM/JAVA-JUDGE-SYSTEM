package javafxapplication6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

public class Story 
{
    String host="jdbc:mysql://localhost:3306/sundayschool?zeroDateTimeBehavior=convertToNull";
    String name="root";
    String pass="";
    
     public Stage stages=new Stage();
    protected Label category,pname,pbranch,ptoss,jname,jbranch,jnumber;
    protected Label dpname,dpsurname,dpbranch,dptoss,djname,djsurname,djbranch,djnumber;
    protected GridPane pana,pan,pani,pano,pane,panu,panetheme,panetheme2,panetheme3;
    protected Label particiNameL,judgeNameL,criteria,attire,audibility,emphasis,gesture,content,poor,fair,good,satisfactory,excellent,one,two,three,four,five;
    protected Label criteriaT,attireT,audibilityT,emphasisT,gestureT,contentT,poorT,fairT,goodT,satisfactoryT,excellentT,oneT,twoT,threeT,fourT,fiveT;
    protected Label criteriaTH,attireTH,audibilityTH,emphasisTH,gestureTH,contentTH,poorTH,fairTH,goodTH,satisfactoryTH,excellentTH,oneTH,twoTH,threeTH,fourTH,fiveTH;
    protected Label participants,judgeone,judgetwo,judgethree;
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
    protected TextField answer1,answer2,answer3,branchr,overallAnswer;
      //LABEL FOR THEME
    protected Label theme,themeb,dikoma,diagelo,trafficking,abuse,tick,tickb,rape,albinism,xenophobia,killing;
    //CHECKBOX FOR THEME
    protected CheckBox dikomaC,diageloC,traffickingC,abuseC,rapeC,albinismC,xenophobiaC,killingC;
    
      //LABEL FOR THEME FOR JUDGE 2
    protected Label theme2,themeb2,dikoma2,diagelo2,trafficking2,abuse2,tick2,tickb2,rape2,albinism2,xenophobia2,killing2;
    //CHECKBOX FOR THEME FOR JUDGE 2
    protected CheckBox dikoma2C,diagelo2C,trafficking2C,abuse2C,rape2C,albinism2C,xenophobia2C,killing2C;
    
       //LABEL FOR THEME FOR JUDGE 3
    protected Label theme3,themeb3,dikoma3,diagelo3,trafficking3,abuse3,tick3,tickb3,rape3,albinism3,xenophobia3,killing3;
    //CHECKBOX FOR THEME FOR JUDGE 2
    protected CheckBox dikoma3C,diagelo3C,trafficking3C,abuse3C,rape3C,albinism3C,xenophobia3C,killing3C;
    //LABELS FOR JUDGES
    protected Label judge1L,judge2L,judge3L;    
    //LABELS FOR DISPLAYING TOTAL
    protected Label judge1T,judge2T,judge3T;
    protected GridPane paneTH,paniT,panoT,paneT,panePart,panePart2,panePart3;
    
    
    int attiretra,audibitytra,emphasistra,gesturetra,contenttra,dikomatra,diagelotra,humantra,womenabusetra,killingtra,rapetra,xenophobiatra,albinismtra;
    
    public int sum1,sum2,sum3,sumall;
    protected Button total1clear,total2clear,total3clear,submitclear;
    
                //DECLARATION FOR ADDITION OF EACH CATEGO
                int c3,d3,e3,f3,g3;
                       int at3 = 0, bt3 = 0, ct3 = 0, dt3 = 0, et3=0, ft3=0, gt3 = 0,ht3=0;
                       int thesum;
                       
                       
                int c,d,e,f,g;
                       int at = 0, bt = 0, ct = 0, dt = 0, et=0, ft=0, gt = 0,ht=0;
                     
                       
                int c2,d2,e2,f2,g2;
                       int at2 = 0, bt2 = 0, ct2 = 0, dt2 = 0, et2=0, ft2=0, gt2 = 0,ht2=0;
                       
public void Inseting()
    {
        particiNameL=new Label("ENTER REGISTERED BRANCH");
        particiNameL.setPrefHeight(30);
        particiNameL.setTranslateX(100);
        particiNameL.setTranslateY(0);
        
        branchr=new TextField();
        branchr.setPrefHeight(30);
        branchr.setPromptText("ENTER BRANCH NAME");
        branchr.setTranslateX(10);
        branchr.setTranslateY(10);
        
       
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
        THEMEGRID();
        THEMEGRID2();
        THEMEGRID3();
        pana=new GridPane();
        pana.setHgap(10);
        pana.setVgap(10);
        pana.add(particiNameL, 0, 1);
        pana.add(branchr, 1, 1);
        pana.add(pan, 0, 2);
        pana.add(pani, 2, 2);
        pana.add(pano, 1, 2);
        pana.add(panetheme, 0, 5);
        pana.add(panetheme2, 1, 5);
        pana.add(panetheme3, 2, 5);
        pana.add(answer1, 0, 5);
        pana.add(answer2, 1, 5);
        pana.add(answer3, 2, 5);
        pana.add(overall, 0, 15);
        pana.add(total1, 0, 5);
        pana.add(total1clear, 0, 6);
        pana.add(total2, 1, 5);
        pana.add(total2clear, 1, 6);
        pana.add(total3, 2, 5);
        pana.add(total3clear, 2, 6);
        pana.add(overallAnswer, 1, 15);
        pana.add(submit, 2, 15);
        pana.add(panePart, 0, 1);
        pana.add(panePart2, 1, 1);
        pana.add(panePart3, 2, 1);
        
        pana.setPrefHeight(690);
        pana.setPrefWidth(1200);
        stages.setTitle("STORY TELLING ");
        Scene scen=new Scene(pana);
        stages.setScene(scen);
        stages.show();
    }
public void PanPart()
    {
        
        java.util.ArrayList<judgeProcess> judgesa =new java.util.ArrayList<judgeProcess>();
        try
        {
                             Connection con=DriverManager.getConnection(host,name,pass);
                             Statement statement = con.createStatement();
                             ResultSet rs = statement.executeQuery("select * from judge");
                             while(rs.next())
                             {
                                   //CLASS WITH METHOD TO SET AND GET JUDGES
                                    judgeProcess judg=new judgeProcess();
                                    
                                    judg.setJudgename(rs.getString("JUDGENAME"));
                                    judg.setJudgesurname(rs.getString("JUDGESURNAME"));
                                    
                                    //ADD VALUES FROM DATABASE TO ARRAYLIST
                                    judgesa.add(judg);
                             }
                             judge1L=new Label("JUDGE 1 "+judgesa.get(0).getJudgename()+" "+judgesa.get(0).getJudgesurname());
                             judge1L.setFont(new Font(17));
                             
            
        }
        catch(SQLException ex)
        {
            Alert a=new Alert(Alert.AlertType.CONFIRMATION);
        }
        
        
        panePart=new GridPane();
        panePart.setPrefHeight(40);
        panePart.setPrefWidth(400);
        panePart.setTranslateY(40);
        panePart.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart.add(judge1L, 0, 0);
        Total1();
    }
public void PanPart2()
    { 
        java.util.ArrayList<judgeProcess> jud2=new java.util.ArrayList<judgeProcess>();
         try
        {
                             Connection con=DriverManager.getConnection(host,name,pass);
                             Statement statement = con.createStatement();
                             ResultSet rs = statement.executeQuery("select * from judge");
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
            Alert a=new Alert(Alert.AlertType.CONFIRMATION);
        }
        panePart2=new GridPane();
        panePart2.setPrefHeight(40);
        panePart2.setTranslateY(40);
        panePart2.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart2.add(judge2L, 0, 0);
        Total2();
    }

public void PanPart3()
    {
         java.util.ArrayList<judgeProcess> judd=new java.util.ArrayList<judgeProcess>();
        try
        {
            Connection con=DriverManager.getConnection(host,name,pass);
            Statement state=con.createStatement();
            ResultSet rss=state.executeQuery("SELECT *FROM judge");
            
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
            Alert a=new Alert(Alert.AlertType.INFORMATION);
        }
        
        panePart3=new GridPane();
        panePart3.setPrefHeight(40);
        panePart3.setPrefWidth(400);
        panePart3.setTranslateY(40);
        panePart3.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY,Insets.EMPTY)));
        panePart3.add(judge3L, 0, 0);
        Total3();
    }


public void pane2()
{
    pan=new GridPane();
    pan.setPrefHeight(400);
    pan.setPrefWidth(400);
    pan.setTranslateY(-50);
    pan.add(pane, 0, 0);
}

public void pane3()
{
    pani=new GridPane();
    pani.setPrefHeight(400);
    pani.add(paneTH, 0, 0);
    pani.setTranslateY(-50);
    pani.setPrefWidth(400);
}

public void pane4()
{
    pano=new GridPane();
    pano.setPrefHeight(400);
    pano.add(paneT, 0, 0);
    pano.setTranslateY(-50);
    pano.setPrefWidth(400);
}
 public void Sheet()      
    {
    
           edditing();
           ratings();
           numbers();
           attireJ();
           audibilityJ();
           emphasisJ();
           gestureJ();
           contentJ();
           Themes1();
           
        pane=new GridPane();
        pane.add(criteria, 0, 0);
        pane.add(attire, 0, 1);
        pane.add(audibility, 0, 2);
        pane.add(emphasis, 0, 3);
        pane.add(gesture, 0, 4);
        pane.add(content, 0, 5);
        
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
        
        
        total1=new Button("Total1");
        total1.setTranslateY(80);
        total1.setFont(new Font(18));
        total1.setPrefWidth(90);
        total1.setPrefHeight(40);
        
        total1clear=new Button("Clear");
        total1clear.setTranslateY(80);
        total1clear.setFont(new Font(18));
        total1clear.setPrefWidth(90);
        total1clear.setPrefHeight(40);
        
        answer1=new TextField();
        answer1.setFont(new Font(18));
        answer1.setTranslateY(125);
        answer1.setPrefWidth(10);
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
        oneL=new CheckBox();
        oneL.setTranslateY(60);
        oneL.setFont(new Font(15));
        oneL.setPrefWidth(50);
        oneL.setPrefHeight(39);
        oneL.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        twoL=new CheckBox();
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
    public void themesa()
    {
          //LOOP FOR ATTIRE CATEGORY
                      
                                
                       
        
    }
    public void Total1()
    {
        CheckBox one[]={oneL,twoL,threeL,fourL,fiveL};
        CheckBox two[]={oneA,twoA,threeA,fourA,fiveA};
        CheckBox three[]={oneE,twoL,threeE,fourE,fiveE};
        CheckBox four[]={oneG,twoG,threeG,fourG,fiveG};
        CheckBox five[]={oneC,twoC,threeC,fourC,fiveC};
        //loop for clearing theme
       
        
        int a=0;
        
       total1.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                                if(dikomaC.isSelected()  )
                                {
                                    at=2;
                                }
                                 if(diageloC.isSelected() )
                                {
                                    bt=2;
                                } 
                                 if(traffickingC.isSelected() )
                                {
                                     ct=2;
                                }
                                 if(abuseC.isSelected())
                                 {
                                    dt=2; 
                                 }
                                 if(rapeC.isSelected() )
                                {
                                    et=2;
                                } 
                                 if(albinismC.isSelected() )
                                {
                                    ft=2;
                                }
                                 if(xenophobiaC.isSelected() )
                                {
                                    gt=2;
                                }
                                 if(killingC.isSelected() )
                                {
                                    ht=2;
                                }
                       
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
                       
                        sum1=c+d+e+f+g+at+bt+ct+dt+et+ft+gt+ht;
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
                   diageloC.setSelected(false);
                   dikomaC.setSelected(false);
                   traffickingC.setSelected(false);
                   abuseC.setSelected(false);
                   rapeC.setSelected(false);
                   albinismC.setSelected(false);
                   xenophobiaC.setSelected(false);
                   killingC.setSelected(false);
               }
               answer1.clear();
                   
           }
       });
    }
      public void Total2()
    {
        CheckBox one2[]={oneLT,twoLT,threeLT,fourLT,fiveLT};
        CheckBox two2[]={oneAT,twoAT,threeAT,fourAT,fiveAT};
        CheckBox three2[]={oneET,twoET,threeET,fourET,fiveET};
        CheckBox four2[]={oneGT,twoGT,threeGT,fourGT,fiveGT};
        CheckBox five2[]={oneCT,twoCT,threeCT,fourCT,fiveCT};
        //loop for clearing theme
       
        
        int a=0;
        
       total2.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                                if(dikoma2C.isSelected()  )
                                {
                                    at2=2;
                                }
                                 if(diagelo2C.isSelected() )
                                {
                                    bt2=2;
                                } 
                                 if(trafficking2C.isSelected() )
                                {
                                     ct2=2;
                                }
                                 if(abuse2C.isSelected())
                                 {
                                    dt2=2; 
                                 }
                                 if(rape2C.isSelected() )
                                {
                                    et2=2;
                                } 
                                 if(albinism2C.isSelected() )
                                {
                                    ft2=2;
                                }
                                 if(xenophobia2C.isSelected() )
                                {
                                    gt2=2;
                                }
                                 if(killing2C.isSelected() )
                                {
                                    ht2=2;
                                }
                       
                       //LOOP FOR ATTIRE CATEGORY
                       for(int a=0;a<one2.length;a++)
                       {
                           if(one2[0].isSelected() && !one2[a].isSelected())
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
                       for(int a=0;a<two2.length;a++)
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
                       for(int a=0;a<three2.length;a++)
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
                       for(int a=0;a<four2.length;a++)
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
                       for(int a=0;a<five2.length;a++)
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
                       
                        sum2=c2+d2+e2+f2+g2+at2+bt2+ct2+dt2+et2+ft2+gt2+ht2;
                        answer2.setText(String.valueOf(sum2));
                        
       
                   }
               });
       total2clear.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent v)
           {
               for(int a=0;a<one2.length;a++)
               {
                   one2[a].setSelected(false);
                   two2[a].setSelected(false);
                   three2[a].setSelected(false);
                   four2[a].setSelected(false);
                   five2[a].setSelected(false);
                   diagelo2C.setSelected(false);
                   dikoma2C.setSelected(false);
                   trafficking2C.setSelected(false);
                   abuse2C.setSelected(false);
                   rape2C.setSelected(false);
                   albinism2C.setSelected(false);
                   xenophobia2C.setSelected(false);
                   killing2C.setSelected(false);
               }
               answer2.clear();
                   
           }
       });
    }
       public void Total3()
    {
        CheckBox one3[]={oneLTH,twoLTH,threeLTH,fourLTH,fiveLTH};
        CheckBox two3[]={oneATH,twoATH,threeATH,fourATH,fiveATH};
        CheckBox three3[]={oneETH,twoETH,threeETH,fourETH,fiveETH};
        CheckBox four3[]={oneGTH,twoGTH,threeGTH,fourGTH,fiveGTH};
        CheckBox five3[]={oneCTH,twoCTH,threeCTH,fourCTH,fiveCTH};
        //loop for clearing theme
       
        
        int a=0;
        
       total3.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                                if(dikoma3C.isSelected()  )
                                {
                                    at3=2;
                                }
                                 if(diagelo3C.isSelected() )
                                {
                                    bt3=2;
                                } 
                                 if(trafficking3C.isSelected() )
                                {
                                     ct3=2;
                                }
                                 if(abuse3C.isSelected())
                                 {
                                    dt3=2; 
                                 }
                                 if(rape3C.isSelected() )
                                {
                                    et3=2;
                                } 
                                 if(albinism3C.isSelected() )
                                {
                                    ft3=2;
                                }
                                 if(xenophobia3C.isSelected() )
                                {
                                    gt3=2;
                                }
                                 if(killing3C.isSelected() )
                                {
                                    ht3=2;
                                }
                       
                       //LOOP FOR ATTIRE CATEGORY
                       for(int a=0;a<one3.length;a++)
                       {
                           if(one3[0].isSelected() && !one3[a].isSelected())
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
                       for(int a=0;a<two3.length;a++)
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
                       for(int a=0;a<three3.length;a++)
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
                       for(int a=0;a<four3.length;a++)
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
                       for(int a=0;a<five3.length;a++)
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
                       
                        sum3=c3+d3+e3+f3+g3+at3+bt3+ct3+dt3+et3+ft3+gt3+ht3;
                        answer3.setText(String.valueOf(sum3));
                        
       
                   }
               });
       total3clear.setOnAction(new EventHandler<ActionEvent>()
       {
           public void handle(ActionEvent v)
           {
               for(int a=0;a<one3.length;a++)
               {
                   one3[a].setSelected(false);
                   two3[a].setSelected(false);
                   three3[a].setSelected(false);
                   four3[a].setSelected(false);
                   five3[a].setSelected(false);
                   diagelo3C.setSelected(false);
                   dikoma3C.setSelected(false);
                   trafficking3C.setSelected(false);
                   abuse3C.setSelected(false);
                   rape3C.setSelected(false);
                   albinism3C.setSelected(false);
                   xenophobia3C.setSelected(false);
                   killing3C.setSelected(false);
               }
               answer3.clear();
                   
           }
       });
    }
        //TOTAL FOR EACH CATEGORY
     public void categoryTotal()
     {
         attiretra=c+c2+c3;
         audibitytra=d+d2+d3;
         emphasistra=e+e2+e3;
         gesturetra=f+f2+f3;
         contenttra=g+g2+g3;
         dikomatra=at+at2+at3;
        diagelotra=bt+bt2+bt3;
         humantra=ct+ct2+ct3;
         womenabusetra=dt+dt2+dt3;
         killingtra=ht+ht2+ht3;
         rapetra=et+et2+et3;
          xenophobiatra=gt+gt2+gt3;
         albinismtra=ft+ft2+ft3;
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
             public void handle(ActionEvent eve)
             {
                 try
                 {
                     Connection con=DriverManager.getConnection(host,name,pass);
                     branch bra=new branch();
                     
                     bra.setBranch(branchr.getText().toUpperCase());
                     
                     String branchnam=bra.getBranch();
                     
                     String checka="select * from branchtable";
                     Statement stas=con.createStatement();
                     ResultSet resu=stas.executeQuery(checka);
                     if(resu.next())
                     {
                         String branchname=resu.getString("BRANCHNAME");
                         
                                  //CHECK IF USER DETAILS ARE EMPTY
                         if(branchnam.isEmpty())
                         {
                              JOptionPane.showMessageDialog(null, "ENTER BRANCH DETAILS","ERROR",JOptionPane.ERROR_MESSAGE);
                                
                         } //IF BRANCH IS REGISTERED ADD DETAILS TO DATABASE
                                  if(branchnam.equals(branchname));
                                  {
                                      String insert="INSERT INTO storytable(ATTIRESTO,AUDIBILITYSTO,EMPHASISSTO,GESTURESTO,CONTENTSTO,DIKOMASTO,DIAGELOSTO,HUMANSTO,WOMENABUSESTO,KILLINGSTO,RAPESTO,XENOPHOBIASTO,ALBINISMSTO,BRANCHNAME,TOTALSTO)  values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                      PreparedStatement preps=con.prepareStatement(insert);
                                      categoryTotal();
                                      preps.setString(1, String.valueOf(attiretra));
                                      preps.setString(2, String.valueOf(audibitytra));
                                      preps.setString(3, String.valueOf(emphasistra));
                                      preps.setString(4, String.valueOf(gesturetra));
                                      preps.setString(5, String.valueOf(contenttra));
                                      preps.setString(6, String.valueOf(dikomatra));
                                      preps.setString(7, String.valueOf(diagelotra));
                                      preps.setString(8, String.valueOf(humantra));
                                      preps.setString(9, String.valueOf(womenabusetra));
                                      preps.setString(10, String.valueOf(killingtra));
                                      preps.setString(11, String.valueOf(rapetra));
                                      preps.setString(12, String.valueOf(xenophobiatra));
                                      preps.setString(13, String.valueOf(albinismtra));
                                      preps.setString(14, branchr.getText().toUpperCase());
                                      preps.setString(15, String.valueOf(overalla));
                                      preps.executeUpdate();
                                      JOptionPane.showMessageDialog(null,branchr.getText().toUpperCase()+" HAS BEING SUCCESSFULLY JUDGED","ERROR",JOptionPane.ERROR_MESSAGE);
                                   
                                  }
                 }
                 }
                 catch(SQLException exe)
                 {
                     JOptionPane.showMessageDialog(null,exe.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
                                
                 }
             }
         }
         );
         }   
         }
         );
         
         
     }
    public void audibilityJ()
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
    }
    public void Themes1()
    {
        theme= new Label("Theme");
        theme.setPrefWidth(150);
        theme.setFont(new Font(13));
        theme.setPrefHeight(40);
        theme.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        dikoma = new Label("Dikoma");
        dikoma.setFont(new Font(13));
        dikoma.setPrefWidth(150);
        dikoma.setPrefHeight(40);
        dikoma.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
         diagelo = new Label("Diagelo");
        diagelo.setFont(new Font(13));
        diagelo.setPrefWidth(150);
        diagelo.setPrefHeight(40);
        diagelo.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
         abuse = new Label("Woman & children abuse");
        abuse.setPrefWidth(150);
        abuse.setFont(new Font(13));
        abuse.setPrefHeight(40);
        abuse.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
         trafficking = new Label("Human trafficking");
        trafficking.setFont(new Font(13));
        trafficking.setPrefWidth(150);
        trafficking.setPrefHeight(40);
        trafficking.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    public void TICKTHEME1()
    {
        tick = new Label("Tick");
        tick.setFont(new Font(15));
        tick.setPrefWidth(50);
        tick.setPrefHeight(39);
        tick.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        dikomaC = new CheckBox();
        dikomaC.setFont(new Font(15));
        dikomaC.setPrefWidth(50);
        dikomaC.setPrefHeight(39);
        dikomaC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        diageloC = new CheckBox();
        diageloC.setFont(new Font(15));
        diageloC.setPrefWidth(50);
        diageloC.setPrefHeight(39);
        diageloC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        abuseC = new CheckBox();
        abuseC.setFont(new Font(15));
        abuseC.setPrefWidth(50);
        abuseC.setPrefHeight(39);
        abuseC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        traffickingC = new CheckBox();
        traffickingC.setFont(new Font(15));
        traffickingC.setPrefWidth(50);
        traffickingC.setPrefHeight(39);
        traffickingC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void TICKTHEME1B()
    {
        tickb = new Label("Tick");
        tickb.setFont(new Font(15));
        tickb.setPrefWidth(50);
        tickb.setPrefHeight(39);
        tickb.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        killingC = new CheckBox();
        killingC.setFont(new Font(15));
        killingC.setPrefWidth(50);
        killingC.setPrefHeight(39);
        killingC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        rapeC = new CheckBox();
        rapeC.setFont(new Font(15));
        rapeC.setPrefWidth(50);
        rapeC.setPrefHeight(39);
        rapeC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        xenophobiaC = new CheckBox();
        xenophobiaC.setFont(new Font(15));
        xenophobiaC.setPrefWidth(50);
        xenophobiaC.setPrefHeight(39);
        xenophobiaC.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        albinismC = new CheckBox();
        albinismC.setFont(new Font(15));
        albinismC.setPrefWidth(50);
        albinismC.setPrefHeight(39);
        albinismC.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
       public void Themes1B()
    {
        themeb = new Label("Theme");
        themeb.setPrefWidth(150);
        themeb.setFont(new Font(13));
        themeb.setPrefHeight(40);
        themeb.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        killing = new Label("Killing of police");
        killing.setFont(new Font(13));
        killing.setPrefWidth(150);
        killing.setPrefHeight(40);
        killing.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        rape= new Label("Rape");
        rape.setFont(new Font(13));
        rape.setPrefWidth(150);
        rape.setPrefHeight(40);
        rape.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        xenophobia = new Label("Xenophobiaa");
        xenophobia.setPrefWidth(150);
        xenophobia.setFont(new Font(13));
        xenophobia.setPrefHeight(40);
        xenophobia.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
        albinism = new Label("Albinism");
        albinism.setFont(new Font(13));
        albinism.setPrefWidth(150);
        albinism.setPrefHeight(40);
        albinism.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    //GRIDPANE FOR THEME
    public void THEMEGRID()
    {
        Themes1();
        TICKTHEME1();
        Themes1B();
        TICKTHEME1B();
        
        
        panetheme=new GridPane();
        panetheme.add(theme, 0, 0); 
        panetheme.add(tick, 1,0);
        panetheme.add(dikoma, 0, 1); 
        panetheme.add(dikomaC, 1,1);
        panetheme.add(diagelo, 0, 2);
        panetheme.add(diageloC, 1,2);
        panetheme.add(trafficking, 0, 3);
        panetheme.add(traffickingC, 1,3);
        panetheme.add(abuse , 0,4);
        panetheme.add(abuseC, 1,4);
        
        
        panetheme.add(themeb, 2, 0); 
        panetheme.add(tickb, 3, 0);
        panetheme.add(killing , 2, 1);
        panetheme.add(killingC , 3, 1);
        panetheme.add(rape, 2, 2);
        panetheme.add(rapeC, 3, 2);
        panetheme.add(xenophobia, 2, 3);
        panetheme.add(xenophobiaC, 3, 3);
        panetheme.add(albinism, 2, 4);
        panetheme.add(albinismC, 3, 4); 
    }
        
    //THEMES FOR SECOND JUDGE
    
        public void Themes21()
    {
        theme2= new Label("Theme");
        theme2.setPrefWidth(150);
        theme2.setFont(new Font(13));
        theme2.setPrefHeight(40);
        theme2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        dikoma2 = new Label("Dikoma");
        dikoma2.setFont(new Font(13));
        dikoma2.setPrefWidth(150);
        dikoma2.setPrefHeight(40);
        dikoma2.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        diagelo2 = new Label("Diagelo");
        diagelo2.setFont(new Font(13));
        diagelo2.setPrefWidth(150);
        diagelo2.setPrefHeight(40);
        diagelo2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
         abuse2 = new Label("Woman & children abuse");
        abuse2.setPrefWidth(150);
        abuse2.setFont(new Font(13));
        abuse2.setPrefHeight(40);
        abuse2.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
         trafficking2 = new Label("Human trafficking");
        trafficking2.setFont(new Font(13));
        trafficking2.setPrefWidth(150);
        trafficking2.setPrefHeight(40);
        trafficking2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    public void TICKTHEME21()
    {
        tick2 = new Label("Tick");
        tick2.setFont(new Font(15));
        tick2.setPrefWidth(50);
        tick2.setPrefHeight(39);
        tick2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        dikoma2C = new CheckBox();
        dikoma2C.setFont(new Font(15));
        dikoma2C.setPrefWidth(50);
        dikoma2C.setPrefHeight(39);
        dikoma2C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        diagelo2C = new CheckBox();
        diagelo2C.setFont(new Font(15));
        diagelo2C.setPrefWidth(50);
        diagelo2C.setPrefHeight(39);
        diagelo2C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        abuse2C = new CheckBox();
        abuse2C.setFont(new Font(15));
        abuse2C.setPrefWidth(50);
        abuse2C.setPrefHeight(39);
        abuse2C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        trafficking2C = new CheckBox();
        trafficking2C.setFont(new Font(15));
        trafficking2C.setPrefWidth(50);
        trafficking2C.setPrefHeight(39);
        trafficking2C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void TICKTHEME21B()
    {
        tickb2 = new Label("Tick");
        tickb2.setFont(new Font(15));
        tickb2.setPrefWidth(50);
        tickb2.setPrefHeight(39);
        tickb2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        killing2C = new CheckBox();
        killing2C.setFont(new Font(15));
        killing2C.setPrefWidth(50);
        killing2C.setPrefHeight(39);
        killing2C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        rape2C = new CheckBox();
        rape2C.setFont(new Font(15));
        rape2C.setPrefWidth(50);
        rape2C.setPrefHeight(39);
        rape2C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        xenophobia2C = new CheckBox();
        xenophobia2C.setFont(new Font(15));
        xenophobia2C.setPrefWidth(50);
        xenophobia2C.setPrefHeight(39);
        xenophobia2C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        albinism2C = new CheckBox();
        albinism2C.setFont(new Font(15));
        albinism2C.setPrefWidth(50);
        albinism2C.setPrefHeight(39);
        albinism2C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
       public void Themes21B()
    {
        themeb2 = new Label("Theme");
        themeb2.setPrefWidth(150);
        themeb2.setFont(new Font(13));
        themeb2.setPrefHeight(40);
        themeb2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        killing2 = new Label("Killing of police");
        killing2.setFont(new Font(13));
        killing2.setPrefWidth(150);
        killing2.setPrefHeight(40);
        killing2.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        rape2= new Label("Rape");
        rape2.setFont(new Font(13));
        rape2.setPrefWidth(150);
        rape2.setPrefHeight(40);
        rape2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        xenophobia2 = new Label("Xenophobiaa");
        xenophobia2.setPrefWidth(150);
        xenophobia2.setFont(new Font(13));
        xenophobia2.setPrefHeight(40);
        xenophobia2.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
        albinism2 = new Label("Albinism");
        albinism2.setFont(new Font(13));
        albinism2.setPrefWidth(150);
        albinism2.setPrefHeight(40);
        albinism2.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    //GRIDPANE FOR THEME
    public void THEMEGRID2()
    {
        Themes21();
        TICKTHEME21();
        Themes21B();
        TICKTHEME21B();
        
        
        panetheme2=new GridPane();
        panetheme2.add(theme2, 0, 0); 
        panetheme2.add(tick2, 1,0);
        panetheme2.add(dikoma2, 0, 1); 
        panetheme2.add(dikoma2C, 1,1);
        panetheme2.add(diagelo2, 0, 2);
        panetheme2.add(diagelo2C, 1,2);
        panetheme2.add(trafficking2, 0, 3);
        panetheme2.add(trafficking2C, 1,3);
        panetheme2.add(abuse2 , 0,4);
        panetheme2.add(abuse2C, 1,4);
        
        
        panetheme2.add(themeb2, 2, 0); 
        panetheme2.add(tickb2, 3, 0);
        panetheme2.add(killing2 , 2, 1);
        panetheme2.add(killing2C , 3, 1);
        panetheme2.add(rape2, 2, 2);
        panetheme2.add(rape2C, 3, 2);
        panetheme2.add(xenophobia2, 2, 3);
        panetheme2.add(xenophobia2C, 3, 3);
        panetheme2.add(albinism2, 2, 4);
        panetheme2.add(albinism2C, 3, 4); 
    }
    //THEMES FOR THIRD JUDGE
        public void Themes31()
    {
        theme3= new Label("Theme");
        theme3.setPrefWidth(150);
        theme3.setFont(new Font(13));
        theme3.setPrefHeight(40);
        theme3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        dikoma3 = new Label("Dikoma");
        dikoma3.setFont(new Font(13));
        dikoma3.setPrefWidth(150);
        dikoma3.setPrefHeight(40);
        dikoma3.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        diagelo3 = new Label("Diagelo");
        diagelo3.setFont(new Font(13));
        diagelo3.setPrefWidth(150);
        diagelo3.setPrefHeight(40);
        diagelo3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
         abuse3 = new Label("Woman & children abuse");
        abuse3.setPrefWidth(150);
        abuse3.setFont(new Font(13));
        abuse3.setPrefHeight(40);
        abuse3.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
         trafficking3 = new Label("Human trafficking");
        trafficking3.setFont(new Font(13));
        trafficking3.setPrefWidth(150);
        trafficking3.setPrefHeight(40);
        trafficking3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    public void TICKTHEME31()
    {
        tick3 = new Label("Tick");
        tick3.setFont(new Font(15));
        tick3.setPrefWidth(50);
        tick3.setPrefHeight(39);
        tick3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
         
        dikoma3C = new CheckBox();
        dikoma3C.setFont(new Font(15));
        dikoma3C.setPrefWidth(50);
        dikoma3C.setPrefHeight(39);
        dikoma3C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        diagelo3C = new CheckBox();
        diagelo3C.setFont(new Font(15));
        diagelo3C.setPrefWidth(50);
        diagelo3C.setPrefHeight(39);
        diagelo3C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        abuse3C = new CheckBox();
        abuse3C.setFont(new Font(15));
        abuse3C.setPrefWidth(50);
        abuse3C.setPrefHeight(39);
        abuse3C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        trafficking3C = new CheckBox();
        trafficking3C.setFont(new Font(15));
        trafficking3C.setPrefWidth(50);
        trafficking3C.setPrefHeight(39);
        trafficking3C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
    
    public void TICKTHEME31B()
    {
        tickb3 = new Label("Tick");
        tickb3.setFont(new Font(15));
        tickb3.setPrefWidth(50);
        tickb3.setPrefHeight(39);
        tickb3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        killing3C = new CheckBox();
        killing3C.setFont(new Font(15));
        killing3C.setPrefWidth(50);
        killing3C.setPrefHeight(39);
        killing3C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        rape3C = new CheckBox();
        rape3C.setFont(new Font(15));
        rape3C.setPrefWidth(50);
        rape3C.setPrefHeight(39);
        rape3C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        xenophobia3C = new CheckBox();
        xenophobia3C.setFont(new Font(15));
        xenophobia3C.setPrefWidth(50);
        xenophobia3C.setPrefHeight(39);
        xenophobia3C.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY ,Insets.EMPTY)));
        
        albinism3C = new CheckBox();
        albinism3C.setFont(new Font(15));
        albinism3C.setPrefWidth(50);
        albinism3C.setPrefHeight(39);
        albinism3C.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY ,Insets.EMPTY)));
    }
       public void Themes31B()
    {
        themeb3 = new Label("Theme");
        themeb3.setPrefWidth(150);
        themeb3.setFont(new Font(13));
        themeb3.setPrefHeight(40);
        themeb3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        killing3 = new Label("Killing of police");
        killing3.setFont(new Font(13));
        killing3.setPrefWidth(150);
        killing3.setPrefHeight(40);
        killing3.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
        rape3= new Label("Rape");
        rape3.setFont(new Font(13));
        rape3.setPrefWidth(150);
        rape3.setPrefHeight(40);
        rape3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        
        xenophobia3 = new Label("Xenophobiaa");
        xenophobia3.setPrefWidth(150);
        xenophobia3.setFont(new Font(13));
        xenophobia3.setPrefHeight(40);
        xenophobia3.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY,Insets.EMPTY)));
        
       
        albinism3 = new Label("Albinism");
        albinism3.setFont(new Font(13));
        albinism3.setPrefWidth(150);
        albinism3.setPrefHeight(40);
        albinism3.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
    }
    //GRIDPANE FOR THEME
    public void THEMEGRID3()
    {
        Themes31();
        TICKTHEME31();
        Themes31B();
        TICKTHEME31B();
        
        
        panetheme3=new GridPane();
        panetheme3.add(theme3, 0, 0); 
        panetheme3.add(tick3, 1,0);
        panetheme3.add(dikoma3, 0, 1); 
        panetheme3.add(dikoma3C, 1,1);
        panetheme3.add(diagelo3, 0, 2);
        panetheme3.add(diagelo3C, 1,2);
        panetheme3.add(trafficking3, 0, 3);
        panetheme3.add(trafficking3C, 1,3);
        panetheme3.add(abuse3 , 0,4);
        panetheme3.add(abuse3C, 1,4);
        
        
        panetheme3.add(themeb3, 2, 0); 
        panetheme3.add(tickb3, 3, 0);
        panetheme3.add(killing3 , 2, 1);
        panetheme3.add(killing3C , 3, 1);
        panetheme3.add(rape3, 2, 2);
        panetheme3.add(rape3C, 3, 2);
        panetheme3.add(xenophobia3, 2, 3);
        panetheme3.add(xenophobia3C, 3, 3);
        panetheme3.add(albinism3, 2, 4);
        panetheme3.add(albinism3C, 3, 4); 
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
        total2.setTranslateY(80);
        total2.setFont(new Font(18));
        total2.setPrefWidth(90);
        total2.setPrefHeight(40);
        
        
        total2clear=new Button("Clear2");
        total2clear.setTranslateY(80);
        total2clear.setFont(new Font(18));
        total2clear.setPrefWidth(90);
        total2clear.setPrefHeight(40);
        
        answer2=new TextField();
        answer2.setFont(new Font(18));
        answer2.setTranslateY(125);
        answer2.setDisable(true);
        answer2.setPrefWidth(90);
        answer2.setPrefHeight(40);
        
        
        submit=new Button("SUBMIT");
        submit.setFont(new Font(18));
        submit.setPrefWidth(400);
        submit.setPrefHeight(50);
        
        
        overall=new Button("OVERALL TOTAL");
        overall.setFont(new Font(18));
        overall.setPrefWidth(400);
        overall.setPrefHeight(50);
        
        overallAnswer=new TextField();
        overallAnswer.setDisable(true);
        overallAnswer.setFont(new Font(18));
        overallAnswer.setPrefWidth(350);
        overallAnswer.setPrefHeight(50);
        
    }
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
        total3.setTranslateY(80);
        total3.setFont(new Font(18));
        total3.setPrefWidth(90);
        total3.setPrefHeight(40);
        
        total3clear=new Button("Clear3");
        total3clear.setTranslateY(80);
        total3clear.setFont(new Font(18));
        total3clear.setPrefWidth(90);
        total3clear.setPrefHeight(40);
              
        answer3=new TextField();
        answer3.setDisable(true);
        answer3.setTranslateY(125);
        answer3.setFont(new Font(18));
        answer3.setPrefWidth(90);
        answer3.setPrefHeight(40);
        
        
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