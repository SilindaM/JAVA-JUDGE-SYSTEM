/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;


/**
 *
 * @author mduduzi
 */
public class judgeProcess
{
    protected String judgename,judgesurname,judgebranch,judgenumber,participantsname,participantsurname,participantbranch;

    public String getParticipantbranch() {
        return participantbranch;
    }

    public void setParticipantbranch(String participantbranch) {
        this.participantbranch = participantbranch;
    }

    public String getParticipantsname() {
        return participantsname;
    }

    public void setParticipantsname(String participantsname) {
        this.participantsname = participantsname;
    }

    public String getParticipantsurname() {
        return participantsurname;
    }

    public void setParticipantsurname(String participantsurname) {
        this.participantsurname = participantsurname;
    }

  

    public void setJudgename(String judgename) {
        this.judgename = judgename;
    }

    public void setJudgesurname(String judgesurname) {
        this.judgesurname = judgesurname;
    }


    public void setJudgebranch(String judgebranch) {
        this.judgebranch = judgebranch;
    }
    

    public void setJudgenumber(String judgenumber)
    {
        this.judgenumber = judgenumber;
    }
    public String getJudgename() 
    {
        return judgename;
    }
    public String getJudgenumber() 
    {
        return judgenumber;
    }
    
    public String getJudgesurname() 
    {
        return judgesurname;
    }
    public String getJudgebranch() 
    {
        return judgebranch;
    }
    @Override
    public String toString() {
        return  "judgename=" + judgename + ", judgesurname=" + judgesurname + ", judgebranch=" + judgebranch + ", judgenumber=" + judgenumber + '}';
    }
    
}
