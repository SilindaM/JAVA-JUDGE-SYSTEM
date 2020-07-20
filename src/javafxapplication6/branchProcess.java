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
public class branchProcess 
{
    protected String branchcode,branchname,teachername,teachersurname,teachernumber;

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public void setTeachersurname(String teachersurname) {
        this.teachersurname = teachersurname;
    }

    public void setTeachernumber(String teachernumber) {
        this.teachernumber = teachernumber;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public String getBranchname() {
        return branchname;
    }

    public String getTeachername() {
        return teachername;
    }

    public String getTeachersurname() {
        return teachersurname;
    }

    public String getTeachernumber() {
        return teachernumber;
    }

    @Override
    public String toString()
    {
        return "branchcode=" + branchcode + ", branchname=" + branchname + ", teachername=" + teachername + ", teachersurname=" + teachersurname + ", teachernumber=" + teachernumber + '}';
    }
   
}
