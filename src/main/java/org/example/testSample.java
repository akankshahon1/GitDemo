package org.example;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {
    public static void main(String[] args) throws IOException {
        DataDriven d=new DataDriven();
     ArrayList data= d.getdata("Add Profile");
     System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println("'hiidhh");


        DataDriven d=new DataDriven();
        ArrayList data= d.getdata("Add Profile");
        System.out.println(column);
        System.out.println(column);
        System.out.println(column);
        System.out.println(column);
        System.out.println(column);
        // driver.findElement(by.xpath("fdee")).sendKeys(data.get(1));
    }
}
