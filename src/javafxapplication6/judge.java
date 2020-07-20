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
public class judge 
{
    public String namej,surnamej,branchj;
    public long numberj;

    public judge(String namej, String surnamej, String branchj, int numberj) 
    {
        this.namej = namej;
        this.surnamej = surnamej;
        this.branchj = branchj;
        this.numberj = numberj;
    }

    public String getNamej() 
    {
        String namejUpper = namej.toUpperCase();
        return namejUpper;
    }

    public void setNamej(String namej)
    {
        this.namej = namej;
    }

    public String getSurnamej()
    {
        String surnamejUpper=surnamej.toUpperCase();
        return surnamejUpper;
    }

    public void setSurnamej(String surnamej)
    {
        this.surnamej = surnamej;
    }

    public String getBranchj() 
    { 
        String branchjUpper=surnamej.toUpperCase();
        return branchjUpper;
    }

    public void setBranchj(String branchj) 
    {
        this.branchj = branchj;
    }
    public long getNumberj()
    {
        return numberj;
    }

    public void setNumberj(long numberj)
    {
        this.numberj = numberj;
    }
    //METHOD TO CHECK IF USER EXISTS
    public boolean existing(String namej,String surnamej,String branchj ,String numberj )
    {
        if(!namej.isEmpty() && !surnamej.isEmpty() && !branchj.isEmpty() && !numberj.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Boolean values(String n,String s,String b,String nu)
    {
        if(n.equals(namej) && s.equals(surnamej) && nu.equals(numberj))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
}
