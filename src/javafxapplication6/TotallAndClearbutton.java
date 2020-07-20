/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

/**
 *
 * @author mduduzi
 */
public class TotallAndClearbutton
{ 
    
    protected CheckBox oneL,twoL,threeL,fourL,fiveL;
    protected CheckBox oneA,twoA,threeA,fourA,fiveA;
    protected CheckBox oneE,twoE,threeE,fourE,fiveE;
    protected CheckBox oneG,twoG,threeG,fourG,fiveG;
    protected CheckBox oneC,twoC,threeC,fourC,fiveC;
    
    protected CheckBox [] one,two,three,four,five;
    
    private Button total1,total2,total3,submit,overall,overallAnswer;
    private Button total1clear,total2clear,total3clear,submitclear;
    public int sum1,a,c,d,e,f,g;
    /*
    public TotallAndClearbutton(CheckBox[] one, CheckBox[] two, CheckBox[] three, CheckBox[] four, CheckBox[] five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }*/
    
    public void Total1(CheckBox[] onea, CheckBox[] twoa, CheckBox[] threea, CheckBox[] foura, CheckBox[] fivea)
    {
        CheckBox one[]={oneL,twoL,threeL,fourL,fiveL};
        CheckBox two[]={oneA,twoA,threeA,fourA,fiveA};
        CheckBox three[]={oneE,twoL,threeE,fourE,fiveE};
        CheckBox four[]={oneG,twoG,threeG,fourG,fiveG};
        CheckBox five[]={oneC,twoC,threeC,fourC,fiveC};
    }
    public void row1(CheckBox[] one)
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
    }
    public void row2(CheckBox[] two)
    {
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
    }
    public void row3(CheckBox[] three)
    { //LOOP FOR EMPHASIS CATEGORY
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
    }
    public void row4(CheckBox[] four)
    {
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
    }
    public void row5(CheckBox[] five)
    {
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
    }
    public void totalbutton(CheckBox[] q,CheckBox[] w,CheckBox[] r,CheckBox[] t,CheckBox[] y)
    {
        total1.setOnAction(new EventHandler<ActionEvent>()
               {
                   public void handle(ActionEvent h)
                   {
                       row1(q);
                       row2(w);
                       row3(r);
                       row4(t);
                       row5(y);
                       //LOOP FOR CONTENT CATEGORY
                        sum1=c+d+e+f+g;
                       System.out.println(sum1);
                   }
               });
    }
    public void clearbutton(CheckBox v[],CheckBox w[],CheckBox x[],CheckBox y[],CheckBox z[])
    {
       
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
                   sum1=0;
               }
                   System.out.println(sum1);
           }
       });
    }
}
