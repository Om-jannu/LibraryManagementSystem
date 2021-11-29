package com.example.librarymanagementsystem;

public class info {
    String id, title, isbn, author, genre, quantity;

    public info(String id, String title, String isbn, String author, String genre, String quantity){
        this.id=id;
        this.title=title;
        this.isbn=isbn;
        this.author=author;
        this.genre=genre;
        this.quantity=quantity;
    }

    public String getBookId(){
        return id;
    }

    public void setBookID(){
        this.id=id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title=title;
    }

    public String getBookISBN(){
        return isbn;
    }

    public void setBookISBN(){
        this.isbn=isbn;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(){
        this.author=author;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(){
        this.genre=genre;
    }

    public String getNoOfCopies(){
        return quantity;
    }

    public void setNoOfCopies(){
        this.quantity=quantity;
    }


}
