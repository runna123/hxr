package com.classbook.chapter.six;


/**
 * @program: classprogram
 * @Description:
 * @author: hxr
 * @date: 2019/11/4
 */

public class BookManager {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary("INB001", "CookBook", 90, 9);
        //x子类访问父类的 protect 成员变量
        int pages = dictionary.pages;
        //类型转换 int 转 String
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        Book book = new Book("INB002", "James", 70);
        display(book.getBookID());
        Book bookdictionary = new Dictionary("INB003", "Toms", 98, 8);
        display(bookdictionary.getBookID());
    }
    public static void diplay(String content){
        System.out.println(content);
    }
    private static void display(String bookID) {
    }
}


