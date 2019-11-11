/**
 * @program: programming2
 * @Description: Express various books
 * @date: 2019/11/8
 */
package com.google.reading;

//抽象类books，方法
public abstract class Books {
    //共同属性：页数、价格
    int pages;
    double price;
    public abstract void Info();
}
