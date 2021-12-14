package com.example.librarymanagementsystem;

import java.util.Date;

public class DuedateDetailsInfo {
    String  membername, bookid, memberid;
    Date duedate;
    double fine;

    /*public DuedateDetailsInfo(String memberid, String membername, String bookid, Date duedate, double fine){
        this.memberid=memberid;
        this.membername=membername;
        this.bookid=bookid;
        this.duedate=duedate;
        this.fine=fine;

    }*/

    public DuedateDetailsInfo( String name, String bookID, String memberID, java.sql.Date returnDate) {
        this.membername=membername;
        this.bookid=bookid;
        this.memberid=memberid;
        this.duedate=duedate;
        this.fine=fine;
    }

    public String getName(){
        return membername;
    }

    public void setName(){
        this.membername=membername;
    }

    public String getBookID(){
        return bookid;
    }

    public void setBookID(){ this.bookid=bookid; }

    public String getMemberID(){
        return memberid;
    }

    public void setMemberID(){
        this.memberid=memberid;
    }

    public Date getReturnDate(){
        return duedate;
    }

    public void setReturnDate(){
        this.duedate=duedate;
    }

    public double getFine(){
        return fine;
    }

    public void setFine(){
        this.fine=fine;
    }

}
