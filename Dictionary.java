package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description: 继承父类Book
 * @author: hxr
 * @date: 2019/11/4
 */

public class Dictionary extends Book{
    private int definitions;
    public Dictionary(String inb001, String cookBook, int i, int definitions){
        this.definitions = definitions;
    }
    public Dictionary(String BookID, String BookName, int pages){
        super(BookID,BookName,pages);
        int definitions = 0;
        this.definitions = definitions;
    }

    public int getDefinitions() {
        return definitions;
    }

    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }
    public String getBookID(){
        return DefaultValue.DICTIONARY_SKU + super.getBookID();
    }
}
