package fileHandlingMethods;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LoginInfo {
    BufferedReader reader;

    public void  getLoginData(){
        HashMap<String,String> loginData = new HashMap<String, String>();
        String [] adminData;
        try{
            reader = new BufferedReader(new FileReader(new File("administratorzy.txt")));
            String line = reader.readLine();

            while(line != null){
//                adminData = line.split(",");
//                loginData.put(adminData[0], adminData[1]);
                line = reader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
//        return getLoginData();
    }
}
