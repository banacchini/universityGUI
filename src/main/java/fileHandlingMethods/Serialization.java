package fileHandlingMethods;

import People.Person;

import java.io.*;
import java.util.ArrayList;

public class Serialization {

    public static void saveFile(ArrayList<Person> list){

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("listData.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Zapisano liste");

        } catch (FileNotFoundException e) {
            System.out.println("wyjebalo sie fos");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("wyjebalo sie oos");
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Person> readFile(){
        try{
            FileInputStream fileInputStream = new FileInputStream("listData.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Person> list = (ArrayList<Person>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();

            return list;

        } catch (FileNotFoundException e) {
            System.out.println("Wyjebalo fis");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Wyjebalo ois");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("cos sie z klasa stalo");
            throw new RuntimeException(e);
        }
    }
}
