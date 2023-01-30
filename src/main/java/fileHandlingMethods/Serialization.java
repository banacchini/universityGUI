package fileHandlingMethods;

import People.Person;
import javafx.collections.ObservableList;

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
            throw new RuntimeException(e);
        } catch (IOException e) {
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
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
