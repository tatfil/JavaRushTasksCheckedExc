package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class VeryComplexClass {
    public void veryComplexMethod() throws IOException {

       File file = new File("e:\\thisfileisnotexist.txt");
        FileInputStream fileInputStream = new FileInputStream(file);


    }

    public static void main(String[] args) {
        VeryComplexClass veryComplexClass = new VeryComplexClass();
        try {
            veryComplexClass.veryComplexMethod();
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("IOException");

        }
        catch(Exception e ){
            System.out.println("Exception");
        }
        finally{
            System.out.println("Finally");
        }



    }
}
