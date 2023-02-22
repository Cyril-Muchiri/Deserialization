package com.chief;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) throws Exception {
User user;

        FileInputStream fin=new FileInputStream("C:\\Users\\Baby Beast\\IdeaProjects\\Serialization\\UserInfo.ser");
        ObjectInputStream oin=new ObjectInputStream(fin);
        user=(User) oin.readObject();
        fin.close();
        oin.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
