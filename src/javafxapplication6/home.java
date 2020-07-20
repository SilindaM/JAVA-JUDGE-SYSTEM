/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;
import java.awt.Paint;
import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.util.Calendar.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Popup;
/**
 *
 * @author mduduzi
 */
public class home 
{
 
    private Button register,memory1,memory2,scripture,story,poetry,choral,drama,hymn,theme,traditional,logout;
    private TextArea area;
    private GridPane top,mainp,pani;
    private Label label;
        Stage stage=new Stage();
    
    //object for registering class
    Register regi=new Register();
     //object for view class
    MemoryTwo memo2=new MemoryTwo();
     //object for search class
    MemoryOne memo1=new MemoryOne();
     //object for update class
    Poetry poetr=new Poetry();
     //object for delete class
    Drama dra=new Drama();
     //object for judging class
    Scripture script=new Scripture();
    //object for Story
    Story sto=new Story();
    //object for choral
    ChoralVerse cho=new ChoralVerse();
    //object for hymn
    Hymn hym=new Hymn();
    //object for theme
    ThemeSong the=new ThemeSong();
    //object for traditional
    Traditional tra=new Traditional();
    
    public void starta()
           
    {
        
        //registerbutton
        register=new Button("REGISTER");
        register.setTranslateX(7);
        register.setTranslateY(0);
        register.setPrefWidth(300);
        register.setPrefHeight(48);
        register.setFont(new Font(20));
        
        
        //MEMORY VERSE 1
        memory1=new Button("MEMORY VERSE ONE");
        memory1.setTranslateX(7);
        memory1.setTranslateY(0);
        memory1.setPrefWidth(300);
        memory1.setPrefHeight(48);
        memory1.setFont(new Font(15));
        
       
        
        
         //MEMORY VERSE2
        memory2=new Button("MEMORY VERSE TWO");
        memory2.setTranslateX(7);
        memory2.setTranslateY(0);
        memory2.setPrefWidth(300);
        memory2.setPrefHeight(48);
        memory2.setFont(new Font(15));
        
         //SCRIPTURE READING
        scripture=new Button("SCRIPTURE READING");
        scripture.setTranslateX(7);
        scripture.setTranslateY(0);
        scripture.setPrefWidth(300);
        scripture.setPrefHeight(48);
        scripture.setFont(new Font(15));
        
         //STORY
        story=new Button("STORY TELLING");
        story.setTranslateX(7);
        story.setTranslateY(0);
        story.setPrefWidth(300);
        story.setPrefHeight(48);
        story.setFont(new Font(15));
        
         //POETRY
        poetry=new Button("POETRY");
        poetry.setTranslateX(7);
        poetry.setTranslateY(0);
        poetry.setPrefWidth(300);
        poetry.setPrefHeight(48);
        poetry.setFont(new Font(15));
        
         //CHORAL
        choral=new Button("CHORAL VERSE");
        choral.setTranslateX(7);
        choral.setTranslateY(0);
        choral.setPrefWidth(300);
        choral.setPrefHeight(48);
        choral.setFont(new Font(15));
        
        
         ///HYMN SONG
        hymn=new Button("HYMN SONG ");
        hymn.setTranslateX(7);
        hymn.setTranslateY(0);
        hymn.setPrefWidth(300);
        hymn.setPrefHeight(48);
        hymn.setFont(new Font(15));
        
          //THEME SONG
        theme=new Button("THEME SONG");
        theme.setTranslateX(7);
        theme.setTranslateY(0);
        theme.setPrefWidth(300);
        theme.setPrefHeight(48);
        theme.setFont(new Font(15));
        
          //DRAMA
        drama=new Button("DRAMA");
        drama.setTranslateX(7);
        drama.setTranslateY(0);
        drama.setPrefWidth(300);
        drama.setPrefHeight(48);
        drama.setFont(new Font(15));
        
         //MUSIC
        traditional=new Button("TRADITIONAL DANCE");
        traditional.setTranslateX(7);
        traditional.setTranslateY(0);
        traditional.setPrefWidth(300);
        traditional.setPrefHeight(48);
        traditional.setFont(new Font(15));
        //METHOD FOR CALL ALL THE GRIDPANES
        ALLPANES();
        RESISTERING();
        MEMORY1();
        MEMORY2();
        STORY();
        SCRIPTURE();
        POETRY();
        CHORALVERSE();
        STORY();
        DRAMA();
        THEME();
        HYMN();
        TRADITIONAL();
    }
    //register button
        //method for closing all the stages 
        public void Stages()
        {
           regi.alla.close();
           memo1.stage.close();
           dra.staged.close();
           memo2.stagetw.close();
           script.stagescr.close();
           sto.stages.close();
           poetr.stagep.close();
           cho.stagec.close();
           hym.stageh.close();
           tra.stagetra.close();
           the.staget.close();
                  
        }
    
       public void RESISTERING()
        {
            register.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                    regi.registering();
                    //call method to close other stages
                    Stages();
                    //open clicked stage
                    regi.alla.show();
                 }
             }
            );
        }
       //BUTTON FOR JUDGING
         public void MEMORY1()
        {
            memory1.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                    memo1.Inseting();
                  //call method to close other stages
                    Stages();
                    //open clicked stage
                    memo1.stage.show();
                 }
             }
            );
        }
         //BUTTON FOR SEARCHING
         
       //BUTTON FOR JUDGING
         public void MEMORY2()
        {
            memory2.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                    memo2.Inseting();
                     //call method to close other stages
                   Stages();
                    //open clicked stage
                    memo2.stagetw.show();
                 }
             }
            );
        }
         //VIEWING BUTTON
         
       //BUTTON FOR JUDGING
         public void SCRIPTURE()
        {
            scripture.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                     script.Inseting();
                     //call method to close other stages
                   Stages();
                    //open clicked stage
                    script.stagescr.show();
                 }
             }
            );
        }
         //UPDATING BUTTON
           public void STORY()
        {
            story.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                   sto.Inseting();
                     //call method to close other stages
                  Stages();
                    //open clicked stage
                    sto.stages.show();
                 }
             }
            );
        }
            //POETRY
           public void POETRY()
        {
            poetry.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                  poetr.Inseting();
                     //call method to close other stages
                  Stages();
                    //open clicked stage
                    poetr.stagep.show();
                 }
             }
            );
        }
            //CHORAL VERSE
            public void CHORALVERSE()
        {
            choral.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                    cho.Inseting();
                     //call method to close other stages
                 Stages();
                    //open clicked stage
                    cho.stagec.show();
                 }
             }
            );
        }
            //POETRY
           public void HYMN()
        {
            
            hymn.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                    hym.Inseting();
                     //call method to close other stages
                   Stages();
                    //open clicked stage
                    hym.stageh.show();
                 }
             }
            );
        }
            //POETRY
           public void THEME()
        {
            theme.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                     the.Inseting();
                     //call method to close other stages
                  Stages();
                    //open clicked stage
                    the.staget.show();
                 }
             }
            );
        }
            //POETRY
           public void DRAMA()
        {
            drama.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                     dra.Inseting();
                     //call method to close other stages
                  Stages();
                    //open clicked stage
                    dra.staged.show();
                 }
             }
            );
        }
            //POETRY
           public void TRADITIONAL()
        {
            traditional.setOnAction(new EventHandler<ActionEvent>()
            {
            public void handle(ActionEvent event)
                 {
                     tra.Inseting();
                     //call method to close other stages
                   Stages();
                    //open clicked stage
                    tra.stagetra.show();
                     
                 }
             }
            );
        }
        public void TOPPANE()
        {
            
            //DATE 
            
         //LOGOUT BUTTON
        logout=new Button("LOGOUT");
        logout.setTranslateX(850);
        logout.setPrefHeight(40);
        
        logout.setPrefWidth(150);
        //same size as the main parent
        logout.setTranslateY(475);
        logout.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent event)
            {
                //CALLING THE LOGIN PAGE
                JavaFXApplication6 login=new JavaFXApplication6();
                login.start(stage);
            }
            

        });
        
        //SYSTEM DESCRIPTION
        label=new Label("");
        label.setFont(Font.font ("Verdana", 20));
        label.setTranslateX(330);
        label.setTranslateY(460);
        
        
        //TOP PANE
        top=new GridPane();
        top.add(logout, 0, 0);
        top.add(label, 0, 0);
        top.setPrefWidth(1010);
        top.setTranslateX(0);
        top.setTranslateY(-430);
        top.setBackground(new Background(new BackgroundFill(Color.YELLOW,CornerRadii.EMPTY,Insets.EMPTY)));
        
        }
        public void MAINPANE()
        {
        //PANE WHERE USER EDITS
        mainp=new GridPane();
        mainp.setBackground(new Background(new BackgroundFill(Color.RED,CornerRadii.EMPTY,Insets.EMPTY)));
        mainp.setPrefHeight(520);
        mainp.setPrefWidth(690);
        mainp.setTranslateY(89);
        mainp.setTranslateX(319);
        mainp.add(register, 0, 1);
        mainp.add(memory1, 0, 2);
        
        
        
        pani=new GridPane();
        pani.setPrefHeight(520);
        pani.setPrefWidth(318);
        pani.setTranslateY(89);
        pani.add(register, 0, 1);
        pani.add(memory1, 0, 2);
        pani.add(memory2, 0, 3);
        pani.add(scripture, 0, 4);
        pani.add(story, 0, 5);
        pani.add(choral, 0, 6);
        pani.add(poetry, 0, 7);
        pani.add(hymn, 0, 8);
        pani.add(theme, 0, 9);
        pani.add(drama, 0, 10);
        pani.add(traditional, 0, 11);
        pani.setBackground(new Background(new BackgroundFill( Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        pani.setVgap(5);
        }
        public void ALLPANES()
        {
         MAINPANE();
         TOPPANE();
        GridPane all=new GridPane();
        all.add(pani, 0, 0);
        all.add(mainp, 0, 0);
        all.add(top, 0, 0);
        
        Scene sa=new Scene(all,1000,600);
        stage.setScene(sa);
        stage.show();
        stage.setTitle("HOME");
        stage.setResizable(false);   
    }   
}

