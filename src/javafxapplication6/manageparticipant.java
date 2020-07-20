/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

/**
 *
 * @author SILINDA
 */
public class manageparticipant 
{
  
  private String pname,psurname,pbranch,page,pcategory;

    public manageparticipant(String pname, String psurname, String page, String pbranch, String pcategory) {
        this.pname = pname;
        this.psurname = psurname;
        this.pbranch = pbranch;
        this.page = page;
        this.pcategory = pcategory;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsurname() {
        return psurname;
    }

    public void setPsurname(String psurname) {
        this.psurname = psurname;
    }

    public String getPbranch() {
        return pbranch;
    }

    public void setPbranch(String pbranch) {
        this.pbranch = pbranch;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

   
  
}
