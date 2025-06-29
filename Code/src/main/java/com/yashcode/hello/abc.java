package com.yashcode.hello;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.sym.Name;

public class abc{
void Record(String Code){
   String  Name="11";
    try{ 
           FileWriter writer = new FileWriter("attendX.csv",true);
           if (Code.equals("836BA7AA"))
           {
               Name="Yash Pal";
           }
           else if(Code.equals("81C10940"))
           {
               Name="Harshad Bhutal";
           }
           else if(Code.equals("43D880A6"))
           {
               Name="Prajwal Kedari";
           }
           else
           {
             System.out.println("you are not the student ");
           }
 
           System.out.println(Name+" is present");
            writer.append(Name);
            writer.append(",");
            writer.append(Code);
            writer.append(",");
            writer.append("11/7/2023");
            writer.append("\n");

             writer.close();
             System.out.println("Data added to the CSV file successfully.");
             
}         catch (IOException e) {
            System.out.println("An error occurred while writing to the CSV file.");
            e.printStackTrace();
        }
}
}