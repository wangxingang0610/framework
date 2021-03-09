package com.study.user;

public class User1 {

    private int id;
    private String name;

    static {
        System.out.println("********load User************");
    }

    public User1() {
    }

    public User1(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void sout() {
        System.out.println("=======另外一个，自己的加载器加载类调用方法=======");
    }






    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
