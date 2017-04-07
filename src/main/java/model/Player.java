package model;

import exceptions.DomainException;

/**
 * Created by Cedric on 7/04/2017.
 */
public class Player
{
    private String name;
    private String fname;
    private int totalScore;
    private String email;
    private String password;


public Player(String name, String fname, String email, String password)
{

}

private void setEmail(String email) throws DomainException
{
    if(email.isEmpty() || email == null)
    {
        throw new DomainException("enter an email address");
    }
    this.email = email;
}

private void setName(String name) throws DomainException
{
    if(name.isEmpty() || name == null)
    {
        throw new DomainException("enter your name");
    }
    this.name = name;
}

private void setFname(String fname) throws DomainException{
    if(fname.isEmpty() || fname == null)
    {
        throw new DomainException("Enter your first name");
    }
    this.fname = fname;
}

private void setTotalScore(int totalScore){
    this.totalScore = totalScore;
}

}