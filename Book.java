package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description: 演示父类和子类的关系
 * @author: hxr
 * @date: 2019/11/4
 */

public class Book {
    private String BookID;
    private String BookName;
    protected int pages;

    public Book(){

    }

    public Book(String BookID,String BookName,int pages){
        this.BookID = BookID;
        this.BookName = BookName;
        this.pages = pages;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
