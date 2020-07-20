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
public class managebranch 
{
  
  private String tbranch,tsurname,tname,tcellphone;

    public managebranch(String tbranch, String tsurname,String tname, String tcellphone) {
        this.tbranch = tbranch;
        this.tsurname = tsurname;
        this.tname = tname;
        this.tcellphone = tcellphone;
    }

    public String getTbranch() {
        return tbranch;
    }

    public void setTbranch(String tbranch) {
        this.tbranch = tbranch;
    }

    public String getTsurname() {
        return tsurname;
    }

    public void setTsurname(String tsurname) {
        this.tsurname = tsurname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTcellphone() {
        return tcellphone;
    }

    public void setTcellphone(String tcellphone) {
        this.tcellphone = tcellphone;
    }

  
}
